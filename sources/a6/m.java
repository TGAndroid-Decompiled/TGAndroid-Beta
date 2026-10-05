package a6;

import ai.ac;
import ai.e6;
import ai.o8;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.view.TextureView;
import androidx.biometric.p;
import androidx.biometric.t;
import androidx.biometric.x;
import androidx.fragment.app.g0;
import androidx.fragment.app.l0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import c6.d0;
import c6.e0;
import ci.b7;
import ci.m0;
import ci.z6;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.b0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.y4;
import fb.n;
import g6.q;
import g6.r;
import g6.w;
import i2.j0;
import ii.a1;
import ii.c3;
import ii.g5;
import ii.h1;
import ii.i2;
import ii.i5;
import ii.k0;
import ii.p2;
import ii.s3;
import ii.x3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import k2.i0;
import lg.o;
import m.i1;
import n4.y;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.vi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gv0;
import qg.b2;
import v7.m8;
public final class m implements gv0, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, s, o, b81, OnSuccessListener, n, i1, vi, k0, h1, k2.o {
    public final int f329a;
    public Object f330b;

    public m(r rVar, String[] strArr) {
        this.f329a = 19;
        this.f330b = strArr;
    }

    public static int M(int i10, String str) {
        int V = V(i10);
        int z10 = z(str);
        return X(z10) + z10 + V;
    }

