package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ah;
import org.telegram.ui.an0;
import org.telegram.ui.bg1;
import org.telegram.ui.dn;
import org.telegram.ui.eh;
import org.telegram.ui.fp;
import org.telegram.ui.gp;
import org.telegram.ui.io0;
import org.telegram.ui.km;
import org.telegram.ui.km0;
import org.telegram.ui.mm0;
import org.telegram.ui.oj0;
import org.telegram.ui.qn;
import org.telegram.ui.re0;
import org.telegram.ui.sn;
import org.telegram.ui.u50;
import org.telegram.ui.y60;
import org.telegram.ui.yo;
public final class x9 implements Runnable {
    public final int f2454a;
    public final boolean f2455b;
    public final Object f2456c;
    public final Object d;
    public final Object e;

    public x9(ci.l3 l3Var, View view, ah.i1 i1Var, boolean z10, boolean z11) {
        this.f2454a = 1;
        this.f2456c = l3Var;
        this.d = view;
        this.e = i1Var;
        this.f2455b = z10;
    }

    private final void a() {
        byte[] bArr;
        mm0 mm0Var = (mm0) this.f2456c;
        boolean z10 = this.f2455b;
        byte[] bArr2 = (byte[]) this.e;
        an0 an0Var = mm0Var.e;
        an0Var.f35711d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            an0Var.f35713e1 = an0Var.P0;
        }
        byte[] bArr3 = an0Var.f35709c1;
        byte[] bArr4 = an0Var.f35713e1;
        if (bArr3 != null && bArr3.length == 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, 32);
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 32, bArr6, 0, 16);
            bArr = new byte[32];
            System.arraycopy(bArr3, 0, bArr, 0, 32);
            Utilities.aesCbcEncryptionByteArraySafe(bArr, bArr5, bArr6, 0, 32, 0, 0);
        } else {
            bArr = null;
        }
        if (an0.Y0(bArr, Long.valueOf(an0Var.f35706b1)) && bArr2.length != 0 && an0Var.f35706b1 != 0) {
            if (an0Var.f35707c == 0) {
                ConnectionsManager.getInstance(an0.s0(an0Var)).sendRequest(new TL_account.getAllSecureValues(), new km0(mm0Var, 0));
                return;
            }
            mm0Var.a();
        } else if (z10) {
            UserConfig.getInstance(an0.r0(an0Var)).resetSavedPassword();
            an0Var.N0 = 0;
            an0Var.R1();
        } else {
            TL_account.authorizationForm authorizationform = an0Var.f35756y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                an0Var.f35756y.errors.clear();
            }
            byte[] bArr7 = an0Var.f35709c1;
            if (bArr7 != null && bArr7.length != 0) {
                mm0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new re0(mm0Var, mm0Var.f39628b, mm0Var.d, 14));
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        Bitmap.CompressFormat compressFormat;
        int i11;
        String[] split;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.g6 g6Var;
        jc jcVar;
        int i15;
        int i16;
        boolean z11;
        byte[] bArr;
        byte[] bArr2;
        Boolean bool = null;
        r9 = null;
        String str = null;
        String str2 = null;
        View view = null;
        View view2 = null;
        boolean z12 = true;
        switch (this.f2454a) {
            case 0:
                y9 y9Var = (y9) this.f2456c;
                TLObject tLObject = (TLObject) this.e;
                boolean z13 = this.f2455b;
                ArrayList arrayList = y9Var.f2511l;
                int i17 = y9Var.f2503a;
                if (((int[]) this.d)[0] == y9Var.f2512m) {
                    y9Var.f2508i = false;
                    y9Var.f2512m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i17).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i17).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z13) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        y9Var.f2510k = tL_payments_savedStarGifts.next_offset;
                        y9Var.f2513n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        y9Var.h = bool;
                        if (arrayList.size() <= y9Var.f2513n && y9Var.f2510k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        y9Var.f2509j = z10;
                    } else {
                        y9Var.f2509j = true;
                    }
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(y9Var.f2504b), y9Var);
                    return;
                }
                return;
            case 1:
                ci.l3 l3Var = (ci.l3) this.f2456c;
                ah.i1 i1Var = (ah.i1) this.e;
                boolean z14 = this.f2455b;
                ci.p4 p4Var = l3Var.f5513a;
                org.telegram.ui.Components.f5.a0(p4Var.C2, 1, p4Var.B1, new ci.k3(l3Var, z14, i1Var, (View) this.d));
                return;
            case 2:
                ei.t1 t1Var = (ei.t1) this.f2456c;
                TLObject tLObject2 = (TLObject) this.e;
                String str3 = (String) this.d;
                boolean z15 = this.f2455b;
                ei.v1 v1Var = t1Var.f9859s;
                if (t1Var.f9858r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        ei.n2 n2Var = v1Var.f9948r;
                        ArrayList arrayList2 = v1Var.f9947n;
                        i10 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str3, messages_botresults);
                        t1Var.h = messages_botresults.next_offset;
                        if (z15) {
                            arrayList2.clear();
                        }
                        arrayList2.size();
                        arrayList2.addAll(messages_botresults.results);
                        t1Var.l();
                    }
                    v1Var.d.c(false);
                    t1Var.f9858r = false;
                    return;
                }
                return;
            case 3:
                ei.a8 a8Var = (ei.a8) this.f2456c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z16 = this.f2455b;
                Runnable runnable = (Runnable) this.e;
                a8Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(a8Var.Z0);
                    if (z16) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                    if (z16) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(a8Var.Z0));
                        } catch (Exception e7) {
                            FileLog.e((Throwable) e7, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 4:
                hg.h0 h0Var = (hg.h0) this.f2456c;
                boolean z17 = this.f2455b;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.d;
                hg.e0 e0Var = (hg.e0) this.e;
                if (!z17) {
                    h0Var.f11901c = e0Var;
                    u3Var.setRightText(h0Var.H(e0Var));
                    u3Var.setRightTextMargin(6);
                    h0Var.I.clear();
                    h0Var.d = true;
                    h0Var.l();
                    h0Var.P();
                    return;
                }
                return;
            case 5:
                boolean z18 = this.f2455b;
                i2.h0 h0Var2 = (i2.h0) this.d;
                j2.j jVar = (j2.j) this.e;
                j2.h o10 = j2.h.o((Context) this.f2456c);
                if (o10 == null) {
                    e2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z18) {
                    j2.e eVar = h0Var2.f12442s;
                    eVar.getClass();
                    eVar.f13987f.a(o10);
                }
                LogSessionId q6 = o10.q();
                synchronized (jVar) {
                    j2.i iVar = jVar.f14015b;
                    iVar.getClass();
                    iVar.f(q6);
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                boolean z19 = this.f2455b;
                ki.t3 t3Var = (ki.t3) this.e;
                String trim = ((EditTextBoldCursor) this.f2456c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ki.j4.k(o2Var, z19, new ah.h0(24, t3Var, trim));
                    return;
                }
                return;
            case 7:
                m4.f0 f0Var = (m4.f0) this.f2456c;
                boolean z20 = this.f2455b;
                m4.v vVar = (m4.v) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.i1 i1Var2 = f0Var.f16585g;
                if (z20) {
                    m4.o1 o1Var = new m4.o1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.u t10 = i1Var2.f16627b.t(vVar);
                        if (t10 != null) {
                            i11 = t10.b(m4.f0.B).f16710n;
                        } else if (!f0Var.h(vVar)) {
                            v7.q8.b(new m4.s1(-100));
                        } else {
                            v7.q8.b(new m4.s1(0));
                            i11 = 0;
                        }
                        m4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.e(i11, o1Var);
                        }
                    } catch (DeadObjectException unused) {
                        i1Var2.f16627b.E(vVar);
                        v7.q8.b(new m4.s1(-100));
                    } catch (RemoteException e10) {
                        e2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        v7.q8.b(new m4.s1(-1));
                    }
                }
                runnable2.run();
                i1Var2.f16627b.m(vVar);
                return;
            case 8:
                ((CameraController) this.f2456c).lambda$initCamera$3(this.f2455b, (Exception) this.d, (Runnable) this.e);
                return;
            case 9:
                String[] strArr = (String[]) this.f2456c;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.d;
                boolean z21 = this.f2455b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    org.telegram.ui.ActionBar.k6.f21230g0 = org.telegram.ui.ActionBar.k6.tl.get(org.telegram.ui.ActionBar.k6.f21235g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.k6.f21249h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.k6.f21249h0) + ".wp").getAbsolutePath();
                        try {
                            String str4 = j6Var.f21023c;
                            if (str4 != null && !str4.equals(absolutePath)) {
                                new File(j6Var.f21023c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        j6Var.f21023c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.k6.f21249h0);
                        j6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i18 = 0; i18 < split.length; i18++) {
                                if ("blur".equals(split[i18])) {
                                    j6Var.h = true;
                                } else if ("motion".equals(split[i18])) {
                                    j6Var.f21033n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        j6Var.f21037x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                j6Var.f21034r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    j6Var.f21035s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    j6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    j6Var.f21036w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                j6Var.f21037x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (j6Var.f21023c != null) {
                                new File(j6Var.f21023c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        j6Var.f21023c = null;
                        org.telegram.ui.ActionBar.k6.f21249h0 = null;
                    }
                    if (!z21 && org.telegram.ui.ActionBar.k6.M == null) {
                        org.telegram.ui.ActionBar.k6.K = j6Var;
                        if (org.telegram.ui.ActionBar.k6.I != org.telegram.ui.ActionBar.k6.J) {
                            z12 = false;
                        }
                        if (z12) {
                            org.telegram.ui.ActionBar.k6.T = 2000;
                            org.telegram.ui.ActionBar.k6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ah.j(21), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.k6.I = j6Var;
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (org.telegram.ui.ActionBar.k6.M == null && !org.telegram.ui.ActionBar.k6.Q) {
                    MessagesController.getInstance(j6Var.E).saveTheme(j6Var, j6Var.k(false), z21, false);
                }
                pVar.run();
                return;
            case 10:
                sn.m0((sn) this.f2456c, (String) this.d, (MessageObject) this.e, this.f2455b);
                return;
            case 11:
                sn snVar = (sn) this.f2456c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) this.e;
                boolean z22 = this.f2455b;
                if (i6Var != null) {
                    snVar.getClass();
                    org.telegram.ui.ActionBar.i6 k10 = j6Var2.k(false);
                    int i19 = i6Var.f20964a;
                    UndoView undoView = snVar.K3;
                    if (undoView != null) {
                        view = undoView.getUndoButton();
                    }
                    org.telegram.ui.ActionBar.k6.H1(j6Var2, false, i19, view);
                    if (z22) {
                        org.telegram.ui.ActionBar.k6.k0(j6Var2, k10, true);
                        return;
                    }
                    return;
                }
                UndoView undoView2 = snVar.K3;
                if (undoView2 != null) {
                    view2 = undoView2.getUndoButton();
                }
                org.telegram.ui.ActionBar.k6.H1(j6Var2, false, -1, view2);
                return;
            case 12:
                dn dnVar = (dn) this.f2456c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z23 = this.f2455b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                sn snVar2 = dnVar.f36660a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, snVar2.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                ag.a m10 = ag.a.m(message.suggested_post.price);
                if (m10.f631a == ag.b.f634b) {
                    i12 = snVar2.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = snVar2.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z23) {
                    m10 = ag.a.i((m10.f632b / 1000) * i12, m10.f631a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z23) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), gi.l.H0(i12))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z23) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), h1.p(message.suggested_post.schedule_date), gi.l.H0(i12))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), h1.p(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i21 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((org.telegram.ui.ActionBar.o2) snVar2).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
                org.telegram.ui.v5 v5Var = new org.telegram.ui.v5(qcVarArr, 4);
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.c2 v02 = org.telegram.ui.Components.f5.v0(snVar2, string, spannableStringBuilder, LocaleController.getString(i14), false, new t0(dnVar, message, c2VarArr, messageObject, v5Var, 26));
                c2VarArr[0] = v02;
                v02.setOnDismissListener(v5Var);
                if (z23 && m10.f631a == ag.b.f633a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(snVar2.getParentActivity());
                    g6Var = ((org.telegram.ui.ActionBar.o2) snVar2).resourceProvider;
                    org.telegram.ui.Components.qc G = new org.telegram.ui.Components.xc(a2, g6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f29832j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                qn qnVar = (qn) this.f2456c;
                qnVar.r((org.telegram.ui.ActionBar.f4) this.d, (TLRPC.WallPaper) this.e, this.f2455b);
                qnVar.o(qnVar.h);
                km kmVar = qnVar.F.f41561j1;
                if (kmVar != null && (jcVar = kmVar.L) != null) {
                    jcVar.invalidate();
                    return;
                }
                return;
            case 14:
                yo yoVar = (yo) this.f2456c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z24 = this.f2455b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    yoVar.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = yoVar.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z24) {
                        if (yoVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yoVar.getParentActivity());
                            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            yoVar.showDialog(alertDialog$Builder.f20678a);
                        } else {
                            return;
                        }
                    }
                }
                r90 r90Var = yoVar.H;
                if (r90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = yoVar.m0;
                    if (tL_chatInviteExported2 != null) {
                        str2 = tL_chatInviteExported2.link;
                    }
                    r90Var.setLink(str2);
                    yoVar.H.c(yoVar.m0, yoVar.f43913a0);
                    return;
                }
                return;
            case 15:
                gp gpVar = (gp) this.f2456c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z25 = this.f2455b;
                chat.join_to_send = z25;
                gpVar.f37643x.d.getMessagesController().toggleChatJoinToSend(chat.f20343id, z25, new y7(gpVar, z25, chat, 17), new eh(17, gpVar, (e90) this.e));
                return;
            case 16:
                gp gpVar2 = (gp) this.f2456c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z26 = this.f2455b;
                chat2.join_request = z26;
                gpVar2.f37643x.d.getMessagesController().toggleChatJoinRequest(chat2.f20343id, z26, new fp(gpVar2, 0), new eh(16, gpVar2, (d90) this.e));
                return;
            case 17:
                boolean z27 = this.f2455b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f2456c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z27 && ChatObject.isChannel(chat3)) {
                    View d = alertDialog$Builder2.f20678a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat3)) {
                                i15 = R.string.ChannelDelete;
                            } else {
                                i15 = R.string.DeleteMega;
                            }
                            textView.setText(LocaleController.getString(i15));
                            return;
                        } else if (chat3.monoforum) {
                            textView.setText(LocaleController.getString(R.string.LeaveConversationMenu));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(LocaleController.getString(R.string.LeaveMega));
                            return;
                        } else {
                            textView.setText(LocaleController.getString(R.string.LeaveChannel));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                mk mkVar = (mk) this.f2456c;
                boolean z28 = this.f2455b;
                ArrayList arrayList3 = (ArrayList) this.e;
                mkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(13, mkVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    str = translitString;
                }
                if (str != null) {
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                int i22 = i16 + 1;
                String[] strArr2 = new String[i22];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList4 = new ArrayList();
                if (!z28) {
                    for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                        hk hkVar = (hk) arrayList3.get(i23);
                        File file = hkVar.f26968f;
                        if (file != null && !file.isDirectory()) {
                            int i24 = 0;
                            while (true) {
                                if (i24 < i22) {
                                    String str5 = strArr2[i24];
                                    String str6 = hkVar.f26966b;
                                    if (str6 != null) {
                                        z11 = str6.toLowerCase().contains(str5);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList4.add(hkVar);
                                    } else {
                                        i24++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(13, mkVar, arrayList4));
                return;
            case 19:
                b90.u((b90) this.f2456c, (TLRPC.TL_error) this.d, this.f2455b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                TLObject tLObject4 = (TLObject) this.e;
                boolean z29 = this.f2455b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.d;
                ty0 ty0Var = ((iy0) this.f2456c).f27471a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z29) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        ty0Var.S = tL_messages_stickerSet;
                        ty0Var.v0();
                        ty0Var.D0();
                    }
                }
                c2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f2456c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z30 = this.f2455b;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.e;
                if (h3Var != null && !h3Var.isDismissed()) {
                    h3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new ah(editTextBoldCursor, 3));
                        return;
                    }
                    return;
                } else if (c2Var2 != null && c2Var2.isShowing()) {
                    c2Var2.l(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new ah(editTextBoldCursor, 4));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 22:
                u50 u50Var = (u50) this.f2456c;
                TLObject tLObject5 = (TLObject) this.e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z31 = this.f2455b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        u50Var.u1(null, tL_chatInviteExported3.link, true, z31);
                        return;
                    }
                }
                return;
            case 23:
                y60 y60Var = (y60) this.f2456c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z32 = this.f2455b;
                if (tL_error2 == null) {
                    y60Var.f43733f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z32) {
                        if (y60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(y60Var.getParentActivity());
                            alertDialog$Builder3.f20678a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f20678a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            y60Var.showDialog(alertDialog$Builder3.f20678a);
                        } else {
                            return;
                        }
                    }
                }
                y60Var.e = false;
                y60Var.f43730a.l();
                return;
            case 24:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z33 = this.f2455b;
                an0 an0Var = ((mm0) this.f2456c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    an0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    an0Var.A1(z33);
                    return;
                }
                return;
            case 25:
                mm0 mm0Var = (mm0) this.f2456c;
                String str7 = (String) this.d;
                boolean z34 = this.f2455b;
                an0 an0Var2 = mm0Var.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.e);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    an0Var2.f35709c1 = tL_secureSecretSettings.secure_secret;
                    an0Var2.f35706b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        an0Var2.f35713e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str7), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        an0Var2.f35713e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr3;
                        AndroidUtilities.runOnUIThread(new x9(mm0Var, passwordsettings, z34, bArr2, 26));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new oj0(mm0Var, 6));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = an0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        an0Var2.f35713e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr4;
                    } else {
                        bArr = new byte[0];
                    }
                    an0Var2.f35709c1 = null;
                    an0Var2.f35706b1 = 0L;
                }
                bArr2 = bArr;
                AndroidUtilities.runOnUIThread(new x9(mm0Var, passwordsettings, z34, bArr2, 26));
                return;
            case 26:
                a();
                return;
            case 27:
                io0 io0Var = (io0) this.f2456c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                boolean z35 = this.f2455b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    io0Var.f38288a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    io0Var.A0(z35);
                    return;
                }
                return;
            case 28:
                bg1.c0((bg1) this.f2456c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.f2455b);
                return;
            default:
                qg.s0 s0Var = (qg.s0) this.f2456c;
                boolean z36 = this.f2455b;
                s0Var.f45047f.f(new qg.q0(s0Var, (a5.a) this.d, 0));
                s0Var.f45047f.f(new qg.q0(s0Var, (a5.a) this.e, 0));
                s0Var.E = z36;
                return;
        }
    }

    public x9(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f2454a = i10;
        this.f2456c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2455b = z10;
    }

    public x9(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f2454a = i10;
        this.f2456c = obj;
        this.d = obj2;
        this.f2455b = z10;
        this.e = obj3;
    }

    public x9(Object obj, TLObject tLObject, Object obj2, boolean z10, int i10) {
        this.f2454a = i10;
        this.f2456c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.f2455b = z10;
    }

    public x9(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f2454a = i10;
        this.f2456c = obj;
        this.f2455b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public x9(iy0 iy0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f2454a = 20;
        this.f2456c = iy0Var;
        this.e = tLObject;
        this.f2455b = z10;
        this.d = c2Var;
    }

    public x9(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f2454a = 17;
        this.f2455b = z10;
        this.f2456c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
