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
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ch;
import org.telegram.ui.ek0;
import org.telegram.ui.en;
import org.telegram.ui.fp;
import org.telegram.ui.gh;
import org.telegram.ui.go0;
import org.telegram.ui.gp;
import org.telegram.ui.im0;
import org.telegram.ui.km0;
import org.telegram.ui.lm;
import org.telegram.ui.qn;
import org.telegram.ui.s50;
import org.telegram.ui.sn;
import org.telegram.ui.w60;
import org.telegram.ui.xe0;
import org.telegram.ui.xf1;
import org.telegram.ui.xm0;
import org.telegram.ui.yo;
public final class x9 implements Runnable {
    public final int f2444a;
    public final boolean f2445b;
    public final Object f2446c;
    public final Object d;
    public final Object e;

    public x9(ci.m3 m3Var, View view, ah.i1 i1Var, boolean z10, boolean z11) {
        this.f2444a = 1;
        this.f2446c = m3Var;
        this.d = view;
        this.e = i1Var;
        this.f2445b = z10;
    }

    private final void a() {
        byte[] bArr;
        km0 km0Var = (km0) this.f2446c;
        boolean z10 = this.f2445b;
        byte[] bArr2 = (byte[]) this.e;
        xm0 xm0Var = km0Var.e;
        xm0Var.f43193d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            xm0Var.f43195e1 = xm0Var.P0;
        }
        byte[] bArr3 = xm0Var.f43191c1;
        byte[] bArr4 = xm0Var.f43195e1;
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
        if (xm0.Y0(bArr, Long.valueOf(xm0Var.f43188b1)) && bArr2.length != 0 && xm0Var.f43188b1 != 0) {
            if (xm0Var.f43189c == 0) {
                ConnectionsManager.getInstance(xm0.s0(xm0Var)).sendRequest(new TL_account.getAllSecureValues(), new im0(km0Var, 0));
                return;
            }
            km0Var.a();
        } else if (z10) {
            UserConfig.getInstance(xm0.r0(xm0Var)).resetSavedPassword();
            xm0Var.N0 = 0;
            xm0Var.Q1();
        } else {
            TL_account.authorizationForm authorizationform = xm0Var.f43238y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                xm0Var.f43238y.errors.clear();
            }
            byte[] bArr7 = xm0Var.f43191c1;
            if (bArr7 != null && bArr7.length != 0) {
                km0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new xe0(km0Var, km0Var.f38587b, km0Var.d, 13));
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
        switch (this.f2444a) {
            case 0:
                y9 y9Var = (y9) this.f2446c;
                TLObject tLObject = (TLObject) this.e;
                boolean z13 = this.f2445b;
                ArrayList arrayList = y9Var.f2498l;
                int i17 = y9Var.f2490a;
                if (((int[]) this.d)[0] == y9Var.f2499m) {
                    y9Var.f2495i = false;
                    y9Var.f2499m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i17).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i17).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z13) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        y9Var.f2497k = tL_payments_savedStarGifts.next_offset;
                        y9Var.f2500n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        y9Var.h = bool;
                        if (arrayList.size() <= y9Var.f2500n && y9Var.f2497k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        y9Var.f2496j = z10;
                    } else {
                        y9Var.f2496j = true;
                    }
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(y9Var.f2491b), y9Var);
                    return;
                }
                return;
            case 1:
                ci.m3 m3Var = (ci.m3) this.f2446c;
                ah.i1 i1Var = (ah.i1) this.e;
                boolean z14 = this.f2445b;
                ci.q4 q4Var = m3Var.f5610a;
                org.telegram.ui.Components.f5.Z(q4Var.C2, 1, q4Var.B1, new ci.l3(m3Var, z14, i1Var, (View) this.d));
                return;
            case 2:
                ei.t1 t1Var = (ei.t1) this.f2446c;
                TLObject tLObject2 = (TLObject) this.e;
                String str3 = (String) this.d;
                boolean z15 = this.f2445b;
                ei.v1 v1Var = t1Var.f9846s;
                if (t1Var.f9845r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        ei.n2 n2Var = v1Var.f9934r;
                        ArrayList arrayList2 = v1Var.f9933n;
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
                    t1Var.f9845r = false;
                    return;
                }
                return;
            case 3:
                ei.a8 a8Var = (ei.a8) this.f2446c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z16 = this.f2445b;
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
                hg.h0 h0Var = (hg.h0) this.f2446c;
                boolean z17 = this.f2445b;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.d;
                hg.e0 e0Var = (hg.e0) this.e;
                if (!z17) {
                    h0Var.f11877c = e0Var;
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
                boolean z18 = this.f2445b;
                i2.h0 h0Var2 = (i2.h0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o10 = j2.i.o((Context) this.f2446c);
                if (o10 == null) {
                    e2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z18) {
                    j2.f fVar = h0Var2.f12412s;
                    fVar.getClass();
                    fVar.f13944f.a(o10);
                }
                LogSessionId q6 = o10.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f13972b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.d;
                boolean z19 = this.f2445b;
                ki.t3 t3Var = (ki.t3) this.e;
                String trim = ((EditTextBoldCursor) this.f2446c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ki.j4.k(n2Var2, z19, new ah.h0(24, t3Var, trim));
                    return;
                }
                return;
            case 7:
                m4.f0 f0Var = (m4.f0) this.f2446c;
                boolean z20 = this.f2445b;
                m4.v vVar = (m4.v) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.i1 i1Var2 = f0Var.f16523g;
                if (z20) {
                    m4.o1 o1Var = new m4.o1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.u t10 = i1Var2.f16565b.t(vVar);
                        if (t10 != null) {
                            i11 = t10.b(m4.f0.B).f16648n;
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
                        i1Var2.f16565b.E(vVar);
                        v7.q8.b(new m4.s1(-100));
                    } catch (RemoteException e10) {
                        e2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        v7.q8.b(new m4.s1(-1));
                    }
                }
                runnable2.run();
                i1Var2.f16565b.m(vVar);
                return;
            case 8:
                ((CameraController) this.f2446c).lambda$initCamera$3(this.f2445b, (Exception) this.d, (Runnable) this.e);
                return;
            case 9:
                String[] strArr = (String[]) this.f2446c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                boolean z21 = this.f2445b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    org.telegram.ui.ActionBar.h6.f21040g0 = org.telegram.ui.ActionBar.h6.tl.get(org.telegram.ui.ActionBar.h6.f21045g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.h6.f21059h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.h6.f21059h0) + ".wp").getAbsolutePath();
                        try {
                            String str4 = g6Var.f20888c;
                            if (str4 != null && !str4.equals(absolutePath)) {
                                new File(g6Var.f20888c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        g6Var.f20888c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.h6.f21059h0);
                        g6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i18 = 0; i18 < split.length; i18++) {
                                if ("blur".equals(split[i18])) {
                                    g6Var.h = true;
                                } else if ("motion".equals(split[i18])) {
                                    g6Var.f20898n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        g6Var.f20902x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                g6Var.f20899r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    g6Var.f20900s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    g6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    g6Var.f20901w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                g6Var.f20902x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (g6Var.f20888c != null) {
                                new File(g6Var.f20888c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        g6Var.f20888c = null;
                        org.telegram.ui.ActionBar.h6.f21059h0 = null;
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
                sn.v0((sn) this.f2446c, (String) this.d, (MessageObject) this.e, this.f2445b);
                return;
            case 11:
                en enVar = (en) this.f2446c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z22 = this.f2445b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i19 = R.string.SuggestedMessageAcceptInfo;
                sn snVar = enVar.f36573a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i19, snVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                ag.a m10 = ag.a.m(message.suggested_post.price);
                if (m10.f631a == ag.c.f636b) {
                    i12 = snVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = snVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
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
                i13 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
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
                org.telegram.ui.ActionBar.b2 u02 = org.telegram.ui.Components.f5.u0(snVar, string, spannableStringBuilder, LocaleController.getString(i14), false, new t0(enVar, message, b2VarArr, messageObject, w5Var, 26));
                b2VarArr[0] = u02;
                u02.setOnDismissListener(w5Var);
                if (z22 && m10.f631a == ag.c.f635a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(snVar.getParentActivity());
                    d6Var = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
                    org.telegram.ui.Components.qc G = new org.telegram.ui.Components.xc(a2, d6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f29645j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 12:
                qn qnVar = (qn) this.f2446c;
                qnVar.l((org.telegram.ui.ActionBar.c4) this.d, (TLRPC.WallPaper) this.e, this.f2445b);
                qnVar.h(qnVar.f40478n);
                lm lmVar = qnVar.V.X0;
                if (lmVar != null && (icVar = lmVar.L) != null) {
                    icVar.invalidate();
                    return;
                }
                return;
            case 13:
                yo yoVar = (yo) this.f2446c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z23 = this.f2445b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    yoVar.f43473l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = yoVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z23) {
                        if (yoVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yoVar.getParentActivity());
                            alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            yoVar.showDialog(alertDialog$Builder.f20608a);
                        } else {
                            return;
                        }
                    }
                }
                q90 q90Var = yoVar.G;
                if (q90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = yoVar.f43473l0;
                    if (tL_chatInviteExported2 != null) {
                        str2 = tL_chatInviteExported2.link;
                    }
                    q90Var.setLink(str2);
                    yoVar.G.c(yoVar.f43473l0, yoVar.Z);
                    return;
                }
                return;
            case 14:
                gp gpVar = (gp) this.f2446c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z24 = this.f2445b;
                chat.join_to_send = z24;
                gpVar.f37295x.d.getMessagesController().toggleChatJoinToSend(chat.f20279id, z24, new x7(gpVar, z24, chat, 18), new gh(17, gpVar, (d90) this.e));
                return;
            case 15:
                gp gpVar2 = (gp) this.f2446c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z25 = this.f2445b;
                chat2.join_request = z25;
                gpVar2.f37295x.d.getMessagesController().toggleChatJoinRequest(chat2.f20279id, z25, new fp(gpVar2, 0), new gh(16, gpVar2, (c90) this.e));
                return;
            case 16:
                boolean z26 = this.f2445b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f2446c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z26 && ChatObject.isChannel(chat3)) {
                    View d = alertDialog$Builder2.f20608a.d(-1);
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
                mk mkVar = (mk) this.f2446c;
                boolean z27 = this.f2445b;
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
                        File file = hkVar.f26904f;
                        if (file != null && !file.isDirectory()) {
                            int i23 = 0;
                            while (true) {
                                if (i23 < i21) {
                                    String str5 = strArr2[i23];
                                    String str6 = hkVar.f26902b;
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
                a90.v((a90) this.f2446c, (TLRPC.TL_error) this.d, this.f2445b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 19:
                TLObject tLObject4 = (TLObject) this.e;
                boolean z28 = this.f2445b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
                oy0 oy0Var = ((dy0) this.f2446c).f25734a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z28) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        oy0Var.S = tL_messages_stickerSet;
                        oy0Var.u0();
                        oy0Var.C0();
                    }
                }
                b2Var.dismiss();
                return;
            case 20:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f2446c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z29 = this.f2445b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                if (f3Var != null && !f3Var.isDismissed()) {
                    f3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z29) {
                        AndroidUtilities.runOnUIThread(new ch(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (b2Var2 != null && b2Var2.isShowing()) {
                    b2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z29) {
                        AndroidUtilities.runOnUIThread(new ch(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 21:
                s50 s50Var = (s50) this.f2446c;
                TLObject tLObject5 = (TLObject) this.e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z30 = this.f2445b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        s50Var.v1(null, tL_chatInviteExported3.link, true, z30);
                        return;
                    }
                }
                return;
            case 22:
                w60 w60Var = (w60) this.f2446c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z31 = this.f2445b;
                if (tL_error2 == null) {
                    w60Var.f42394f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z31) {
                        if (w60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(w60Var.getParentActivity());
                            alertDialog$Builder3.f20608a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f20608a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            w60Var.showDialog(alertDialog$Builder3.f20608a);
                        } else {
                            return;
                        }
                    }
                }
                w60Var.e = false;
                w60Var.f42391a.l();
                return;
            case 23:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z32 = this.f2445b;
                xm0 xm0Var = ((km0) this.f2446c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    xm0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    xm0Var.A1(z32);
                    return;
                }
                return;
            case 24:
                km0 km0Var = (km0) this.f2446c;
                String str7 = (String) this.d;
                boolean z33 = this.f2445b;
                xm0 xm0Var2 = km0Var.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.e);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    xm0Var2.f43191c1 = tL_secureSecretSettings.secure_secret;
                    xm0Var2.f43188b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        xm0Var2.f43195e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str7), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        xm0Var2.f43195e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new ek0(km0Var, 5));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = xm0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        xm0Var2.f43195e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    xm0Var2.f43191c1 = null;
                    xm0Var2.f43188b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new x9(km0Var, passwordsettings, z33, bArr, 25));
                return;
            case 25:
                a();
                return;
            case 26:
                go0 go0Var = (go0) this.f2446c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                boolean z34 = this.f2445b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    go0Var.f37254a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    go0Var.A0(z34);
                    return;
                }
                return;
            case 27:
                xf1.c0((xf1) this.f2446c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.f2445b);
                return;
            default:
                qg.s0 s0Var = (qg.s0) this.f2446c;
                boolean z35 = this.f2445b;
                s0Var.f44668f.f(new qg.q0(s0Var, (a5.a) this.d, 0));
                s0Var.f44668f.f(new qg.q0(s0Var, (a5.a) this.e, 0));
                s0Var.E = z35;
                return;
        }
    }

    public x9(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f2444a = i10;
        this.f2446c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2445b = z10;
    }

    public x9(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f2444a = i10;
        this.f2446c = obj;
        this.d = obj2;
        this.f2445b = z10;
        this.e = obj3;
    }

    public x9(Object obj, TLObject tLObject, Object obj2, boolean z10, int i10) {
        this.f2444a = i10;
        this.f2446c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.f2445b = z10;
    }

    public x9(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f2444a = i10;
        this.f2446c = obj;
        this.f2445b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public x9(dy0 dy0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f2444a = 19;
        this.f2446c = dy0Var;
        this.e = tLObject;
        this.f2445b = z10;
        this.d = b2Var;
    }

    public x9(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f2444a = 16;
        this.f2445b = z10;
        this.f2446c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
