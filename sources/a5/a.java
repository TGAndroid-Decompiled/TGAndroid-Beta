package a5;

import a0.m;
import ai.c9;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import b2.s;
import c3.h;
import c3.i;
import c3.p;
import c3.u;
import c5.v;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.c0;
import com.google.firebase.messaging.n;
import e2.b0;
import e9.f1;
import e9.j0;
import e9.k0;
import e9.m0;
import g2.g;
import i9.r;
import ia.d;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import k6.c;
import m.p3;
import m4.a0;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ak;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.fa;
import qi.f;
import rg.s1;
import u2.f0;
import u2.h0;
import u2.i0;
import u2.l0;
import u2.t;
import v7.d8;
import v7.d9;
import v7.e8;
import v7.j;
import v7.k;
import v7.k6;
import v7.t6;
import v7.t8;
import x7.d0;
import x7.e0;
import x7.i9;
import x7.ia;
import x7.p7;
import yf.e;
import yf.z;
import z7.ib;
import z7.we;
import z7.x;
import z7.y;
import z7.zf;
public class a implements i, r {
    public final int f298a;
    public int f299b;
    public Object f300c;
    public Object d;

    public a(char c10, int i10) {
        this.f298a = i10;
    }

    public static a5.a f(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: a5.a.f(android.content.res.Resources, int, android.content.res.Resources$Theme):a5.a");
    }

