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
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.g60;
import org.telegram.ui.gp;
import org.telegram.ui.jn;
import org.telegram.ui.jn0;
import org.telegram.ui.l70;
import org.telegram.ui.mf0;
import org.telegram.ui.ml0;
import org.telegram.ui.np;
import org.telegram.ui.oh;
import org.telegram.ui.op;
import org.telegram.ui.qh;
import org.telegram.ui.qm;
import org.telegram.ui.ro0;
import org.telegram.ui.tm0;
import org.telegram.ui.vm0;
import org.telegram.ui.vn;
import org.telegram.ui.xn;
import org.telegram.ui.y21;
import org.telegram.ui.zg1;
public final class s4 implements Runnable {
    public final int f1492a;
    public final boolean f1493b;
    public final Object f1494c;
    public final Object d;
    public final Object e;

    public s4(u4 u4Var, View view, zg.p0 p0Var, boolean z10, boolean z11) {
        this.f1492a = 0;
        this.f1494c = u4Var;
        this.d = view;
        this.e = p0Var;
        this.f1493b = z10;
    }

    private final void a() {
        byte[] bArr;
        byte[] bArr2;
        vm0 vm0Var = (vm0) this.f1494c;
        String str = (String) this.e;
        jn0 jn0Var = vm0Var.e;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            jn0Var.f34775c1 = tL_secureSecretSettings.secure_secret;
            jn0Var.f34772b1 = tL_secureSecretSettings.secure_secret_id;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                jn0Var.f34779e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str), bArr);
            } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                jn0Var.f34779e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                AndroidUtilities.runOnUIThread(new s4(vm0Var, passwordsettings, this.f1493b, bArr2, 26));
            } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                AndroidUtilities.runOnUIThread(new ml0(vm0Var, 4));
                return;
            } else {
                bArr = new byte[0];
            }
        } else {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = jn0Var.J.new_secure_algo;
            if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                jn0Var.f34779e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                bArr = bArr3;
            } else {
                bArr = new byte[0];
            }
            jn0Var.f34775c1 = null;
            jn0Var.f34772b1 = 0L;
        }
        bArr2 = bArr;
        AndroidUtilities.runOnUIThread(new s4(vm0Var, passwordsettings, this.f1493b, bArr2, 26));
    }

    private final void b() {
        byte[] bArr;
        vm0 vm0Var = (vm0) this.f1494c;
        boolean z10 = this.f1493b;
        byte[] bArr2 = (byte[]) this.e;
        jn0 jn0Var = vm0Var.e;
        jn0Var.f34777d1 = ((TL_account.passwordSettings) this.d).email;
        if (z10) {
            jn0Var.f34779e1 = jn0Var.P0;
        }
        byte[] bArr3 = jn0Var.f34775c1;
        byte[] bArr4 = jn0Var.f34779e1;
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
        if (jn0.Z0(bArr, Long.valueOf(jn0Var.f34772b1)) && bArr2.length != 0 && jn0Var.f34772b1 != 0) {
            if (jn0Var.f34773c == 0) {
                ConnectionsManager.getInstance(jn0.t0(jn0Var)).sendRequest(new TL_account.getAllSecureValues(), new tm0(vm0Var, 0));
                return;
            }
            vm0Var.a();
        } else if (z10) {
            UserConfig.getInstance(jn0.s0(jn0Var)).resetSavedPassword();
            jn0Var.N0 = 0;
            jn0Var.R1();
        } else {
            TL_account.authorizationForm authorizationform = jn0Var.f34822y;
            if (authorizationform != null) {
                authorizationform.values.clear();
                jn0Var.f34822y.errors.clear();
            }
            byte[] bArr7 = jn0Var.f34775c1;
            if (bArr7 != null && bArr7.length != 0) {
                vm0Var.b();
            } else {
                Utilities.globalQueue.postRunnable(new mf0(vm0Var, vm0Var.f38641b, vm0Var.d, 12));
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
        xn xnVar;
        char c10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.e6 e6Var;
        ci.ab abVar;
        int i16;
        int i17;
        boolean z11;
        String str = null;
        boolean z12 = true;
        switch (this.f1492a) {
            case 0:
                u4 u4Var = (u4) this.f1494c;
                zg.p0 p0Var = (zg.p0) this.e;
                boolean z13 = this.f1493b;
                e6 e6Var2 = u4Var.f1578a;
                org.telegram.ui.Components.e5.a0(e6Var2.C2, 1, e6Var2.B1, new t4(u4Var, z13, p0Var, (View) this.d));
                return;
            case 1:
                ci.w1 w1Var = (ci.w1) this.f1494c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.e;
                boolean z14 = this.f1493b;
                ci.z1 z1Var = w1Var.f5761s;
                if (w1Var.f5760r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        ci.s2 s2Var = z1Var.f5907r;
                        ArrayList arrayList = z1Var.f5906n;
                        i10 = ((org.telegram.ui.ActionBar.g3) s2Var).currentAccount;
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
                    w1Var.f5760r = false;
                    return;
                }
                return;
            case 2:
                ci.k8 k8Var = (ci.k8) this.f1494c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z15 = this.f1493b;
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
                gg.i0 i0Var = (gg.i0) this.f1494c;
                boolean z16 = this.f1493b;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) this.d;
                gg.f0 f0Var = (gg.f0) this.e;
                if (!z16) {
                    i0Var.f9751c = f0Var;
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
                boolean z17 = this.f1493b;
                i2.f0 f0Var2 = (i2.f0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o9 = j2.i.o((Context) this.f1494c);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z17) {
                    j2.f fVar = f0Var2.f10678s;
                    fVar.getClass();
                    fVar.f12570f.a(o9);
                }
                LogSessionId q6 = o9.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.f12597b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                boolean z18 = this.f1493b;
                ii.u3 u3Var = (ii.u3) this.e;
                String trim = ((EditTextBoldCursor) this.f1494c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ii.k4.k(o2Var, z18, new ah.b(18, u3Var, trim));
                    return;
                }
                return;
            case 6:
                ki.s0 s0Var = (ki.s0) this.f1494c;
                ki.t tVar = (ki.t) this.d;
                boolean z19 = this.f1493b;
                ki.o0 o0Var = (ki.o0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    tVar.f();
                    long e10 = w7.k.e(tVar.f13866a) / 1000;
                    s0Var.f13852l.b("active output finalized: size=" + file.length() + ", durationMs=" + e10 + ", elapsedMs=" + ki.s0.e(nanoTime));
                    s0Var.f();
                    long j3 = s0Var.f13854n;
                    if (e10 > j3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z19 && !z10) {
                        try {
                            s0Var.f13850j.execute(new ki.f0(s0Var, o0Var, tVar.f13866a, e10, true));
                            return;
                        } catch (Exception e11) {
                            e = e11;
                            s0Var = s0Var;
                            s0Var.h.post(new ki.c0(s0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = tVar.f13866a;
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
                m4.a0 a0Var = (m4.a0) this.f1494c;
                boolean z20 = this.f1493b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.a1 a1Var = a0Var.f14722g;
                if (z20) {
                    m4.g1 g1Var = new m4.g1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v x10 = a1Var.f14741b.x(rVar);
                        if (x10 != null) {
                            i12 = x10.b(m4.a0.B).f14817n;
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
                        a1Var.f14741b.M(rVar);
                        v7.m8.b(new m4.k1(-100));
                    } catch (RemoteException e13) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e13);
                        v7.m8.b(new m4.k1(-1));
                    }
                }
                runnable2.run();
                a1Var.f14741b.n(rVar);
                return;
            case 8:
                boolean z21 = this.f1493b;
                m4.r rVar2 = (m4.r) this.e;
                m4.a0 a0Var2 = ((m4.k0) ((androidx.activity.n) this.f1494c).d).f14879g;
                m4.e1 e1Var = a0Var2.f14734t;
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
                ((CameraController) this.f1494c).lambda$initCamera$3(this.f1493b, (Exception) this.d, (Runnable) this.e);
                return;
            case 10:
                String[] strArr = (String[]) this.f1494c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                boolean z22 = this.f1493b;
                org.telegram.ui.ActionBar.r rVar3 = (org.telegram.ui.ActionBar.r) this.e;
                try {
                    org.telegram.ui.ActionBar.i6.f19105g0 = org.telegram.ui.ActionBar.i6.ql.get(org.telegram.ui.ActionBar.i6.f19110g5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        org.telegram.ui.ActionBar.i6.f19123h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.i6.f19123h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = h6Var.f18955c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(h6Var.f18955c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        h6Var.f18955c = absolutePath;
                        Uri parse = Uri.parse(org.telegram.ui.ActionBar.i6.f19123h0);
                        h6Var.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i19 = 0; i19 < split.length; i19++) {
                                if ("blur".equals(split[i19])) {
                                    h6Var.h = true;
                                } else if ("motion".equals(split[i19])) {
                                    h6Var.f18965n = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                        h6Var.f18969x = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                h6Var.f18966r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    h6Var.f18967s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    h6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    h6Var.f18968w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                h6Var.f18969x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } else {
                        try {
                            if (h6Var.f18955c != null) {
                                new File(h6Var.f18955c).delete();
                            }
                        } catch (Exception unused5) {
                        }
                        h6Var.f18955c = null;
                        org.telegram.ui.ActionBar.i6.f19123h0 = null;
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
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                if (org.telegram.ui.ActionBar.i6.M == null && !org.telegram.ui.ActionBar.i6.Q) {
                    MessagesController.getInstance(h6Var.E).saveTheme(h6Var, h6Var.k(false), z22, false);
                }
                rVar3.run();
                return;
            case 11:
                xn.u0((xn) this.f1494c, (String) this.d, (MessageObject) this.e, this.f1493b);
                return;
            case 12:
                jn jnVar = (jn) this.f1494c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z23 = this.f1493b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                xn xnVar2 = jnVar.f34766a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, xnVar2.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                if (m10.f49268a == zf.b.f49271b) {
                    i13 = xnVar2.getMessagesController().config.tonSuggestedPostCommissionPermille.get();
                } else {
                    i13 = xnVar2.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                }
                if (z23) {
                    c10 = 0;
                    xnVar = xnVar2;
                    m10 = zf.a.i((m10.f49269b / 1000) * i13, m10.f49268a);
                } else {
                    xnVar = xnVar2;
                    c10 = 0;
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z23) {
                        int i21 = R.string.SuggestedMessageAcceptInfoAnytimeAdmin2;
                        String f7 = m10.f();
                        String G0 = ei.l.G0(i13);
                        Object[] objArr = new Object[2];
                        objArr[c10] = f7;
                        objArr[1] = G0;
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, objArr)));
                    } else {
                        int i22 = R.string.SuggestedMessageAcceptInfoAnytimeUser2;
                        Object[] objArr2 = new Object[1];
                        objArr2[c10] = m10.f();
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, objArr2)));
                    }
                } else if (z23) {
                    int i23 = R.string.SuggestedMessageAcceptInfoAdmin2;
                    String f10 = m10.f();
                    String o10 = yh.e0.o(message.suggested_post.schedule_date);
                    String G02 = ei.l.G0(i13);
                    Object[] objArr3 = new Object[3];
                    objArr3[c10] = f10;
                    objArr3[1] = o10;
                    objArr3[2] = G02;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i23, objArr3)));
                } else {
                    int i24 = R.string.SuggestedMessageAcceptInfoUser2;
                    String f11 = m10.f();
                    String o11 = yh.e0.o(message.suggested_post.schedule_date);
                    Object[] objArr4 = new Object[2];
                    objArr4[c10] = f11;
                    objArr4[1] = o11;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i24, objArr4)));
                }
                spannableStringBuilder.append(' ');
                int i25 = R.string.SuggestedMessageAcceptInfo3;
                i14 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                Object[] objArr5 = new Object[1];
                objArr5[c10] = Long.valueOf(MessagesController.getInstance(i14).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS));
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i25, objArr5)));
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
                org.telegram.ui.t5 t5Var = new org.telegram.ui.t5(qcVarArr, 4);
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                String string = LocaleController.getString(R.string.SuggestedPostAcceptTitle);
                if (message.suggested_post.schedule_date == 0) {
                    i15 = R.string.Next;
                } else {
                    i15 = R.string.SuggestedPostPublish;
                }
                xn xnVar3 = xnVar;
                org.telegram.ui.ActionBar.c2 v02 = org.telegram.ui.Components.e5.v0(xnVar3, string, spannableStringBuilder, LocaleController.getString(i15), false, new m3(jnVar, message, c2VarArr, messageObject, t5Var, 18));
                c2VarArr[c10] = v02;
                v02.setOnDismissListener(t5Var);
                if (z23 && m10.f49268a == zf.b.f49270a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(xnVar3.getParentActivity());
                    e6Var = ((org.telegram.ui.ActionBar.o2) xnVar3).resourceProvider;
                    org.telegram.ui.Components.qc G = new xc(a2, e6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.f27691j = 60000;
                    G.k(true);
                    qcVarArr[c10] = G;
                    return;
                }
                return;
            case 13:
                vn vnVar = (vn) this.f1494c;
                vnVar.j((org.telegram.ui.ActionBar.d4) this.d, (TLRPC.WallPaper) this.e, this.f1493b);
                vnVar.g(vnVar.f38647n);
                qm qmVar = vnVar.V.X0;
                if (qmVar != null && (abVar = qmVar.L) != null) {
                    abVar.invalidate();
                    return;
                }
                return;
            case 14:
                gp gpVar = (gp) this.f1494c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z24 = this.f1493b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    gpVar.f34000l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = gpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z24) {
                        if (gpVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gpVar.getParentActivity());
                            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            gpVar.showDialog(alertDialog$Builder.f18655a);
                        } else {
                            return;
                        }
                    }
                }
                i90 i90Var = gpVar.G;
                if (i90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = gpVar.f34000l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    i90Var.setLink(str);
                    gpVar.G.c(gpVar.f34000l0, gpVar.Z);
                    return;
                }
                return;
            case 15:
                op opVar = (op) this.f1494c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z25 = this.f1493b;
                chat.join_to_send = z25;
                opVar.f36235x.d.getMessagesController().toggleChatJoinToSend(chat.f18329id, z25, new ci.y0(opVar, z25, chat, 16), new qh(17, opVar, (w80) this.e));
                return;
            case 16:
                op opVar2 = (op) this.f1494c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z26 = this.f1493b;
                chat2.join_request = z26;
                opVar2.f36235x.d.getMessagesController().toggleChatJoinRequest(chat2.f18329id, z26, new np(opVar2, 0), new qh(16, opVar2, (v80) this.e));
                return;
            case 17:
                boolean z27 = this.f1493b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f1494c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z27 && ChatObject.isChannel(chat3)) {
                    View d10 = alertDialog$Builder2.f18655a.d(-1);
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
                pk pkVar = (pk) this.f1494c;
                boolean z28 = this.f1493b;
                ArrayList arrayList2 = (ArrayList) this.e;
                pkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new fe(11, pkVar, new ArrayList()));
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
                int i26 = i17 + 1;
                String[] strArr2 = new String[i26];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z28) {
                    for (int i27 = 0; i27 < arrayList2.size(); i27++) {
                        kk kkVar = (kk) arrayList2.get(i27);
                        File file4 = kkVar.f25783f;
                        if (file4 != null && !file4.isDirectory()) {
                            int i28 = 0;
                            while (true) {
                                if (i28 < i26) {
                                    String str4 = strArr2[i28];
                                    String str5 = kkVar.f25781b;
                                    if (str5 != null) {
                                        z11 = str5.toLowerCase().contains(str4);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList3.add(kkVar);
                                    } else {
                                        i28++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new fe(11, pkVar, arrayList3));
                return;
            case 19:
                t80.t((t80) this.f1494c, (TLRPC.TL_error) this.d, this.f1493b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                TLObject tLObject3 = (TLObject) this.d;
                boolean z29 = this.f1493b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                hy0 hy0Var = ((wx0) this.f1494c).f30204a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z29) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        hy0Var.S = tL_messages_stickerSet;
                        hy0Var.t0();
                        hy0Var.B0();
                    }
                }
                c2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f1494c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z30 = this.f1493b;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.e;
                if (g3Var != null && !g3Var.isDismissed()) {
                    g3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new oh(3, editTextBoldCursor));
                        return;
                    }
                    return;
                } else if (c2Var2 != null && c2Var2.isShowing()) {
                    c2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z30) {
                        AndroidUtilities.runOnUIThread(new oh(4, editTextBoldCursor));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 22:
                g60 g60Var = (g60) this.f1494c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z31 = this.f1493b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        g60Var.u1(null, tL_chatInviteExported3.link, true, z31);
                        return;
                    }
                }
                return;
            case 23:
                l70 l70Var = (l70) this.f1494c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z32 = this.f1493b;
                if (tL_error2 == null) {
                    l70Var.f35268f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z32) {
                        if (l70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(l70Var.getParentActivity());
                            alertDialog$Builder3.f18655a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.f18655a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            l70Var.showDialog(alertDialog$Builder3.f18655a);
                        } else {
                            return;
                        }
                    }
                }
                l70Var.e = false;
                l70Var.f35265a.l();
                return;
            case 24:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z33 = this.f1493b;
                jn0 jn0Var = ((vm0) this.f1494c).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    jn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    jn0Var.B1(z33);
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
                ro0 ro0Var = (ro0) this.f1494c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z34 = this.f1493b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    ro0Var.f37168a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    ro0Var.A0(z34);
                    return;
                }
                return;
            case 28:
                y21.W((y21) this.f1494c, this.f1493b, (org.telegram.ui.ActionBar.d4) this.d, (org.telegram.ui.ActionBar.c5) this.e);
                return;
            default:
                zg1.c0((zg1) this.f1494c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.f1493b);
                return;
        }
    }

    public s4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f1492a = i10;
        this.f1494c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1493b = z10;
    }

    public s4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1492a = i10;
        this.f1494c = obj;
        this.d = obj2;
        this.f1493b = z10;
        this.e = obj3;
    }

    public s4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f1492a = i10;
        this.f1494c = obj;
        this.f1493b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public s4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f1492a = 17;
        this.f1493b = z10;
        this.f1494c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
