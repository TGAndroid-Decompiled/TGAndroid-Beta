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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an0;
import org.telegram.ui.bo;
import org.telegram.ui.eo;
import org.telegram.ui.j60;
import org.telegram.ui.k31;
import org.telegram.ui.kh;
import org.telegram.ui.m70;
import org.telegram.ui.mh1;
import org.telegram.ui.mp;
import org.telegram.ui.on0;
import org.telegram.ui.pf0;
import org.telegram.ui.pn;
import org.telegram.ui.qh;
import org.telegram.ui.ql0;
import org.telegram.ui.tp;
import org.telegram.ui.up;
import org.telegram.ui.vm;
import org.telegram.ui.wo0;
import org.telegram.ui.ym0;
public final class g2 implements Runnable {
    public final int f2736a;
    public final boolean f2737b;
    public final Object f2738c;
    public final Object d;
    public final Object e;

    public g2(int i10, Object obj, Object obj2, Object obj3, boolean z10, boolean z11) {
        this.f2736a = i10;
        this.f2738c = obj;
        this.e = obj2;
        this.d = obj3;
        this.f2737b = z10;
    }

    private final void a() {
        byte[] bArr;
        an0 an0Var = (an0) this.f2738c;
        boolean z10 = this.f2737b;
        byte[] bArr2 = (byte[]) this.e;
        on0 on0Var = an0Var.e;
        on0Var.f35527d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            on0Var.f35529e1 = on0Var.P0;
        }
        byte[] bArr3 = on0Var.f35525c1;
        byte[] bArr4 = on0Var.f35529e1;
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
        if (on0.Z0(bArr, Long.valueOf(on0Var.f35522b1)) && bArr2.length != 0 && on0Var.f35522b1 != 0) {
            if (on0Var.f35523c == 0) {
                ConnectionsManager.getInstance(on0.t0(on0Var)).sendRequest(new TL_account.getAllSecureValues(), new ym0(an0Var, 0));
                return;
            }
            an0Var.a();
        } else if (z10) {
            UserConfig.getInstance(on0.s0(on0Var)).resetSavedPassword();
            on0Var.N0 = 0;
            on0Var.R1();
        } else {
            TL_account.authorizationForm authorizationform = on0Var.f35572y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                on0Var.f35572y.errors.clear();
            }
            byte[] bArr7 = on0Var.f35525c1;
            if (bArr7 != null && bArr7.length != 0) {
                an0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new pf0(an0Var, an0Var.f31042b, an0Var.d, 12));
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
        nc ncVar;
        int i15;
        int i16;
        boolean z10;
        byte[] bArr;
        String string;
        int i17;
        String string2;
        int i18;
        String str = null;
        boolean z11 = true;
        switch (this.f2736a) {
            case 0:
                h2 h2Var = (h2) this.f2738c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.e;
                boolean z12 = this.f2737b;
                k2 k2Var = h2Var.f2783s;
                if (h2Var.f2782r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        f3 f3Var = k2Var.f2984r;
                        ArrayList arrayList = k2Var.f2983n;
                        i10 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str2, messages_botresults);
                        h2Var.h = messages_botresults.next_offset;
                        if (z12) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        h2Var.l();
                    }
                    k2Var.d.c(false);
                    h2Var.f2782r = false;
                    return;
                }
                return;
            case 1:
                r9 r9Var = (r9) this.f2738c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z13 = this.f2737b;
                Runnable runnable = (Runnable) this.e;
                r9Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(r9Var.Z0);
                    if (z13) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                    if (z13) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(r9Var.Z0));
                        } catch (Exception e7) {
                            FileLog.e((Throwable) e7, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 2:
                fg.h0 h0Var = (fg.h0) this.f2738c;
                boolean z14 = this.f2737b;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.d;
                fg.e0 e0Var = (fg.e0) this.e;
                if (!z14) {
                    h0Var.f8030c = e0Var;
                    u3Var.setRightText(h0Var.H(e0Var));
                    u3Var.setRightTextMargin(6);
                    h0Var.I.clear();
                    h0Var.d = true;
                    h0Var.l();
                    h0Var.Q();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                boolean z15 = this.f2737b;
                hi.w3 w3Var = (hi.w3) this.e;
                String trim = ((EditTextBoldCursor) this.f2738c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    hi.m4.k(p2Var, z15, new cb(14, w3Var, trim));
                    return;
                }
                return;
            case 4:
                boolean z16 = this.f2737b;
                i2.e0 e0Var2 = (i2.e0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o9 = j2.i.o((Context) this.f2738c);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z16) {
                    j2.e eVar = e0Var2.f10157s;
                    eVar.getClass();
                    eVar.f11465f.a(o9);
                }
                LogSessionId q6 = o9.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f11493b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                m4.b0 b0Var = (m4.b0) this.f2738c;
                boolean z17 = this.f2737b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.h1 h1Var = b0Var.f13295g;
                if (z17) {
                    m4.n1 n1Var = new m4.n1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v w10 = h1Var.f13376b.w(rVar);
                        if (w10 != null) {
                            i11 = w10.b(m4.b0.B).f13448n;
                        } else if (!b0Var.h(rVar)) {
                            v7.o8.b(new m4.r1(-100));
                        } else {
                            v7.o8.b(new m4.r1(0));
                            i11 = 0;
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i11, n1Var);
                        }
                    } catch (DeadObjectException unused) {
                        h1Var.f13376b.K(rVar);
                        v7.o8.b(new m4.r1(-100));
                    } catch (RemoteException e10) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e10);
                        v7.o8.b(new m4.r1(-1));
                    }
                }
                runnable2.run();
                h1Var.f13376b.n(rVar);
                return;
            case 6:
                boolean z18 = this.f2737b;
                m4.r rVar2 = (m4.r) this.e;
                m4.b0 b0Var2 = ((m4.l0) ((androidx.activity.o) this.f2738c).d).f13430g;
                m4.l1 l1Var = b0Var2.f13307t;
                w7.u.b(l1Var, (m4.s) this.d);
                int d = l1Var.d();
                if (d == 1) {
                    if (l1Var.m0(2)) {
                        l1Var.b();
                    }
                } else if (d == 4 && l1Var.m0(4)) {
                    l1Var.H();
                }
                if (z18 && l1Var.m0(1)) {
                    l1Var.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i19 : new int[]{31, 2}) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(i19, true);
                }
                if (z18) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(1, true);
                }
                e2.d.g(!false);
                b0Var2.p(rVar2);
                return;
            case 7:
                og.v0 v0Var = (og.v0) this.f2738c;
                boolean z19 = this.f2737b;
                v0Var.f14515f.f(new og.s0(v0Var, (a5.a) this.d, 0));
                v0Var.f14515f.f(new og.s0(v0Var, (a5.a) this.e, 0));
                v0Var.E = z19;
                return;
            case 8:
                ((CameraController) this.f2738c).lambda$initCamera$3(this.f2737b, (Exception) this.d, (Runnable) this.e);
                return;
            case 9:
                String[] strArr = (String[]) this.f2738c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                boolean z20 = this.f2737b;
                org.telegram.ui.ActionBar.q qVar2 = (org.telegram.ui.ActionBar.q) this.e;
                try {
                    org.telegram.ui.ActionBar.j6.f17976g0 = org.telegram.ui.ActionBar.j6.ql.get(org.telegram.ui.ActionBar.j6.f17981g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.j6.f17993h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.j6.f17993h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = i6Var.f17838c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(i6Var.f17838c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        i6Var.f17838c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.j6.f17993h0);
                        i6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i20 = 0; i20 < split.length; i20++) {
                                if ("blur".equals(split[i20])) {
                                    i6Var.h = true;
                                } else if ("motion".equals(split[i20])) {
                                    i6Var.f17848n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        i6Var.f17852x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                i6Var.f17849r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    i6Var.f17850s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    i6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    i6Var.f17851w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                i6Var.f17852x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (i6Var.f17838c != null) {
                                new File(i6Var.f17838c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        i6Var.f17838c = null;
                        org.telegram.ui.ActionBar.j6.f17993h0 = null;
                    }
                    if (!z20 && org.telegram.ui.ActionBar.j6.M == null) {
                        org.telegram.ui.ActionBar.j6.K = i6Var;
                        if (org.telegram.ui.ActionBar.j6.I != org.telegram.ui.ActionBar.j6.J) {
                            z11 = false;
                        }
                        if (z11) {
                            org.telegram.ui.ActionBar.j6.T = 2000;
                            org.telegram.ui.ActionBar.j6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new f0(11), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.j6.I = i6Var;
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (org.telegram.ui.ActionBar.j6.M == null && !org.telegram.ui.ActionBar.j6.Q) {
                    MessagesController.getInstance(i6Var.E).saveTheme(i6Var, i6Var.k(false), z20, false);
                }
                qVar2.run();
                return;
            case 10:
                eo.U((eo) this.f2738c, (String) this.e, (MessageObject) this.d, this.f2737b);
                return;
            case 11:
                pn pnVar = (pn) this.f2738c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z21 = this.f2737b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i21 = R.string.SuggestedMessageAcceptInfo;
                eo eoVar = pnVar.f35881a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, eoVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                yf.a m10 = yf.a.m(message.suggested_post.price);
                if (m10.f46926a == yf.b.f46929b) {
                    i12 = eoVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = eoVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z21) {
                    m10 = yf.a.i((m10.f46927b / 1000) * i12, m10.f46926a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z21) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), di.m.G0(i12))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z21) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), xh.e0.o(message.suggested_post.schedule_date), di.m.G0(i12))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), xh.e0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i22 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.pc[] pcVarArr = new org.telegram.ui.Components.pc[1];
                org.telegram.ui.s5 s5Var = new org.telegram.ui.s5(pcVarArr, 4);
                org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                String string3 = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.d2 v02 = org.telegram.ui.Components.d5.v0(eoVar, string3, spannableStringBuilder, LocaleController.getString(i14), false, new ya(pnVar, message, d2VarArr, messageObject, s5Var, 14));
                d2VarArr[0] = v02;
                v02.setOnDismissListener(s5Var);
                if (z21 && m10.f46926a == yf.b.f46928a) {
                    org.telegram.ui.Components.jb a2 = org.telegram.ui.Components.kb.a(eoVar.getParentActivity());
                    f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
                    org.telegram.ui.Components.pc G = new org.telegram.ui.Components.wc(a2, f6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f26081j = 60000;
                    G.k(true);
                    pcVarArr[0] = G;
                    return;
                }
                return;
            case 12:
                bo boVar = (bo) this.f2738c;
                boVar.j((org.telegram.ui.ActionBar.f4) this.d, (TLRPC.WallPaper) this.e, this.f2737b);
                boVar.g(boVar.f31303n);
                vm vmVar = boVar.V.X0;
                if (vmVar != null && (ncVar = vmVar.L) != null) {
                    ncVar.invalidate();
                    return;
                }
                return;
            case 13:
                mp mpVar = (mp) this.f2738c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.d;
                boolean z22 = this.f2737b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    mpVar.f35030l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = mpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z22) {
                        if (mpVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar.getParentActivity());
                            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            mpVar.showDialog(alertDialog$Builder.f17528a);
                        } else {
                            return;
                        }
                    }
                }
                f90 f90Var = mpVar.G;
                if (f90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = mpVar.f35030l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    f90Var.setLink(str);
                    mpVar.G.c(mpVar.f35030l0, mpVar.Z);
                    return;
                }
                return;
            case 14:
                up upVar = (up) this.f2738c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z23 = this.f2737b;
                chat.join_to_send = z23;
                upVar.f37303x.d.getMessagesController().toggleChatJoinToSend(chat.f17195id, z23, new c1(upVar, z23, chat, 15), new qh(17, upVar, (t80) this.e));
                return;
            case 15:
                up upVar2 = (up) this.f2738c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z24 = this.f2737b;
                chat2.join_request = z24;
                upVar2.f37303x.d.getMessagesController().toggleChatJoinRequest(chat2.f17195id, z24, new tp(upVar2, 0), new qh(16, upVar2, (s80) this.e));
                return;
            case 16:
                boolean z25 = this.f2737b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f2738c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z25 && ChatObject.isChannel(chat3)) {
                    View d10 = alertDialog$Builder2.f17528a.d(-1);
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
                sk skVar = (sk) this.f2738c;
                boolean z26 = this.f2737b;
                ArrayList arrayList2 = (ArrayList) this.d;
                skVar.getClass();
                String lowerCase = ((String) this.e).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(12, skVar, new ArrayList()));
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
                int i23 = i16 + 1;
                String[] strArr2 = new String[i23];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z26) {
                    for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                        nk nkVar = (nk) arrayList2.get(i24);
                        File file = nkVar.f25539f;
                        if (file != null && !file.isDirectory()) {
                            int i25 = 0;
                            while (true) {
                                if (i25 < i23) {
                                    String str4 = strArr2[i25];
                                    String str5 = nkVar.f25537b;
                                    if (str5 != null) {
                                        z10 = str5.toLowerCase().contains(str4);
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList3.add(nkVar);
                                    } else {
                                        i25++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(12, skVar, arrayList3));
                return;
            case 18:
                q80.t((q80) this.f2738c, (TLRPC.TL_error) this.d, this.f2737b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 19:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z27 = this.f2737b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                hy0 hy0Var = ((wx0) this.f2738c).f28861a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z27) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        hy0Var.S = tL_messages_stickerSet;
                        hy0Var.t0();
                        hy0Var.B0();
                    }
                }
                d2Var.dismiss();
                return;
            case 20:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f2738c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z28 = this.f2737b;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                if (h3Var != null && !h3Var.isDismissed()) {
                    h3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z28) {
                        AndroidUtilities.runOnUIThread(new kh(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (d2Var2 != null && d2Var2.isShowing()) {
                    d2Var2.k(true);
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
                j60 j60Var = (j60) this.f2738c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z29 = this.f2737b;
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
                m70 m70Var = (m70) this.f2738c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                boolean z30 = this.f2737b;
                if (tL_error2 == null) {
                    m70Var.f34855f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z30) {
                        if (m70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(m70Var.getParentActivity());
                            alertDialog$Builder3.f17528a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f17528a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            m70Var.showDialog(alertDialog$Builder3.f17528a);
                        } else {
                            return;
                        }
                    }
                }
                m70Var.e = false;
                m70Var.f34852a.l();
                return;
            case 23:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                TLObject tLObject6 = (TLObject) this.d;
                boolean z31 = this.f2737b;
                on0 on0Var = ((an0) this.f2738c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    on0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    on0Var.B1(z31);
                    return;
                }
                return;
            case 24:
                an0 an0Var = (an0) this.f2738c;
                String str6 = (String) this.e;
                boolean z32 = this.f2737b;
                on0 on0Var2 = an0Var.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    on0Var2.f35525c1 = tL_secureSecretSettings.secure_secret;
                    on0Var2.f35522b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        on0Var2.f35529e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        on0Var2.f35529e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new ql0(an0Var, 4));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = on0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        on0Var2.f35529e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    on0Var2.f35525c1 = null;
                    on0Var2.f35522b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new g2(an0Var, passwordsettings, z32, bArr, 25));
                return;
            case 25:
                a();
                return;
            case 26:
                wo0 wo0Var = (wo0) this.f2738c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                TLObject tLObject7 = (TLObject) this.d;
                boolean z33 = this.f2737b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    wo0Var.f38255a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    wo0Var.A0(z33);
                    return;
                }
                return;
            case 27:
                k31.W((k31) this.f2738c, this.f2737b, (org.telegram.ui.ActionBar.f4) this.d, (org.telegram.ui.ActionBar.e5) this.e);
                return;
            case 28:
                mh1.c0((mh1) this.f2738c, (TLRPC.TL_error) this.e, (TLObject) this.d, this.f2737b);
                return;
            default:
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) this.f2738c;
                boolean z34 = this.f2737b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.e;
                int i26 = R.raw.star_premium_2;
                if (z34) {
                    string = LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated);
                } else {
                    string = LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                }
                if (z34) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat4)) {
                        i18 = R.string.BoostingCheckStatistic;
                    } else {
                        i18 = R.string.BoostingCheckStatisticGroup;
                    }
                    string2 = LocaleController.getString(i18);
                } else {
                    if (ChatObject.isChannelAndNotMegaGroup(chat4)) {
                        i17 = R.string.BoostingCheckGiftsStatistic;
                    } else {
                        i17 = R.string.BoostingCheckGiftsStatisticGroup;
                    }
                    string2 = LocaleController.getString(i17);
                }
                org.telegram.ui.Components.pc M = wcVar.M(string, AndroidUtilities.replaceSingleTag(string2, org.telegram.ui.ActionBar.j6.Gi, 0, new sg.c(chat4), f6Var2), i26);
                M.f26081j = 5000;
                M.j();
                return;
        }
    }

    public g2(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f2736a = i10;
        this.f2738c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2737b = z10;
    }

    public g2(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f2736a = i10;
        this.f2738c = obj;
        this.d = obj2;
        this.f2737b = z10;
        this.e = obj3;
    }

    public g2(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f2736a = i10;
        this.f2738c = obj;
        this.f2737b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public g2(sk skVar, String str, boolean z10, ArrayList arrayList) {
        this.f2736a = 17;
        this.f2738c = skVar;
        this.e = str;
        this.f2737b = z10;
        this.d = arrayList;
    }

    public g2(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f2736a = 16;
        this.f2737b = z10;
        this.f2738c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
