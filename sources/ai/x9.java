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
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ah;
import org.telegram.ui.ck0;
import org.telegram.ui.cn;
import org.telegram.ui.dp;
import org.telegram.ui.eh;
import org.telegram.ui.eo0;
import org.telegram.ui.ep;
import org.telegram.ui.gm0;
import org.telegram.ui.im0;
import org.telegram.ui.jm;
import org.telegram.ui.on;
import org.telegram.ui.q50;
import org.telegram.ui.qn;
import org.telegram.ui.u60;
import org.telegram.ui.ve0;
import org.telegram.ui.vf1;
import org.telegram.ui.vm0;
import org.telegram.ui.wo;
public final class x9 implements Runnable {
    public final int f2451a;
    public final boolean f2452b;
    public final Object f2453c;
    public final Object d;
    public final Object e;

    public x9(ci.m3 m3Var, View view, ah.i1 i1Var, boolean z10, boolean z11) {
        this.f2451a = 1;
        this.f2453c = m3Var;
        this.d = view;
        this.e = i1Var;
        this.f2452b = z10;
    }

    private final void a() {
        byte[] bArr;
        im0 im0Var = (im0) this.f2453c;
        boolean z10 = this.f2452b;
        byte[] bArr2 = (byte[]) this.e;
        vm0 vm0Var = im0Var.e;
        vm0Var.f42285d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            vm0Var.f42287e1 = vm0Var.P0;
        }
        byte[] bArr3 = vm0Var.f42283c1;
        byte[] bArr4 = vm0Var.f42287e1;
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
        if (vm0.Y0(bArr, Long.valueOf(vm0Var.f42280b1)) && bArr2.length != 0 && vm0Var.f42280b1 != 0) {
            if (vm0Var.f42281c == 0) {
                ConnectionsManager.getInstance(vm0.s0(vm0Var)).sendRequest(new TL_account.getAllSecureValues(), new gm0(im0Var, 0));
                return;
            }
            im0Var.a();
        } else if (z10) {
            UserConfig.getInstance(vm0.r0(vm0Var)).resetSavedPassword();
            vm0Var.N0 = 0;
            vm0Var.Q1();
        } else {
            TL_account.authorizationForm authorizationform = vm0Var.f42330y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                vm0Var.f42330y.errors.clear();
            }
            byte[] bArr7 = vm0Var.f42283c1;
            if (bArr7 != null && bArr7.length != 0) {
                im0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new ve0(im0Var, im0Var.f38022b, im0Var.d, 13));
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
        org.telegram.ui.ActionBar.d6 d6Var;
        ic icVar;
        int i15;
        int i16;
        boolean z11;
        byte[] bArr;
        Boolean bool = null;
        r9 = null;
        String str = null;
        String str2 = null;
        boolean z12 = true;
        switch (this.f2451a) {
            case 0:
                y9 y9Var = (y9) this.f2453c;
                TLObject tLObject = (TLObject) this.e;
                boolean z13 = this.f2452b;
                ArrayList arrayList = y9Var.f2504l;
                int i17 = y9Var.f2496a;
                if (((int[]) this.d)[0] == y9Var.f2505m) {
                    y9Var.f2501i = false;
                    y9Var.f2505m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i17).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i17).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z13) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        y9Var.f2503k = tL_payments_savedStarGifts.next_offset;
                        y9Var.f2506n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        y9Var.h = bool;
                        if (arrayList.size() <= y9Var.f2506n && y9Var.f2503k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        y9Var.f2502j = z10;
                    } else {
                        y9Var.f2502j = true;
                    }
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(y9Var.f2497b), y9Var);
                    return;
                }
                return;
            case 1:
                ci.m3 m3Var = (ci.m3) this.f2453c;
                ah.i1 i1Var = (ah.i1) this.e;
                boolean z14 = this.f2452b;
                ci.q4 q4Var = m3Var.f5607a;
                org.telegram.ui.Components.f5.Z(q4Var.C2, 1, q4Var.B1, new ci.l3(m3Var, z14, i1Var, (View) this.d));
                return;
            case 2:
                ei.t1 t1Var = (ei.t1) this.f2453c;
                TLObject tLObject2 = (TLObject) this.e;
                String str3 = (String) this.d;
                boolean z15 = this.f2452b;
                ei.v1 v1Var = t1Var.f9843s;
                if (t1Var.f9842r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        ei.n2 n2Var = v1Var.f9931r;
                        ArrayList arrayList2 = v1Var.f9930n;
                        i10 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
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
                    t1Var.f9842r = false;
                    return;
                }
                return;
            case 3:
                ei.a8 a8Var = (ei.a8) this.f2453c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z16 = this.f2452b;
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
                hg.h0 h0Var = (hg.h0) this.f2453c;
                boolean z17 = this.f2452b;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.d;
                hg.e0 e0Var = (hg.e0) this.e;
                if (!z17) {
                    h0Var.f11874c = e0Var;
                    u3Var.setRightText(h0Var.H(e0Var));
                    u3Var.setRightTextMargin(6);
                    h0Var.I.clear();
                    h0Var.d = true;
                    h0Var.l();
                    h0Var.Q();
                    return;
                }
                return;
            case 5:
                boolean z18 = this.f2452b;
                i2.i0 i0Var = (i2.i0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o10 = j2.i.o((Context) this.f2453c);
                if (o10 == null) {
                    e2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z18) {
                    j2.f fVar = i0Var.f12413s;
                    fVar.getClass();
                    fVar.f13942f.a(o10);
                }
                LogSessionId q6 = o10.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f13970b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.d;
                boolean z19 = this.f2452b;
                ki.t3 t3Var = (ki.t3) this.e;
                String trim = ((EditTextBoldCursor) this.f2453c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ki.j4.k(n2Var2, z19, new ah.h0(24, t3Var, trim));
                    return;
                }
                return;
            case 7:
                m4.f0 f0Var = (m4.f0) this.f2453c;
                boolean z20 = this.f2452b;
                m4.v vVar = (m4.v) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.i1 i1Var2 = f0Var.f16522g;
                if (z20) {
                    m4.o1 o1Var = new m4.o1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.u t10 = i1Var2.f16564b.t(vVar);
                        if (t10 != null) {
                            i11 = t10.b(m4.f0.B).f16647n;
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
                        i1Var2.f16564b.E(vVar);
                        v7.q8.b(new m4.s1(-100));
                    } catch (RemoteException e10) {
                        e2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        v7.q8.b(new m4.s1(-1));
                    }
                }
                runnable2.run();
                i1Var2.f16564b.m(vVar);
                return;
            case 8:
                ((CameraController) this.f2453c).lambda$initCamera$3(this.f2452b, (Exception) this.d, (Runnable) this.e);
                return;
            case 9:
                String[] strArr = (String[]) this.f2453c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                boolean z21 = this.f2452b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    org.telegram.ui.ActionBar.h6.f21034g0 = org.telegram.ui.ActionBar.h6.tl.get(org.telegram.ui.ActionBar.h6.f21039g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.h6.f21053h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.h6.f21053h0) + ".wp").getAbsolutePath();
                        try {
                            String str4 = g6Var.f20882c;
                            if (str4 != null && !str4.equals(absolutePath)) {
                                new File(g6Var.f20882c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        g6Var.f20882c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.h6.f21053h0);
                        g6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i18 = 0; i18 < split.length; i18++) {
                                if ("blur".equals(split[i18])) {
                                    g6Var.h = true;
                                } else if ("motion".equals(split[i18])) {
                                    g6Var.f20892n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        g6Var.f20896x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                g6Var.f20893r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    g6Var.f20894s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    g6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    g6Var.f20895w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                g6Var.f20896x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (g6Var.f20882c != null) {
                                new File(g6Var.f20882c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        g6Var.f20882c = null;
                        org.telegram.ui.ActionBar.h6.f21053h0 = null;
                    }
                    if (!z21 && org.telegram.ui.ActionBar.h6.M == null) {
                        org.telegram.ui.ActionBar.h6.K = g6Var;
                        if (org.telegram.ui.ActionBar.h6.I != org.telegram.ui.ActionBar.h6.J) {
                            z12 = false;
                        }
                        if (z12) {
                            org.telegram.ui.ActionBar.h6.T = 2000;
                            org.telegram.ui.ActionBar.h6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ah.j(21), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.h6.I = g6Var;
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (org.telegram.ui.ActionBar.h6.M == null && !org.telegram.ui.ActionBar.h6.Q) {
                    MessagesController.getInstance(g6Var.E).saveTheme(g6Var, g6Var.k(false), z21, false);
                }
                pVar.run();
                return;
            case 10:
                qn.v0((qn) this.f2453c, (String) this.d, (MessageObject) this.e, this.f2452b);
                return;
            case 11:
                cn cnVar = (cn) this.f2453c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z22 = this.f2452b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i19 = R.string.SuggestedMessageAcceptInfo;
                qn qnVar = cnVar.f36004a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i19, qnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                ag.a m10 = ag.a.m(message.suggested_post.price);
                if (m10.f631a == ag.b.f634b) {
                    i12 = qnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = qnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z22) {
                    m10 = ag.a.i((m10.f632b / 1000) * i12, m10.f631a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z22) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), gi.l.H0(i12))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z22) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), h1.p(message.suggested_post.schedule_date), gi.l.H0(i12))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), h1.p(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i20 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
                org.telegram.ui.w5 w5Var = new org.telegram.ui.w5(qcVarArr, 4);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.b2 u02 = org.telegram.ui.Components.f5.u0(qnVar, string, spannableStringBuilder, LocaleController.getString(i14), false, new t0(cnVar, message, b2VarArr, messageObject, w5Var, 26));
                b2VarArr[0] = u02;
                u02.setOnDismissListener(w5Var);
                if (z22 && m10.f631a == ag.b.f633a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(qnVar.getParentActivity());
                    d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
                    org.telegram.ui.Components.qc G = new org.telegram.ui.Components.xc(a2, d6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f29594j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 12:
                on onVar = (on) this.f2453c;
                onVar.l((org.telegram.ui.ActionBar.c4) this.d, (TLRPC.WallPaper) this.e, this.f2452b);
                onVar.h(onVar.f39927n);
                jm jmVar = onVar.V.X0;
                if (jmVar != null && (icVar = jmVar.L) != null) {
                    icVar.invalidate();
                    return;
                }
                return;
            case 13:
                wo woVar = (wo) this.f2453c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z23 = this.f2452b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    woVar.f42915l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = woVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z23) {
                        if (woVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(woVar.getParentActivity());
                            alertDialog$Builder.f20602a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            woVar.showDialog(alertDialog$Builder.f20602a);
                        } else {
                            return;
                        }
                    }
                }
                q90 q90Var = woVar.G;
                if (q90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = woVar.f42915l0;
                    if (tL_chatInviteExported2 != null) {
                        str2 = tL_chatInviteExported2.link;
                    }
                    q90Var.setLink(str2);
                    woVar.G.c(woVar.f42915l0, woVar.Z);
                    return;
                }
                return;
            case 14:
                ep epVar = (ep) this.f2453c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z24 = this.f2452b;
                chat.join_to_send = z24;
                epVar.f36734x.d.getMessagesController().toggleChatJoinToSend(chat.f20273id, z24, new y7(epVar, z24, chat, 18), new eh(17, epVar, (d90) this.e));
                return;
            case 15:
                ep epVar2 = (ep) this.f2453c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z25 = this.f2452b;
                chat2.join_request = z25;
                epVar2.f36734x.d.getMessagesController().toggleChatJoinRequest(chat2.f20273id, z25, new dp(epVar2, 0), new eh(16, epVar2, (c90) this.e));
                return;
            case 16:
                boolean z26 = this.f2452b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f2453c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z26 && ChatObject.isChannel(chat3)) {
                    View d = alertDialog$Builder2.f20602a.d(-1);
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
            case 17:
                mk mkVar = (mk) this.f2453c;
                boolean z27 = this.f2452b;
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
                int i21 = i16 + 1;
                String[] strArr2 = new String[i21];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList4 = new ArrayList();
                if (!z27) {
                    for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                        hk hkVar = (hk) arrayList3.get(i22);
                        File file = hkVar.f26890f;
                        if (file != null && !file.isDirectory()) {
                            int i23 = 0;
                            while (true) {
                                if (i23 < i21) {
                                    String str5 = strArr2[i23];
                                    String str6 = hkVar.f26888b;
                                    if (str6 != null) {
                                        z11 = str6.toLowerCase().contains(str5);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList4.add(hkVar);
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(13, mkVar, arrayList4));
                return;
            case 18:
                a90.v((a90) this.f2453c, (TLRPC.TL_error) this.d, this.f2452b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 19:
                TLObject tLObject4 = (TLObject) this.e;
                boolean z28 = this.f2452b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
                py0 py0Var = ((ey0) this.f2453c).f26046a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z28) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        py0Var.S = tL_messages_stickerSet;
                        py0Var.u0();
                        py0Var.C0();
                    }
                }
                b2Var.dismiss();
                return;
            case 20:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f2453c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z29 = this.f2452b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                if (f3Var != null && !f3Var.isDismissed()) {
                    f3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z29) {
                        AndroidUtilities.runOnUIThread(new ah(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (b2Var2 != null && b2Var2.isShowing()) {
                    b2Var2.l(true);
                    editTextBoldCursor.requestFocus();
                    if (z29) {
                        AndroidUtilities.runOnUIThread(new ah(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 21:
                q50 q50Var = (q50) this.f2453c;
                TLObject tLObject5 = (TLObject) this.e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z30 = this.f2452b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        q50Var.v1(null, tL_chatInviteExported3.link, true, z30);
                        return;
                    }
                }
                return;
            case 22:
                u60 u60Var = (u60) this.f2453c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z31 = this.f2452b;
                if (tL_error2 == null) {
                    u60Var.f41807f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z31) {
                        if (u60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(u60Var.getParentActivity());
                            alertDialog$Builder3.f20602a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f20602a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            u60Var.showDialog(alertDialog$Builder3.f20602a);
                        } else {
                            return;
                        }
                    }
                }
                u60Var.e = false;
                u60Var.f41804a.l();
                return;
            case 23:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z32 = this.f2452b;
                vm0 vm0Var = ((im0) this.f2453c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    vm0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    vm0Var.A1(z32);
                    return;
                }
                return;
            case 24:
                im0 im0Var = (im0) this.f2453c;
                String str7 = (String) this.d;
                boolean z33 = this.f2452b;
                vm0 vm0Var2 = im0Var.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.e);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    vm0Var2.f42283c1 = tL_secureSecretSettings.secure_secret;
                    vm0Var2.f42280b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        vm0Var2.f42287e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str7), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        vm0Var2.f42287e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new ck0(im0Var, 5));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = vm0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        vm0Var2.f42287e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    vm0Var2.f42283c1 = null;
                    vm0Var2.f42280b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new x9(im0Var, passwordsettings, z33, bArr, 25));
                return;
            case 25:
                a();
                return;
            case 26:
                eo0 eo0Var = (eo0) this.f2453c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                boolean z34 = this.f2452b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    eo0Var.f36693a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    eo0Var.A0(z34);
                    return;
                }
                return;
            case 27:
                vf1.c0((vf1) this.f2453c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.f2452b);
                return;
            default:
                qg.t0 t0Var = (qg.t0) this.f2453c;
                boolean z35 = this.f2452b;
                t0Var.f44630f.f(new qg.r0(t0Var, (a5.a) this.d, 0));
                t0Var.f44630f.f(new qg.r0(t0Var, (a5.a) this.e, 0));
                t0Var.E = z35;
                return;
        }
    }

    public x9(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f2451a = i10;
        this.f2453c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2452b = z10;
    }

    public x9(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f2451a = i10;
        this.f2453c = obj;
        this.d = obj2;
        this.f2452b = z10;
        this.e = obj3;
    }

    public x9(Object obj, TLObject tLObject, Object obj2, boolean z10, int i10) {
        this.f2451a = i10;
        this.f2453c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.f2452b = z10;
    }

    public x9(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f2451a = i10;
        this.f2453c = obj;
        this.f2452b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public x9(ey0 ey0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f2451a = 19;
        this.f2453c = ey0Var;
        this.e = tLObject;
        this.f2452b = z10;
        this.d = b2Var;
    }

    public x9(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f2451a = 16;
        this.f2452b = z10;
        this.f2453c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
