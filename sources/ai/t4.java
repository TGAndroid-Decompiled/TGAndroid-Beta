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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d31;
import org.telegram.ui.g60;
import org.telegram.ui.hh1;
import org.telegram.ui.ip;
import org.telegram.ui.kh;
import org.telegram.ui.l70;
import org.telegram.ui.ln;
import org.telegram.ui.mn0;
import org.telegram.ui.nf0;
import org.telegram.ui.pp;
import org.telegram.ui.qp;
import org.telegram.ui.sk0;
import org.telegram.ui.sm;
import org.telegram.ui.ug;
import org.telegram.ui.uo0;
import org.telegram.ui.wm0;
import org.telegram.ui.xn;
import org.telegram.ui.ym0;
import org.telegram.ui.zn;
public final class t4 implements Runnable {
    public final int f1729a;
    public final boolean f1730b;
    public final Object f1731c;
    public final Object d;
    public final Object f1732e;

    public t4(v4 v4Var, View view, zg.n0 n0Var, boolean z10, boolean z11) {
        this.f1729a = 0;
        this.f1731c = v4Var;
        this.d = view;
        this.f1732e = n0Var;
        this.f1730b = z10;
    }

    private final void a() {
        byte[] bArr;
        byte[] bArr2;
        ym0 ym0Var = (ym0) this.f1731c;
        String str = (String) this.f1732e;
        mn0 mn0Var = ym0Var.f44459e;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            mn0Var.f39990c1 = tL_secureSecretSettings.secure_secret;
            mn0Var.f39987b1 = tL_secureSecretSettings.secure_secret_id;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                mn0Var.f39995e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str), bArr);
            } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                mn0Var.f39995e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                AndroidUtilities.runOnUIThread(new t4(ym0Var, passwordsettings, this.f1730b, bArr2, 26));
            } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                AndroidUtilities.runOnUIThread(new sk0(ym0Var, 5));
                return;
            } else {
                bArr = new byte[0];
            }
        } else {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = mn0Var.J.new_secure_algo;
            if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                mn0Var.f39995e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                bArr = bArr3;
            } else {
                bArr = new byte[0];
            }
            mn0Var.f39990c1 = null;
            mn0Var.f39987b1 = 0L;
        }
        bArr2 = bArr;
        AndroidUtilities.runOnUIThread(new t4(ym0Var, passwordsettings, this.f1730b, bArr2, 26));
    }

    private final void b() {
        byte[] bArr;
        ym0 ym0Var = (ym0) this.f1731c;
        boolean z10 = this.f1730b;
        byte[] bArr2 = (byte[]) this.f1732e;
        mn0 mn0Var = ym0Var.f44459e;
        mn0Var.f39992d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            mn0Var.f39995e1 = mn0Var.P0;
        }
        byte[] bArr3 = mn0Var.f39990c1;
        byte[] bArr4 = mn0Var.f39995e1;
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
        if (mn0.Y0(bArr, Long.valueOf(mn0Var.f39987b1)) && bArr2.length != 0 && mn0Var.f39987b1 != 0) {
            if (mn0Var.f39988c == 0) {
                ConnectionsManager.getInstance(mn0.s0(mn0Var)).sendRequest(new TL_account.getAllSecureValues(), new wm0(ym0Var, 0));
                return;
            }
            ym0Var.a();
        } else if (z10) {
            UserConfig.getInstance(mn0.r0(mn0Var)).resetSavedPassword();
            mn0Var.N0 = 0;
            mn0Var.Q1();
        } else {
            TL_account.authorizationForm authorizationform = mn0Var.f40038y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                mn0Var.f40038y.errors.clear();
            }
            byte[] bArr7 = mn0Var.f39990c1;
            if (bArr7 != null && bArr7.length != 0) {
                ym0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new nf0(ym0Var, ym0Var.f44457b, ym0Var.d, 12));
            }
        }
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
        int[] iArr;
        String[] split;
        int i13;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.d6 d6Var;
        ci.bb bbVar;
        int i16;
        int i17;
        boolean z11;
        String str = null;
        boolean z12 = true;
        switch (this.f1729a) {
            case 0:
                v4 v4Var = (v4) this.f1731c;
                zg.n0 n0Var = (zg.n0) this.f1732e;
                boolean z13 = this.f1730b;
                f6 f6Var = v4Var.f1824a;
                org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new u4(v4Var, z13, n0Var, (View) this.d));
                return;
            case 1:
                ci.v1 v1Var = (ci.v1) this.f1731c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.f1732e;
                boolean z14 = this.f1730b;
                ci.y1 y1Var = v1Var.f6125s;
                if (v1Var.f6124r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        ci.r2 r2Var = y1Var.f6345r;
                        ArrayList arrayList = y1Var.f6344n;
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
                    v1Var.f6124r = false;
                    return;
                }
                return;
            case 2:
                ci.l8 l8Var = (ci.l8) this.f1731c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z15 = this.f1730b;
                Runnable runnable = (Runnable) this.f1732e;
                l8Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(l8Var.Z0);
                    if (z15) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                    if (z15) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(l8Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                gg.h0 h0Var = (gg.h0) this.f1731c;
                boolean z16 = this.f1730b;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) this.d;
                gg.e0 e0Var = (gg.e0) this.f1732e;
                if (!z16) {
                    h0Var.f10616c = e0Var;
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
                boolean z17 = this.f1730b;
                i2.f0 f0Var = (i2.f0) this.d;
                j2.k kVar = (j2.k) this.f1732e;
                j2.i o9 = j2.i.o((Context) this.f1731c);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z17) {
                    j2.f fVar = f0Var.f11682s;
                    fVar.getClass();
                    fVar.f13693f.a(o9);
                }
                LogSessionId q6 = o9.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f13723b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
                boolean z18 = this.f1730b;
                ii.u3 u3Var = (ii.u3) this.f1732e;
                String trim = ((EditTextBoldCursor) this.f1731c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ii.l4.k(m2Var, z18, new ah.b(18, u3Var, trim));
                    return;
                }
                return;
            case 6:
                ki.t0 t0Var = (ki.t0) this.f1731c;
                ki.u uVar = (ki.u) this.d;
                boolean z19 = this.f1730b;
                ki.p0 p0Var = (ki.p0) this.f1732e;
                long nanoTime = System.nanoTime();
                try {
                    uVar.g();
                    long e11 = w7.j.e(uVar.f15139a) / 1000;
                    t0Var.f15126m.b("active output finalized: size=" + file.length() + ", durationMs=" + e11 + ", elapsedMs=" + ki.t0.f(nanoTime));
                    t0Var.g();
                    long j3 = t0Var.f15128o;
                    if (e11 > j3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z19 && !z10) {
                        try {
                            t0Var.f15124k.execute(new ki.g0(t0Var, p0Var, uVar.f15139a, e11, true));
                            return;
                        } catch (Exception e12) {
                            e = e12;
                            t0Var = t0Var;
                            t0Var.f15122i.post(new ki.d0(t0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = uVar.f15139a;
                    try {
                        long min = Math.min(j3, e11);
                        if (z10) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        file2 = file3;
                        try {
                            t0Var.s(file2, 0L, min, z19, i11);
                            w7.j.c(file2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            w7.j.c(file2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file2 = file3;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            case 7:
                m4.b0 b0Var = (m4.b0) this.f1731c;
                boolean z20 = this.f1730b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.f1732e;
                m4.c1 c1Var = b0Var.f16010g;
                if (z20) {
                    m4.i1 i1Var = new m4.i1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v x10 = c1Var.f16033b.x(rVar);
                        if (x10 != null) {
                            i12 = x10.b(m4.b0.B).f16133n;
                        } else if (!b0Var.h(rVar)) {
                            v7.j8.b(new m4.m1(-100));
                        } else {
                            v7.j8.b(new m4.m1(0));
                            i12 = 0;
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i12, i1Var);
                        }
                    } catch (DeadObjectException unused) {
                        c1Var.f16033b.M(rVar);
                        v7.j8.b(new m4.m1(-100));
                    } catch (RemoteException e14) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e14);
                        v7.j8.b(new m4.m1(-1));
                    }
                }
                runnable2.run();
                c1Var.f16033b.n(rVar);
                return;
            case 8:
                boolean z21 = this.f1730b;
                m4.r rVar2 = (m4.r) this.f1732e;
                m4.b0 b0Var2 = ((m4.l0) ((androidx.activity.n) this.f1731c).d).f16162g;
                m4.g1 g1Var = b0Var2.f16022t;
                w7.s.b(g1Var, (m4.s) this.d);
                int d = g1Var.d();
                if (d == 1) {
                    if (g1Var.m0(2)) {
                        g1Var.b();
                    }
                } else if (d == 4 && g1Var.m0(4)) {
                    g1Var.H();
                }
                if (z21 && g1Var.m0(1)) {
                    g1Var.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i18 : new int[]{31, 2}) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(i18, true);
                }
                if (z21) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(1, true);
                }
                e2.d.g(!false);
                b0Var2.p(rVar2);
                return;
            case 9:
                ((CameraController) this.f1731c).lambda$initCamera$3(this.f1730b, (Exception) this.d, (Runnable) this.f1732e);
                return;
            case 10:
                String[] strArr = (String[]) this.f1731c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                boolean z22 = this.f1730b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.f1732e;
                try {
                    org.telegram.ui.ActionBar.h6.f20836g0 = org.telegram.ui.ActionBar.h6.tl.get(org.telegram.ui.ActionBar.h6.f20841g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.h6.f20852h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.h6.f20852h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = g6Var.f20659c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(g6Var.f20659c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        g6Var.f20659c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.h6.f20852h0);
                        g6Var.f20662e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i19 = 0; i19 < split.length; i19++) {
                                if ("blur".equals(split[i19])) {
                                    g6Var.h = true;
                                } else if ("motion".equals(split[i19])) {
                                    g6Var.f20670n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        g6Var.f20674x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                g6Var.f20671r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    g6Var.f20672s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    g6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    g6Var.f20673w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                g6Var.f20674x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (g6Var.f20659c != null) {
                                new File(g6Var.f20659c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        g6Var.f20659c = null;
                        org.telegram.ui.ActionBar.h6.f20852h0 = null;
                    }
                    if (!z22 && org.telegram.ui.ActionBar.h6.M == null) {
                        org.telegram.ui.ActionBar.h6.K = g6Var;
                        if (org.telegram.ui.ActionBar.h6.I != org.telegram.ui.ActionBar.h6.J) {
                            z12 = false;
                        }
                        if (z12) {
                            org.telegram.ui.ActionBar.h6.T = 2000;
                            org.telegram.ui.ActionBar.h6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new f(16), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.h6.I = g6Var;
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                if (org.telegram.ui.ActionBar.h6.M == null && !org.telegram.ui.ActionBar.h6.Q) {
                    MessagesController.getInstance(g6Var.E).saveTheme(g6Var, g6Var.k(false), z22, false);
                }
                pVar.run();
                return;
            case 11:
                zn.v0((zn) this.f1731c, (String) this.d, (MessageObject) this.f1732e, this.f1730b);
                return;
            case 12:
                ln lnVar = (ln) this.f1731c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z23 = this.f1730b;
                MessageObject messageObject = (MessageObject) this.f1732e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                zn znVar = lnVar.f39701a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, znVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                if (m10.f54528a == zf.b.f54531b) {
                    i13 = znVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i13 = znVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z23) {
                    m10 = zf.a.i((m10.f54529b / 1000) * i13, m10.f54528a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z23) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), ei.l.H0(i13))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z23) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), yh.c0.q(message.suggested_post.schedule_date), ei.l.H0(i13))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), yh.c0.q(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i21 = R.string.SuggestedMessageAcceptInfo3;
                i14 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, Long.valueOf(MessagesController.getInstance(i14).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.sc[] scVarArr = new org.telegram.ui.Components.sc[1];
                org.telegram.ui.q5 q5Var = new org.telegram.ui.q5(scVarArr, 4);
                org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i15 = R.string.Next;
                } else {
                    i15 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.a2 u02 = org.telegram.ui.Components.g5.u0(znVar, string, spannableStringBuilder, LocaleController.getString(i15), false, new n3(lnVar, message, a2VarArr, messageObject, q5Var, 18));
                a2VarArr[0] = u02;
                u02.setOnDismissListener(q5Var);
                if (z23 && m10.f54528a == zf.b.f54530a) {
                    org.telegram.ui.Components.mb a2 = org.telegram.ui.Components.nb.a(znVar.getParentActivity());
                    d6Var = ((org.telegram.ui.ActionBar.m2) znVar).resourceProvider;
                    org.telegram.ui.Components.sc G = new ad(a2, d6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f30711j = 60000;
                    G.k(true);
                    scVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                xn xnVar = (xn) this.f1731c;
                xnVar.j((org.telegram.ui.ActionBar.b4) this.d, (TLRPC.WallPaper) this.f1732e, this.f1730b);
                xnVar.g(xnVar.f44116n);
                sm smVar = xnVar.V.X0;
                if (smVar != null && (bbVar = smVar.L) != null) {
                    bbVar.invalidate();
                    return;
                }
                return;
            case 14:
                ip ipVar = (ip) this.f1731c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.f1732e;
                boolean z24 = this.f1730b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    ipVar.f38751l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = ipVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z24) {
                        if (ipVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ipVar.getParentActivity());
                            alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            ipVar.showDialog(alertDialog$Builder.f20368a);
                        } else {
                            return;
                        }
                    }
                }
                y90 y90Var = ipVar.G;
                if (y90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ipVar.f38751l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    y90Var.setLink(str);
                    ipVar.G.c(ipVar.f38751l0, ipVar.Z);
                    return;
                }
                return;
            case 15:
                qp qpVar = (qp) this.f1731c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z25 = this.f1730b;
                chat.join_to_send = z25;
                qpVar.f41215x.d.getMessagesController().toggleChatJoinToSend(chat.f20032id, z25, new ci.x0(qpVar, z25, chat, 16), new ug(21, qpVar, (m90) this.f1732e));
                return;
            case 16:
                qp qpVar2 = (qp) this.f1731c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z26 = this.f1730b;
                chat2.join_request = z26;
                qpVar2.f41215x.d.getMessagesController().toggleChatJoinRequest(chat2.f20032id, z26, new pp(qpVar2, 0), new ug(20, qpVar2, (l90) this.f1732e));
                return;
            case 17:
                boolean z27 = this.f1730b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f1731c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f1732e;
                if (z27 && ChatObject.isChannel(chat3)) {
                    View d10 = alertDialog$Builder2.f20368a.d(-1);
                    if (d10 instanceof TextView) {
                        TextView textView = (TextView) d10;
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
            case 18:
                rk rkVar = (rk) this.f1731c;
                boolean z28 = this.f1730b;
                ArrayList arrayList2 = (ArrayList) this.f1732e;
                rkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new wc(17, rkVar, new ArrayList()));
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
                int i22 = i17 + 1;
                String[] strArr2 = new String[i22];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z28) {
                    for (int i23 = 0; i23 < arrayList2.size(); i23++) {
                        mk mkVar = (mk) arrayList2.get(i23);
                        File file4 = mkVar.f28736f;
                        if (file4 != null && !file4.isDirectory()) {
                            int i24 = 0;
                            while (true) {
                                if (i24 < i22) {
                                    String str4 = strArr2[i24];
                                    String str5 = mkVar.f28733b;
                                    if (str5 != null) {
                                        z11 = str5.toLowerCase().contains(str4);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList3.add(mkVar);
                                    } else {
                                        i24++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new wc(17, rkVar, arrayList3));
                return;
            case 19:
                j90.v((j90) this.f1731c, (TLRPC.TL_error) this.d, this.f1730b, (TLRPC.TL_messages_importChatInvite) this.f1732e);
                return;
            case 20:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z29 = this.f1730b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f1732e;
                zy0 zy0Var = ((oy0) this.f1731c).f29555a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z29) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        zy0Var.S = tL_messages_stickerSet;
                        zy0Var.u0();
                        zy0Var.C0();
                    }
                }
                a2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f1731c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z30 = this.f1730b;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.f1732e;
                if (e3Var != null && !e3Var.isDismissed()) {
                    e3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new kh(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (a2Var2 != null && a2Var2.isShowing()) {
                    a2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new kh(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 22:
                g60 g60Var = (g60) this.f1731c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.f1732e;
                boolean z31 = this.f1730b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        g60Var.v1(null, tL_chatInviteExported3.link, true, z31);
                        return;
                    }
                }
                return;
            case 23:
                l70 l70Var = (l70) this.f1731c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f1732e;
                boolean z32 = this.f1730b;
                if (tL_error2 == null) {
                    l70Var.f39533f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z32) {
                        if (l70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(l70Var.getParentActivity());
                            alertDialog$Builder3.f20368a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f20368a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            l70Var.showDialog(alertDialog$Builder3.f20368a);
                        } else {
                            return;
                        }
                    }
                }
                l70Var.f39532e = false;
                l70Var.f39529a.l();
                return;
            case 24:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f1732e;
                boolean z33 = this.f1730b;
                mn0 mn0Var = ((ym0) this.f1731c).f44459e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    mn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    mn0Var.A1(z33);
                    return;
                }
                return;
            case 25:
                a();
                return;
            case 26:
                b();
                return;
            case 27:
                uo0 uo0Var = (uo0) this.f1731c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.f1732e;
                boolean z34 = this.f1730b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    uo0Var.f42693a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    uo0Var.A0(z34);
                    return;
                }
                return;
            case 28:
                d31.V((d31) this.f1731c, this.f1730b, (org.telegram.ui.ActionBar.b4) this.d, (org.telegram.ui.ActionBar.a5) this.f1732e);
                return;
            default:
                hh1.c0((hh1) this.f1731c, (TLRPC.TL_error) this.d, (TLObject) this.f1732e, this.f1730b);
                return;
        }
    }

    public t4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f1729a = i10;
        this.f1731c = obj;
        this.d = obj2;
        this.f1732e = obj3;
        this.f1730b = z10;
    }

    public t4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1729a = i10;
        this.f1731c = obj;
        this.d = obj2;
        this.f1730b = z10;
        this.f1732e = obj3;
    }

    public t4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f1729a = i10;
        this.f1731c = obj;
        this.f1730b = z10;
        this.d = obj2;
        this.f1732e = obj3;
    }

    public t4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f1729a = 17;
        this.f1730b = z10;
        this.f1731c = chat;
        this.d = alertDialog$Builder;
        this.f1732e = zArr;
    }
}
