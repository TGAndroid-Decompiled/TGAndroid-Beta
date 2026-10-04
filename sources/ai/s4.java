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
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.yc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bh1;
import org.telegram.ui.h60;
import org.telegram.ui.hh;
import org.telegram.ui.hp;
import org.telegram.ui.kn;
import org.telegram.ui.kn0;
import org.telegram.ui.m70;
import org.telegram.ui.nf0;
import org.telegram.ui.nl0;
import org.telegram.ui.oh;
import org.telegram.ui.op;
import org.telegram.ui.pp;
import org.telegram.ui.qm;
import org.telegram.ui.so0;
import org.telegram.ui.um0;
import org.telegram.ui.wm0;
import org.telegram.ui.wn;
import org.telegram.ui.y21;
import org.telegram.ui.yn;
public final class s4 implements Runnable {
    public final int f1622a;
    public final boolean f1623b;
    public final Object f1624c;
    public final Object d;
    public final Object f1625e;

    public s4(u4 u4Var, View view, zg.o0 o0Var, boolean z10, boolean z11) {
        this.f1622a = 0;
        this.f1624c = u4Var;
        this.d = view;
        this.f1625e = o0Var;
        this.f1623b = z10;
    }

    private final void a() {
        byte[] bArr;
        byte[] bArr2;
        wm0 wm0Var = (wm0) this.f1624c;
        String str = (String) this.f1625e;
        kn0 kn0Var = wm0Var.f42534e;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            kn0Var.f38012c1 = tL_secureSecretSettings.secure_secret;
            kn0Var.f38009b1 = tL_secureSecretSettings.secure_secret_id;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                kn0Var.f38017e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str), bArr);
            } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                kn0Var.f38017e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                AndroidUtilities.runOnUIThread(new s4(wm0Var, passwordsettings, this.f1623b, bArr2, 26));
            } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                AndroidUtilities.runOnUIThread(new nl0(wm0Var, 4));
                return;
            } else {
                bArr = new byte[0];
            }
        } else {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = kn0Var.J.new_secure_algo;
            if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                kn0Var.f38017e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                bArr = bArr3;
            } else {
                bArr = new byte[0];
            }
            kn0Var.f38012c1 = null;
            kn0Var.f38009b1 = 0L;
        }
        bArr2 = bArr;
        AndroidUtilities.runOnUIThread(new s4(wm0Var, passwordsettings, this.f1623b, bArr2, 26));
    }

    private final void b() {
        byte[] bArr;
        wm0 wm0Var = (wm0) this.f1624c;
        boolean z10 = this.f1623b;
        byte[] bArr2 = (byte[]) this.f1625e;
        kn0 kn0Var = wm0Var.f42534e;
        kn0Var.f38014d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            kn0Var.f38017e1 = kn0Var.P0;
        }
        byte[] bArr3 = kn0Var.f38012c1;
        byte[] bArr4 = kn0Var.f38017e1;
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
        if (kn0.Z0(bArr, Long.valueOf(kn0Var.f38009b1)) && bArr2.length != 0 && kn0Var.f38009b1 != 0) {
            if (kn0Var.f38010c == 0) {
                ConnectionsManager.getInstance(kn0.t0(kn0Var)).sendRequest(new TL_account.getAllSecureValues(), new um0(wm0Var, 0));
                return;
            }
            wm0Var.a();
        } else if (z10) {
            UserConfig.getInstance(kn0.s0(kn0Var)).resetSavedPassword();
            kn0Var.N0 = 0;
            kn0Var.R1();
        } else {
            TL_account.authorizationForm authorizationform = kn0Var.f38060y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                kn0Var.f38060y.errors.clear();
            }
            byte[] bArr7 = kn0Var.f38012c1;
            if (bArr7 != null && bArr7.length != 0) {
                wm0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new nf0(wm0Var, wm0Var.f42532b, wm0Var.d, 12));
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
        ci.ab abVar;
        int i16;
        int i17;
        boolean z11;
        String str = null;
        boolean z12 = true;
        switch (this.f1622a) {
            case 0:
                u4 u4Var = (u4) this.f1624c;
                zg.o0 o0Var = (zg.o0) this.f1625e;
                boolean z13 = this.f1623b;
                e6 e6Var = u4Var.f1716a;
                org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new t4(u4Var, z13, o0Var, (View) this.d));
                return;
            case 1:
                ci.w1 w1Var = (ci.w1) this.f1624c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.f1625e;
                boolean z14 = this.f1623b;
                ci.z1 z1Var = w1Var.f6205s;
                if (w1Var.f6204r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        ci.s2 s2Var = z1Var.f6365r;
                        ArrayList arrayList = z1Var.f6364n;
                        i10 = ((org.telegram.ui.ActionBar.f3) s2Var).currentAccount;
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
                    w1Var.f6204r = false;
                    return;
                }
                return;
            case 2:
                ci.k8 k8Var = (ci.k8) this.f1624c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z15 = this.f1623b;
                Runnable runnable = (Runnable) this.f1625e;
                k8Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(k8Var.Z0);
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
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(k8Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                gg.i0 i0Var = (gg.i0) this.f1624c;
                boolean z16 = this.f1623b;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) this.d;
                gg.f0 f0Var = (gg.f0) this.f1625e;
                if (!z16) {
                    i0Var.f10611c = f0Var;
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
                boolean z17 = this.f1623b;
                i2.f0 f0Var2 = (i2.f0) this.d;
                j2.k kVar = (j2.k) this.f1625e;
                j2.i o9 = j2.i.o((Context) this.f1624c);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z17) {
                    j2.f fVar = f0Var2.f11632s;
                    fVar.getClass();
                    fVar.f13656f.a(o9);
                }
                LogSessionId q6 = o9.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f13686b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                boolean z18 = this.f1623b;
                ii.u3 u3Var = (ii.u3) this.f1625e;
                String trim = ((EditTextBoldCursor) this.f1624c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ii.k4.k(n2Var, z18, new ah.b(18, u3Var, trim));
                    return;
                }
                return;
            case 6:
                ki.s0 s0Var = (ki.s0) this.f1624c;
                ki.t tVar = (ki.t) this.d;
                boolean z19 = this.f1623b;
                ki.o0 o0Var2 = (ki.o0) this.f1625e;
                long nanoTime = System.nanoTime();
                try {
                    tVar.g();
                    long e11 = w7.k.e(tVar.f15066a) / 1000;
                    s0Var.f15053m.b("active output finalized: size=" + file.length() + ", durationMs=" + e11 + ", elapsedMs=" + ki.s0.f(nanoTime));
                    s0Var.g();
                    long j3 = s0Var.f15055o;
                    if (e11 > j3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z19 && !z10) {
                        try {
                            s0Var.f15051k.execute(new ki.f0(s0Var, o0Var2, tVar.f15066a, e11, true));
                            return;
                        } catch (Exception e12) {
                            e = e12;
                            s0Var = s0Var;
                            s0Var.f15049i.post(new ki.c0(s0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = tVar.f15066a;
                    try {
                        long min = Math.min(j3, e11);
                        if (z10) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        file2 = file3;
                        try {
                            s0Var.s(file2, 0L, min, z19, i11);
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
                } catch (Exception e13) {
                    e = e13;
                }
            case 7:
                m4.a0 a0Var = (m4.a0) this.f1624c;
                boolean z20 = this.f1623b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.f1625e;
                m4.a1 a1Var = a0Var.f16041g;
                if (z20) {
                    m4.g1 g1Var = new m4.g1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v x10 = a1Var.f16060b.x(rVar);
                        if (x10 != null) {
                            i12 = x10.b(m4.a0.B).f16142n;
                        } else if (!a0Var.h(rVar)) {
                            v7.l8.b(new m4.k1(-100));
                        } else {
                            v7.l8.b(new m4.k1(0));
                            i12 = 0;
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i12, g1Var);
                        }
                    } catch (DeadObjectException unused) {
                        a1Var.f16060b.M(rVar);
                        v7.l8.b(new m4.k1(-100));
                    } catch (RemoteException e14) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e14);
                        v7.l8.b(new m4.k1(-1));
                    }
                }
                runnable2.run();
                a1Var.f16060b.n(rVar);
                return;
            case 8:
                boolean z21 = this.f1623b;
                m4.r rVar2 = (m4.r) this.f1625e;
                m4.a0 a0Var2 = ((m4.k0) ((androidx.activity.n) this.f1624c).d).f16209g;
                m4.e1 e1Var = a0Var2.f16053t;
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
                ((CameraController) this.f1624c).lambda$initCamera$3(this.f1623b, (Exception) this.d, (Runnable) this.f1625e);
                return;
            case 10:
                String[] strArr = (String[]) this.f1624c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                boolean z22 = this.f1623b;
                org.telegram.ui.ActionBar.q qVar2 = (org.telegram.ui.ActionBar.q) this.f1625e;
                try {
                    org.telegram.ui.ActionBar.i6.f20867g0 = org.telegram.ui.ActionBar.i6.ql.get(org.telegram.ui.ActionBar.i6.f20872g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.i6.f20885h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.i6.f20885h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = h6Var.f20692c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(h6Var.f20692c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        h6Var.f20692c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.i6.f20885h0);
                        h6Var.f20695e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i19 = 0; i19 < split.length; i19++) {
                                if ("blur".equals(split[i19])) {
                                    h6Var.h = true;
                                } else if ("motion".equals(split[i19])) {
                                    h6Var.f20703n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        h6Var.f20707x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                h6Var.f20704r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    h6Var.f20705s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    h6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    h6Var.f20706w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                h6Var.f20707x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (h6Var.f20692c != null) {
                                new File(h6Var.f20692c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        h6Var.f20692c = null;
                        org.telegram.ui.ActionBar.i6.f20885h0 = null;
                    }
                    if (!z22 && org.telegram.ui.ActionBar.i6.M == null) {
                        org.telegram.ui.ActionBar.i6.K = h6Var;
                        if (org.telegram.ui.ActionBar.i6.I != org.telegram.ui.ActionBar.i6.J) {
                            z12 = false;
                        }
                        if (z12) {
                            org.telegram.ui.ActionBar.i6.T = 2000;
                            org.telegram.ui.ActionBar.i6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new f(16), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.i6.I = h6Var;
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                if (org.telegram.ui.ActionBar.i6.M == null && !org.telegram.ui.ActionBar.i6.Q) {
                    MessagesController.getInstance(h6Var.E).saveTheme(h6Var, h6Var.k(false), z22, false);
                }
                qVar2.run();
                return;
            case 11:
                yn.S((yn) this.f1624c, (String) this.d, (MessageObject) this.f1625e, this.f1623b);
                return;
            case 12:
                kn knVar = (kn) this.f1624c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z23 = this.f1623b;
                MessageObject messageObject = (MessageObject) this.f1625e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                yn ynVar = knVar.f38003a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, ynVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                if (m10.f53295a == zf.b.f53298b) {
                    i13 = ynVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i13 = ynVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z23) {
                    m10 = zf.a.i((m10.f53296b / 1000) * i13, m10.f53295a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z23) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), ei.m.L0(i13))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z23) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), yh.e0.o(message.suggested_post.schedule_date), ei.m.L0(i13))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), yh.e0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i21 = R.string.SuggestedMessageAcceptInfo3;
                i14 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, Long.valueOf(MessagesController.getInstance(i14).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.rc[] rcVarArr = new org.telegram.ui.Components.rc[1];
                org.telegram.ui.s5 s5Var = new org.telegram.ui.s5(rcVarArr, 4);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i15 = R.string.Next;
                } else {
                    i15 = R.string.SuggestedPostPublish;
                }
                org.telegram.ui.ActionBar.b2 v02 = org.telegram.ui.Components.e5.v0(ynVar, string, spannableStringBuilder, LocaleController.getString(i15), false, new m3(knVar, message, b2VarArr, messageObject, s5Var, 18));
                b2VarArr[0] = v02;
                v02.setOnDismissListener(s5Var);
                if (z23 && m10.f53295a == zf.b.f53297a) {
                    org.telegram.ui.Components.lb a2 = org.telegram.ui.Components.mb.a(ynVar.getParentActivity());
                    d6Var = ((org.telegram.ui.ActionBar.n2) ynVar).resourceProvider;
                    org.telegram.ui.Components.rc G = new yc(a2, d6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f30339j = 60000;
                    G.k(true);
                    rcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                wn wnVar = (wn) this.f1624c;
                wnVar.j((org.telegram.ui.ActionBar.c4) this.d, (TLRPC.WallPaper) this.f1625e, this.f1623b);
                wnVar.g(wnVar.f42540n);
                qm qmVar = wnVar.V.V0;
                if (qmVar != null && (abVar = qmVar.L) != null) {
                    abVar.invalidate();
                    return;
                }
                return;
            case 14:
                hp hpVar = (hp) this.f1624c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.f1625e;
                boolean z24 = this.f1623b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    hpVar.f37141l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = hpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z24) {
                        if (hpVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hpVar.getParentActivity());
                            alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            hpVar.showDialog(alertDialog$Builder.f20368a);
                        } else {
                            return;
                        }
                    }
                }
                j90 j90Var = hpVar.G;
                if (j90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hpVar.f37141l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    j90Var.setLink(str);
                    hpVar.G.c(hpVar.f37141l0, hpVar.Z);
                    return;
                }
                return;
            case 15:
                pp ppVar = (pp) this.f1624c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z25 = this.f1623b;
                chat.join_to_send = z25;
                ppVar.f39524x.d.getMessagesController().toggleChatJoinToSend(chat.f20038id, z25, new ci.y0(ppVar, z25, chat, 16), new oh(18, ppVar, (x80) this.f1625e));
                return;
            case 16:
                pp ppVar2 = (pp) this.f1624c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z26 = this.f1623b;
                chat2.join_request = z26;
                ppVar2.f39524x.d.getMessagesController().toggleChatJoinRequest(chat2.f20038id, z26, new op(ppVar2, 0), new oh(17, ppVar2, (w80) this.f1625e));
                return;
            case 17:
                boolean z27 = this.f1623b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f1624c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f1625e;
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
                qk qkVar = (qk) this.f1624c;
                boolean z28 = this.f1623b;
                ArrayList arrayList2 = (ArrayList) this.f1625e;
                qkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new be(12, qkVar, new ArrayList()));
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
                        lk lkVar = (lk) arrayList2.get(i23);
                        File file4 = lkVar.f28389f;
                        if (file4 != null && !file4.isDirectory()) {
                            int i24 = 0;
                            while (true) {
                                if (i24 < i22) {
                                    String str4 = strArr2[i24];
                                    String str5 = lkVar.f28386b;
                                    if (str5 != null) {
                                        z11 = str5.toLowerCase().contains(str4);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList3.add(lkVar);
                                    } else {
                                        i24++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new be(12, qkVar, arrayList3));
                return;
            case 19:
                u80.t((u80) this.f1624c, (TLRPC.TL_error) this.d, this.f1623b, (TLRPC.TL_messages_importChatInvite) this.f1625e);
                return;
            case 20:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z29 = this.f1623b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f1625e;
                qy0 qy0Var = ((fy0) this.f1624c).f26602a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z29) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        qy0Var.S = tL_messages_stickerSet;
                        qy0Var.t0();
                        qy0Var.B0();
                    }
                }
                b2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f1624c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z30 = this.f1623b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f1625e;
                if (f3Var != null && !f3Var.isDismissed()) {
                    f3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new hh(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (b2Var2 != null && b2Var2.isShowing()) {
                    b2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new hh(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 22:
                h60 h60Var = (h60) this.f1624c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.f1625e;
                boolean z31 = this.f1623b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        h60Var.u1(null, tL_chatInviteExported3.link, true, z31);
                        return;
                    }
                }
                return;
            case 23:
                m70 m70Var = (m70) this.f1624c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f1625e;
                boolean z32 = this.f1623b;
                if (tL_error2 == null) {
                    m70Var.f38449f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z32) {
                        if (m70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(m70Var.getParentActivity());
                            alertDialog$Builder3.f20368a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f20368a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            m70Var.showDialog(alertDialog$Builder3.f20368a);
                        } else {
                            return;
                        }
                    }
                }
                m70Var.f38448e = false;
                m70Var.f38445a.l();
                return;
            case 24:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f1625e;
                boolean z33 = this.f1623b;
                kn0 kn0Var = ((wm0) this.f1624c).f42534e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    kn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    kn0Var.B1(z33);
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
                so0 so0Var = (so0) this.f1624c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.f1625e;
                boolean z34 = this.f1623b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    so0Var.f40541a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    so0Var.A0(z34);
                    return;
                }
                return;
            case 28:
                y21.U((y21) this.f1624c, this.f1623b, (org.telegram.ui.ActionBar.c4) this.d, (org.telegram.ui.ActionBar.b5) this.f1625e);
                return;
            default:
                bh1.c0((bh1) this.f1624c, (TLRPC.TL_error) this.d, (TLObject) this.f1625e, this.f1623b);
                return;
        }
    }

    public s4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f1622a = i10;
        this.f1624c = obj;
        this.d = obj2;
        this.f1625e = obj3;
        this.f1623b = z10;
    }

    public s4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1622a = i10;
        this.f1624c = obj;
        this.d = obj2;
        this.f1623b = z10;
        this.f1625e = obj3;
    }

    public s4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f1622a = i10;
        this.f1624c = obj;
        this.f1623b = z10;
        this.d = obj2;
        this.f1625e = obj3;
    }

    public s4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f1622a = 17;
        this.f1623b = z10;
        this.f1624c = chat;
        this.d = alertDialog$Builder;
        this.f1625e = zArr;
    }
}
