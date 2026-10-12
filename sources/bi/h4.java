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
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.zc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.co;
import org.telegram.ui.cp0;
import org.telegram.ui.dn0;
import org.telegram.ui.fn0;
import org.telegram.ui.fo;
import org.telegram.ui.l31;
import org.telegram.ui.n60;
import org.telegram.ui.np;
import org.telegram.ui.oh;
import org.telegram.ui.oh1;
import org.telegram.ui.qn;
import org.telegram.ui.rp;
import org.telegram.ui.s70;
import org.telegram.ui.uf0;
import org.telegram.ui.un0;
import org.telegram.ui.vp;
import org.telegram.ui.wp;
import org.telegram.ui.xm;
import org.telegram.ui.yk0;
public final class h4 implements Runnable {
    public final int f3113a;
    public final boolean f3114b;
    public final Object f3115c;
    public final Object d;
    public final Object e;

    public h4(j4 j4Var, View view, ah.i1 i1Var, boolean z10, boolean z11) {
        this.f3113a = 0;
        this.f3115c = j4Var;
        this.d = view;
        this.e = i1Var;
        this.f3114b = z10;
    }

    private final void a() {
        byte[] bArr;
        fn0 fn0Var = (fn0) this.f3115c;
        boolean z10 = this.f3114b;
        byte[] bArr2 = (byte[]) this.e;
        un0 un0Var = fn0Var.e;
        un0Var.f40729d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            un0Var.f40731e1 = un0Var.P0;
        }
        byte[] bArr3 = un0Var.f40727c1;
        byte[] bArr4 = un0Var.f40731e1;
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
        if (un0.Y0(bArr, Long.valueOf(un0Var.f40724b1)) && bArr2.length != 0 && un0Var.f40724b1 != 0) {
            if (un0Var.f40725c == 0) {
                ConnectionsManager.getInstance(un0.s0(un0Var)).sendRequest(new TL_account.getAllSecureValues(), new dn0(fn0Var, 0));
                return;
            }
            fn0Var.a();
        } else if (z10) {
            UserConfig.getInstance(un0.r0(un0Var)).resetSavedPassword();
            un0Var.N0 = 0;
            un0Var.Q1();
        } else {
            TL_account.authorizationForm authorizationform = un0Var.f40774y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                un0Var.f40774y.errors.clear();
            }
            byte[] bArr7 = un0Var.f40727c1;
            if (bArr7 != null && bArr7.length != 0) {
                fn0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new uf0(fn0Var, fn0Var.f35868b, fn0Var.d, 12));
            }
        }
    }

    private final void b() {
        l31.V((l31) this.f3115c, this.f3114b, (org.telegram.ui.ActionBar.b4) this.d, (org.telegram.ui.ActionBar.a5) this.e);
    }

    private final void c() {
        oh1.c0((oh1) this.f3115c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.f3114b);
    }

    @Override
    public final void run() {
        int i10;
        Bitmap.CompressFormat compressFormat;
        File file;
        boolean z10;
        File file2;
        int i11;
        int i12;
        String[] split;
        int i13;
        fo foVar;
        char c10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.c6 c6Var;
        di.ab abVar;
        int i16;
        int i17;
        boolean z11;
        byte[] bArr;
        String str = null;
        boolean z12 = true;
        switch (this.f3113a) {
            case 0:
                j4 j4Var = (j4) this.f3115c;
                ah.i1 i1Var = (ah.i1) this.e;
                boolean z13 = this.f3114b;
                q5 q5Var = j4Var.f3202a;
                org.telegram.ui.Components.g5.Z(q5Var.C2, 1, q5Var.B1, new i4(j4Var, z13, i1Var, (View) this.d));
                return;
            case 1:
                di.v1 v1Var = (di.v1) this.f3115c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.e;
                boolean z14 = this.f3114b;
                di.y1 y1Var = v1Var.f7975s;
                if (v1Var.f7974r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        di.r2 r2Var = y1Var.f8123r;
                        ArrayList arrayList = y1Var.f8122n;
                        i10 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str2, messages_botresults);
                        v1Var.h = messages_botresults.next_offset;
                        if (z14) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        v1Var.l();
                    }
                    y1Var.d.c(false);
                    v1Var.f7974r = false;
                    return;
                }
                return;
            case 2:
                di.k8 k8Var = (di.k8) this.f3115c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z15 = this.f3114b;
                Runnable runnable = (Runnable) this.e;
                k8Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(k8Var.Z0);
                    if (z15) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                    if (z15) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(k8Var.Z0));
                        } catch (Exception e7) {
                            FileLog.e((Throwable) e7, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                hg.h0 h0Var = (hg.h0) this.f3115c;
                boolean z16 = this.f3114b;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) this.d;
                hg.e0 e0Var = (hg.e0) this.e;
                if (!z16) {
                    h0Var.f10566c = e0Var;
                    v3Var.setRightText(h0Var.H(e0Var));
                    v3Var.setRightTextMargin(6);
                    h0Var.I.clear();
                    h0Var.d = true;
                    h0Var.l();
                    h0Var.Q();
                    return;
                }
                return;
            case 4:
                boolean z17 = this.f3114b;
                i2.h0 h0Var2 = (i2.h0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o10 = j2.i.o((Context) this.f3115c);
                if (o10 == null) {
                    e2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z17) {
                    j2.f fVar = h0Var2.f11012s;
                    fVar.getClass();
                    fVar.f12528f.a(o10);
                }
                LogSessionId q6 = o10.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f12556b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
                boolean z18 = this.f3114b;
                ji.u3 u3Var = (ji.u3) this.e;
                String trim = ((EditTextBoldCursor) this.f3115c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ji.l4.k(m2Var, z18, new ah.h0(22, u3Var, trim));
                    return;
                }
                return;
            case 6:
                li.u0 u0Var = (li.u0) this.f3115c;
                li.x xVar = (li.x) this.d;
                boolean z19 = this.f3114b;
                li.q0 q0Var = (li.q0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    xVar.g();
                    long e10 = w7.p.e(xVar.f15037a) / 1000;
                    u0Var.f15015m.b("active output finalized: size=" + file.length() + ", durationMs=" + e10 + ", elapsedMs=" + li.u0.f(nanoTime));
                    u0Var.g();
                    long j10 = u0Var.f15017o;
                    if (e10 > j10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z19 && !z10) {
                        u0Var.f15013k.execute(new li.j0(u0Var, q0Var, xVar.f15037a, e10, true));
                        return;
                    }
                    File file3 = xVar.f15037a;
                    try {
                        long min = Math.min(j10, e10);
                        if (z10) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        file2 = file3;
                        try {
                            u0Var.s(file2, 0L, min, z19, i11);
                            w7.p.c(file2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            w7.p.c(file2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file2 = file3;
                    }
                } catch (Exception e11) {
                    u0Var.f15011i.post(new li.g0(u0Var, e11, 2));
                    return;
                }
            case 7:
                m4.f0 f0Var = (m4.f0) this.f3115c;
                boolean z20 = this.f3114b;
                m4.w wVar = (m4.w) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.j1 j1Var = f0Var.f15428g;
                if (z20) {
                    m4.p1 p1Var = new m4.p1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v q10 = j1Var.f15475b.q(wVar);
                        if (q10 != null) {
                            i12 = q10.b(m4.f0.B).f15559n;
                        } else if (!f0Var.h(wVar)) {
                            v7.q8.b(new m4.t1(-100));
                        } else {
                            v7.q8.b(new m4.t1(0));
                            i12 = 0;
                        }
                        m4.v vVar = wVar.d;
                        if (vVar != null) {
                            vVar.e(i12, p1Var);
                        }
                    } catch (DeadObjectException unused) {
                        j1Var.f15475b.C(wVar);
                        v7.q8.b(new m4.t1(-100));
                    } catch (RemoteException e12) {
                        e2.a.m("MediaSessionImpl", "Exception in " + wVar, e12);
                        v7.q8.b(new m4.t1(-1));
                    }
                }
                runnable2.run();
                j1Var.f15475b.j(wVar);
                return;
            case 8:
                ((CameraController) this.f3115c).lambda$initCamera$3(this.f3114b, (Exception) this.d, (Runnable) this.e);
                return;
            case 9:
                String[] strArr = (String[]) this.f3115c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                boolean z21 = this.f3114b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    org.telegram.ui.ActionBar.g6.f19948g0 = org.telegram.ui.ActionBar.g6.tl.get(org.telegram.ui.ActionBar.g6.f19953g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.g6.f19967h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.g6.f19967h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = f6Var.f19795c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(f6Var.f19795c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        f6Var.f19795c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.g6.f19967h0);
                        f6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i18 = 0; i18 < split.length; i18++) {
                                if ("blur".equals(split[i18])) {
                                    f6Var.h = true;
                                } else if ("motion".equals(split[i18])) {
                                    f6Var.f19805n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        f6Var.f19809x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                f6Var.f19806r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    f6Var.f19807s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    f6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    f6Var.f19808w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                f6Var.f19809x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (f6Var.f19795c != null) {
                                new File(f6Var.f19795c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        f6Var.f19795c = null;
                        org.telegram.ui.ActionBar.g6.f19967h0 = null;
                    }
                    if (!z21 && org.telegram.ui.ActionBar.g6.M == null) {
                        org.telegram.ui.ActionBar.g6.K = f6Var;
                        if (org.telegram.ui.ActionBar.g6.I != org.telegram.ui.ActionBar.g6.J) {
                            z12 = false;
                        }
                        if (z12) {
                            org.telegram.ui.ActionBar.g6.T = 2000;
                            org.telegram.ui.ActionBar.g6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ah.j(17), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.g6.I = f6Var;
                    org.telegram.ui.ActionBar.g6.o1(false, false);
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (org.telegram.ui.ActionBar.g6.M == null && !org.telegram.ui.ActionBar.g6.Q) {
                    MessagesController.getInstance(f6Var.E).saveTheme(f6Var, f6Var.k(false), z21, false);
                }
                pVar.run();
                return;
            case 10:
                fo.v0((fo) this.f3115c, (String) this.d, (MessageObject) this.e, this.f3114b);
                return;
            case 11:
                qn qnVar = (qn) this.f3115c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z22 = this.f3114b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i19 = R.string.SuggestedMessageAcceptInfo;
                fo foVar2 = qnVar.f39497a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i19, foVar2.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                ag.a m10 = ag.a.m(message.suggested_post.price);
                if (m10.f627a == ag.b.f630b) {
                    i13 = foVar2.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i13 = foVar2.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z22) {
                    c10 = 0;
                    foVar = foVar2;
                    m10 = ag.a.i((m10.f628b / 1000) * i13, m10.f627a);
                } else {
                    foVar = foVar2;
                    c10 = 0;
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z22) {
                        int i20 = R.string.SuggestedMessageAcceptInfoAnytimeAdmin2;
                        String f7 = m10.f();
                        String H0 = fi.l.H0(i13);
                        Object[] objArr = new Object[2];
                        objArr[c10] = f7;
                        objArr[1] = H0;
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, objArr)));
                    } else {
                        int i21 = R.string.SuggestedMessageAcceptInfoAnytimeUser2;
                        Object[] objArr2 = new Object[1];
                        objArr2[c10] = m10.f();
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, objArr2)));
                    }
                } else if (z22) {
                    int i22 = R.string.SuggestedMessageAcceptInfoAdmin2;
                    String f10 = m10.f();
                    String q11 = zh.d0.q(message.suggested_post.schedule_date);
                    String H02 = fi.l.H0(i13);
                    Object[] objArr3 = new Object[3];
                    objArr3[c10] = f10;
                    objArr3[1] = q11;
                    objArr3[2] = H02;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, objArr3)));
                } else {
                    int i23 = R.string.SuggestedMessageAcceptInfoUser2;
                    String f11 = m10.f();
                    String q12 = zh.d0.q(message.suggested_post.schedule_date);
                    Object[] objArr4 = new Object[2];
                    objArr4[c10] = f11;
                    objArr4[1] = q12;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i23, objArr4)));
                }
                spannableStringBuilder.append(' ');
                int i24 = R.string.SuggestedMessageAcceptInfo3;
                i14 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                Object[] objArr5 = new Object[1];
                objArr5[c10] = Long.valueOf(MessagesController.getInstance(i14).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS));
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i24, objArr5)));
                sc[] scVarArr = new sc[1];
                org.telegram.ui.v5 v5Var = new org.telegram.ui.v5(scVarArr, 4);
                org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i15 = R.string.Next;
                } else {
                    i15 = R.string.SuggestedPostPublish;
                }
                fo foVar3 = foVar;
                org.telegram.ui.ActionBar.a2 u02 = org.telegram.ui.Components.g5.u0(foVar3, string, spannableStringBuilder, LocaleController.getString(i15), false, new c3(qnVar, message, a2VarArr, messageObject, v5Var, 18));
                a2VarArr[c10] = u02;
                u02.setOnDismissListener(v5Var);
                if (z22 && m10.f627a == ag.b.f629a) {
                    org.telegram.ui.Components.mb a2 = org.telegram.ui.Components.nb.a(foVar3.getParentActivity());
                    c6Var = ((org.telegram.ui.ActionBar.m2) foVar3).resourceProvider;
                    sc G = new zc(a2, c6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f29102j = 60000;
                    G.k(true);
                    scVarArr[c10] = G;
                    return;
                }
                return;
            case 12:
                co coVar = (co) this.f3115c;
                coVar.j((org.telegram.ui.ActionBar.b4) this.d, (TLRPC.WallPaper) this.e, this.f3114b);
                coVar.g(coVar.f34983n);
                xm xmVar = coVar.V.X0;
                if (xmVar != null && (abVar = xmVar.L) != null) {
                    abVar.invalidate();
                    return;
                }
                return;
            case 13:
                np npVar = (np) this.f3115c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z23 = this.f3114b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    npVar.f38767l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = npVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z23) {
                        if (npVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar.getParentActivity());
                            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            npVar.showDialog(alertDialog$Builder.f19548a);
                        } else {
                            return;
                        }
                    }
                }
                w90 w90Var = npVar.G;
                if (w90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = npVar.f38767l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    w90Var.setLink(str);
                    npVar.G.c(npVar.f38767l0, npVar.Z);
                    return;
                }
                return;
            case 14:
                wp wpVar = (wp) this.f3115c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z24 = this.f3114b;
                chat.join_to_send = z24;
                wpVar.f41631x.d.getMessagesController().toggleChatJoinToSend(chat.f19216id, z24, new di.x0(wpVar, z24, chat, 17), new rp(3, wpVar, (j90) this.e));
                return;
            case 15:
                wp wpVar2 = (wp) this.f3115c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z25 = this.f3114b;
                chat2.join_request = z25;
                wpVar2.f41631x.d.getMessagesController().toggleChatJoinRequest(chat2.f19216id, z25, new vp(wpVar2, 0), new rp(2, wpVar2, (i90) this.e));
                return;
            case 16:
                boolean z26 = this.f3114b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f3115c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z26 && ChatObject.isChannel(chat3)) {
                    View d = alertDialog$Builder2.f19548a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat3)) {
                                i16 = R.string.ChannelDelete;
                            } else {
                                i16 = R.string.DeleteMega;
                            }
                            textView.setText(LocaleController.getString(i16));
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
                ok okVar = (ok) this.f3115c;
                boolean z27 = this.f3114b;
                ArrayList arrayList2 = (ArrayList) this.e;
                okVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new rp(29, okVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    str = translitString;
                }
                if (str != null) {
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                int i25 = i17 + 1;
                String[] strArr2 = new String[i25];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z27) {
                    for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                        jk jkVar = (jk) arrayList2.get(i26);
                        File file4 = jkVar.f26399f;
                        if (file4 != null && !file4.isDirectory()) {
                            int i27 = 0;
                            while (true) {
                                if (i27 < i25) {
                                    String str4 = strArr2[i27];
                                    String str5 = jkVar.f26397b;
                                    if (str5 != null) {
                                        z11 = str5.toLowerCase().contains(str4);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList3.add(jkVar);
                                    } else {
                                        i27++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new rp(29, okVar, arrayList3));
                return;
            case 18:
                g90.v((g90) this.f3115c, (TLRPC.TL_error) this.d, this.f3114b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 19:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z28 = this.f3114b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.e;
                ty0 ty0Var = ((iy0) this.f3115c).f26124a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z28) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        ty0Var.S = tL_messages_stickerSet;
                        ty0Var.u0();
                        ty0Var.C0();
                    }
                }
                a2Var.dismiss();
                return;
            case 20:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f3115c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z29 = this.f3114b;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.e;
                if (e3Var != null && !e3Var.isDismissed()) {
                    e3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z29) {
                        AndroidUtilities.runOnUIThread(new oh(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (a2Var2 != null && a2Var2.isShowing()) {
                    a2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z29) {
                        AndroidUtilities.runOnUIThread(new oh(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 21:
                n60 n60Var = (n60) this.f3115c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z30 = this.f3114b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        n60Var.v1(null, tL_chatInviteExported3.link, true, z30);
                        return;
                    }
                }
                return;
            case 22:
                s70 s70Var = (s70) this.f3115c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z31 = this.f3114b;
                if (tL_error2 == null) {
                    s70Var.f39984f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z31) {
                        if (s70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(s70Var.getParentActivity());
                            alertDialog$Builder3.f19548a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f19548a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            s70Var.showDialog(alertDialog$Builder3.f19548a);
                        } else {
                            return;
                        }
                    }
                }
                s70Var.e = false;
                s70Var.f39981a.l();
                return;
            case 23:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z32 = this.f3114b;
                un0 un0Var = ((fn0) this.f3115c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    un0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    un0Var.A1(z32);
                    return;
                }
                return;
            case 24:
                fn0 fn0Var = (fn0) this.f3115c;
                String str6 = (String) this.e;
                boolean z33 = this.f3114b;
                un0 un0Var2 = fn0Var.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    un0Var2.f40727c1 = tL_secureSecretSettings.secure_secret;
                    un0Var2.f40724b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        un0Var2.f40731e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        un0Var2.f40731e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new yk0(fn0Var, 5));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = un0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        un0Var2.f40731e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    un0Var2.f40727c1 = null;
                    un0Var2.f40724b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new h4(fn0Var, passwordsettings, z33, bArr, 25));
                return;
            case 25:
                a();
                return;
            case 26:
                cp0 cp0Var = (cp0) this.f3115c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z34 = this.f3114b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    cp0Var.f34996a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    cp0Var.A0(z34);
                    return;
                }
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                qg.q0 q0Var2 = (qg.q0) this.f3115c;
                boolean z35 = this.f3114b;
                q0Var2.f43524f.f(new qg.o0(q0Var2, (a5.a) this.d, 0));
                q0Var2.f43524f.f(new qg.o0(q0Var2, (a5.a) this.e, 0));
                q0Var2.E = z35;
                return;
        }
    }

    public h4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f3113a = i10;
        this.f3115c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f3114b = z10;
    }

    public h4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f3113a = i10;
        this.f3115c = obj;
        this.d = obj2;
        this.f3114b = z10;
        this.e = obj3;
    }

    public h4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f3113a = i10;
        this.f3115c = obj;
        this.f3114b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public h4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f3113a = 16;
        this.f3114b = z10;
        this.f3115c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