    public static void P(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                } catch (ArrayIndexOutOfBoundsException e7) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e7);
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

    public static int U(long j3) {
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (((-16384) & j3) == 0) {
            return 2;
        }
        if (((-2097152) & j3) == 0) {
            return 3;
        }
        if (((-268435456) & j3) == 0) {
            return 4;
        }
        if (((-34359738368L) & j3) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j3) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j3) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j3) == 0) {
            return 8;
        }
        if ((j3 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int V(int i10) {
        return X(i10 << 3);
    }

    public static int X(int i10) {
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

    public static int z(CharSequence charSequence) {
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

    @Override
    public void A(k2.l lVar) {
        y yVar = ((i0) this.f330b).Y0;
        Handler handler = (Handler) yVar.f16649b;
        if (handler != null) {
            handler.post(new k2.i(yVar, lVar, 0));
        }
    }

    @Override
    public void B(Editable editable) {
        ((i5) this.f330b).h();
    }

    @Override
    public boolean C(boolean z10) {
        return false;
    }

    @Override
    public void D() {
        j0 j0Var = ((i0) this.f330b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override
    public void E(k2.l lVar) {
        y yVar = ((i0) this.f330b).Y0;
        Handler handler = (Handler) yVar.f16649b;
        if (handler != null) {
            handler.post(new k2.i(yVar, lVar, 1));
        }
    }

    @Override
    public void F() {
        ((m0) this.f330b).f5548e.invalidate();
    }

    public void G(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f330b;
        O(i10, 2);
        try {
            int X = X(str.length());
            if (X == X(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= X) {
                    byteBuffer.position(position + X);
                    P(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    L((position2 - position) - X);
                    byteBuffer.position(position2);
                    return;
                }
                throw new b5(position + X, byteBuffer.limit());
            }
            L(z(str));
            P(str, byteBuffer);
        } catch (BufferOverflowException e7) {
            b5 b5Var = new b5(byteBuffer.position(), byteBuffer.limit());
            b5Var.initCause(e7);
            throw b5Var;
        }
    }

    @Override
    public void G0(MessageObject messageObject) {
        ((ac) ((e6) this.f330b).Q1).f(true);
    }

    public void H(int i10, byte[] bArr) {
        O(i10, 2);
        L(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f330b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new b5(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public void I(MessageObject messageObject) {
        ((ac) ((e6) this.f330b).Q1).f(false);
    }

    @Override
    public q9 J() {
        s3 s3Var = ((a1) this.f330b).S;
        if (s3Var == null) {
            return null;
        }
        return s3Var.f12631a.getTextSelectionHelper();
    }

    public void K(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f330b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new b5(byteBuffer.position(), byteBuffer.limit());
    }

    public void L(int i10) {
        while ((i10 & (-128)) != 0) {
            K((i10 & 127) | 128);
            i10 >>>= 7;
        }
        K(i10);
    }

    @Override
    public void N(CharSequence charSequence) {
        s3 s3Var = ((a1) this.f330b).S;
        if (s3Var != null) {
            s3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                s3Var.f12631a.u4(charSequence.toString());
            }
        }
    }

    public void O(int i10, int i11) {
        L((i10 << 3) | i11);
    }

    public void Q(long j3) {
        while (((-128) & j3) != 0) {
            K((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        K((int) j3);
    }

    @Override
    public p9 R() {
        return (a1) this.f330b;
    }

    @Override
    public boolean S1() {
        return false;
    }

    @Override
    public ii.a T() {
        return ((a1) this.f330b).f12204a;
    }

    @Override
    public boolean W() {
        a1 a1Var = (a1) this.f330b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f12204a;
            if (s3Var.f12631a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void Z(int i10, int i11) {
        a1 a1Var = (a1) this.f330b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f12204a;
            i2 i2Var = s3Var.f12631a.Q3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    public void a(j6.l lVar, t tVar) {
        l0 l0Var = (l0) this.f330b;
        if (l0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (l0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            l0 l0Var2 = (l0) this.f330b;
            p pVar = (p) l0Var2.D("androidx.biometric.BiometricFragment");
            if (pVar == null) {
                pVar = new p();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(l0Var2);
                aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                l0Var2.A(true);
                l0Var2.E();
            }
            v k10 = pVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            x xVar = pVar.f2238l0;
            xVar.f2248f = lVar;
            int i10 = lVar.f14024a;
            if (i10 == 0) {
                if (tVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && i11 < 30 && i10 == 15 && tVar == null) {
                xVar.f2249g = v7.p.a();
            } else {
                xVar.f2249g = tVar;
            }
            if (pVar.Q()) {
                pVar.f2238l0.f2252k = pVar.q(2131689576);
            } else {
                pVar.f2238l0.f2252k = null;
            }
            if (pVar.Q() && new aa.a(new k6.h(k10, 1)).f(255) != 0) {
                pVar.f2238l0.f2255n = true;
                pVar.S();
            } else if (pVar.f2238l0.f2257p) {
                pVar.f2237k0.postDelayed(new androidx.biometric.o(pVar), 600L);
            } else {
                pVar.X();
            }
        }
    }

    @Override
    public boolean a0() {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f329a) {
            case 10:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.u();
                d0 d0Var = ((e0) this.f330b).f4297k;
                Parcel O0 = fVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, d0Var);
                fVar.T0(O0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.T0(fVar2.O0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 19:
                q qVar = new q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel O02 = iVar.O0();
                com.google.android.gms.internal.cast.v.d(O02, qVar);
                O02.writeStringArray((String[]) this.f330b);
                iVar.T0(O02, 6);
                return;
            default:
                h7.f fVar3 = new h7.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = q7.a.f44844a;
                obtain.writeStrongBinder(fVar3);
                q7.a.b(obtain, (GetCredentialRequest) this.f330b);
                q7.a.b(obtain, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).G0(obtain, 1);
                return;
        }
    }

    @Override
    public void b(ii.i1 i1Var) {
        switch (this.f329a) {
            case 25:
                s3 s3Var = ((a1) this.f330b).S;
                if (s3Var != null) {
                    x3 x3Var = s3Var.f12631a;
                    x3.N1(x3Var, i1Var);
                    x3Var.f12770o3.P(i1Var, true);
                    return;
                }
                return;
            default:
                g5 g5Var = ((i5) this.f330b).f12450s;
                if (g5Var != null) {
                    x3 x3Var2 = ((c3) g5Var).f12263a;
                    x3.N1(x3Var2, i1Var);
                    x3Var2.f12770o3.P(i1Var, true);
                    return;
                }
                return;
        }
    }

    public float c(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.f4555b;
        int i11 = (int) cVar2.f4555b;
        float v = v((int) cVar.f4554a, i10, (int) cVar2.f4554a, i11);
        float v9 = v((int) cVar2.f4554a, i11, (int) cVar.f4554a, i10);
        if (Float.isNaN(v)) {
            return v9 / 7.0f;
        }
        if (Float.isNaN(v9)) {
            return v / 7.0f;
        }
        return (v + v9) / 14.0f;
    }

    @Override
    public void d(long j3) {
        y yVar = ((i0) this.f330b).Y0;
        Handler handler = (Handler) yVar.f16649b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void g() {
        a1 a1Var = (a1) this.f330b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            x3.Q1(s3Var.f12631a, a1Var.f12204a);
        }
    }

    @Override
    public void g0() {
        a1 a1Var = (a1) this.f330b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f12204a;
            x3 x3Var = s3Var.f12631a;
            i2 i2Var = x3Var.Q3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f12770o3.onContentChanged();
        }
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public aa.a h(of.b r42) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.h(of.b):aa.a");
    }

    public ic.a i(float f7, float f10, int i10, int i11) {
        int i12;
        ic.a b10;
        ic.a b11;
        int i13 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i13);
        dc.b bVar = (dc.b) this.f330b;
        int min = Math.min(bVar.f8220a - 1, i10 + i13) - max;
        float f11 = 3.0f * f7;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f8221b - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                dc.b bVar2 = (dc.b) this.f330b;
                ic.b bVar3 = new ic.b(bVar2, max, max2, min, min2, f7);
                int i14 = bVar3.f12047e;
                int i15 = bVar3.f12046c;
                int i16 = i14 + i15;
                int i17 = bVar3.f12048f;
                int i18 = (i17 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i19 = 0; i19 < i17; i19++) {
                    if ((i19 & 1) == 0) {
                        i12 = (i19 + 1) / 2;
                    } else {
                        i12 = -((i19 + 1) / 2);
                    }
                    int i20 = i12 + i18;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i21 = i15;
                    while (i21 < i16 && !bVar2.b(i21, i20)) {
                        i21++;
                    }
                    int i22 = 0;
                    while (i21 < i16) {
                        if (bVar2.b(i21, i20)) {
                            if (i22 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i22 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i20, i21, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i22 = 1;
                            } else {
                                i22++;
                                iArr[i22] = iArr[i22] + 1;
                            }
                        } else {
                            if (i22 == 1) {
                                i22++;
                            }
                            iArr[i22] = iArr[i22] + 1;
                        }
                        i21++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i20, i16, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f12045b;
                if (!arrayList.isEmpty()) {
                    return (ic.a) arrayList.get(0);
                }
                throw cc.e.a();
            }
            throw cc.e.a();
        }
        throw cc.e.a();
    }

    @Override
    public void j(Object obj) {
        Bundle extras;
        switch (this.f329a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.f330b;
                g0 g0Var = (g0) k0Var.F.pollFirst();
                if (g0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = g0Var.f2609a;
                int i10 = g0Var.f2610b;
                androidx.fragment.app.s l4 = k0Var.f2620c.l(str);
                if (l4 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                l4.x(i10, aVar.f2082a, aVar.f2083b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f330b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f2083b;
                int i11 = u.e("ProxyBillingActivityV2", intent).f4204a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f2082a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    public Boolean k() {
        Bundle bundle = (Bundle) this.f330b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override
    public TextureView k0() {
        return null;
    }

    @Override
    public void l(ii.i1 i1Var) {
        ii.a aVar;
        i5 i5Var = (i5) this.f330b;
        g5 g5Var = i5Var.f12450s;
        if (g5Var != null && (aVar = i5Var.f12204a) != null) {
            x3 x3Var = ((c3) g5Var).f12263a;
            ArrayList arrayList = x3Var.f12778s3;
            long j3 = aVar.f12203t;
            if (j3 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((ii.a) arrayList.get(i11)).f12194k.contains(Long.valueOf(j3))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    i2 i2Var = x3Var.Q3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    ii.a aVar2 = new ii.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f12194k;
                    ArrayList arrayList3 = aVar2.f12194k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a4.a.y(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    x3Var.t4();
                    x3Var.f26034f3.N(false);
                    i2 i2Var2 = x3Var.Q3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    x3Var.post(new p2(x3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public void m() {
        ((i0) this.f330b).f14454j1 = true;
    }

    @Override
    public boolean n(ii.i1 i1Var) {
        return false;
    }

    @Override
    public void o() {
        j0 j0Var = ((i0) this.f330b).W;
        if (j0Var != null) {
            j0Var.f11708a.f11797g0 = true;
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        i0 i0Var = (i0) this.f330b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = i0Var.f14445a1) != null) {
            jVar.d(i10);
        }
        y yVar = i0Var.Y0;
        Handler handler = (Handler) yVar.f16649b;
        if (handler != null) {
            handler.post(new o8(yVar, i10, 11));
        }
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        y yVar = ((i0) this.f330b).Y0;
        Handler handler = (Handler) yVar.f16649b;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.f330b;
        z6 z6Var = b7Var.M;
        e81 e81Var = b7Var.f4769x;
        if (e81Var == null) {
            return;
        }
        if (e81Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z6Var);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        f2 f2Var;
        f1 b10;
        d6.a aVar = (d6.a) this.f330b;
        Bundle bundle = (Bundle) obj;
        if (r0.f6969j) {
            Context context = aVar.f8107a;
            r rVar = aVar.f8111f;
            r0 r0Var = new r0(context, rVar, aVar.f8109c, aVar.f8114j, aVar.f8112g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i10 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (z10) {
                    i10 = 0;
                    z10 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String v = sa.e.v(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            r0Var.h = i11;
            l5.t.b(context);
            r0Var.f6975g = l5.t.a().c(j5.a.f13985e).a("CAST_SENDER_SDK", new i5.c("proto"), b0.f6725a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                r0Var.f6973e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(v, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                e7.f6644c = new m(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                e7.d = new k6.c[]{c6.y.f4394c};
                e7.f6643b = false;
                e7.f6642a = 8426;
                Task e10 = rVar.e(0, e7.a());
                ?? obj2 = new Object();
                obj2.f14025b = r0Var;
                obj2.f14026c = packageName;
                obj2.f14024a = i10;
                obj2.d = sharedPreferences;
                e10.addOnSuccessListener(obj2);
            }
            if (z10) {
                n6.l.h(sharedPreferences);
                g6.b bVar = f2.f6853i;
                synchronized (f2.class) {
                    try {
                        if (f2.f6855k == null) {
                            f2.f6855k = new f2(sharedPreferences, r0Var, packageName);
                        }
                        f2Var = f2.f6855k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = f2Var.f6858c;
                SharedPreferences sharedPreferences2 = f2Var.f6857b;
                HashSet hashSet = f2Var.f6860f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = f2Var.f6861g;
                hashSet2.clear();
                f2Var.h = 0L;
                String str2 = f2.f6854j;
                if (str2.equals(string) && str.equals(string2)) {
                    f2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j3 = sharedPreferences2.getLong(str3, 0L);
                            if (j3 != 0 && currentTimeMillis - j3 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                f1 b11 = f2.b(str3.substring(41));
                                if (b11 != null) {
                                    hashSet2.add(b11);
                                    hashSet.add(b11);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = f2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    f2Var.c(hashSet3);
                    n6.l.h(f2Var.f6859e);
                    n6.l.h(f2Var.d);
                    f2Var.f6859e.post(f2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    f2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                f2.a(f1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        b2 b2Var = ((b7) this.f330b).f4767w;
        if (b2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(b2Var.f44999y0 - f10) >= 1.0E-4f) {
                b2Var.f44999y0 = f10;
                b2Var.requestLayout();
            }
        }
    }

    @Override
    public boolean p(ii.i1 i1Var) {
        return false;
    }

    @Override
    public Object p2() {
        Constructor constructor = (Constructor) this.f330b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e7) {
            m8 m8Var = ib.c.f12042a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    public float q(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        int i21 = 1;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = (-abs) / 2;
        int i23 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i23 = 1;
        }
        int i24 = i16 + i18;
        int i25 = i14;
        int i26 = i15;
        int i27 = 0;
        while (i25 != i24) {
            if (z10) {
                i19 = i26;
            } else {
                i19 = i25;
            }
            if (z10) {
                i20 = i25;
            } else {
                i20 = i26;
            }
            boolean z12 = z10;
            if (i27 == i21) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i28 = abs;
            if (z11 == ((dc.b) this.f330b).b(i19, i20)) {
                if (i27 == 2) {
                    return v7.z6.b(i25, i26, i14, i15);
                }
                i27++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i26 == i17) {
                    break;
                }
                i26 += i23;
                i22 -= i28;
            }
            i25 += i18;
            abs = i28;
            z10 = z12;
            i21 = 1;
        }
        if (i27 == 2) {
            return v7.z6.b(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override
    public void s(int i10, long j3, long j10) {
        y yVar = ((i0) this.f330b).Y0;
        Handler handler = (Handler) yVar.f16649b;
        if (handler != null) {
            handler.post(new k2.j(yVar, i10, j3, j10, 0));
        }
    }

    @Override
    public void t(ii.i1 i1Var, int i10, int i11) {
        g5 g5Var;
        q9 textSelectionHelper;
        i5 i5Var = (i5) this.f330b;
        if (!i5Var.f12451w && i10 != i11 && (g5Var = i5Var.f12450s) != null && (textSelectionHelper = ((c3) g5Var).f12263a.getTextSelectionHelper()) != null) {
            i1Var.post(new y4(this, i1Var, i11, textSelectionHelper, i10, 3));
        }
    }

    @Override
    public void u() {
        x2.p pVar;
        i0 i0Var = (i0) this.f330b;
        synchronized (i0Var.f11594a) {
            pVar = i0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    public float v(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        dc.b bVar = (dc.b) this.f330b;
        float q6 = q(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f8220a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f7 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f11 = i11;
        int i18 = (int) (f11 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f11 / (i11 - i18);
        } else {
            int i19 = bVar.f8221b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (q(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + q6) - 1.0f;
    }

    @Override
    public void v0() {
        a1 a1Var = (a1) this.f330b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f12204a;
            x3.P1(s3Var.f12631a);
        }
    }

    @Override
    public void w0(Object obj) {
        switch (this.f329a) {
            case 3:
                p pVar = (p) this.f330b;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(2131689613));
                    }
                    x xVar = pVar.f2238l0;
                    if (!xVar.f2255n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = xVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new androidx.biometric.g(pVar, 0));
                    }
                    x xVar2 = pVar.f2238l0;
                    if (xVar2.f2262u == null) {
                        xVar2.f2262u = new z();
                    }
                    x.h(xVar2.f2262u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) this.f330b;
                if (tVar != null && pVar2.f2667r0) {
                    pVar2.getClass();
                    throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public void x(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        y yVar = ((i0) this.f330b).Y0;
        Handler handler = (Handler) yVar.f16649b;
        if (handler != null) {
            handler.post(new k2.g(yVar, exc, 1));
        }
    }

    @Override
    public void x0(ih ihVar) {
        NotificationCenter.getInstance(hg.n.Z((hg.n) this.f330b)).doOnIdle(ihVar);
    }

    @Override
    public void y() {
        ((i0) this.f330b).f14452h1 = true;
    }

    public m(Object obj, int i10) {
        this.f329a = i10;
        this.f330b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public m(byte[] bArr, int i10) {
        this.f329a = 14;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f330b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public m(int i10) {
        this.f329a = i10;
        switch (i10) {
            case 20:
                this.f330b = new xa.c(24);
                return;
            case 23:
                return;
            default:
                this.f330b = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
        }
    }

    public m(Context context) {
        this.f329a = 8;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f330b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public m(LaunchActivity launchActivity, Executor executor, v7.o oVar) {
        this.f329a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            l0 s10 = launchActivity.s();
            x xVar = (x) new aa.a(launchActivity).j(x.class);
            this.f330b = s10;
            xVar.d = executor;
            xVar.f2247e = oVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void K0() {
    }

    @Override
    public void r() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void u0() {
    }

    @Override
    public void S(boolean z10) {
    }

    @Override
    public void U0(Object obj) {
    }

    @Override
    public void j1(TLRPC.User user) {
    }

    @Override
    public void n0(boolean z10) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void w(CharSequence charSequence) {
    }

    @Override
    public void f(int i10, int i11) {
    }

    @Override
    public void onError(e81 e81Var, Exception exc) {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