    public void A(String str, l lVar) {
        Map map = (Map) this.f300c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f299b > 0) {
                new c0(Looper.getMainLooper(), 4).post(new v(this, lVar, str, false, 5));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a4.a.q("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public byte[] B() {
        j jVar;
        d dVar;
        e0 e0Var;
        d dVar2;
        y yVar;
        d dVar3;
        switch (this.f298a) {
            case 22:
                d9 d9Var = d9.f47917c;
                f fVar = (f) this.f300c;
                ((d8) this.d).h = false;
                d8 d8Var = (d8) this.d;
                d8Var.f47911f = Boolean.FALSE;
                fVar.f45541a = new e8(d8Var);
                try {
                    d9.b();
                    k6 k6Var = new k6(fVar);
                    k kVar = new k(0);
                    d9Var.a(kVar);
                    HashMap hashMap = new HashMap((HashMap) kVar.f47993b);
                    HashMap hashMap2 = new HashMap((HashMap) kVar.f47994c);
                    v7.i iVar = (v7.i) kVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jVar = new j(byteArrayOutputStream, hashMap, hashMap2, iVar);
                        dVar = (d) hashMap.get(k6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar != null) {
                        dVar.a(k6Var, jVar);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(k6.class)));
                } catch (UnsupportedEncodingException e7) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
                }
            case 23:
            default:
                zf zfVar = zf.f53072c;
                p3 p3Var = (p3) this.f300c;
                ((d8) this.d).h = false;
                d8 d8Var2 = (d8) this.d;
                d8Var2.f47911f = Boolean.FALSE;
                p3Var.f15859a = new we(d8Var2);
                try {
                    zf.b();
                    ib ibVar = new ib(p3Var);
                    k kVar2 = new k(13);
                    zfVar.a(kVar2);
                    HashMap hashMap3 = new HashMap((HashMap) kVar2.f47993b);
                    HashMap hashMap4 = new HashMap((HashMap) kVar2.f47994c);
                    x xVar = (x) kVar2.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        yVar = new y(byteArrayOutputStream2, hashMap3, hashMap4, xVar);
                        dVar3 = (d) hashMap3.get(ib.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar3 != null) {
                        dVar3.a(ibVar, yVar);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(ib.class)));
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 24:
                ia iaVar = ia.f49537c;
                n nVar = (n) this.f300c;
                ((d8) this.d).h = false;
                d8 d8Var3 = (d8) this.d;
                d8Var3.f47911f = Boolean.FALSE;
                nVar.f7905a = new i9(d8Var3);
                try {
                    ia.b();
                    p7 p7Var = new p7(nVar);
                    k kVar3 = new k(7);
                    iaVar.a(kVar3);
                    HashMap hashMap5 = new HashMap((HashMap) kVar3.f47993b);
                    HashMap hashMap6 = new HashMap((HashMap) kVar3.f47994c);
                    d0 d0Var = (d0) kVar3.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        e0Var = new e0(byteArrayOutputStream3, hashMap5, hashMap6, d0Var);
                        dVar2 = (d) hashMap5.get(p7.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar2 != null) {
                        dVar2.a(p7Var, e0Var);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(p7.class)));
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
        }
    }

    public void C(Bundle bundle) {
        Bundle bundle2;
        this.f299b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f300c).entrySet()) {
            l lVar = (l) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lVar.onCreate(bundle2);
        }
    }

    public void D(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f300c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void a(int i10, int i11) {
        boolean z10;
        int i12 = (i11 << 16) + i10;
        if (this.f299b != i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f299b = i12;
        for (int i13 = 0; i13 < e.f50965y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new s1(bitmap, 19));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            z[] zVarArr = (z[]) this.f300c;
            if (zVarArr[i13] == null) {
                zVarArr[i13] = new z(i11 * i10 * 2);
            }
        }
    }

    public sa.b b() {
        if ("".isEmpty()) {
            return new sa.b((String) this.f300c, ((Long) this.d).longValue(), this.f299b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    @Override
    public h c(p pVar, long j3) {
        long j10;
        switch (this.f298a) {
            case 8:
                long position = pVar.getPosition();
                long l4 = l(pVar);
                long g10 = pVar.g();
                pVar.h(Math.max(6, ((u) this.f300c).f4107c));
                long l10 = l(pVar);
                long g11 = pVar.g();
                if (l4 <= j3 && l10 > j3) {
                    return new h(0, -9223372036854775807L, g10);
                }
                if (l10 <= j3) {
                    return new h(-2, l10, g11);
                }
                return new h(-1, l4, position);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                e2.v vVar = (e2.v) this.d;
                vVar.G(min);
                pVar.b(0, min, vVar.f8590a);
                int i10 = vVar.f8592c;
                long j11 = -1;
                long j12 = -1;
                long j13 = -9223372036854775807L;
                while (true) {
                    if (vVar.a() >= 188) {
                        byte[] bArr = vVar.f8590a;
                        int i11 = vVar.f8591b;
                        while (true) {
                            if (i11 < i10) {
                                j10 = -9223372036854775807L;
                                if (bArr[i11] != 71) {
                                    i11++;
                                }
                            } else {
                                j10 = -9223372036854775807L;
                            }
                        }
                        int i12 = i11 + 188;
                        if (i12 <= i10) {
                            long a2 = t8.a(vVar, i11, this.f299b);
                            if (a2 != j10) {
                                long b10 = ((b0) this.f300c).b(a2);
                                if (b10 > j3) {
                                    if (j13 == j10) {
                                        return new h(-1, b10, position2);
                                    }
                                    return new h(0, -9223372036854775807L, position2 + j12);
                                }
                                j13 = b10;
                                if (100000 + j13 > j3) {
                                    return new h(0, -9223372036854775807L, position2 + i11);
                                }
                                j12 = i11;
                            }
                            vVar.J(i12);
                            j11 = i12;
                        }
                    } else {
                        j10 = -9223372036854775807L;
                    }
                }
                if (j13 != j10) {
                    return new h(-2, j13, position2 + j11);
                }
                return h.d;
        }
    }

    public k0 d() {
        f1 f1Var;
        j0 j0Var = (j0) this.d;
        if (j0Var == null) {
            int i10 = this.f299b;
            Object[] objArr = (Object[]) this.f300c;
            if (i10 == 0) {
                f1Var = f1.h;
            } else if (i10 == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                f1Var = new f1(null, objArr, 1);
            } else {
                t6.e(i10, objArr.length >> 1);
                Object f7 = f1.f(objArr, i10, m0.t(i10), 0);
                if (f7 instanceof Object[]) {
                    Object[] objArr2 = (Object[]) f7;
                    this.d = (j0) objArr2[2];
                    Object obj = objArr2[0];
                    int intValue = ((Integer) objArr2[1]).intValue();
                    objArr = Arrays.copyOf(objArr, intValue * 2);
                    f7 = obj;
                    i10 = intValue;
                }
                f1Var = new f1(f7, objArr, i10);
            }
            j0 j0Var2 = (j0) this.d;
            if (j0Var2 == null) {
                return f1Var;
            }
            throw j0Var2.a();
        }
        throw j0Var.a();
    }

    public void e(int i10) {
        String str;
        int i11 = this.f299b;
        if (i10 == i11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        String str2 = "String";
        if (i11 == 0) {
            str = "String";
        } else if (i11 == 1) {
            str = "ArrayBuffer";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" expected, but got ");
        if (i10 != 0) {
            if (i10 == 1) {
                str2 = "ArrayBuffer";
            } else {
                str2 = "Unknown";
            }
        }
        sb2.append(str2);
        throw new IllegalStateException(sb2.toString());
    }

    @Override
    public void g() {
        switch (this.f298a) {
            case 8:
                return;
            default:
                e2.v vVar = (e2.v) this.d;
                byte[] bArr = e2.d0.f8539b;
                vVar.getClass();
                vVar.H(bArr.length, bArr);
                return;
        }
    }

    public void i(String str, Object... objArr) {
        if (this.f299b <= 3) {
            String str2 = (String) this.f300c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public void j(e2.h hVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            u2.j0 j0Var = (u2.j0) it.next();
            e2.d0.U(j0Var.f47312a, new i0(0, hVar, j0Var.f47313b));
        }
    }

    public void k(int i10, s sVar, int i11, Object obj, long j3) {
        j(new rg.x(8, this, new u2.b0(1, i10, sVar, i11, obj, e2.d0.e0(j3), -9223372036854775807L)));
    }

    public long l(p pVar) {
        int d;
        c3.s sVar = (c3.s) this.d;
        u uVar = (u) this.f300c;
        while (pVar.g() < pVar.getLength() - 6) {
            int i10 = this.f299b;
            long g10 = pVar.g();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean b10 = false;
            pVar.b(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                pVar.m();
                pVar.h((int) (g10 - pVar.getPosition()));
            } else {
                e2.v vVar = new e2.v(16);
                System.arraycopy(bArr, 0, vVar.f8590a, 0, 2);
                byte[] bArr2 = vVar.f8590a;
                while (i11 < 14 && (d = pVar.d(2 + i11, 14 - i11, bArr2)) != -1) {
                    i11 += d;
                }
                vVar.I(i11);
                pVar.m();
                pVar.h((int) (g10 - pVar.getPosition()));
                b10 = c3.b.b(vVar, uVar, i10, sVar);
            }
            if (b10) {
                break;
            }
            pVar.h(1);
        }
        if (pVar.g() >= pVar.getLength() - 6) {
            pVar.h((int) (pVar.getLength() - pVar.g()));
            return uVar.f4112j;
        }
        return sVar.f4101a;
    }

    public Object m(int i10) {
        SparseArray sparseArray = (SparseArray) this.f300c;
        if (this.f299b == -1) {
            this.f299b = 0;
        }
        while (true) {
            int i11 = this.f299b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f299b--;
        }
        while (this.f299b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f299b + 1)) {
            this.f299b++;
        }
        return sparseArray.valueAt(this.f299b);
    }

    public boolean n() {
        ColorStateList colorStateList;
        if (((Shader) this.f300c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void o(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        j(new h0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), 1));
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        a0 a0Var = ((m4.k0) this.d).f16218g;
        Handler handler = a0Var.f16054l;
        m4.r rVar = (m4.r) this.f300c;
        e2.d0.U(handler, new ki.h0(a0Var, rVar, new c9(this, this.f299b, list, rVar, 6)));
    }

    public void p(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        j(new h0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), 0));
    }

    public void q(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, IOException iOException, boolean z10) {
        j(new ak(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), iOException, z10));
    }

    public void r(t tVar, int i10, IOException iOException, boolean z10) {
        q(tVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void s(t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, int i13) {
        j(new fa(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), i13, 10));
    }

    public a u(Object obj, Object obj2) {
        int i10 = (this.f299b + 1) * 2;
        Object[] objArr = (Object[]) this.f300c;
        if (i10 > objArr.length) {
            this.f300c = Arrays.copyOf(objArr, w.h(objArr.length, i10));
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = (Object[]) this.f300c;
                int i11 = this.f299b;
                int i12 = i11 * 2;
                objArr2[i12] = obj;
                objArr2[i12 + 1] = obj2;
                this.f299b = i11 + 1;
                return this;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    public void v(int i10) {
        w(i10, 200L, tr.f31215f);
    }

    public void w(int i10, long j3, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f300c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f300c).cancel();
        }
        int[] iArr = new int[1];
        this.f299b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f300c = ofInt;
        ofInt.addUpdateListener(new ai.x(24, this, iArr));
        ((ValueAnimator) this.f300c).addListener(new fi(this, i10, iArr, 1));
        ((ValueAnimator) this.f300c).setDuration(j3);
        ((ValueAnimator) this.f300c).setInterpolator(interpolator);
        ((ValueAnimator) this.f300c).start();
    }

    public List x(CharSequence charSequence) {
        charSequence.getClass();
        a6.i iVar = (a6.i) this.d;
        iVar.getClass();
        d9.h hVar = new d9.h(iVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void y(int i10, long j3, long j10) {
        u2.b0 b0Var = new u2.b0(1, i10, null, 3, null, e2.d0.e0(j3), e2.d0.e0(j10));
        f0 f0Var = (f0) this.f300c;
        f0Var.getClass();
        j(new v50(this, f0Var, b0Var, 10));
    }

    public void z(String str, c cVar) {
        int i10 = this.f299b + 1;
        Object[] objArr = (Object[]) this.f300c;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            if (i11 >= 0) {
                int i12 = length + (length >> 1) + 1;
                if (i12 < i11) {
                    int highestOneBit = Integer.highestOneBit(i11 - 1);
                    i12 = highestOneBit + highestOneBit;
                }
                if (i12 < 0) {
                    i12 = Integer.MAX_VALUE;
                }
                this.f300c = Arrays.copyOf(objArr, i12);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f300c;
        int i13 = this.f299b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f299b = i13 + 1;
    }

    public a(int i10, int i11) {
        this.f298a = i11;
        switch (i11) {
            case 5:
                this.f300c = new Object[i10 * 2];
                this.f299b = 0;
                return;
            default:
                this.f299b = i10;
                return;
        }
    }

    public a(Object obj, int i10, Object obj2, int i11) {
        this.f298a = i11;
        this.d = obj;
        this.f299b = i10;
        this.f300c = obj2;
    }

    public a(int i10, byte b10) {
        this.f298a = i10;
        switch (i10) {
            case 13:
                this.f300c = new gh.a();
                return;
            case 19:
                this.f300c = new Object[8];
                this.f299b = 0;
                return;
            case 25:
                int i11 = e.f50965y;
                this.f300c = new z[i11];
                this.d = new Bitmap[i11];
                return;
            default:
                this.f300c = DesugarCollections.synchronizedMap(new m(0));
                this.f299b = 0;
                return;
        }
    }

    public a(n nVar, int i10) {
        this.f298a = 24;
        this.d = new Object();
        this.f300c = nVar;
        ia.b();
        this.f299b = i10;
    }

    public a(String str, String[] strArr) {
        String sb2;
        this.f298a = 17;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.d = sb2;
        this.f300c = str;
        int i10 = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.f300c, i10)) {
            i10++;
        }
        this.f299b = i10;
    }

    private final void t() {
    }

    @Override
    public void h(Throwable th2) {
    }

    public a(p3 p3Var, int i10) {
        this.f298a = 26;
        this.d = new Object();
        this.f300c = p3Var;
        zf.b();
        this.f299b = i10;
    }

    public a(f fVar, int i10) {
        this.f298a = 22;
        this.d = new Object();
        this.f300c = fVar;
        d9.b();
        this.f299b = i10;
    }

    public a(zl0 zl0Var) {
        this.f298a = 15;
        this.d = zl0Var;
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f298a = 16;
        this.f300c = rectF;
        this.f299b = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (((File) this.d) == null) {
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            FileOutputStream fileOutputStream = new FileOutputStream((File) this.d);
            Deflater deflater = new Deflater(1, true);
            deflater.setInput(array, byteBuffer.arrayOffset(), byteBuffer.remaining());
            deflater.finish();
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                fileOutputStream.write(bArr, 0, deflater.deflate(bArr));
            }
            deflater.end();
            fileOutputStream.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public a(l0 l0Var) {
        this.f298a = 21;
        this.f300c = new SparseArray();
        this.d = l0Var;
        this.f299b = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i10) {
        this.f298a = 7;
        this.f300c = shader;
        this.d = colorStateList;
        this.f299b = i10;
    }

    public a(String str) {
        this.f298a = 0;
        this.f300c = str;
        this.d = null;
        this.f299b = 0;
    }

    public a(u uVar, int i10) {
        this.f298a = 8;
        this.f300c = uVar;
        this.f299b = i10;
        this.d = new Object();
    }

    public a(int i10, b0 b0Var) {
        this.f298a = 10;
        this.f299b = i10;
        this.f300c = b0Var;
        this.d = new e2.v();
    }

    public a(byte[] bArr) {
        this.f298a = 0;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f300c = null;
        this.f299b = 1;
    }

    public a(g gVar) {
        this.f298a = 11;
        b2.p pVar = new b2.p(6);
        pVar.f3427c = new qb.b(28);
        this.d = pVar;
        this.f300c = gVar;
        this.f299b = 1;
    }

    public a(a6.i iVar) {
        this.f298a = 4;
        this.d = iVar;
        this.f300c = d9.c.f8161a;
        this.f299b = Integer.MAX_VALUE;
    }

    public a(m4.k0 k0Var, m4.r rVar, int i10) {
        this.f298a = 12;
        this.d = k0Var;
        this.f300c = rVar;
        this.f299b = i10;
    }
}
