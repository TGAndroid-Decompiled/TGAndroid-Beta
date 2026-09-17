package a6;

import ai.ac;
import ai.f6;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.view.TextureView;
import android.view.Window;
import androidx.biometric.p;
import androidx.biometric.t;
import androidx.biometric.x;
import androidx.fragment.app.g0;
import androidx.fragment.app.k0;
import androidx.fragment.app.l0;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import c3.j0;
import c6.e0;
import c6.y;
import ci.a7;
import ci.d7;
import ci.m0;
import ci.uc;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.b0;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.d0;
import e2.v;
import ei.x4;
import g6.n;
import g6.q;
import g6.r;
import gg.a2;
import gg.b2;
import ii.c3;
import ii.d2;
import ii.h1;
import ii.h2;
import ii.i1;
import ii.o5;
import ii.w3;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import l.w;
import lg.o;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dj0;
import org.telegram.ui.iy;
import org.telegram.ui.nv0;
import qg.e2;
public final class m implements nv0, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, s, o, e71, OnSuccessListener, n, f6.a, fb.n, w, b2, z3.m, b5, h1 {
    public final int f306a;
    public final Object f307b;

    public m(r rVar, String[] strArr) {
        this.f306a = 21;
        this.f307b = strArr;
    }

    public static int E(int i10, String str) {
        int P = P(i10);
        int l4 = l(str);
        return R(l4) + l4 + P;
    }

