package k6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import androidx.biometric.p;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import bi.d4;
import bi.k2;
import bi.k3;
import bi.m1;
import bi.n1;
import bi.o2;
import bi.t;
import bi.u0;
import bi.z5;
import c6.d0;
import c6.e0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.x4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.l0;
import e2.x;
import g6.q;
import g6.r;
import g6.w;
import ig.b1;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import jg.a1;
import m.i1;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONObject;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.br0;
import org.telegram.ui.ih0;
import v7.t6;
public final class h implements a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, q4, m1, s, OnCompleteListener, g6.n, f6.a, i1, z3.m, b1 {
    public static h f10942c;
    public final int f10943a;
    public Object f10944b;

    public h(r rVar, String[] strArr) {
        this.f10943a = 25;
        this.f10944b = strArr;
    }

    public static int F(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static final l G(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    public static int O(int i10, String str) {
        int U = U(i10);
        int F = F(str);
        return V(F) + F + U;
    }

    public static final boolean Q(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.Q(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static void R(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            char c10 = 57343;
            int i11 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i12 = remaining + arrayOffset;
                    while (i11 < length) {
                        int i13 = i11 + arrayOffset;
                        if (i13 >= i12 || (charAt = charSequence.charAt(i11)) >= 128) {
                            break;
                        }
                        array[i13] = (byte) charAt;
                        i11++;
                    }
                    if (i11 == length) {
                        i10 = arrayOffset + length;
                    } else {
                        i10 = arrayOffset + i11;
                        while (i11 < length) {
                            char charAt2 = charSequence.charAt(i11);
                            if (charAt2 < 128 && i10 < i12) {
                                array[i10] = (byte) charAt2;
                                i10++;
                            } else if (charAt2 < 2048 && i10 <= i12 - 2) {
                                int i14 = i10 + 1;
                                array[i10] = (byte) ((charAt2 >>> 6) | 960);
                                i10 += 2;
                                array[i14] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || c10 < charAt2) && i10 <= i12 - 3) {
                                array[i10] = (byte) ((charAt2 >>> '\f') | 480);
                                int i15 = i10 + 2;
                                array[i10 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i10 += 3;
                                array[i15] = (byte) ((charAt2 & '?') | 128);
                            } else if (i10 <= i12 - 4) {
                                int i16 = i11 + 1;
                                if (i16 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i16);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        array[i10] = (byte) ((codePoint >>> 18) | 240);
                                        array[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i17 = i10 + 3;
                                        array[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i10 += 4;
                                        array[i17] = (byte) ((codePoint & 63) | 128);
                                        i11 = i16;
                                    } else {
                                        i11 = i16;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11 - 1);
                                throw new IllegalArgumentException(sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt2);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            i11++;
                            c10 = 57343;
                        }
                    }
                    byteBuffer.position(i10 - byteBuffer.arrayOffset());
                    return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            }
            int length2 = charSequence.length();
            while (i11 < length2) {
                char charAt4 = charSequence.charAt(i11);
                char c11 = charAt4;
                if (charAt4 >= 128) {
                    if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        c11 = (charAt4 & '?') | 128;
                    } else {
                        if (charAt4 >= 55296 && 57343 >= charAt4) {
                            int i18 = i11 + 1;
                            if (i18 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i18);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i11 = i18;
                                } else {
                                    i11 = i18;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i11 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                        i11++;
                    }
                }
                byteBuffer.put((byte) c11);
                i11++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public static int T(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        if ((j10 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int U(int i10) {
        return V(i10 << 3);
    }

    public static int V(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        if ((i10 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static h p(Context context) {
        n6.l.g(context);
        synchronized (h.class) {
            try {
                if (f10942c == null) {
                    o.a(context);
                    f10942c = new h(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10942c;
    }

    public JSONObject A() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f10944b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(x9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        x9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    x9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public void B(Editable editable) {
        z5 z5Var = (z5) this.f10944b;
        bi.a aVar = z5Var.f2881a;
        if (aVar != null) {
            aVar.f2832s = true;
            aVar.f2831r = z5Var.f3481r.f3226k2;
        }
        z5Var.w();
        k3 k3Var = z5Var.E;
        if (k3Var != null && z5Var.f2881a != null) {
            k3Var.a();
        }
    }

    public int C() {
        return ((v() & 255) << 24) | ((v() & 255) << 16) | ((v() & 255) << 8) | (v() & 255);
    }

    public int D() {
        return ((v() & Byte.MAX_VALUE) << 21) | ((v() & Byte.MAX_VALUE) << 14) | ((v() & Byte.MAX_VALUE) << 7) | (v() & Byte.MAX_VALUE);
    }

    public void E(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((ff.a) this.f10944b).skip(j10 - j11);
            if (skip > 0) {
                j11 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public boolean H(boolean z10) {
        return false;
    }

    @Override
    public boolean I(n1 n1Var) {
        return false;
    }

    public void J(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f10944b;
        P(i10, 2);
        try {
            int V = V(str.length());
            if (V == V(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= V) {
                    byteBuffer.position(position + V);
                    R(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    N((position2 - position) - V);
                    byteBuffer.position(position2);
                    return;
                }
                throw new x4(position + V, byteBuffer.limit());
            }
            N(F(str));
            R(str, byteBuffer);
        } catch (BufferOverflowException e) {
            x4 x4Var = new x4(byteBuffer.position(), byteBuffer.limit());
            x4Var.initCause(e);
            throw x4Var;
        }
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f10943a) {
            case 10:
                ((t) this.f10944b).J(z10, i10, i11, 0L, false);
                t tVar = (t) this.f10944b;
                ih0 ih0Var = tVar.O;
                if (ih0Var != null) {
                    ih0Var.h();
                    tVar.O = null;
                    return;
                }
                return;
            default:
                ((k2) this.f10944b).x0(i10, i11, z10);
                return;
        }
    }

    public void L(int i10, byte[] bArr) {
        P(i10, 2);
        N(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f10944b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new x4(byteBuffer.position(), byteBuffer.limit());
    }

    public void M(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f10944b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new x4(byteBuffer.position(), byteBuffer.limit());
    }

    public void N(int i10) {
        while ((i10 & (-128)) != 0) {
            M((i10 & 127) | 128);
            i10 >>>= 7;
        }
        M(i10);
    }

    public void P(int i10, int i11) {
        N((i10 << 3) | i11);
    }

    public void S(long j10) {
        while (((-128) & j10) != 0) {
            M((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        M((int) j10);
    }

    public void a(j6.m mVar, u uVar) {
        k0 k0Var = (k0) this.f10944b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            k0 k0Var2 = (k0) this.f10944b;
            p pVar = (p) k0Var2.D("androidx.biometric.BiometricFragment");
            if (pVar == null) {
                pVar = new p();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
                aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                k0Var2.A(true);
                k0Var2.E();
            }
            v k10 = pVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            y yVar = pVar.f1115l0;
            yVar.f1125f = mVar;
            int i10 = mVar.f9699a;
            if (i10 == 0) {
                if (uVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i10 == 15 && uVar == null) {
                yVar.f1126g = v7.m.a();
            } else {
                yVar.f1126g = uVar;
            }
            if (pVar.Q()) {
                pVar.f1115l0.f1129k = pVar.q(2131689576);
            } else {
                pVar.f1115l0.f1129k = null;
            }
            if (pVar.Q() && new android.support.v4.media.session.a0(new androidx.biometric.s(k10, 0)).h(255) != 0) {
                pVar.f1115l0.f1132n = true;
                pVar.S();
            } else if (pVar.f1115l0.f1134p) {
                pVar.f1114k0.postDelayed(new androidx.biometric.o(pVar), 600L);
            } else {
                pVar.X();
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f10943a) {
            case 15:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.v();
                d0 d0Var = ((e0) this.f10944b).f3867k;
                Parcel P0 = fVar.P0();
                com.google.android.gms.internal.cast.u.d(P0, d0Var);
                fVar.U0(P0, 18);
                g6.f fVar2 = (g6.f) wVar.v();
                fVar2.U0(fVar2.P0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 25:
                q qVar = new q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).v();
                Parcel P02 = iVar.P0();
                com.google.android.gms.internal.cast.u.d(P02, qVar);
                P02.writeStringArray((String[]) this.f10944b);
                iVar.U0(P02, 6);
                return;
            default:
                h7.f fVar3 = new h7.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = q7.a.f45500a;
                obtain.writeStrongBinder(fVar3);
                q7.a.b(obtain, (GetCredentialRequest) this.f10944b);
                q7.a.b(obtain, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).v())).H0(obtain, 1);
                return;
        }
    }

    @Override
    public void b(n1 n1Var) {
        k3 k3Var = ((z5) this.f10944b).E;
        if (k3Var != null) {
            d4 d4Var = k3Var.f3169a;
            d4.P1(d4Var, n1Var);
            d4Var.f2938o3.h(n1Var, true);
        }
    }

    public c2.q c(ac.a r24) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.c(ac.a):c2.q");
    }

    @Override
    public void d() {
        a1 a1Var = (a1) this.f10944b;
        a1Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new bg.k(a1Var, 3)).setInterpolator(gr.h);
    }

    @Override
    public boolean f() {
        z5 z5Var = (z5) this.f10944b;
        k3 k3Var = z5Var.E;
        if (k3Var != null && z5Var.f2881a != null) {
            return k3Var.f3169a.V4();
        }
        return false;
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public void h(int i10, int i11) {
        o2 o2Var;
        z5 z5Var = (z5) this.f10944b;
        k3 k3Var = z5Var.E;
        if (k3Var != null && z5Var.f2881a != null && (o2Var = k3Var.f3169a.Q3) != null) {
            o2Var.f(i10, i11);
        }
    }

    @Override
    public void i(n1 n1Var, int i10, int i11) {
        k3 k3Var;
        k9 textSelectionHelper;
        z5 z5Var = (z5) this.f10944b;
        if (!z5Var.G && i10 != i11 && (k3Var = z5Var.E) != null && (textSelectionHelper = k3Var.f3169a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != z5Var) {
                z5Var.post(new u0(this, n1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public boolean k() {
        return true;
    }

    @Override
    public void k0(Object obj) {
        switch (this.f10943a) {
            case 4:
                p pVar = (p) this.f10944b;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(2131689613));
                    }
                    y yVar = pVar.f1115l0;
                    if (!yVar.f1132n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = yVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new androidx.biometric.g(pVar, 0));
                    }
                    y yVar2 = pVar.f1115l0;
                    if (yVar2.f1139u == null) {
                        yVar2.f1139u = new z();
                    }
                    y.h(yVar2.f1139u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) this.f10944b;
                if (tVar != null && pVar2.f1531r0) {
                    pVar2.getClass();
                    throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public z3.d l(int i10, int i11, byte[] bArr) {
        return sc.e.a(this, bArr, i11);
    }

    @Override
    public void m(Object obj) {
        Bundle extras;
        switch (this.f10943a) {
            case 7:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.f10944b;
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = f0Var.f1464a;
                int i10 = f0Var.f1465b;
                androidx.fragment.app.s s10 = j0Var.f1478c.s(str);
                if (s10 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                s10.x(i10, aVar.f964a, aVar.f965b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f10944b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f965b;
                int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f3785a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f964a;
                if (i12 != -1 || i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void n() {
        a1 a1Var = (a1) this.f10944b;
        a1Var.f9879b.f8470a.B();
        a1Var.f9886x.setViewHidden(false);
        PhotoViewer photoViewer = ((br0) a1Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.a3(true, true);
    }

    @Override
    public int o() {
        return 2;
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f10944b).f5781c, "joinApplication", task);
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void q(Bitmap bitmap) {
        ((f6.i) this.f10944b).e(bitmap, 3);
    }

    @Override
    public void s(String str, long j10, long j11, long j12) {
        e6.n nVar = (e6.n) this.f10944b;
        try {
            nVar.a(new e6.m(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.f6284k;
            Log.e(bVar.f7368a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = nVar.f6304q.f6290i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public void t() {
        ((a1) this.f10944b).f9886x.setViewHidden(true);
    }

    public void u(bb.e0 e0Var) {
        ((l5.q) ((i5.f) ((qa.b) this.f10944b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new a1.c(this, 6)).a(new i5.a(null, e0Var, i5.d.f8207a, null), new k2.k0(5));
    }

    public byte v() {
        int read = ((ff.a) this.f10944b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public void w(CharSequence charSequence) {
        k3 k3Var = ((z5) this.f10944b).E;
        if (k3Var != null && charSequence != null && charSequence.length() > 0) {
            k3Var.f3169a.w4(charSequence.toString());
        }
    }

    @Override
    public boolean x(n1 n1Var) {
        return false;
    }

    @Override
    public void y(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.y(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public void z(byte[] bArr, int i10, int i11, z3.l lVar, e2.j jVar) {
        boolean z10;
        d2.b a2;
        boolean z11;
        x xVar = (x) this.f10944b;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            if (xVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.e("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i12 = m10 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    if (i12 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t6.e("Incomplete vtt cue box header found.", z11);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i13 = m11 - 8;
                    byte[] bArr2 = xVar.f6207a;
                    int i14 = xVar.f6208b;
                    String str = l0.f6165a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    xVar.O(i13);
                    i12 = (i12 - 8) - i13;
                    if (m12 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f5645a = charSequence;
                    aVar.f5646b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.f8198a;
                    i4.g gVar2 = new i4.g();
                    gVar2.f8192c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public h(Object obj, int i10) {
        this.f10943a = i10;
        this.f10944b = obj;
    }

    public h(byte[] bArr, int i10) {
        this.f10943a = 17;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f10944b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public h(Context context) {
        this.f10943a = 0;
        this.f10944b = context.getApplicationContext();
    }

    public h(x6.a aVar) {
        this.f10943a = 28;
        n6.l.g(aVar);
        this.f10944b = aVar;
    }

    public h(ca.c cVar) {
        this.f10943a = 21;
        this.f10944b = new File(cVar.f4084b, "com.crashlytics.settings.json");
    }

    public h(int i10) {
        this.f10943a = i10;
        switch (i10) {
            case 13:
                return;
            case 27:
                this.f10944b = new x();
                return;
            default:
                this.f10944b = new r2.y(yb.a.h, 18);
                return;
        }
    }

    public h(LaunchActivity launchActivity, Executor executor, v7.l lVar) {
        this.f10943a = 5;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s10 = launchActivity.s();
            y yVar = (y) new android.support.v4.media.session.a0(launchActivity).n(y.class);
            this.f10944b = s10;
            yVar.d = executor;
            yVar.e = lVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void g() {
    }

    @Override
    public void j() {
    }

    @Override
    public void r() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void e(n1 n1Var) {
    }
}
