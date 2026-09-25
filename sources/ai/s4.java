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
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d60;
import org.telegram.ui.fh;
import org.telegram.ui.fp;
import org.telegram.ui.gn0;
import org.telegram.ui.i70;
import org.telegram.ui.il0;
import org.telegram.ui.in;
import org.telegram.ui.jf0;
import org.telegram.ui.mh;
import org.telegram.ui.mp;
import org.telegram.ui.np;
import org.telegram.ui.oo0;
import org.telegram.ui.pm;
import org.telegram.ui.qm0;
import org.telegram.ui.sm0;
import org.telegram.ui.un;
import org.telegram.ui.w21;
import org.telegram.ui.wn;
import org.telegram.ui.zg1;
public final class s4 implements Runnable {
    public final int f1490a;
    public final boolean f1491b;
    public final Object f1492c;
    public final Object d;
    public final Object e;

    public s4(u4 u4Var, View view, zg.o0 o0Var, boolean z10, boolean z11) {
        this.f1490a = 0;
        this.f1492c = u4Var;
        this.d = view;
        this.e = o0Var;
        this.f1491b = z10;
    }

    private final void a() {
        byte[] bArr;
        byte[] bArr2;
        sm0 sm0Var = (sm0) this.f1492c;
        String str = (String) this.e;
        gn0 gn0Var = sm0Var.e;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            gn0Var.f33978c1 = tL_secureSecretSettings.secure_secret;
            gn0Var.f33975b1 = tL_secureSecretSettings.secure_secret_id;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                gn0Var.f33982e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str), bArr);
            } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                gn0Var.f33982e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                AndroidUtilities.runOnUIThread(new s4(sm0Var, passwordsettings, this.f1491b, bArr2, 26));
            } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                AndroidUtilities.runOnUIThread(new il0(sm0Var, 4));
                return;
            } else {
                bArr = new byte[0];
            }
        } else {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = gn0Var.J.new_secure_algo;
            if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                gn0Var.f33982e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                bArr = bArr3;
            } else {
                bArr = new byte[0];
            }
            gn0Var.f33978c1 = null;
            gn0Var.f33975b1 = 0L;
        }
        bArr2 = bArr;
        AndroidUtilities.runOnUIThread(new s4(sm0Var, passwordsettings, this.f1491b, bArr2, 26));
    }

    private final void b() {
        byte[] bArr;
        sm0 sm0Var = (sm0) this.f1492c;
        boolean z10 = this.f1491b;
        byte[] bArr2 = (byte[]) this.e;
        gn0 gn0Var = sm0Var.e;
        gn0Var.f33980d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            gn0Var.f33982e1 = gn0Var.P0;
        }
        byte[] bArr3 = gn0Var.f33978c1;
        byte[] bArr4 = gn0Var.f33982e1;
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
        if (gn0.Z0(bArr, Long.valueOf(gn0Var.f33975b1)) && bArr2.length != 0 && gn0Var.f33975b1 != 0) {
            if (gn0Var.f33976c == 0) {
                ConnectionsManager.getInstance(gn0.t0(gn0Var)).sendRequest(new TL_account.getAllSecureValues(), new qm0(sm0Var, 0));
                return;
            }
            sm0Var.a();
        } else if (z10) {
            UserConfig.getInstance(gn0.s0(gn0Var)).resetSavedPassword();
            gn0Var.N0 = 0;
            gn0Var.R1();
        } else {
            TL_account.authorizationForm authorizationform = gn0Var.f34025y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                gn0Var.f34025y.errors.clear();
            }
            byte[] bArr7 = gn0Var.f33978c1;
            if (bArr7 != null && bArr7.length != 0) {
                sm0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new jf0(sm0Var, sm0Var.f37829b, sm0Var.d, 12));
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
        switch (this.f1490a) {
            case 0:
                u4 u4Var = (u4) this.f1492c;
                zg.o0 o0Var = (zg.o0) this.e;
                boolean z13 = this.f1491b;
                e6 e6Var = u4Var.f1576a;
                org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new t4(u4Var, z13, o0Var, (View) this.d));
                return;
            case 1:
                ci.w1 w1Var = (ci.w1) this.f1492c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.e;
                boolean z14 = this.f1491b;
                ci.z1 z1Var = w1Var.f5702s;
                if (w1Var.f5701r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        ci.s2 s2Var = z1Var.f5906r;
                        ArrayList arrayList = z1Var.f5905n;
                        i10 = ((org.telegram.ui.ActionBar.e3) s2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str2, messages_botresults);
                        w1Var.h = messages_botresults.next_offset;
                        if (z14) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        w1Var.l();
                    }
                    z1Var.d.c(false);
                    w1Var.f5701r = false;
                    return;
                }
                return;
            case 2:
                ci.l8 l8Var = (ci.l8) this.f1492c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z15 = this.f1491b;
                Runnable runnable = (Runnable) this.e;
                l8Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(l8Var.Z0);
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
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(l8Var.Z0));
                        } catch (Exception e7) {
                            FileLog.e((Throwable) e7, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                gg.i0 i0Var = (gg.i0) this.f1492c;
                boolean z16 = this.f1491b;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) this.d;
                gg.f0 f0Var = (gg.f0) this.e;
                if (!z16) {
                    i0Var.f9745c = f0Var;
                    v3Var.setRightText(i0Var.H(f0Var));
                    v3Var.setRightTextMargin(6);
                    i0Var.I.clear();
                    i0Var.d = true;
                    i0Var.l();
                    i0Var.Q();
                    return;
                }
                return;
            case 4:
                boolean z17 = this.f1491b;
                i2.f0 f0Var2 = (i2.f0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o9 = j2.i.o((Context) this.f1492c);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z17) {
                    j2.f fVar = f0Var2.f10675s;
                    fVar.getClass();
                    fVar.f12567f.a(o9);
                }
                LogSessionId q6 = o9.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f12594b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
                boolean z18 = this.f1491b;
                ii.u3 u3Var = (ii.u3) this.e;
                String trim = ((EditTextBoldCursor) this.f1492c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ii.k4.k(m2Var, z18, new ah.b(18, u3Var, trim));
                    return;
                }
                return;
            case 6:
                ki.s0 s0Var = (ki.s0) this.f1492c;
                ki.t tVar = (ki.t) this.d;
                boolean z19 = this.f1491b;
                ki.o0 o0Var2 = (ki.o0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    tVar.f();
                    long e10 = w7.k.e(tVar.f13864a) / 1000;
                    s0Var.f13850l.b("active output finalized: size=" + file.length() + ", durationMs=" + e10 + ", elapsedMs=" + ki.s0.e(nanoTime));
                    s0Var.f();
                    long j3 = s0Var.f13852n;
                    if (e10 > j3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z19 && !z10) {
                        try {
                            s0Var.f13848j.execute(new ki.f0(s0Var, o0Var2, tVar.f13864a, e10, true));
                            return;
                        } catch (Exception e11) {
                            e = e11;
                            s0Var = s0Var;
                            s0Var.h.post(new ki.c0(s0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = tVar.f13864a;
                    try {
                        long min = Math.min(j3, e10);
                        if (z10) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        file2 = file3;
                        try {
                            s0Var.r(file2, 0L, min, z19, i11);
                            w7.k.c(file2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            w7.k.c(file2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file2 = file3;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            case 7:
                m4.a0 a0Var = (m4.a0) this.f1492c;
                boolean z20 = this.f1491b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.a1 a1Var = a0Var.f14695g;
                if (z20) {
                    m4.g1 g1Var = new m4.g1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v x10 = a1Var.f14714b.x(rVar);
                        if (x10 != null) {
                            i12 = x10.b(m4.a0.B).f14790n;
                        } else if (!a0Var.h(rVar)) {
                            v7.m8.b(new m4.k1(-100));
                        } else {
                            v7.m8.b(new m4.k1(0));
                            i12 = 0;
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i12, g1Var);
                        }
                    } catch (DeadObjectException unused) {
                        a1Var.f14714b.M(rVar);
                        v7.m8.b(new m4.k1(-100));
                    } catch (RemoteException e13) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e13);
                        v7.m8.b(new m4.k1(-1));
                    }
                }
                runnable2.run();
                a1Var.f14714b.n(rVar);
                return;
            case 8:
                boolean z21 = this.f1491b;
                m4.r rVar2 = (m4.r) this.e;
                m4.a0 a0Var2 = ((m4.k0) ((androidx.activity.n) this.f1492c).d).f14852g;
                m4.e1 e1Var = a0Var2.f14707t;
                w7.u.b(e1Var, (m4.s) this.d);
                int d = e1Var.d();
                if (d == 1) {
                    if (e1Var.m0(2)) {
                        e1Var.b();
                    }
                } else if (d == 4 && e1Var.m0(4)) {
                    e1Var.H();
                }
                if (z21 && e1Var.m0(1)) {
                    e1Var.i();
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
                a0Var2.p(rVar2);
                return;
            case 9:
                ((CameraController) this.f1492c).lambda$initCamera$3(this.f1491b, (Exception) this.d, (Runnable) this.e);
                return;
            case 10:
                String[] strArr = (String[]) this.f1492c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                boolean z22 = this.f1491b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    org.telegram.ui.ActionBar.h6.f19108g0 = org.telegram.ui.ActionBar.h6.ql.get(org.telegram.ui.ActionBar.h6.f19113g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.h6.f19125h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.h6.f19125h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = g6Var.f18937c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(g6Var.f18937c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        g6Var.f18937c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.h6.f19125h0);
                        g6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i19 = 0; i19 < split.length; i19++) {
                                if ("blur".equals(split[i19])) {
                                    g6Var.h = true;
                                } else if ("motion".equals(split[i19])) {
                                    g6Var.f18947n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        g6Var.f18951x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                g6Var.f18948r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    g6Var.f18949s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    g6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    g6Var.f18950w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                g6Var.f18951x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (g6Var.f18937c != null) {
                                new File(g6Var.f18937c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        g6Var.f18937c = null;
                        org.telegram.ui.ActionBar.h6.f19125h0 = null;
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
                    org.telegram.ui.ActionBar.h6.n1(false, false);
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                if (org.telegram.ui.ActionBar.h6.M == null && !org.telegram.ui.ActionBar.h6.Q) {
                    MessagesController.getInstance(g6Var.E).saveTheme(g6Var, g6Var.k(false), z22, false);
                }
                pVar.run();
                return;
            case 11:
                wn.u0((wn) this.f1492c, (String) this.d, (MessageObject) this.e, this.f1491b);
                return;
            case 12:
                in inVar = (in) this.f1492c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z23 = this.f1491b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                wn wnVar = inVar.f34558a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, wnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                if (m10.f49226a == zf.b.f49229b) {
                    i13 = wnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i13 = wnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z23) {
                    m10 = zf.a.i((m10.f49227b / 1000) * i13, m10.f49226a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z23) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), ei.l.G0(i13))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z23) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), yh.e0.o(message.suggested_post.schedule_date), ei.l.G0(i13))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), yh.e0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i21 = R.string.SuggestedMessageAcceptInfo3;
                i14 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, Long.valueOf(MessagesController.getInstance(i14).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
                org.telegram.ui.r5 r5Var = new org.telegram.ui.r5(qcVarArr, 4);
                org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i15 = R.string.Next;
                } else {
                    i15 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.a2 v02 = org.telegram.ui.Components.e5.v0(wnVar, string, spannableStringBuilder, LocaleController.getString(i15), false, new m3(inVar, message, a2VarArr, messageObject, r5Var, 18));
                a2VarArr[0] = v02;
                v02.setOnDismissListener(r5Var);
                if (z23 && m10.f49226a == zf.b.f49228a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(wnVar.getParentActivity());
                    d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
                    org.telegram.ui.Components.qc G = new xc(a2, d6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f27578j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                un unVar = (un) this.f1492c;
                unVar.j((org.telegram.ui.ActionBar.b4) this.d, (TLRPC.WallPaper) this.e, this.f1491b);
                unVar.g(unVar.f38508n);
                pm pmVar = unVar.V.X0;
                if (pmVar != null && (bbVar = pmVar.L) != null) {
                    bbVar.invalidate();
                    return;
                }
                return;
            case 14:
                fp fpVar = (fp) this.f1492c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z24 = this.f1491b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    fpVar.f33725l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = fpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z24) {
                        if (fpVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fpVar.getParentActivity());
                            alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            fpVar.showDialog(alertDialog$Builder.f18662a);
                        } else {
                            return;
                        }
                    }
                }
                g90 g90Var = fpVar.G;
                if (g90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fpVar.f33725l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    g90Var.setLink(str);
                    fpVar.G.c(fpVar.f33725l0, fpVar.Z);
                    return;
                }
                return;
            case 15:
                np npVar = (np) this.f1492c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z25 = this.f1491b;
                chat.join_to_send = z25;
                npVar.f35935x.d.getMessagesController().toggleChatJoinToSend(chat.f18336id, z25, new ci.y0(npVar, z25, chat, 16), new fh(19, npVar, (u80) this.e));
                return;
            case 16:
                np npVar2 = (np) this.f1492c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z26 = this.f1491b;
                chat2.join_request = z26;
                npVar2.f35935x.d.getMessagesController().toggleChatJoinRequest(chat2.f18336id, z26, new mp(npVar2, 0), new fh(18, npVar2, (t80) this.e));
                return;
            case 17:
                boolean z27 = this.f1491b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f1492c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z27 && ChatObject.isChannel(chat3)) {
                    View d10 = alertDialog$Builder2.f18662a.d(-1);
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
                ok okVar = (ok) this.f1492c;
                boolean z28 = this.f1491b;
                ArrayList arrayList2 = (ArrayList) this.e;
                okVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new kd(14, okVar, new ArrayList()));
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
                        jk jkVar = (jk) arrayList2.get(i23);
                        File file4 = jkVar.f25442f;
                        if (file4 != null && !file4.isDirectory()) {
                            int i24 = 0;
                            while (true) {
                                if (i24 < i22) {
                                    String str4 = strArr2[i24];
                                    String str5 = jkVar.f25440b;
                                    if (str5 != null) {
                                        z11 = str5.toLowerCase().contains(str4);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList3.add(jkVar);
                                    } else {
                                        i24++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new kd(14, okVar, arrayList3));
                return;
            case 19:
                r80.t((r80) this.f1492c, (TLRPC.TL_error) this.d, this.f1491b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z29 = this.f1491b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.e;
                fy0 fy0Var = ((ux0) this.f1492c).f28945a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z29) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        fy0Var.S = tL_messages_stickerSet;
                        fy0Var.t0();
                        fy0Var.B0();
                    }
                }
                a2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f1492c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z30 = this.f1491b;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.e;
                if (e3Var != null && !e3Var.isDismissed()) {
                    e3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new mh(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (a2Var2 != null && a2Var2.isShowing()) {
                    a2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new mh(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 22:
                d60 d60Var = (d60) this.f1492c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z31 = this.f1491b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        d60Var.u1(null, tL_chatInviteExported3.link, true, z31);
                        return;
                    }
                }
                return;
            case 23:
                i70 i70Var = (i70) this.f1492c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z32 = this.f1491b;
                if (tL_error2 == null) {
                    i70Var.f34426f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z32) {
                        if (i70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i70Var.getParentActivity());
                            alertDialog$Builder3.f18662a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f18662a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            i70Var.showDialog(alertDialog$Builder3.f18662a);
                        } else {
                            return;
                        }
                    }
                }
                i70Var.e = false;
                i70Var.f34423a.l();
                return;
            case 24:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z33 = this.f1491b;
                gn0 gn0Var = ((sm0) this.f1492c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    gn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    gn0Var.B1(z33);
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
                oo0 oo0Var = (oo0) this.f1492c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z34 = this.f1491b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    oo0Var.f36279a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    oo0Var.A0(z34);
                    return;
                }
                return;
            case 28:
                w21.W((w21) this.f1492c, this.f1491b, (org.telegram.ui.ActionBar.b4) this.d, (org.telegram.ui.ActionBar.a5) this.e);
                return;
            default:
                zg1.c0((zg1) this.f1492c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.f1491b);
                return;
        }
    }

    public s4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f1490a = i10;
        this.f1492c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1491b = z10;
    }

    public s4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1490a = i10;
        this.f1492c = obj;
        this.d = obj2;
        this.f1491b = z10;
        this.e = obj3;
    }

    public s4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f1490a = i10;
        this.f1492c = obj;
        this.f1491b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public s4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f1490a = 17;
        this.f1491b = z10;
        this.f1492c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
