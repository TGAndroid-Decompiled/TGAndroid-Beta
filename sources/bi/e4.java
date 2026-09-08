package bi;

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
import android.util.SparseBooleanArray;
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
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.yc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ao;
import org.telegram.ui.bn0;
import org.telegram.ui.co;
import org.telegram.ui.fh;
import org.telegram.ui.g31;
import org.telegram.ui.hh1;
import org.telegram.ui.j60;
import org.telegram.ui.kh;
import org.telegram.ui.lp;
import org.telegram.ui.n70;
import org.telegram.ui.on;
import org.telegram.ui.pf0;
import org.telegram.ui.pn0;
import org.telegram.ui.rl0;
import org.telegram.ui.sp;
import org.telegram.ui.tp;
import org.telegram.ui.um;
import org.telegram.ui.xo0;
import org.telegram.ui.zm0;
public final class e4 implements Runnable {
    public final int f2935a;
    public final boolean f2936b;
    public final Object f2937c;
    public final Object d;
    public final Object f2938e;

    public e4(g4 g4Var, View view, ah.j1 j1Var, boolean z10, boolean z11) {
        this.f2935a = 0;
        this.f2937c = g4Var;
        this.d = view;
        this.f2938e = j1Var;
        this.f2936b = z10;
    }

    private final void a() {
        byte[] bArr;
        bn0 bn0Var = (bn0) this.f2937c;
        boolean z10 = this.f2936b;
        byte[] bArr2 = (byte[]) this.f2938e;
        pn0 pn0Var = bn0Var.f34876e;
        pn0Var.f39585d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            pn0Var.f39588e1 = pn0Var.P0;
        }
        byte[] bArr3 = pn0Var.f39583c1;
        byte[] bArr4 = pn0Var.f39588e1;
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
        if (pn0.Z0(bArr, Long.valueOf(pn0Var.f39580b1)) && bArr2.length != 0 && pn0Var.f39580b1 != 0) {
            if (pn0Var.f39581c == 0) {
                ConnectionsManager.getInstance(pn0.t0(pn0Var)).sendRequest(new TL_account.getAllSecureValues(), new zm0(bn0Var, 0));
                return;
            }
            bn0Var.a();
        } else if (z10) {
            UserConfig.getInstance(pn0.s0(pn0Var)).resetSavedPassword();
            pn0Var.N0 = 0;
            pn0Var.R1();
        } else {
            TL_account.authorizationForm authorizationform = pn0Var.f39631y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                pn0Var.f39631y.errors.clear();
            }
            byte[] bArr7 = pn0Var.f39583c1;
            if (bArr7 != null && bArr7.length != 0) {
                bn0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new pf0(bn0Var, bn0Var.f34874b, bn0Var.d, 12));
            }
        }
    }

    @Override
    public final void run() {
        int i10;
        Bitmap.CompressFormat compressFormat;
        int i11;
        int[] iArr;
        String[] split;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.f6 f6Var;
        di.eb ebVar;
        int i15;
        int i16;
        boolean z10;
        byte[] bArr;
        String str = null;
        boolean z11 = true;
        switch (this.f2935a) {
            case 0:
                g4 g4Var = (g4) this.f2937c;
                ah.j1 j1Var = (ah.j1) this.f2938e;
                boolean z12 = this.f2936b;
                o5 o5Var = g4Var.f3048a;
                org.telegram.ui.Components.e5.a0(o5Var.C2, 1, o5Var.B1, new f4(g4Var, z12, j1Var, (View) this.d));
                return;
            case 1:
                di.w1 w1Var = (di.w1) this.f2937c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.f2938e;
                boolean z13 = this.f2936b;
                di.z1 z1Var = w1Var.f8346s;
                if (w1Var.f8345r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        di.t2 t2Var = z1Var.f8539r;
                        ArrayList arrayList = z1Var.f8538n;
                        i10 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str2, messages_botresults);
                        w1Var.h = messages_botresults.next_offset;
                        if (z13) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        w1Var.l();
                    }
                    z1Var.d.c(false);
                    w1Var.f8345r = false;
                    return;
                }
                return;
            case 2:
                di.o8 o8Var = (di.o8) this.f2937c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z14 = this.f2936b;
                Runnable runnable = (Runnable) this.f2938e;
                o8Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(o8Var.Z0);
                    if (z14) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                    if (z14) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(o8Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                hg.i0 i0Var = (hg.i0) this.f2937c;
                boolean z15 = this.f2936b;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.d;
                hg.f0 f0Var = (hg.f0) this.f2938e;
                if (!z15) {
                    i0Var.f11098c = f0Var;
                    u3Var.setRightText(i0Var.H(f0Var));
                    u3Var.setRightTextMargin(6);
                    i0Var.I.clear();
                    i0Var.d = true;
                    i0Var.l();
                    i0Var.Q();
                    return;
                }
                return;
            case 4:
                boolean z16 = this.f2936b;
                i2.f0 f0Var2 = (i2.f0) this.d;
                j2.k kVar = (j2.k) this.f2938e;
                j2.i o9 = j2.i.o((Context) this.f2937c);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z16) {
                    j2.f fVar = f0Var2.f11559s;
                    fVar.getClass();
                    fVar.f13206f.a(o9);
                }
                LogSessionId q6 = o9.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f13236b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                boolean z17 = this.f2936b;
                ji.s3 s3Var = (ji.s3) this.f2938e;
                String trim = ((EditTextBoldCursor) this.f2937c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ji.j4.k(n2Var, z17, new ah.i0(22, s3Var, trim));
                    return;
                }
                return;
            case 6:
                m4.a0 a0Var = (m4.a0) this.f2937c;
                boolean z18 = this.f2936b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.f2938e;
                m4.f1 f1Var = a0Var.f15858g;
                if (z18) {
                    m4.l1 l1Var = new m4.l1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v y3 = f1Var.f15918b.y(rVar);
                        if (y3 != null) {
                            i11 = y3.b(m4.a0.B).f16011n;
                        } else if (!a0Var.h(rVar)) {
                            v7.l8.b(new m4.p1(-100));
                        } else {
                            v7.l8.b(new m4.p1(0));
                            i11 = 0;
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i11, l1Var);
                        }
                    } catch (DeadObjectException unused) {
                        f1Var.f15918b.N(rVar);
                        v7.l8.b(new m4.p1(-100));
                    } catch (RemoteException e11) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e11);
                        v7.l8.b(new m4.p1(-1));
                    }
                }
                runnable2.run();
                f1Var.f15918b.o(rVar);
                return;
            case 7:
                boolean z19 = this.f2936b;
                m4.r rVar2 = (m4.r) this.f2938e;
                m4.a0 a0Var2 = ((m4.k0) ((androidx.activity.o) this.f2937c).d).f15997g;
                m4.j1 j1Var2 = a0Var2.f15870t;
                w7.t.b(j1Var2, (m4.s) this.d);
                int d = j1Var2.d();
                if (d == 1) {
                    if (j1Var2.m0(2)) {
                        j1Var2.b();
                    }
                } else if (d == 4 && j1Var2.m0(4)) {
                    j1Var2.H();
                }
                if (z19 && j1Var2.m0(1)) {
                    j1Var2.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i17 : new int[]{31, 2}) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(i17, true);
                }
                if (z19) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(1, true);
                }
                e2.d.g(!false);
                a0Var2.p(rVar2);
                return;
            case 8:
                ((CameraController) this.f2937c).lambda$initCamera$3(this.f2936b, (Exception) this.d, (Runnable) this.f2938e);
                return;
            case 9:
                String[] strArr = (String[]) this.f2937c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                boolean z20 = this.f2936b;
                org.telegram.ui.ActionBar.q qVar2 = (org.telegram.ui.ActionBar.q) this.f2938e;
                try {
                    org.telegram.ui.ActionBar.j6.f20739g0 = org.telegram.ui.ActionBar.j6.ql.get(org.telegram.ui.ActionBar.j6.f20744g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.j6.f20756h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.j6.f20756h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = i6Var.f20571c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(i6Var.f20571c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        i6Var.f20571c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.j6.f20756h0);
                        i6Var.f20574e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i18 = 0; i18 < split.length; i18++) {
                                if ("blur".equals(split[i18])) {
                                    i6Var.h = true;
                                } else if ("motion".equals(split[i18])) {
                                    i6Var.f20582n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        i6Var.f20586x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                i6Var.f20583r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    i6Var.f20584s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    i6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    i6Var.f20585w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                i6Var.f20586x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (i6Var.f20571c != null) {
                                new File(i6Var.f20571c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        i6Var.f20571c = null;
                        org.telegram.ui.ActionBar.j6.f20756h0 = null;
                    }
                    if (!z20 && org.telegram.ui.ActionBar.j6.M == null) {
                        org.telegram.ui.ActionBar.j6.K = i6Var;
                        if (org.telegram.ui.ActionBar.j6.I != org.telegram.ui.ActionBar.j6.J) {
                            z11 = false;
                        }
                        if (z11) {
                            org.telegram.ui.ActionBar.j6.T = 2000;
                            org.telegram.ui.ActionBar.j6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ah.j(17), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.j6.I = i6Var;
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (org.telegram.ui.ActionBar.j6.M == null && !org.telegram.ui.ActionBar.j6.Q) {
                    MessagesController.getInstance(i6Var.E).saveTheme(i6Var, i6Var.k(false), z20, false);
                }
                qVar2.run();
                return;
            case 10:
                co.U((co) this.f2937c, (String) this.d, (MessageObject) this.f2938e, this.f2936b);
                return;
            case 11:
                on onVar = (on) this.f2937c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z21 = this.f2936b;
                MessageObject messageObject = (MessageObject) this.f2938e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i19 = R.string.SuggestedMessageAcceptInfo;
                co coVar = onVar.f39310a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i19, coVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                if (m10.f51653a == zf.b.f51656b) {
                    i12 = coVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = coVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z21) {
                    m10 = zf.a.i((m10.f51654b / 1000) * i12, m10.f51653a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z21) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), fi.m.G0(i12))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z21) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), zh.e0.o(message.suggested_post.schedule_date), fi.m.G0(i12))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), zh.e0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i20 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                qc[] qcVarArr = new qc[1];
                org.telegram.ui.r5 r5Var = new org.telegram.ui.r5(qcVarArr, 4);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.b2 v02 = org.telegram.ui.Components.e5.v0(coVar, string, spannableStringBuilder, LocaleController.getString(i14), false, new z2(onVar, message, b2VarArr, messageObject, r5Var, 18));
                b2VarArr[0] = v02;
                v02.setOnDismissListener(r5Var);
                if (z21 && m10.f51653a == zf.b.f51655a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(coVar.getParentActivity());
                    f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
                    qc G = new yc(a2, f6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f29706j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 12:
                ao aoVar = (ao) this.f2937c;
                aoVar.j((org.telegram.ui.ActionBar.d4) this.d, (TLRPC.WallPaper) this.f2938e, this.f2936b);
                aoVar.g(aoVar.f34518n);
                um umVar = aoVar.V.X0;
                if (umVar != null && (ebVar = umVar.L) != null) {
                    ebVar.invalidate();
                    return;
                }
                return;
            case 13:
                lp lpVar = (lp) this.f2937c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.f2938e;
                boolean z22 = this.f2936b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    lpVar.f38466l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = lpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z22) {
                        if (lpVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lpVar.getParentActivity());
                            alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            lpVar.showDialog(alertDialog$Builder.f20225a);
                        } else {
                            return;
                        }
                    }
                }
                w80 w80Var = lpVar.G;
                if (w80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = lpVar.f38466l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    w80Var.setLink(str);
                    lpVar.G.c(lpVar.f38466l0, lpVar.Z);
                    return;
                }
                return;
            case 14:
                tp tpVar = (tp) this.f2937c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z23 = this.f2936b;
                chat.join_to_send = z23;
                tpVar.f40835x.d.getMessagesController().toggleChatJoinToSend(chat.f19896id, z23, new di.y0(tpVar, z23, chat, 15), new fh(20, tpVar, (j80) this.f2938e));
                return;
            case 15:
                tp tpVar2 = (tp) this.f2937c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z24 = this.f2936b;
                chat2.join_request = z24;
                tpVar2.f40835x.d.getMessagesController().toggleChatJoinRequest(chat2.f19896id, z24, new sp(tpVar2, 0), new fh(19, tpVar2, (i80) this.f2938e));
                return;
            case 16:
                boolean z25 = this.f2936b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f2937c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f2938e;
                if (z25 && ChatObject.isChannel(chat3)) {
                    View d10 = alertDialog$Builder2.f20225a.d(-1);
                    if (d10 instanceof TextView) {
                        TextView textView = (TextView) d10;
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
                nk nkVar = (nk) this.f2937c;
                boolean z26 = this.f2936b;
                ArrayList arrayList2 = (ArrayList) this.f2938e;
                nkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new uc(15, nkVar, new ArrayList()));
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
                ArrayList arrayList3 = new ArrayList();
                if (!z26) {
                    for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                        ik ikVar = (ik) arrayList2.get(i22);
                        File file = ikVar.f27182f;
                        if (file != null && !file.isDirectory()) {
                            int i23 = 0;
                            while (true) {
                                if (i23 < i21) {
                                    String str4 = strArr2[i23];
                                    String str5 = ikVar.f27179b;
                                    if (str5 != null) {
                                        z10 = str5.toLowerCase().contains(str4);
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList3.add(ikVar);
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new uc(15, nkVar, arrayList3));
                return;
            case 18:
                g80.t((g80) this.f2937c, (TLRPC.TL_error) this.d, this.f2936b, (TLRPC.TL_messages_importChatInvite) this.f2938e);
                return;
            case 19:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z27 = this.f2936b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f2938e;
                ux0 ux0Var = ((jx0) this.f2937c).f27610a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z27) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        ux0Var.S = tL_messages_stickerSet;
                        ux0Var.t0();
                        ux0Var.B0();
                    }
                }
                b2Var.dismiss();
                return;
            case 20:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f2937c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z28 = this.f2936b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f2938e;
                if (f3Var != null && !f3Var.isDismissed()) {
                    f3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z28) {
                        AndroidUtilities.runOnUIThread(new kh(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (b2Var2 != null && b2Var2.isShowing()) {
                    b2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z28) {
                        AndroidUtilities.runOnUIThread(new kh(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 21:
                j60 j60Var = (j60) this.f2937c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.f2938e;
                boolean z29 = this.f2936b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        j60Var.u1(null, tL_chatInviteExported3.link, true, z29);
                        return;
                    }
                }
                return;
            case 22:
                n70 n70Var = (n70) this.f2937c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f2938e;
                boolean z30 = this.f2936b;
                if (tL_error2 == null) {
                    n70Var.f38871f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z30) {
                        if (n70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(n70Var.getParentActivity());
                            alertDialog$Builder3.f20225a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f20225a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            n70Var.showDialog(alertDialog$Builder3.f20225a);
                        } else {
                            return;
                        }
                    }
                }
                n70Var.f38870e = false;
                n70Var.f38867a.l();
                return;
            case 23:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f2938e;
                boolean z31 = this.f2936b;
                pn0 pn0Var = ((bn0) this.f2937c).f34876e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    pn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    pn0Var.B1(z31);
                    return;
                }
                return;
            case 24:
                bn0 bn0Var = (bn0) this.f2937c;
                String str6 = (String) this.f2938e;
                boolean z32 = this.f2936b;
                pn0 pn0Var2 = bn0Var.f34876e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    pn0Var2.f39583c1 = tL_secureSecretSettings.secure_secret;
                    pn0Var2.f39580b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        pn0Var2.f39588e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        pn0Var2.f39588e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new rl0(bn0Var, 4));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = pn0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        pn0Var2.f39588e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    pn0Var2.f39583c1 = null;
                    pn0Var2.f39580b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new e4(bn0Var, passwordsettings, z32, bArr, 25));
                return;
            case 25:
                a();
                return;
            case 26:
                xo0 xo0Var = (xo0) this.f2937c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.f2938e;
                boolean z33 = this.f2936b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    xo0Var.f42833a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    xo0Var.A0(z33);
                    return;
                }
                return;
            case 27:
                g31.W((g31) this.f2937c, this.f2936b, (org.telegram.ui.ActionBar.d4) this.d, (org.telegram.ui.ActionBar.c5) this.f2938e);
                return;
            case 28:
                hh1.c0((hh1) this.f2937c, (TLRPC.TL_error) this.d, (TLObject) this.f2938e, this.f2936b);
                return;
            default:
                qg.q0 q0Var = (qg.q0) this.f2937c;
                boolean z34 = this.f2936b;
                q0Var.f44550f.f(new qg.o0(q0Var, (a5.a) this.d, 0));
                q0Var.f44550f.f(new qg.o0(q0Var, (a5.a) this.f2938e, 0));
                q0Var.E = z34;
                return;
        }
    }

    public e4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f2935a = i10;
        this.f2937c = obj;
        this.d = obj2;
        this.f2938e = obj3;
        this.f2936b = z10;
    }

    public e4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f2935a = i10;
        this.f2937c = obj;
        this.d = obj2;
        this.f2936b = z10;
        this.f2938e = obj3;
    }

    public e4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f2935a = i10;
        this.f2937c = obj;
        this.f2936b = z10;
        this.d = obj2;
        this.f2938e = obj3;
    }

    public e4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f2935a = 16;
        this.f2936b = z10;
        this.f2937c = chat;
        this.d = alertDialog$Builder;
        this.f2938e = zArr;
    }
}
