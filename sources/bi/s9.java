package bi;

import a8.ng;
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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ap;
import org.telegram.ui.dg1;
import org.telegram.ui.fn;
import org.telegram.ui.hh;
import org.telegram.ui.hp;
import org.telegram.ui.in0;
import org.telegram.ui.ip;
import org.telegram.ui.jp;
import org.telegram.ui.lj0;
import org.telegram.ui.mm;
import org.telegram.ui.oe0;
import org.telegram.ui.po0;
import org.telegram.ui.sm0;
import org.telegram.ui.sn;
import org.telegram.ui.um0;
import org.telegram.ui.un;
import org.telegram.ui.v50;
import org.telegram.ui.z60;
public final class s9 implements Runnable {
    public final int f5413a;
    public final boolean f5414b;
    public final Object f5415c;
    public final Object d;
    public final Object e;

    public s9(di.l3 l3Var, View view, bh.x0 x0Var, boolean z10, boolean z11) {
        this.f5413a = 1;
        this.f5415c = l3Var;
        this.d = view;
        this.e = x0Var;
        this.f5414b = z10;
    }

    private final void a() {
        byte[] bArr;
        um0 um0Var = (um0) this.f5415c;
        boolean z10 = this.f5414b;
        byte[] bArr2 = (byte[]) this.e;
        in0 in0Var = um0Var.e;
        in0Var.f40282d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            in0Var.f40284e1 = in0Var.P0;
        }
        byte[] bArr3 = in0Var.f40280c1;
        byte[] bArr4 = in0Var.f40284e1;
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
        if (in0.Z0(bArr, Long.valueOf(in0Var.f40277b1)) && bArr2.length != 0 && in0Var.f40277b1 != 0) {
            if (in0Var.f40278c == 0) {
                ConnectionsManager.getInstance(in0.t0(in0Var)).sendRequest(new TL_account.getAllSecureValues(), new sm0(um0Var, 0));
                return;
            }
            um0Var.a();
        } else if (z10) {
            UserConfig.getInstance(in0.s0(in0Var)).resetSavedPassword();
            in0Var.N0 = 0;
            in0Var.S1();
        } else {
            TL_account.authorizationForm authorizationform = in0Var.f40327y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                in0Var.f40327y.errors.clear();
            }
            byte[] bArr7 = in0Var.f40280c1;
            if (bArr7 != null && bArr7.length != 0) {
                um0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new oe0(um0Var, um0Var.f44169b, um0Var.d, 15));
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
        org.telegram.ui.ActionBar.u6 u6Var;
        cc ccVar;
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
        switch (this.f5413a) {
            case 0:
                t9 t9Var = (t9) this.f5415c;
                TLObject tLObject = (TLObject) this.e;
                boolean z13 = this.f5414b;
                ArrayList arrayList = t9Var.f5471l;
                int i17 = t9Var.f5463a;
                if (((int[]) this.d)[0] == t9Var.f5472m) {
                    t9Var.f5468i = false;
                    t9Var.f5472m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i17).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i17).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z13) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        t9Var.f5470k = tL_payments_savedStarGifts.next_offset;
                        t9Var.f5473n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        t9Var.h = bool;
                        if (arrayList.size() <= t9Var.f5473n && t9Var.f5470k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        t9Var.f5469j = z10;
                    } else {
                        t9Var.f5469j = true;
                    }
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(t9Var.f5464b), t9Var);
                    return;
                }
                return;
            case 1:
                di.l3 l3Var = (di.l3) this.f5415c;
                bh.x0 x0Var = (bh.x0) this.e;
                boolean z14 = this.f5414b;
                di.q4 q4Var = l3Var.f8756a;
                org.telegram.ui.Components.g5.Z(q4Var.f9021r2, 1, q4Var.f9016q1, new di.k3(l3Var, z14, x0Var, (View) this.d));
                return;
            case 2:
                fi.s1 s1Var = (fi.s1) this.f5415c;
                TLObject tLObject2 = (TLObject) this.e;
                String str3 = (String) this.d;
                boolean z15 = this.f5414b;
                fi.u1 u1Var = s1Var.f11578s;
                if (s1Var.f11577r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        fi.l2 l2Var = u1Var.f11746r;
                        ArrayList arrayList2 = u1Var.f11745n;
                        i10 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str3, messages_botresults);
                        s1Var.h = messages_botresults.next_offset;
                        if (z15) {
                            arrayList2.clear();
                        }
                        arrayList2.size();
                        arrayList2.addAll(messages_botresults.results);
                        s1Var.l();
                    }
                    u1Var.d.c(false);
                    s1Var.f11577r = false;
                    return;
                }
                return;
            case 3:
                fi.w7 w7Var = (fi.w7) this.f5415c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z16 = this.f5414b;
                Runnable runnable = (Runnable) this.e;
                w7Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(w7Var.Z0);
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
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(w7Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 4:
                boolean z17 = this.f5414b;
                i2.j0 j0Var = (i2.j0) this.d;
                j2.j jVar = (j2.j) this.e;
                j2.h o10 = j2.h.o((Context) this.f5415c);
                if (o10 == null) {
                    e2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z17) {
                    j2.e eVar = j0Var.f13614s;
                    eVar.getClass();
                    eVar.f15200f.a(o10);
                }
                LogSessionId q5 = o10.q();
                synchronized (jVar) {
                    j2.i iVar = jVar.f15228b;
                    iVar.getClass();
                    iVar.f(q5);
                }
                return;
            case 5:
                ig.i0 i0Var = (ig.i0) this.f5415c;
                boolean z18 = this.f5414b;
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) this.d;
                ig.f0 f0Var = (ig.f0) this.e;
                if (!z18) {
                    i0Var.f14074c = f0Var;
                    z3Var.setRightText(i0Var.H(f0Var));
                    z3Var.setRightTextMargin(6);
                    i0Var.I.clear();
                    i0Var.d = true;
                    i0Var.l();
                    i0Var.P();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                boolean z19 = this.f5414b;
                li.s3 s3Var = (li.s3) this.e;
                String trim = ((EditTextBoldCursor) this.f5415c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    li.j4.k(r2Var, z19, new ai.f0(26, s3Var, trim));
                    return;
                }
                return;
            case 7:
                m4.f0 f0Var2 = (m4.f0) this.f5415c;
                boolean z20 = this.f5414b;
                m4.w wVar = (m4.w) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.j1 j1Var = f0Var2.f18045g;
                if (z20) {
                    m4.p1 p1Var = new m4.p1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.u p10 = j1Var.f18092b.p(wVar);
                        if (p10 != null) {
                            i11 = p10.b(m4.f0.B).f18172n;
                        } else if (!f0Var2.h(wVar)) {
                            a8.qd.b(new m4.t1(-100));
                        } else {
                            a8.qd.b(new m4.t1(0));
                            i11 = 0;
                        }
                        m4.v vVar = wVar.d;
                        if (vVar != null) {
                            vVar.e(i11, p1Var);
                        }
                    } catch (DeadObjectException unused) {
                        j1Var.f18092b.B(wVar);
                        a8.qd.b(new m4.t1(-100));
                    } catch (RemoteException e11) {
                        e2.a.m("MediaSessionImpl", "Exception in " + wVar, e11);
                        a8.qd.b(new m4.t1(-1));
                    }
                }
                runnable2.run();
                j1Var.f18092b.i(wVar);
                return;
            case 8:
                ((CameraController) this.f5415c).lambda$initCamera$3(this.f5414b, (Exception) this.d, (Runnable) this.e);
                return;
            case 9:
                String[] strArr = (String[]) this.f5415c;
                org.telegram.ui.ActionBar.x6 x6Var = (org.telegram.ui.ActionBar.x6) this.d;
                boolean z21 = this.f5414b;
                org.telegram.ui.ActionBar.q qVar = (org.telegram.ui.ActionBar.q) this.e;
                try {
                    org.telegram.ui.ActionBar.y6.f23406g0 = org.telegram.ui.ActionBar.y6.tl.get(org.telegram.ui.ActionBar.y6.f23411g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.y6.f23422h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.y6.f23422h0) + ".wp").getAbsolutePath();
                        try {
                            String str4 = x6Var.f23255c;
                            if (str4 != null && !str4.equals(absolutePath)) {
                                new File(x6Var.f23255c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        x6Var.f23255c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.y6.f23422h0);
                        x6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i18 = 0; i18 < split.length; i18++) {
                                if ("blur".equals(split[i18])) {
                                    x6Var.h = true;
                                } else if ("motion".equals(split[i18])) {
                                    x6Var.f23265n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        x6Var.f23269x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                x6Var.f23266r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    x6Var.f23267s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    x6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    x6Var.f23268w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                x6Var.f23269x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (x6Var.f23255c != null) {
                                new File(x6Var.f23255c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        x6Var.f23255c = null;
                        org.telegram.ui.ActionBar.y6.f23422h0 = null;
                    }
                    if (!z21 && org.telegram.ui.ActionBar.y6.M == null) {
                        org.telegram.ui.ActionBar.y6.K = x6Var;
                        if (org.telegram.ui.ActionBar.y6.I != org.telegram.ui.ActionBar.y6.J) {
                            z12 = false;
                        }
                        if (z12) {
                            org.telegram.ui.ActionBar.y6.T = 2000;
                            org.telegram.ui.ActionBar.y6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ag.c(23), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.y6.I = x6Var;
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (org.telegram.ui.ActionBar.y6.M == null && !org.telegram.ui.ActionBar.y6.Q) {
                    MessagesController.getInstance(x6Var.E).saveTheme(x6Var, x6Var.k(false), z21, false);
                }
                qVar.run();
                return;
            case 10:
                un.w1((un) this.f5415c, (String) this.d, (MessageObject) this.e, this.f5414b);
                return;
            case 11:
                un unVar = (un) this.f5415c;
                org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) this.d;
                org.telegram.ui.ActionBar.x6 x6Var2 = (org.telegram.ui.ActionBar.x6) this.e;
                boolean z22 = this.f5414b;
                if (w6Var != null) {
                    unVar.getClass();
                    org.telegram.ui.ActionBar.w6 k10 = x6Var2.k(false);
                    int i19 = w6Var.f23215a;
                    UndoView undoView = unVar.K3;
                    if (undoView != null) {
                        view = undoView.getUndoButton();
                    }
                    org.telegram.ui.ActionBar.y6.H1(x6Var2, false, i19, view);
                    if (z22) {
                        org.telegram.ui.ActionBar.y6.k0(x6Var2, k10, true);
                        return;
                    }
                    return;
                }
                UndoView undoView2 = unVar.K3;
                if (undoView2 != null) {
                    view2 = undoView2.getUndoButton();
                }
                org.telegram.ui.ActionBar.y6.H1(x6Var2, false, -1, view2);
                return;
            case 12:
                fn fnVar = (fn) this.f5415c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z23 = this.f5414b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                un unVar2 = fnVar.f39423a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, unVar2.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                bg.a m10 = bg.a.m(message.suggested_post.price);
                if (m10.f3978a == bg.b.f3981b) {
                    i12 = unVar2.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = unVar2.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z23) {
                    m10 = bg.a.i((m10.f3979b / 1000) * i12, m10.f3978a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z23) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), hi.k.F0(i12))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z23) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), g1.o(message.suggested_post.schedule_date), hi.k.F0(i12))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), g1.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i21 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((org.telegram.ui.ActionBar.r2) unVar2).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
                org.telegram.ui.u5 u5Var = new org.telegram.ui.u5(qcVarArr, 4);
                org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.e2 u02 = org.telegram.ui.Components.g5.u0(unVar2, string, spannableStringBuilder, LocaleController.getString(i14), false, new u0(fnVar, message, e2VarArr, messageObject, u5Var, 26));
                e2VarArr[0] = u02;
                u02.setOnDismissListener(u5Var);
                if (z23 && m10.f3978a == bg.b.f3980a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(unVar2.getParentActivity());
                    u6Var = ((org.telegram.ui.ActionBar.r2) unVar2).resourceProvider;
                    org.telegram.ui.Components.qc G = new org.telegram.ui.Components.wc(a2, u6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f31889j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                sn snVar = (sn) this.f5415c;
                snVar.r((org.telegram.ui.ActionBar.h4) this.d, (TLRPC.WallPaper) this.e, this.f5414b);
                snVar.o(snVar.h);
                mm mmVar = snVar.F.f44295j1;
                if (mmVar != null && (ccVar = mmVar.L) != null) {
                    ccVar.invalidate();
                    return;
                }
                return;
            case 14:
                ap apVar = (ap) this.f5415c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z24 = this.f5414b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    apVar.f37859l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = apVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z24) {
                        if (apVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(apVar.getParentActivity());
                            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            apVar.showDialog(alertDialog$Builder.f22368a);
                        } else {
                            return;
                        }
                    }
                }
                r90 r90Var = apVar.G;
                if (r90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = apVar.f37859l0;
                    if (tL_chatInviteExported2 != null) {
                        str2 = tL_chatInviteExported2.link;
                    }
                    r90Var.setLink(str2);
                    apVar.G.c(apVar.f37859l0, apVar.Z);
                    return;
                }
                return;
            case 15:
                jp jpVar = (jp) this.f5415c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z25 = this.f5414b;
                chat.join_to_send = z25;
                jpVar.f40713x.d.getMessagesController().toggleChatJoinToSend(chat.f22027id, z25, new u7(jpVar, z25, chat, 17), new org.telegram.ui.ed(28, jpVar, (f90) this.e));
                return;
            case 16:
                jp jpVar2 = (jp) this.f5415c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z26 = this.f5414b;
                chat2.join_request = z26;
                jpVar2.f40713x.d.getMessagesController().toggleChatJoinRequest(chat2.f22027id, z26, new hp(jpVar2, 0), new org.telegram.ui.ed(27, jpVar2, (e90) this.e));
                return;
            case 17:
                boolean z27 = this.f5414b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f5415c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z27 && ChatObject.isChannel(chat3)) {
                    View d = alertDialog$Builder2.f22368a.d(-1);
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
                mk mkVar = (mk) this.f5415c;
                boolean z28 = this.f5414b;
                ArrayList arrayList3 = (ArrayList) this.e;
                mkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ip(23, mkVar, new ArrayList()));
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
                        File file = hkVar.f29005f;
                        if (file != null && !file.isDirectory()) {
                            int i24 = 0;
                            while (true) {
                                if (i24 < i22) {
                                    String str5 = strArr2[i24];
                                    String str6 = hkVar.f29003b;
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
                AndroidUtilities.runOnUIThread(new ip(23, mkVar, arrayList4));
                return;
            case 19:
                c90.t((c90) this.f5415c, (TLRPC.TL_error) this.d, this.f5414b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                TLObject tLObject4 = (TLObject) this.e;
                boolean z29 = this.f5414b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                cz0 cz0Var = ((ry0) this.f5415c).f32347a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z29) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        cz0Var.S = tL_messages_stickerSet;
                        cz0Var.v0();
                        cz0Var.D0();
                    }
                }
                e2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f5415c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z30 = this.f5414b;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.e;
                if (k3Var != null && !k3Var.isDismissed()) {
                    k3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new hh(editTextBoldCursor, 3));
                        return;
                    }
                    return;
                } else if (e2Var2 != null && e2Var2.isShowing()) {
                    e2Var2.l(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new hh(editTextBoldCursor, 4));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 22:
                v50 v50Var = (v50) this.f5415c;
                TLObject tLObject5 = (TLObject) this.e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z31 = this.f5414b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        v50Var.u1(null, tL_chatInviteExported3.link, true, z31);
                        return;
                    }
                }
                return;
            case 23:
                z60 z60Var = (z60) this.f5415c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z32 = this.f5414b;
                if (tL_error2 == null) {
                    z60Var.f46186f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z32) {
                        if (z60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(z60Var.getParentActivity());
                            alertDialog$Builder3.f22368a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f22368a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            z60Var.showDialog(alertDialog$Builder3.f22368a);
                        } else {
                            return;
                        }
                    }
                }
                z60Var.e = false;
                z60Var.f46183a.l();
                return;
            case 24:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z33 = this.f5414b;
                in0 in0Var = ((um0) this.f5415c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    in0Var.J = password;
                    TwoStepVerificationActivity.n0(password);
                    in0Var.B1(z33);
                    return;
                }
                return;
            case 25:
                um0 um0Var = (um0) this.f5415c;
                String str7 = (String) this.d;
                boolean z34 = this.f5414b;
                in0 in0Var2 = um0Var.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.e);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    in0Var2.f40280c1 = tL_secureSecretSettings.secure_secret;
                    in0Var2.f40277b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        in0Var2.f40284e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str7), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        in0Var2.f40284e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr3;
                        AndroidUtilities.runOnUIThread(new s9(um0Var, passwordsettings, z34, bArr2, 26));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new lj0(um0Var, 6));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = in0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        in0Var2.f40284e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr4;
                    } else {
                        bArr = new byte[0];
                    }
                    in0Var2.f40280c1 = null;
                    in0Var2.f40277b1 = 0L;
                }
                bArr2 = bArr;
                AndroidUtilities.runOnUIThread(new s9(um0Var, passwordsettings, z34, bArr2, 26));
                return;
            case 26:
                a();
                return;
            case 27:
                po0 po0Var = (po0) this.f5415c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                boolean z35 = this.f5414b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    po0Var.f42587a0 = password2;
                    TwoStepVerificationActivity.n0(password2);
                    po0Var.B0(z35);
                    return;
                }
                return;
            case 28:
                dg1.d0((dg1) this.f5415c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.f5414b);
                return;
            default:
                rg.q0 q0Var = (rg.q0) this.f5415c;
                boolean z36 = this.f5414b;
                q0Var.f47506f.f(new rg.o0(q0Var, (ng) this.d, 0));
                q0Var.f47506f.f(new rg.o0(q0Var, (ng) this.e, 0));
                q0Var.E = z36;
                return;
        }
    }

    public s9(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f5413a = i10;
        this.f5415c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5414b = z10;
    }

    public s9(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f5413a = i10;
        this.f5415c = obj;
        this.d = obj2;
        this.f5414b = z10;
        this.e = obj3;
    }

    public s9(Object obj, TLObject tLObject, Object obj2, boolean z10, int i10) {
        this.f5413a = i10;
        this.f5415c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.f5414b = z10;
    }

    public s9(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f5413a = i10;
        this.f5415c = obj;
        this.f5414b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public s9(ry0 ry0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f5413a = 20;
        this.f5415c = ry0Var;
        this.e = tLObject;
        this.f5414b = z10;
        this.d = e2Var;
    }

    public s9(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f5413a = 17;
        this.f5414b = z10;
        this.f5415c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