    public static void I(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    public static int N(long j3) {
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

    public static int P(int i10) {
        return R(i10 << 3);
    }

    public static int R(int i10) {
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

    public static int l(CharSequence charSequence) {
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
    public int A() {
        return 2;
    }

    @Override
    public void B(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
        boolean z10;
        d2.b a2;
        boolean z11;
        v vVar = (v) this.f307b;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        ArrayList arrayList = new ArrayList();
        while (vVar.a() > 0) {
            if (vVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.a("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int j3 = vVar.j();
            if (vVar.j() == 1987343459) {
                int i12 = j3 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    if (i12 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.a("Incomplete vtt cue box header found.", z11);
                    int j10 = vVar.j();
                    int j11 = vVar.j();
                    int i13 = j10 - 8;
                    byte[] bArr2 = vVar.f7934a;
                    int i14 = vVar.f7935b;
                    String str = d0.f7888a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    vVar.K(i13);
                    i12 = (i12 - 8) - i13;
                    if (j11 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (j11 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f7414a = charSequence;
                    aVar.f7415b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.f10987a;
                    i4.g gVar2 = new i4.g();
                    gVar2.f10981c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                vVar.K(j3 - 8);
            }
        }
        hVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public void C(int i10) {
        while ((i10 & (-128)) != 0) {
            u((i10 & 127) | 128);
            i10 >>>= 7;
        }
        u(i10);
    }

    @Override
    public void D(i1 i1Var, int i10, int i11) {
        c3 c3Var;
        q9 textSelectionHelper;
        o5 o5Var = (o5) this.f307b;
        if (!o5Var.G && i10 != i11 && (c3Var = o5Var.E) != null && (textSelectionHelper = c3Var.f11286a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != o5Var) {
                o5Var.post(new x4(this, i1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    @Override
    public void E0(MessageObject messageObject) {
        ((ac) ((f6) this.f307b).Q1).f(true);
    }

    @Override
    public a0.i F() {
        switch (this.f306a) {
            case 22:
                return null;
            default:
                return null;
        }
    }

    public void G(int i10, int i11) {
        C((i10 << 3) | i11);
    }

    @Override
    public void H(MessageObject messageObject) {
        ((ac) ((f6) this.f307b).Q1).f(false);
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f306a) {
            case 26:
                ((ii.r) this.f307b).I(i10, z10, i11, false, 0L);
                ii.r rVar = (ii.r) this.f307b;
                dj0 dj0Var = rVar.O;
                if (dj0Var != null) {
                    dj0Var.i();
                    rVar.O = null;
                    return;
                }
                return;
            default:
                ((d2) this.f307b).s0(i10, i11, z10);
                return;
        }
    }

    public void K(long j3) {
        while (((-128) & j3) != 0) {
            u((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        u((int) j3);
    }

    @Override
    public void M(CharSequence charSequence) {
        c3 c3Var = ((o5) this.f307b).E;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f11286a.u4(charSequence.toString());
        }
    }

    @Override
    public boolean O(int i10) {
        switch (this.f306a) {
            case 22:
                if (i10 == ((sn0) this.f307b).f9766d0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public void Q(ArrayList arrayList) {
        boolean z10;
        switch (this.f306a) {
            case 22:
                sn0 sn0Var = (sn0) this.f307b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    sn0Var.J.add(((a2) arrayList.get(i10)).f9674a);
                }
                iy iyVar = sn0Var.U;
                if (iyVar != null) {
                    if (sn0Var.D0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    iyVar.d(z10, false);
                }
                sn0Var.l();
                return;
            default:
                return;
        }
    }

    @Override
    public void W(Editable editable) {
        o5 o5Var = (o5) this.f307b;
        ii.a aVar = o5Var.f11220a;
        if (aVar != null) {
            aVar.f11218s = true;
            aVar.f11217r = o5Var.f11543r.E;
        }
        o5Var.u();
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11220a != null) {
            c3Var.a();
        }
    }

    public void a(j6.l lVar, t tVar) {
        Object obj = this.f307b;
        l0 l0Var = (l0) obj;
        if (l0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (l0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            l0 l0Var2 = (l0) obj;
            p pVar = (p) l0Var2.D("androidx.biometric.BiometricFragment");
            if (pVar == null) {
                pVar = new p();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(l0Var2);
                aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                l0Var2.A(true);
                l0Var2.E();
            }
            androidx.fragment.app.v k10 = pVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            x xVar = pVar.f2068l0;
            xVar.f2077f = lVar;
            int i10 = lVar.f12910a;
            if (i10 == 0) {
                if (tVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && i11 < 30 && i10 == 15 && tVar == null) {
                xVar.f2078g = v7.o.a();
            } else {
                xVar.f2078g = tVar;
            }
            if (pVar.Q()) {
                pVar.f2068l0.f2081k = pVar.q(2131689576);
            } else {
                pVar.f2068l0.f2081k = null;
            }
            if (pVar.Q() && new aa.a(new k6.h(k10, 1)).f(255) != 0) {
                pVar.f2068l0.f2084n = true;
                pVar.S();
            } else if (pVar.f2068l0.f2086p) {
                pVar.f2067k0.postDelayed(new androidx.biometric.o(pVar), 600L);
            } else {
                pVar.X();
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f306a) {
            case 10:
                g6.w wVar = (g6.w) obj;
                g6.f fVar = (g6.f) wVar.u();
                c6.d0 d0Var = ((e0) this.f307b).f3980k;
                Parcel O0 = fVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, d0Var);
                fVar.T0(O0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.T0(fVar2.O0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            default:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel O02 = iVar.O0();
                com.google.android.gms.internal.cast.v.d(O02, qVar);
                O02.writeStringArray((String[]) this.f307b);
                iVar.T0(O02, 5);
                return;
        }
    }

    public dc.d b(com.google.firebase.messaging.m r24) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.b(com.google.firebase.messaging.m):dc.d");
    }

    @Override
    public boolean b0(boolean z10) {
        return false;
    }

    @Override
    public void c(i1 i1Var) {
        c3 c3Var = ((o5) this.f307b).E;
        if (c3Var != null) {
            w3 w3Var = c3Var.f11286a;
            w3.N1(w3Var, i1Var);
            w3Var.f11714h3.t(i1Var, true);
        }
    }

    public int d(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        fc.a aVar = (fc.a) this.f307b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i14 = 1;
                while (i14 < length && iArr[i14] == 0) {
                    i14++;
                }
                if (i14 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i15 = length - i14;
                    int[] iArr4 = new int[i15];
                    System.arraycopy(iArr, i14, iArr4, 0, i15);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i10];
            boolean z10 = true;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = aVar.f9054a[aVar.f9058g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            fc.a aVar2 = fc.a.h;
                            i12 ^= i18;
                        }
                    } else {
                        i12 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i19 = 1; i19 < length2; i19++) {
                            i12 = aVar.c(i17, i12) ^ iArr2[i19];
                        }
                    }
                    i13 = i12;
                }
                iArr5[(i10 - 1) - i16] = i13;
                if (i13 != 0) {
                    z10 = false;
                }
            }
            if (z10) {
                return 0;
            }
            fc.b bVar = new fc.b(aVar, iArr5);
            fc.b a2 = aVar.a(i10, 1);
            fc.b bVar2 = aVar.f9056c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            fc.b bVar3 = aVar.d;
            fc.b bVar4 = a2;
            fc.b bVar5 = bVar;
            fc.b bVar6 = bVar4;
            fc.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    fc.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c10));
                        bVar5 = bVar5.a(bVar6.h(d, c10));
                    }
                    fc.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        fc.b bVar9 = bVar5;
                        bVar5 = bVar6;
                        bVar6 = bVar9;
                        bVar7 = bVar3;
                        bVar3 = a10;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c11 = bVar3.c(0);
            if (c11 != 0) {
                int b11 = aVar.b(c11);
                fc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                fc.b bVar10 = bVarArr[0];
                fc.b bVar11 = bVarArr[1];
                int d10 = bVar10.d();
                if (d10 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d10];
                    int i20 = 0;
                    for (int i21 = 1; i21 < aVar.e && i20 < d10; i21++) {
                        if (bVar10.b(i21) == 0) {
                            iArr6[i20] = aVar.b(i21);
                            i20++;
                        }
                    }
                    if (i20 == d10) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i22 = 0; i22 < length3; i22++) {
                    int b12 = aVar.b(iArr3[i22]);
                    int i23 = 1;
                    for (int i24 = 0; i24 < length3; i24++) {
                        if (i22 != i24) {
                            int c12 = aVar.c(iArr3[i24], b12);
                            if ((c12 & 1) == 0) {
                                i11 = c12 | 1;
                            } else {
                                i11 = c12 & (-2);
                            }
                            i23 = aVar.c(i23, i11);
                        }
                    }
                    int c13 = aVar.c(bVar11.b(b12), aVar.b(i23));
                    iArr7[i22] = c13;
                    if (aVar.f9058g != 0) {
                        iArr7[i22] = aVar.c(c13, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f9055b[i26];
                        if (i27 >= 0) {
                            iArr[i27] = iArr[i27] ^ iArr7[i25];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    public Boolean e() {
        Bundle bundle = (Bundle) this.f307b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override
    public boolean f() {
        o5 o5Var = (o5) this.f307b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11220a != null) {
            return c3Var.f11286a.T4();
        }
        return false;
    }

    @Override
    public void g(l.k kVar, boolean z10) {
        ((g.s) this.f307b).g(kVar);
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f306a) {
            case 22:
                sn0 sn0Var = (sn0) this.f307b;
                sn0Var.D0--;
                sn0Var.f9767e0 = i10;
                if (sn0Var.f9769f0 != i10) {
                    sn0Var.f9783s.clear();
                }
                if (sn0Var.f9770g0 != i10) {
                    sn0Var.I.clear();
                }
                sn0Var.N = true;
                iy iyVar = sn0Var.U;
                if (iyVar != null) {
                    if (sn0Var.D0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    iyVar.d(z10, true);
                }
                sn0Var.l();
                iy iyVar2 = sn0Var.U;
                if (iyVar2 != null) {
                    iyVar2.c();
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new uc(this, 21));
                return;
        }
    }

    @Override
    public void j(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = (o5) this.f307b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11220a != null && (h2Var = c3Var.f11286a.J3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public TextureView j0() {
        return null;
    }

    @Override
    public void k(Object obj) {
        Bundle extras;
        switch (this.f306a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                k0 k0Var = (k0) this.f307b;
                g0 g0Var = (g0) k0Var.F.pollFirst();
                if (g0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = g0Var.f2416a;
                int i10 = g0Var.f2417b;
                androidx.fragment.app.s l4 = k0Var.f2427c.l(str);
                if (l4 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                l4.x(i10, aVar.f1921a, aVar.f1922b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f307b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1922b;
                int i11 = u.e("ProxyBillingActivityV2", intent).f3894a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f1921a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void n(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int A = (int) a4.a.A(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (A - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, A, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.i) this.f307b).e(bitmap2, 0);
    }

    public void o(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f307b;
        G(i10, 2);
        try {
            int R = R(str.length());
            if (R == R(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= R) {
                    byteBuffer.position(position + R);
                    I(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    C((position2 - position) - R);
                    byteBuffer.position(position2);
                    return;
                }
                throw new com.google.android.gms.internal.cast.b5(position + R, byteBuffer.limit());
            }
            C(l(str));
            I(str, byteBuffer);
        } catch (BufferOverflowException e) {
            com.google.android.gms.internal.cast.b5 b5Var = new com.google.android.gms.internal.cast.b5(byteBuffer.position(), byteBuffer.limit());
            b5Var.initCause(e);
            throw b5Var;
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
    public void onStateChanged(boolean z10, int i10) {
        d7 d7Var = (d7) this.f307b;
        a7 a7Var = d7Var.M;
        h71 h71Var = d7Var.f4534x;
        if (h71Var == null) {
            return;
        }
        if (h71Var.y()) {
            AndroidUtilities.runOnUIThread(a7Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(a7Var);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        f2 f2Var;
        f1 b10;
        d6.a aVar = (d6.a) this.f307b;
        Bundle bundle = (Bundle) obj;
        if (r0.f6478j) {
            Context context = aVar.f7512a;
            r rVar = aVar.f7515f;
            r0 r0Var = new r0(context, rVar, aVar.f7514c, aVar.f7518j, aVar.f7516g);
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
            String t10 = p6.t(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            r0Var.h = i11;
            l5.t.b(context);
            r0Var.f6483g = l5.t.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), b0.f6258a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                r0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(t10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                e.f6183c = new j0(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                e.d = new k6.c[]{y.f4069c};
                e.f6182b = false;
                e.f6181a = 8426;
                Task e7 = rVar.e(0, e.a());
                ?? obj2 = new Object();
                obj2.f12911b = r0Var;
                obj2.f12912c = packageName;
                obj2.f12910a = i10;
                obj2.d = sharedPreferences;
                e7.addOnSuccessListener(obj2);
            }
            if (z10) {
                n6.l.h(sharedPreferences);
                g6.b bVar = f2.f6374i;
                synchronized (f2.class) {
                    try {
                        if (f2.f6376k == null) {
                            f2.f6376k = new f2(sharedPreferences, r0Var, packageName);
                        }
                        f2Var = f2.f6376k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = f2Var.f6379c;
                SharedPreferences sharedPreferences2 = f2Var.f6378b;
                HashSet hashSet = f2Var.f6380f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = f2Var.f6381g;
                hashSet2.clear();
                f2Var.h = 0L;
                String str2 = f2.f6375j;
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
                    n6.l.h(f2Var.e);
                    n6.l.h(f2Var.d);
                    f2Var.e.post(f2Var.d);
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
        e2 e2Var = ((d7) this.f307b).f4532w;
        if (e2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(e2Var.f41373y0 - f10) >= 1.0E-4f) {
                e2Var.f41373y0 = f10;
                e2Var.requestLayout();
            }
        }
    }

    @Override
    public void p(String str, long j3, long j10, long j11) {
        e6.p pVar = (e6.p) this.f307b;
        try {
            pVar.a(new e6.o(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.f8013k;
            Log.e(bVar.f9430a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = pVar.f8037q.f8019i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    @Override
    public void p0(Object obj) {
        int i10 = this.f306a;
        Object obj2 = this.f307b;
        switch (i10) {
            case 3:
                p pVar = (p) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(2131689613));
                    }
                    x xVar = pVar.f2068l0;
                    if (!xVar.f2084n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = xVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new androidx.biometric.g(pVar, 0));
                    }
                    x xVar2 = pVar.f2068l0;
                    if (xVar2.f2091u == null) {
                        xVar2.f2091u = new z();
                    }
                    x.h(xVar2.f2091u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) obj2;
                if (((androidx.lifecycle.t) obj) != null && pVar2.f2470r0) {
                    pVar2.getClass();
                    throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public Object p2() {
        Type type = (Type) this.f307b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumSet type: " + type.toString());
    }

    @Override
    public boolean q(i1 i1Var) {
        return false;
    }

    @Override
    public z3.d r(int i10, int i11, byte[] bArr) {
        return w.f.a(this, bArr, i11);
    }

    public void s(int i10, byte[] bArr) {
        G(i10, 2);
        C(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f307b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new com.google.android.gms.internal.cast.b5(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public boolean t(i1 i1Var) {
        return false;
    }

    public void u(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f307b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new com.google.android.gms.internal.cast.b5(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public boolean v(l.k kVar) {
        Window.Callback callback = ((g.s) this.f307b).f9298f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public a0.i w() {
        switch (this.f306a) {
            case 22:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void y(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.y(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public void z() {
        ((m0) this.f307b).e.invalidate();
    }

    public m(Object obj, int i10) {
        this.f306a = i10;
        this.f307b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public m(byte[] bArr, int i10) {
        this.f306a = 14;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f307b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public m(Context context) {
        this.f306a = 8;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f307b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public m(int i10) {
        this.f306a = i10;
        switch (i10) {
            case 25:
                this.f307b = new v();
                return;
            default:
                this.f307b = new m(fc.a.h, 19);
                return;
        }
    }

    public m(LaunchActivity launchActivity, Executor executor, v7.n nVar) {
        this.f306a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            l0 s10 = launchActivity.s();
            x xVar = (x) new aa.a(launchActivity).m(x.class);
            this.f307b = s10;
            xVar.d = executor;
            xVar.e = nVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void k0() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void x() {
    }

    private final void i(ArrayList arrayList) {
    }

    @Override
    public void L(boolean z10) {
    }

    @Override
    public void g0(boolean z10) {
    }

    @Override
    public void m(i1 i1Var) {
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
    public void onError(h71 h71Var, Exception exc) {
    }
}
