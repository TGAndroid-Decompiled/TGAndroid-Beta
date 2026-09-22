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
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn0;
import org.telegram.ui.f31;
import org.telegram.ui.gh;
import org.telegram.ui.i60;
import org.telegram.ui.ih1;
import org.telegram.ui.ip;
import org.telegram.ui.ln;
import org.telegram.ui.n70;
import org.telegram.ui.ph;
import org.telegram.ui.pn0;
import org.telegram.ui.pp;
import org.telegram.ui.qp;
import org.telegram.ui.rf0;
import org.telegram.ui.rm;
import org.telegram.ui.sl0;
import org.telegram.ui.xn;
import org.telegram.ui.xo0;
import org.telegram.ui.zm0;
import org.telegram.ui.zn;
public final class s4 implements Runnable {
    public final int f1498a;
    public final boolean f1499b;
    public final Object f1500c;
    public final Object d;
    public final Object e;

    public s4(u4 u4Var, View view, zg.p0 p0Var, boolean z10, boolean z11) {
        this.f1498a = 0;
        this.f1500c = u4Var;
        this.d = view;
        this.e = p0Var;
        this.f1499b = z10;
    }

    private final void a() {
        byte[] bArr;
        bn0 bn0Var = (bn0) this.f1500c;
        boolean z10 = this.f1499b;
        byte[] bArr2 = (byte[]) this.e;
        pn0 pn0Var = bn0Var.e;
        pn0Var.f36634d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            pn0Var.f36636e1 = pn0Var.P0;
        }
        byte[] bArr3 = pn0Var.f36632c1;
        byte[] bArr4 = pn0Var.f36636e1;
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
        if (pn0.Z0(bArr, Long.valueOf(pn0Var.f36629b1)) && bArr2.length != 0 && pn0Var.f36629b1 != 0) {
            if (pn0Var.f36630c == 0) {
                ConnectionsManager.getInstance(pn0.t0(pn0Var)).sendRequest(new TL_account.getAllSecureValues(), new zm0(bn0Var, 0));
                return;
            }
            bn0Var.a();
        } else if (z10) {
            UserConfig.getInstance(pn0.s0(pn0Var)).resetSavedPassword();
            pn0Var.N0 = 0;
            pn0Var.R1();
        } else {
            TL_account.authorizationForm authorizationform = pn0Var.f36679y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                pn0Var.f36679y.errors.clear();
            }
            byte[] bArr7 = pn0Var.f36632c1;
            if (bArr7 != null && bArr7.length != 0) {
                bn0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new rf0(bn0Var, bn0Var.f32519b, bn0Var.d, 12));
            }
        }
    }

    private final void b() {
        xo0 xo0Var = (xo0) this.f1500c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            xo0Var.f39664a0 = password;
            TwoStepVerificationActivity.m0(password);
            xo0Var.A0(this.f1499b);
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
        zn znVar;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.f6 f6Var;
        ci.eb ebVar;
        int i15;
        int i16;
        boolean z10;
        byte[] bArr;
        byte[] bArr2;
        String str = null;
        boolean z11 = true;
        switch (this.f1498a) {
            case 0:
                u4 u4Var = (u4) this.f1500c;
                zg.p0 p0Var = (zg.p0) this.e;
                boolean z12 = this.f1499b;
                f6 f6Var2 = u4Var.f1570a;
                org.telegram.ui.Components.d5.a0(f6Var2.C2, 1, f6Var2.B1, new t4(u4Var, z12, p0Var, (View) this.d));
                return;
            case 1:
                ci.w1 w1Var = (ci.w1) this.f1500c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.e;
                boolean z13 = this.f1499b;
                ci.z1 z1Var = w1Var.f5685s;
                if (w1Var.f5684r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        ci.t2 t2Var = z1Var.f5859r;
                        ArrayList arrayList = z1Var.f5858n;
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
                    w1Var.f5684r = false;
                    return;
                }
                return;
            case 2:
                ci.o8 o8Var = (ci.o8) this.f1500c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z14 = this.f1499b;
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
                gg.i0 i0Var = (gg.i0) this.f1500c;
                boolean z15 = this.f1499b;
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) this.d;
                gg.f0 f0Var = (gg.f0) this.e;
                if (!z15) {
                    i0Var.f9764c = f0Var;
                    w3Var.setRightText(i0Var.H(f0Var));
                    w3Var.setRightTextMargin(6);
                    i0Var.I.clear();
                    i0Var.d = true;
                    i0Var.l();
                    i0Var.Q();
                    return;
                }
                return;
            case 4:
                boolean z16 = this.f1499b;
                i2.e0 e0Var = (i2.e0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o9 = j2.i.o((Context) this.f1500c);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z16) {
                    j2.f fVar = e0Var.f10675s;
                    fVar.getClass();
                    fVar.f12579f.a(o9);
                }
                LogSessionId q6 = o9.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f12606b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                boolean z17 = this.f1499b;
                ii.t3 t3Var = (ii.t3) this.e;
                String trim = ((EditTextBoldCursor) this.f1500c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ii.j4.k(n2Var, z17, new ah.b(18, t3Var, trim));
                    return;
                }
                return;
            case 6:
                ki.q0 q0Var = (ki.q0) this.f1500c;
                ki.q qVar = (ki.q) this.d;
                boolean z18 = this.f1499b;
                ki.m0 m0Var = (ki.m0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    qVar.c();
                    q0Var.f13836l.b("active output finalized: size=" + qVar.f13816a.length() + ", elapsedMs=" + ki.q0.e(nanoTime));
                    q0Var.f();
                    if (z18) {
                        q0Var.b(m0Var, qVar.f13816a, q0Var.D, true);
                    } else {
                        File file = qVar.f13816a;
                        try {
                            q0Var.r(file, 0L, q0Var.D, false, 2);
                            w7.k.c(file);
                        } catch (Exception e10) {
                            e = e10;
                            q0Var = q0Var;
                            q0Var.h.post(new ki.z(q0Var, e, 2));
                            return;
                        }
                    }
                    return;
                } catch (Exception e11) {
                    e = e11;
                }
            case 7:
                m4.a0 a0Var = (m4.a0) this.f1500c;
                boolean z19 = this.f1499b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.f1 f1Var = a0Var.f14690g;
                if (z19) {
                    m4.l1 l1Var = new m4.l1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v x10 = f1Var.f14747b.x(rVar);
                        if (x10 != null) {
                            i11 = x10.b(m4.a0.B).f14835n;
                        } else if (!a0Var.h(rVar)) {
                            v7.m8.b(new m4.p1(-100));
                        } else {
                            v7.m8.b(new m4.p1(0));
                            i11 = 0;
                        }
                        m4.q qVar2 = rVar.d;
                        if (qVar2 != null) {
                            qVar2.d(i11, l1Var);
                        }
                    } catch (DeadObjectException unused) {
                        f1Var.f14747b.M(rVar);
                        v7.m8.b(new m4.p1(-100));
                    } catch (RemoteException e12) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e12);
                        v7.m8.b(new m4.p1(-1));
                    }
                }
                runnable2.run();
                f1Var.f14747b.n(rVar);
                return;
            case 8:
                boolean z20 = this.f1499b;
                m4.r rVar2 = (m4.r) this.e;
                m4.a0 a0Var2 = ((m4.k0) ((androidx.activity.n) this.f1500c).d).f14821g;
                m4.j1 j1Var = a0Var2.f14702t;
                w7.u.b(j1Var, (m4.s) this.d);
                int d = j1Var.d();
                if (d == 1) {
                    if (j1Var.m0(2)) {
                        j1Var.b();
                    }
                } else if (d == 4 && j1Var.m0(4)) {
                    j1Var.H();
                }
                if (z20 && j1Var.m0(1)) {
                    j1Var.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i17 : new int[]{31, 2}) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(i17, true);
                }
                if (z20) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(1, true);
                }
                e2.d.g(!false);
                a0Var2.p(rVar2);
                return;
            case 9:
                ((CameraController) this.f1500c).lambda$initCamera$3(this.f1499b, (Exception) this.d, (Runnable) this.e);
                return;
            case 10:
                String[] strArr = (String[]) this.f1500c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                boolean z21 = this.f1499b;
                org.telegram.ui.ActionBar.q qVar3 = (org.telegram.ui.ActionBar.q) this.e;
                try {
                    org.telegram.ui.ActionBar.j6.f19157g0 = org.telegram.ui.ActionBar.j6.ql.get(org.telegram.ui.ActionBar.j6.f19162g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.j6.f19175h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.j6.f19175h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = i6Var.f18992c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(i6Var.f18992c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        i6Var.f18992c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.j6.f19175h0);
                        i6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i18 = 0; i18 < split.length; i18++) {
                                if ("blur".equals(split[i18])) {
                                    i6Var.h = true;
                                } else if ("motion".equals(split[i18])) {
                                    i6Var.f19002n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        i6Var.f19006x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                i6Var.f19003r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    i6Var.f19004s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    i6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    i6Var.f19005w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                i6Var.f19006x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (i6Var.f18992c != null) {
                                new File(i6Var.f18992c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        i6Var.f18992c = null;
                        org.telegram.ui.ActionBar.j6.f19175h0 = null;
                    }
                    if (!z21 && org.telegram.ui.ActionBar.j6.M == null) {
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
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (org.telegram.ui.ActionBar.j6.M == null && !org.telegram.ui.ActionBar.j6.Q) {
                    MessagesController.getInstance(i6Var.E).saveTheme(i6Var, i6Var.k(false), z21, false);
                }
                qVar3.run();
                return;
            case 11:
                zn.v0((zn) this.f1500c, (String) this.d, (MessageObject) this.e, this.f1499b);
                return;
            case 12:
                ln lnVar = (ln) this.f1500c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z22 = this.f1499b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i19 = R.string.SuggestedMessageAcceptInfo;
                zn znVar2 = lnVar.f35505a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i19, znVar2.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                if (m10.f49272a == zf.b.f49275b) {
                    i12 = znVar2.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i12 = znVar2.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z22) {
                    znVar = znVar2;
                    m10 = zf.a.i((m10.f49273b / 1000) * i12, m10.f49272a);
                } else {
                    znVar = znVar2;
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z22) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), ei.l.G0(i12))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z22) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), yh.e0.o(message.suggested_post.schedule_date), ei.l.G0(i12))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), yh.e0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i20 = R.string.SuggestedMessageAcceptInfo3;
                i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, Long.valueOf(MessagesController.getInstance(i13).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.pc[] pcVarArr = new org.telegram.ui.Components.pc[1];
                org.telegram.ui.r5 r5Var = new org.telegram.ui.r5(pcVarArr, 4);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i14 = R.string.Next;
                } else {
                    i14 = R.string.SuggestedPostPublish;
                }
                zn znVar3 = znVar;
                org.telegram.ui.ActionBar.b2 v02 = org.telegram.ui.Components.d5.v0(znVar3, string, spannableStringBuilder, LocaleController.getString(i14), false, new m3(lnVar, message, b2VarArr, messageObject, r5Var, 18));
                b2VarArr[0] = v02;
                v02.setOnDismissListener(r5Var);
                if (z22 && m10.f49272a == zf.b.f49274a) {
                    org.telegram.ui.Components.jb a2 = org.telegram.ui.Components.kb.a(znVar3.getParentActivity());
                    f6Var = ((org.telegram.ui.ActionBar.n2) znVar3).resourceProvider;
                    org.telegram.ui.Components.pc G = new xc(a2, f6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f27311j = 60000;
                    G.k(true);
                    pcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                xn xnVar = (xn) this.f1500c;
                xnVar.j((org.telegram.ui.ActionBar.d4) this.d, (TLRPC.WallPaper) this.e, this.f1499b);
                xnVar.g(xnVar.f39651n);
                rm rmVar = xnVar.V.X0;
                if (rmVar != null && (ebVar = rmVar.L) != null) {
                    ebVar.invalidate();
                    return;
                }
                return;
            case 14:
                ip ipVar = (ip) this.f1500c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z23 = this.f1499b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    ipVar.f34669l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = ipVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z23) {
                        if (ipVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ipVar.getParentActivity());
                            alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            ipVar.showDialog(alertDialog$Builder.f18669a);
                        } else {
                            return;
                        }
                    }
                }
                g90 g90Var = ipVar.G;
                if (g90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ipVar.f34669l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    g90Var.setLink(str);
                    ipVar.G.c(ipVar.f34669l0, ipVar.Z);
                    return;
                }
                return;
            case 15:
                qp qpVar = (qp) this.f1500c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z24 = this.f1499b;
                chat.join_to_send = z24;
                qpVar.f36977x.d.getMessagesController().toggleChatJoinToSend(chat.f18343id, z24, new ci.y0(qpVar, z24, chat, 16), new gh(20, qpVar, (u80) this.e));
                return;
            case 16:
                qp qpVar2 = (qp) this.f1500c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z25 = this.f1499b;
                chat2.join_request = z25;
                qpVar2.f36977x.d.getMessagesController().toggleChatJoinRequest(chat2.f18343id, z25, new pp(qpVar2, 0), new gh(19, qpVar2, (t80) this.e));
                return;
            case 17:
                boolean z26 = this.f1499b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f1500c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z26 && ChatObject.isChannel(chat3)) {
                    View d10 = alertDialog$Builder2.f18669a.d(-1);
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
            case 18:
                nk nkVar = (nk) this.f1500c;
                boolean z27 = this.f1499b;
                ArrayList arrayList2 = (ArrayList) this.e;
                nkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new tc(15, nkVar, new ArrayList()));
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
                if (!z27) {
                    for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                        ik ikVar = (ik) arrayList2.get(i22);
                        File file2 = ikVar.f25150f;
                        if (file2 != null && !file2.isDirectory()) {
                            int i23 = 0;
                            while (true) {
                                if (i23 < i21) {
                                    String str4 = strArr2[i23];
                                    String str5 = ikVar.f25148b;
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
                AndroidUtilities.runOnUIThread(new tc(15, nkVar, arrayList3));
                return;
            case 19:
                r80.t((r80) this.f1500c, (TLRPC.TL_error) this.d, this.f1499b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z28 = this.f1499b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                iy0 iy0Var = ((xx0) this.f1500c).f30428a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z28) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        iy0Var.S = tL_messages_stickerSet;
                        iy0Var.t0();
                        iy0Var.B0();
                    }
                }
                b2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f1500c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z29 = this.f1499b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                if (f3Var != null && !f3Var.isDismissed()) {
                    f3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z29) {
                        AndroidUtilities.runOnUIThread(new ph(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (b2Var2 != null && b2Var2.isShowing()) {
                    b2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z29) {
                        AndroidUtilities.runOnUIThread(new ph(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 22:
                i60 i60Var = (i60) this.f1500c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z30 = this.f1499b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        i60Var.u1(null, tL_chatInviteExported3.link, true, z30);
                        return;
                    }
                }
                return;
            case 23:
                n70 n70Var = (n70) this.f1500c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z31 = this.f1499b;
                if (tL_error2 == null) {
                    n70Var.f35925f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z31) {
                        if (n70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(n70Var.getParentActivity());
                            alertDialog$Builder3.f18669a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f18669a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            n70Var.showDialog(alertDialog$Builder3.f18669a);
                        } else {
                            return;
                        }
                    }
                }
                n70Var.e = false;
                n70Var.f35922a.l();
                return;
            case 24:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z32 = this.f1499b;
                pn0 pn0Var = ((bn0) this.f1500c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    pn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    pn0Var.B1(z32);
                    return;
                }
                return;
            case 25:
                bn0 bn0Var = (bn0) this.f1500c;
                String str6 = (String) this.e;
                boolean z33 = this.f1499b;
                pn0 pn0Var2 = bn0Var.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    pn0Var2.f36632c1 = tL_secureSecretSettings.secure_secret;
                    pn0Var2.f36629b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        pn0Var2.f36636e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        pn0Var2.f36636e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr3;
                        AndroidUtilities.runOnUIThread(new s4(bn0Var, passwordsettings, z33, bArr2, 26));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new sl0(bn0Var, 4));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = pn0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        pn0Var2.f36636e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr4;
                    } else {
                        bArr = new byte[0];
                    }
                    pn0Var2.f36632c1 = null;
                    pn0Var2.f36629b1 = 0L;
                }
                bArr2 = bArr;
                AndroidUtilities.runOnUIThread(new s4(bn0Var, passwordsettings, z33, bArr2, 26));
                return;
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                f31.W((f31) this.f1500c, this.f1499b, (org.telegram.ui.ActionBar.d4) this.d, (org.telegram.ui.ActionBar.c5) this.e);
                return;
            default:
                ih1.c0((ih1) this.f1500c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.f1499b);
                return;
        }
    }

    public s4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f1498a = i10;
        this.f1500c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1499b = z10;
    }

    public s4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1498a = i10;
        this.f1500c = obj;
        this.d = obj2;
        this.f1499b = z10;
        this.e = obj3;
    }

    public s4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f1498a = i10;
        this.f1500c = obj;
        this.f1499b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public s4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f1498a = 17;
        this.f1499b = z10;
        this.f1500c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
