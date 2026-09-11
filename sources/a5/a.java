package a5;

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
import bi.k8;
import bi.t2;
import c3.h;
import c3.i;
import c3.p;
import c3.u;
import c5.v;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.c0;
import com.google.firebase.messaging.n;
import di.s7;
import e2.b0;
import e9.f1;
import e9.j0;
import e9.k0;
import e9.m0;
import fg.f;
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
import ji.b5;
import m.p3;
import m2.t;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ua0;
import org.telegram.ui.web.g1;
import sg.p0;
import u2.f0;
import u2.h0;
import u2.i0;
import v7.a6;
import v7.c8;
import v7.d8;
import v7.d9;
import v7.j;
import v7.k6;
import v7.q8;
import v7.t6;
import x7.d0;
import x7.e0;
import x7.i9;
import x7.ia;
import x7.p7;
import yf.a0;
import yf.e;
import z7.ib;
import z7.we;
import z7.x;
import z7.y;
import z7.zf;
public class a implements i, r {
    public final int f284a;
    public int f285b;
    public Object f286c;
    public Object d;

    public a(char c10, int i10) {
        this.f284a = i10;
    }

    public static a5.a e(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: a5.a.e(android.content.res.Resources, int, android.content.res.Resources$Theme):a5.a");
    }

    public void A(String str, l lVar) {
        Map map = (Map) this.f286c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f285b > 0) {
                new c0(Looper.getMainLooper(), 4).post(new v(this, lVar, str, false, 5));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a4.a.p("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public byte[] B() {
        j jVar;
        d dVar;
        e0 e0Var;
        d dVar2;
        y yVar;
        d dVar3;
        switch (this.f284a) {
            case 22:
                d9 d9Var = d9.f47432c;
                f fVar = (f) this.f286c;
                ((c8) this.d).h = false;
                c8 c8Var = (c8) this.d;
                c8Var.f47410f = Boolean.FALSE;
                fVar.f9492a = new d8(c8Var);
                try {
                    d9.b();
                    k6 k6Var = new k6(fVar);
                    t tVar = new t(27);
                    d9Var.a(tVar);
                    HashMap hashMap = new HashMap((HashMap) tVar.f15817b);
                    HashMap hashMap2 = new HashMap((HashMap) tVar.f15818c);
                    v7.i iVar = (v7.i) tVar.d;
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
                zf zfVar = zf.f51373c;
                p3 p3Var = (p3) this.f286c;
                ((c8) this.d).h = false;
                c8 c8Var2 = (c8) this.d;
                c8Var2.f47410f = Boolean.FALSE;
                p3Var.f15634a = new we(c8Var2);
                try {
                    zf.b();
                    ib ibVar = new ib(p3Var);
                    a6 a6Var = new a6(10);
                    zfVar.a(a6Var);
                    HashMap hashMap3 = new HashMap((HashMap) a6Var.f47378b);
                    HashMap hashMap4 = new HashMap((HashMap) a6Var.f47379c);
                    x xVar = (x) a6Var.d;
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
                ia iaVar = ia.f49040c;
                n nVar = (n) this.f286c;
                ((c8) this.d).h = false;
                c8 c8Var3 = (c8) this.d;
                c8Var3.f47410f = Boolean.FALSE;
                nVar.f6374a = new i9(c8Var3);
                try {
                    ia.b();
                    p7 p7Var = new p7(nVar);
                    a6 a6Var2 = new a6(4);
                    iaVar.a(a6Var2);
                    HashMap hashMap5 = new HashMap((HashMap) a6Var2.f47378b);
                    HashMap hashMap6 = new HashMap((HashMap) a6Var2.f47379c);
                    d0 d0Var = (d0) a6Var2.d;
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
        this.f285b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f286c).entrySet()) {
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
            for (Map.Entry entry : ((Map) this.f286c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void a(int i10, int i11) {
        boolean z10;
        int i12 = (i11 << 16) + i10;
        if (this.f285b != i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f285b = i12;
        for (int i13 = 0; i13 < e.f50067y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new p0(bitmap, 14));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            a0[] a0VarArr = (a0[]) this.f286c;
            if (a0VarArr[i13] == null) {
                a0VarArr[i13] = new a0(i11 * i10 * 2);
            }
        }
    }

    public sa.b b() {
        if ("".isEmpty()) {
            return new sa.b((String) this.f286c, ((Long) this.d).longValue(), this.f285b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public k0 c() {
        f1 f1Var;
        j0 j0Var = (j0) this.d;
        if (j0Var == null) {
            int i10 = this.f285b;
            Object[] objArr = (Object[]) this.f286c;
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

    public void d(int i10) {
        String str;
        int i11 = this.f285b;
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

    public void f(String str, Object... objArr) {
        if (this.f285b <= 3) {
            String str2 = (String) this.f286c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    @Override
    public h g(p pVar, long j3) {
        long j10;
        switch (this.f284a) {
            case 8:
                long position = pVar.getPosition();
                long k10 = k(pVar);
                long k11 = pVar.k();
                pVar.l(Math.max(6, ((u) this.f286c).f4300c));
                long k12 = k(pVar);
                long k13 = pVar.k();
                if (k10 <= j3 && k12 > j3) {
                    return new h(0, -9223372036854775807L, k11);
                }
                if (k12 <= j3) {
                    return new h(-2, k12, k13);
                }
                return new h(-1, k10, position);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                e2.v vVar = (e2.v) this.d;
                vVar.G(min);
                pVar.b(0, min, vVar.f8789a);
                int i10 = vVar.f8791c;
                long j11 = -1;
                long j12 = -1;
                long j13 = -9223372036854775807L;
                while (true) {
                    if (vVar.a() >= 188) {
                        byte[] bArr = vVar.f8789a;
                        int i11 = vVar.f8790b;
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
                            long a2 = q8.a(vVar, i11, this.f285b);
                            if (a2 != j10) {
                                long b10 = ((b0) this.f286c).b(a2);
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

    public void i(e2.h hVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            u2.j0 j0Var = (u2.j0) it.next();
            e2.d0.U(j0Var.f46710a, new g1(23, hVar, j0Var.f46711b));
        }
    }

    public void j(int i10, s sVar, int i11, Object obj, long j3) {
        i(new t2(11, this, new u2.b0(1, i10, sVar, i11, obj, e2.d0.e0(j3), -9223372036854775807L)));
    }

    public long k(p pVar) {
        int h;
        c3.s sVar = (c3.s) this.d;
        u uVar = (u) this.f286c;
        while (pVar.k() < pVar.getLength() - 6) {
            int i10 = this.f285b;
            long k10 = pVar.k();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean b10 = false;
            pVar.b(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                pVar.q();
                pVar.l((int) (k10 - pVar.getPosition()));
            } else {
                e2.v vVar = new e2.v(16);
                System.arraycopy(bArr, 0, vVar.f8789a, 0, 2);
                byte[] bArr2 = vVar.f8789a;
                while (i11 < 14 && (h = pVar.h(2 + i11, 14 - i11, bArr2)) != -1) {
                    i11 += h;
                }
                vVar.I(i11);
                pVar.q();
                pVar.l((int) (k10 - pVar.getPosition()));
                b10 = c3.b.b(vVar, uVar, i10, sVar);
            }
            if (b10) {
                break;
            }
            pVar.l(1);
        }
        if (pVar.k() >= pVar.getLength() - 6) {
            pVar.l((int) (pVar.getLength() - pVar.k()));
            return uVar.f4305j;
        }
        return sVar.f4294a;
    }

    public Object l(int i10) {
        SparseArray sparseArray = (SparseArray) this.f286c;
        if (this.f285b == -1) {
            this.f285b = 0;
        }
        while (true) {
            int i11 = this.f285b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f285b--;
        }
        while (this.f285b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f285b + 1)) {
            this.f285b++;
        }
        return sparseArray.valueAt(this.f285b);
    }

    public boolean m() {
        ColorStateList colorStateList;
        if (((Shader) this.f286c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void n(u2.t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        i(new h0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), 1));
    }

    public void o(u2.t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        i(new h0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), 0));
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        m4.a0 a0Var = ((m4.k0) this.d).f15970g;
        Handler handler = a0Var.f15835l;
        m4.r rVar = (m4.r) this.f286c;
        e2.d0.U(handler, new b5(a0Var, rVar, new k8(this, this.f285b, list, rVar, 6)));
    }

    public void p(u2.t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, IOException iOException, boolean z10) {
        i(new i0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), iOException, z10));
    }

    public void q(u2.t tVar, int i10, IOException iOException, boolean z10) {
        p(tVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void r(u2.t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, int i13) {
        i(new ua0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), i13, 1));
    }

    public a t(Object obj, Object obj2) {
        int i10 = (this.f285b + 1) * 2;
        Object[] objArr = (Object[]) this.f286c;
        if (i10 > objArr.length) {
            this.f286c = Arrays.copyOf(objArr, w.h(objArr.length, i10));
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = (Object[]) this.f286c;
                int i11 = this.f285b;
                int i12 = i11 * 2;
                objArr2[i12] = obj;
                objArr2[i12 + 1] = obj2;
                this.f285b = i11 + 1;
                return this;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    public void u(int i10) {
        v(i10, 200L, pr.f29466f);
    }

    public void v(int i10, long j3, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f286c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f286c).cancel();
        }
        int[] iArr = new int[1];
        this.f285b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f286c = ofInt;
        ofInt.addUpdateListener(new ah.m0(25, this, iArr));
        ((ValueAnimator) this.f286c).addListener(new gi(this, i10, iArr, 1));
        ((ValueAnimator) this.f286c).setDuration(j3);
        ((ValueAnimator) this.f286c).setInterpolator(interpolator);
        ((ValueAnimator) this.f286c).start();
    }

    @Override
    public void w() {
        switch (this.f284a) {
            case 8:
                return;
            default:
                e2.v vVar = (e2.v) this.d;
                byte[] bArr = e2.d0.f8738b;
                vVar.getClass();
                vVar.H(bArr.length, bArr);
                return;
        }
    }

    public List x(CharSequence charSequence) {
        charSequence.getClass();
        xa.c cVar = (xa.c) this.d;
        cVar.getClass();
        d9.i iVar = new d9.i(cVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (iVar.hasNext()) {
            arrayList.add((String) iVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void y(int i10, long j3, long j10) {
        u2.b0 b0Var = new u2.b0(1, i10, null, 3, null, e2.d0.e0(j3), e2.d0.e0(j10));
        f0 f0Var = (f0) this.f286c;
        f0Var.getClass();
        i(new s7(this, f0Var, b0Var, 3));
    }

    public void z(String str, k6.c cVar) {
        int i10 = this.f285b + 1;
        Object[] objArr = (Object[]) this.f286c;
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
                this.f286c = Arrays.copyOf(objArr, i12);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f286c;
        int i13 = this.f285b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f285b = i13 + 1;
    }

    public a(int i10, int i11) {
        this.f284a = i11;
        switch (i11) {
            case 5:
                this.f286c = new Object[i10 * 2];
                this.f285b = 0;
                return;
            default:
                this.f285b = i10;
                return;
        }
    }

    public a(Object obj, int i10, Object obj2, int i11) {
        this.f284a = i11;
        this.d = obj;
        this.f285b = i10;
        this.f286c = obj2;
    }

    public a(int i10, byte b10) {
        this.f284a = i10;
        switch (i10) {
            case 13:
                this.f286c = new hh.a();
                return;
            case 19:
                this.f286c = new Object[8];
                this.f285b = 0;
                return;
            case 25:
                int i11 = e.f50067y;
                this.f286c = new a0[i11];
                this.d = new Bitmap[i11];
                return;
            default:
                this.f286c = DesugarCollections.synchronizedMap(new a0.l(0));
                this.f285b = 0;
                return;
        }
    }

    public a(n nVar, int i10) {
        this.f284a = 24;
        this.d = new Object();
        this.f286c = nVar;
        ia.b();
        this.f285b = i10;
    }

    public a(f fVar, int i10) {
        this.f284a = 22;
        this.d = new Object();
        this.f286c = fVar;
        d9.b();
        this.f285b = i10;
    }

    public a(String str, String[] strArr) {
        String sb2;
        this.f284a = 16;
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
        this.f286c = str;
        int i10 = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.f286c, i10)) {
            i10++;
        }
        this.f285b = i10;
    }

    private final void s() {
    }

    @Override
    public void h(Throwable th2) {
    }

    public a(p3 p3Var, int i10) {
        this.f284a = 26;
        this.d = new Object();
        this.f286c = p3Var;
        zf.b();
        this.f285b = i10;
    }

    public a(ll0 ll0Var) {
        this.f284a = 15;
        this.d = ll0Var;
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f284a = 17;
        this.f286c = rectF;
        this.f285b = i10;
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

    public a(org.telegram.ui.web.n nVar) {
        this.f284a = 21;
        this.f286c = new SparseArray();
        this.d = nVar;
        this.f285b = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i10) {
        this.f284a = 7;
        this.f286c = shader;
        this.d = colorStateList;
        this.f285b = i10;
    }

    public a(String str) {
        this.f284a = 0;
        this.f286c = str;
        this.d = null;
        this.f285b = 0;
    }

    public a(u uVar, int i10) {
        this.f284a = 8;
        this.f286c = uVar;
        this.f285b = i10;
        this.d = new Object();
    }

    public a(int i10, b0 b0Var) {
        this.f284a = 10;
        this.f285b = i10;
        this.f286c = b0Var;
        this.d = new e2.v();
    }

    public a(byte[] bArr) {
        this.f284a = 0;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f286c = null;
        this.f285b = 1;
    }

    public a(g gVar) {
        this.f284a = 11;
        b2.p pVar = new b2.p(6);
        pVar.f2233c = new rb.a(28);
        this.d = pVar;
        this.f286c = gVar;
        this.f285b = 1;
    }

    public a(xa.c cVar) {
        this.f284a = 4;
        this.d = cVar;
        this.f286c = d9.c.f6630a;
        this.f285b = Integer.MAX_VALUE;
    }

    public a(m4.k0 k0Var, m4.r rVar, int i10) {
        this.f284a = 12;
        this.d = k0Var;
        this.f286c = rVar;
        this.f285b = i10;
    }
}
