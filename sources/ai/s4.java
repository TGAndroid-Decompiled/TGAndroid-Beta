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
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an0;
import org.telegram.ui.bo;
import org.telegram.ui.cn0;
import org.telegram.ui.g31;
import org.telegram.ui.ih1;
import org.telegram.ui.k60;
import org.telegram.ui.kp;
import org.telegram.ui.lh;
import org.telegram.ui.nn;
import org.telegram.ui.p70;
import org.telegram.ui.qn0;
import org.telegram.ui.rf0;
import org.telegram.ui.rp;
import org.telegram.ui.sl0;
import org.telegram.ui.sp;
import org.telegram.ui.tm;
import org.telegram.ui.wh;
import org.telegram.ui.yo0;
import org.telegram.ui.zn;
public final class s4 implements Runnable {
    public final int f1501a;
    public final boolean f1502b;
    public final Object f1503c;
    public final Object d;
    public final Object e;

    public s4(u4 u4Var, View view, zg.p0 p0Var, boolean z10, boolean z11) {
        this.f1501a = 0;
        this.f1503c = u4Var;
        this.d = view;
        this.e = p0Var;
        this.f1502b = z10;
    }

    private final void a() {
        byte[] bArr;
        cn0 cn0Var = (cn0) this.f1503c;
        boolean z10 = this.f1502b;
        byte[] bArr2 = (byte[]) this.e;
        qn0 qn0Var = cn0Var.e;
        qn0Var.f36957d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            qn0Var.f36959e1 = qn0Var.P0;
        }
        byte[] bArr3 = qn0Var.f36955c1;
        byte[] bArr4 = qn0Var.f36959e1;
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
        if (qn0.Z0(bArr, Long.valueOf(qn0Var.f36952b1)) && bArr2.length != 0 && qn0Var.f36952b1 != 0) {
            if (qn0Var.f36953c == 0) {
                ConnectionsManager.getInstance(qn0.t0(qn0Var)).sendRequest(new TL_account.getAllSecureValues(), new an0(cn0Var, 0));
                return;
            }
            cn0Var.a();
        } else if (z10) {
            UserConfig.getInstance(qn0.s0(qn0Var)).resetSavedPassword();
            qn0Var.N0 = 0;
            qn0Var.R1();
        } else {
            TL_account.authorizationForm authorizationform = qn0Var.f37002y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                qn0Var.f37002y.errors.clear();
            }
            byte[] bArr7 = qn0Var.f36955c1;
            if (bArr7 != null && bArr7.length != 0) {
                cn0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new rf0(cn0Var, cn0Var.f32845b, cn0Var.d, 12));
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
        ci.eb ebVar;
        int i15;
        int i16;
        boolean z10;
        byte[] bArr;
        String str = null;
        boolean z11 = true;
        switch (this.f1501a) {
            case 0:
                u4 u4Var = (u4) this.f1503c;
                zg.p0 p0Var = (zg.p0) this.e;
                boolean z12 = this.f1502b;
                f6 f6Var2 = u4Var.f1573a;
                org.telegram.ui.Components.c5.a0(f6Var2.C2, 1, f6Var2.B1, new t4(u4Var, z12, p0Var, (View) this.d));
                return;
            case 1:
                ci.w1 w1Var = (ci.w1) this.f1503c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.e;
                boolean z13 = this.f1502b;
                ci.z1 z1Var = w1Var.f5686s;
                if (w1Var.f5685r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        ci.t2 t2Var = z1Var.f5860r;
                        ArrayList arrayList = z1Var.f5859n;
                        i10 = ((org.telegram.ui.ActionBar.g3) t2Var).currentAccount;
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
                    w1Var.f5685r = false;
                    return;
                }
                return;
            case 2:
                ci.o8 o8Var = (ci.o8) this.f1503c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z14 = this.f1502b;
                Runnable runnable = (Runnable) this.e;
                o8Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(o8Var.Z0);
                    if (z14) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                    if (z14) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(o8Var.Z0));
                        } catch (Exception e7) {
                            FileLog.e((Throwable) e7, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                gg.i0 i0Var = (gg.i0) this.f1503c;
                boolean z15 = this.f1502b;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.d;
                gg.f0 f0Var = (gg.f0) this.e;
                if (!z15) {
                    i0Var.f9764c = f0Var;
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
                boolean z16 = this.f1502b;
                i2.e0 e0Var = (i2.e0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o9 = j2.i.o((Context) this.f1503c);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z16) {
                    j2.f fVar = e0Var.f10674s;
                    fVar.getClass();
                    fVar.f12578f.a(o9);
                }
                LogSessionId q6 = o9.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f12605b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                boolean z17 = this.f1502b;
                ii.t3 t3Var = (ii.t3) this.e;
                String trim = ((EditTextBoldCursor) this.f1503c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ii.j4.k(o2Var, z17, new ah.b(18, t3Var, trim));
                    return;
                }
                return;
            case 6:
                m4.a0 a0Var = (m4.a0) this.f1503c;
                boolean z18 = this.f1502b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.g1 g1Var = a0Var.f14464g;
                if (z18) {
                    m4.m1 m1Var = new m4.m1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v x10 = g1Var.f14548b.x(rVar);
                        if (x10 != null) {
                            i11 = x10.b(m4.a0.B).f14620n;
                        } else if (!a0Var.h(rVar)) {
                            v7.l8.b(new m4.q1(-100));
                        } else {
                            v7.l8.b(new m4.q1(0));
                            i11 = 0;
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i11, m1Var);
                        }
                    } catch (DeadObjectException unused) {
                        g1Var.f14548b.M(rVar);
                        v7.l8.b(new m4.q1(-100));
                    } catch (RemoteException e10) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e10);
                        v7.l8.b(new m4.q1(-1));
                    }
                }
                runnable2.run();
                g1Var.f14548b.n(rVar);
                return;
            case 7:
                boolean z19 = this.f1502b;
                m4.r rVar2 = (m4.r) this.e;
                m4.a0 a0Var2 = ((m4.l0) ((androidx.activity.n) this.f1503c).d).f14606g;
                m4.k1 k1Var = a0Var2.f14476t;
                w7.t.b(k1Var, (m4.s) this.d);
                int d = k1Var.d();
                if (d == 1) {
                    if (k1Var.m0(2)) {
                        k1Var.b();
                    }
                } else if (d == 4 && k1Var.m0(4)) {
                    k1Var.H();
                }
                if (z19 && k1Var.m0(1)) {
                    k1Var.i();
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
                ((CameraController) this.f1503c).lambda$initCamera$3(this.f1502b, (Exception) this.d, (Runnable) this.e);
                return;
            case 9:
                String[] strArr = (String[]) this.f1503c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                boolean z20 = this.f1502b;
                org.telegram.ui.ActionBar.r rVar3 = (org.telegram.ui.ActionBar.r) this.e;
                try {
                    org.telegram.ui.ActionBar.j6.f18911g0 = org.telegram.ui.ActionBar.j6.ql.get(org.telegram.ui.ActionBar.j6.f18916g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.j6.f18929h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.j6.f18929h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = i6Var.f18761c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(i6Var.f18761c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        i6Var.f18761c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.j6.f18929h0);
                        i6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i18 = 0; i18 < split.length; i18++) {
                                if ("blur".equals(split[i18])) {
                                    i6Var.h = true;
                                } else if ("motion".equals(split[i18])) {
                                    i6Var.f18771n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        i6Var.f18775x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                i6Var.f18772r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    i6Var.f18773s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    i6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    i6Var.f18774w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                i6Var.f18775x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (i6Var.f18761c != null) {
                                new File(i6Var.f18761c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        i6Var.f18761c = null;
                        org.telegram.ui.ActionBar.j6.f18929h0 = null;
                    }
                    if (!z20 && org.telegram.ui.ActionBar.j6.M == null) {
                        org.telegram.ui.ActionBar.j6.K = i6Var;
                        if (org.telegram.ui.ActionBar.j6.I != org.telegram.ui.ActionBar.j6.J) {
                            z11 = false;
                        }
                        if (z11) {
                            org.telegram.ui.ActionBar.j6.T = 2000;
                            org.telegram.ui.ActionBar.j6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new f(16), 2100L);
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
                rVar3.run();
                return;
            case 10:
                bo.U((bo) this.f1503c, (String) this.d, (MessageObject) this.e, this.f1502b);
                return;
            case 11:
                nn nnVar = (nn) this.f1503c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z21 = this.f1502b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i19 = R.string.SuggestedMessageAcceptInfo;
                bo boVar = nnVar.f36139a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i19, boVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                if (m10.f48980a == zf.b.f48983b) {
                    i12 = boVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = boVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z21) {
                    m10 = zf.a.i((m10.f48981b / 1000) * i12, m10.f48980a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z21) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), ei.l.G0(i12))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z21) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), yh.e0.o(message.suggested_post.schedule_date), ei.l.G0(i12))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), yh.e0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i20 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.oc[] ocVarArr = new org.telegram.ui.Components.oc[1];
                org.telegram.ui.r5 r5Var = new org.telegram.ui.r5(ocVarArr, 4);
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.c2 v02 = org.telegram.ui.Components.c5.v0(boVar, string, spannableStringBuilder, LocaleController.getString(i14), false, new m3(nnVar, message, c2VarArr, messageObject, r5Var, 18));
                c2VarArr[0] = v02;
                v02.setOnDismissListener(r5Var);
                if (z21 && m10.f48980a == zf.b.f48982a) {
                    org.telegram.ui.Components.ib a2 = org.telegram.ui.Components.jb.a(boVar.getParentActivity());
                    f6Var = ((org.telegram.ui.ActionBar.o2) boVar).resourceProvider;
                    org.telegram.ui.Components.oc G = new vc(a2, f6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f26705j = 60000;
                    G.k(true);
                    ocVarArr[0] = G;
                    return;
                }
                return;
            case 12:
                zn znVar = (zn) this.f1503c;
                znVar.j((org.telegram.ui.ActionBar.e4) this.d, (TLRPC.WallPaper) this.e, this.f1502b);
                znVar.g(znVar.f40286n);
                tm tmVar = znVar.V.X0;
                if (tmVar != null && (ebVar = tmVar.L) != null) {
                    ebVar.invalidate();
                    return;
                }
                return;
            case 13:
                kp kpVar = (kp) this.f1503c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z22 = this.f1502b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    kpVar.f35337l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = kpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z22) {
                        if (kpVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kpVar.getParentActivity());
                            alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            kpVar.showDialog(alertDialog$Builder.f18447a);
                        } else {
                            return;
                        }
                    }
                }
                v80 v80Var = kpVar.G;
                if (v80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = kpVar.f35337l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    v80Var.setLink(str);
                    kpVar.G.c(kpVar.f35337l0, kpVar.Z);
                    return;
                }
                return;
            case 14:
                sp spVar = (sp) this.f1503c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z23 = this.f1502b;
                chat.join_to_send = z23;
                spVar.f37543x.d.getMessagesController().toggleChatJoinToSend(chat.f18121id, z23, new ci.y0(spVar, z23, chat, 15), new wh(14, spVar, (j80) this.e));
                return;
            case 15:
                sp spVar2 = (sp) this.f1503c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z24 = this.f1502b;
                chat2.join_request = z24;
                spVar2.f37543x.d.getMessagesController().toggleChatJoinRequest(chat2.f18121id, z24, new rp(spVar2, 0), new wh(13, spVar2, (i80) this.e));
                return;
            case 16:
                boolean z25 = this.f1502b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f1503c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z25 && ChatObject.isChannel(chat3)) {
                    View d10 = alertDialog$Builder2.f18447a.d(-1);
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
                nk nkVar = (nk) this.f1503c;
                boolean z26 = this.f1502b;
                ArrayList arrayList2 = (ArrayList) this.e;
                nkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new oh(9, nkVar, new ArrayList()));
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
                        File file = ikVar.f24952f;
                        if (file != null && !file.isDirectory()) {
                            int i23 = 0;
                            while (true) {
                                if (i23 < i21) {
                                    String str4 = strArr2[i23];
                                    String str5 = ikVar.f24950b;
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
                AndroidUtilities.runOnUIThread(new oh(9, nkVar, arrayList3));
                return;
            case 18:
                g80.t((g80) this.f1503c, (TLRPC.TL_error) this.d, this.f1502b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 19:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z27 = this.f1502b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                wx0 wx0Var = ((lx0) this.f1503c).f25986a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z27) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        wx0Var.S = tL_messages_stickerSet;
                        wx0Var.t0();
                        wx0Var.B0();
                    }
                }
                c2Var.dismiss();
                return;
            case 20:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f1503c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z28 = this.f1502b;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.e;
                if (g3Var != null && !g3Var.isDismissed()) {
                    g3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z28) {
                        AndroidUtilities.runOnUIThread(new lh(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (c2Var2 != null && c2Var2.isShowing()) {
                    c2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z28) {
                        AndroidUtilities.runOnUIThread(new lh(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 21:
                k60 k60Var = (k60) this.f1503c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z29 = this.f1502b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        k60Var.u1(null, tL_chatInviteExported3.link, true, z29);
                        return;
                    }
                }
                return;
            case 22:
                p70 p70Var = (p70) this.f1503c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z30 = this.f1502b;
                if (tL_error2 == null) {
                    p70Var.f36552f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z30) {
                        if (p70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(p70Var.getParentActivity());
                            alertDialog$Builder3.f18447a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f18447a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            p70Var.showDialog(alertDialog$Builder3.f18447a);
                        } else {
                            return;
                        }
                    }
                }
                p70Var.e = false;
                p70Var.f36549a.l();
                return;
            case 23:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z31 = this.f1502b;
                qn0 qn0Var = ((cn0) this.f1503c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    qn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    qn0Var.B1(z31);
                    return;
                }
                return;
            case 24:
                cn0 cn0Var = (cn0) this.f1503c;
                String str6 = (String) this.e;
                boolean z32 = this.f1502b;
                qn0 qn0Var2 = cn0Var.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    qn0Var2.f36955c1 = tL_secureSecretSettings.secure_secret;
                    qn0Var2.f36952b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        qn0Var2.f36959e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        qn0Var2.f36959e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new sl0(cn0Var, 4));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = qn0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        qn0Var2.f36959e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    qn0Var2.f36955c1 = null;
                    qn0Var2.f36952b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new s4(cn0Var, passwordsettings, z32, bArr, 25));
                return;
            case 25:
                a();
                return;
            case 26:
                yo0 yo0Var = (yo0) this.f1503c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z33 = this.f1502b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    yo0Var.f39950a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    yo0Var.A0(z33);
                    return;
                }
                return;
            case 27:
                g31.W((g31) this.f1503c, this.f1502b, (org.telegram.ui.ActionBar.e4) this.d, (org.telegram.ui.ActionBar.d5) this.e);
                return;
            case 28:
                ih1.c0((ih1) this.f1503c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.f1502b);
                return;
            default:
                pg.q0 q0Var = (pg.q0) this.f1503c;
                boolean z34 = this.f1502b;
                q0Var.f40978f.f(new pg.o0(q0Var, (a5.a) this.d, 0));
                q0Var.f40978f.f(new pg.o0(q0Var, (a5.a) this.e, 0));
                q0Var.E = z34;
                return;
        }
    }

    public s4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f1501a = i10;
        this.f1503c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1502b = z10;
    }

    public s4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1501a = i10;
        this.f1503c = obj;
        this.d = obj2;
        this.f1502b = z10;
        this.e = obj3;
    }

    public s4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f1501a = i10;
        this.f1503c = obj;
        this.f1502b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public s4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f1501a = 16;
        this.f1502b = z10;
        this.f1503c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
