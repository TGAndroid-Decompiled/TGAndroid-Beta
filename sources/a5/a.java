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
import c3.i;
import c3.p;
import c3.u;
import com.google.android.gms.common.api.internal.l;
import com.google.firebase.messaging.n;
import di.q;
import e2.b0;
import e2.h;
import e2.v;
import e9.f1;
import e9.j0;
import e9.k0;
import e9.m0;
import g2.g;
import gg.t1;
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
import ki.f;
import m.e3;
import m.r3;
import m4.w;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.ta0;
import qg.q0;
import u2.c0;
import u2.g0;
import u2.i0;
import u2.l0;
import v7.a6;
import v7.d8;
import v7.d9;
import v7.e8;
import v7.j;
import v7.k6;
import v7.t6;
import v7.t8;
import x7.d0;
import x7.e0;
import x7.i9;
import x7.ia;
import x7.p7;
import xf.a0;
import xf.e;
import z7.ib;
import z7.we;
import z7.x;
import z7.y;
import z7.zf;
public class a implements i, r {
    public final int f274a;
    public int f275b;
    public Object f276c;
    public Object d;

    public a(char c10, int i10) {
        this.f274a = i10;
    }

    public static a5.a e(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: a5.a.e(android.content.res.Resources, int, android.content.res.Resources$Theme):a5.a");
    }

    public byte[] A() {
        j jVar;
        d dVar;
        e0 e0Var;
        d dVar2;
        y yVar;
        d dVar3;
        switch (this.f274a) {
            case 22:
                d9 d9Var = d9.f42976c;
                f fVar = (f) this.f276c;
                ((d8) this.d).h = false;
                d8 d8Var = (d8) this.d;
                d8Var.f42970f = Boolean.FALSE;
                fVar.f12538a = new e8(d8Var);
                try {
                    d9.b();
                    k6 k6Var = new k6(fVar);
                    e3 e3Var = new e3(27);
                    d9Var.a(e3Var);
                    HashMap hashMap = new HashMap((HashMap) e3Var.f13001b);
                    HashMap hashMap2 = new HashMap((HashMap) e3Var.f13002c);
                    v7.i iVar = (v7.i) e3Var.d;
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
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 23:
            default:
                zf zfVar = zf.f47853c;
                r3 r3Var = (r3) this.f276c;
                ((d8) this.d).h = false;
                d8 d8Var2 = (d8) this.d;
                d8Var2.f42970f = Boolean.FALSE;
                r3Var.f13137a = new we(d8Var2);
                try {
                    zf.b();
                    ib ibVar = new ib(r3Var);
                    a6 a6Var = new a6(10);
                    zfVar.a(a6Var);
                    HashMap hashMap3 = new HashMap((HashMap) a6Var.f42934b);
                    HashMap hashMap4 = new HashMap((HashMap) a6Var.f42935c);
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
                } catch (UnsupportedEncodingException e7) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
                }
            case 24:
                ia iaVar = ia.f44807c;
                n nVar = (n) this.f276c;
                ((d8) this.d).h = false;
                d8 d8Var3 = (d8) this.d;
                d8Var3.f42970f = Boolean.FALSE;
                nVar.f6103a = new i9(d8Var3);
                try {
                    ia.b();
                    p7 p7Var = new p7(nVar);
                    a6 a6Var2 = new a6(4);
                    iaVar.a(a6Var2);
                    HashMap hashMap5 = new HashMap((HashMap) a6Var2.f42934b);
                    HashMap hashMap6 = new HashMap((HashMap) a6Var2.f42935c);
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
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
        }
    }

    public void B(Bundle bundle) {
        Bundle bundle2;
        this.f275b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f276c).entrySet()) {
            l lVar = (l) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lVar.onCreate(bundle2);
        }
    }

    public void C(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f276c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override
    public void D() {
        switch (this.f274a) {
            case 8:
                return;
            default:
                v vVar = (v) this.d;
                byte[] bArr = e2.d0.f7189b;
                vVar.getClass();
                vVar.H(bArr.length, bArr);
                return;
        }
    }

    public void a(int i10, int i11) {
        boolean z10;
        int i12 = (i11 << 16) + i10;
        if (this.f275b != i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f275b = i12;
        for (int i13 = 0; i13 < e.f45111y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new q0(bitmap, 25));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            a0[] a0VarArr = (a0[]) this.f276c;
            if (a0VarArr[i13] == null) {
                a0VarArr[i13] = new a0(i11 * i10 * 2);
            }
        }
    }

    public sa.b b() {
        if ("".isEmpty()) {
            return new sa.b((String) this.f276c, ((Long) this.d).longValue(), this.f275b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public k0 c() {
        f1 f1Var;
        j0 j0Var = (j0) this.d;
        if (j0Var == null) {
            int i10 = this.f275b;
            Object[] objArr = (Object[]) this.f276c;
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
        int i11 = this.f275b;
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
        if (this.f275b <= 3) {
            String str2 = (String) this.f276c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public void g(h hVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            e2.d0.U(l0Var.f42373a, new u2.k0(0, hVar, l0Var.f42374b));
        }
    }

    public void i(int i10, s sVar, int i11, Object obj, long j3) {
        g(new m4.q0(10, this, new c0(1, i10, sVar, i11, obj, e2.d0.e0(j3), -9223372036854775807L)));
    }

    public long j(p pVar) {
        int e;
        c3.s sVar = (c3.s) this.d;
        u uVar = (u) this.f276c;
        while (pVar.h() < pVar.getLength() - 6) {
            int i10 = this.f275b;
            long h = pVar.h();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean b10 = false;
            pVar.b(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                pVar.p();
                pVar.j((int) (h - pVar.getPosition()));
            } else {
                v vVar = new v(16);
                System.arraycopy(bArr, 0, vVar.f7234a, 0, 2);
                byte[] bArr2 = vVar.f7234a;
                while (i11 < 14 && (e = pVar.e(2 + i11, 14 - i11, bArr2)) != -1) {
                    i11 += e;
                }
                vVar.I(i11);
                pVar.p();
                pVar.j((int) (h - pVar.getPosition()));
                b10 = c3.b.b(vVar, uVar, i10, sVar);
            }
            if (b10) {
                break;
            }
            pVar.j(1);
        }
        if (pVar.h() >= pVar.getLength() - 6) {
            pVar.j((int) (pVar.getLength() - pVar.h()));
            return uVar.f4222j;
        }
        return sVar.f4212a;
    }

    public Object k(int i10) {
        SparseArray sparseArray = (SparseArray) this.f276c;
        if (this.f275b == -1) {
            this.f275b = 0;
        }
        while (true) {
            int i11 = this.f275b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f275b--;
        }
        while (this.f275b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f275b + 1)) {
            this.f275b++;
        }
        return sparseArray.valueAt(this.f275b);
    }

    public boolean l() {
        ColorStateList colorStateList;
        if (((Shader) this.f276c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void m(u2.u uVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        g(new i0(this, uVar, new c0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), 1));
    }

    @Override
    public c3.h n(p pVar, long j3) {
        long j10;
        switch (this.f274a) {
            case 8:
                long position = pVar.getPosition();
                long j11 = j(pVar);
                long h = pVar.h();
                pVar.j(Math.max(6, ((u) this.f276c).f4218c));
                long j12 = j(pVar);
                long h10 = pVar.h();
                if (j11 <= j3 && j12 > j3) {
                    return new c3.h(0, -9223372036854775807L, h);
                }
                if (j12 <= j3) {
                    return new c3.h(-2, j12, h10);
                }
                return new c3.h(-1, j11, position);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                v vVar = (v) this.d;
                vVar.G(min);
                pVar.b(0, min, vVar.f7234a);
                int i10 = vVar.f7236c;
                long j13 = -1;
                long j14 = -1;
                long j15 = -9223372036854775807L;
                while (true) {
                    if (vVar.a() >= 188) {
                        byte[] bArr = vVar.f7234a;
                        int i11 = vVar.f7235b;
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
                            long a2 = t8.a(vVar, i11, this.f275b);
                            if (a2 != j10) {
                                long b10 = ((b0) this.f276c).b(a2);
                                if (b10 > j3) {
                                    if (j15 == j10) {
                                        return new c3.h(-1, b10, position2);
                                    }
                                    return new c3.h(0, -9223372036854775807L, position2 + j14);
                                }
                                j15 = b10;
                                if (100000 + j15 > j3) {
                                    return new c3.h(0, -9223372036854775807L, position2 + i11);
                                }
                                j14 = i11;
                            }
                            vVar.J(i12);
                            j13 = i12;
                        }
                    } else {
                        j10 = -9223372036854775807L;
                    }
                }
                if (j15 != j10) {
                    return new c3.h(-2, j15, position2 + j13);
                }
                return c3.h.d;
        }
    }

    public void o(u2.u uVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        g(new i0(this, uVar, new c0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), 0));
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        m4.b0 b0Var = ((m4.l0) this.d).f13430g;
        Handler handler = b0Var.f13299l;
        m4.r rVar = (m4.r) this.f276c;
        e2.d0.U(handler, new w(b0Var, rVar, new q(this, this.f275b, list, rVar, 5)));
    }

    public void p(u2.u uVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, IOException iOException, boolean z10) {
        g(new u2.j0(this, uVar, new c0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), iOException, z10));
    }

    public void q(u2.u uVar, int i10, IOException iOException, boolean z10) {
        p(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void r(u2.u uVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, int i13) {
        g(new ta0(this, uVar, new c0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), i13, 1));
    }

    public a t(Object obj, Object obj2) {
        int i10 = (this.f275b + 1) * 2;
        Object[] objArr = (Object[]) this.f276c;
        if (i10 > objArr.length) {
            this.f276c = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.h(objArr.length, i10));
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = (Object[]) this.f276c;
                int i11 = this.f275b;
                int i12 = i11 * 2;
                objArr2[i12] = obj;
                objArr2[i12 + 1] = obj2;
                this.f275b = i11 + 1;
                return this;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    public void u(int i10) {
        v(i10, 200L, wr.f28819f);
    }

    public void v(int i10, long j3, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f276c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f276c).cancel();
        }
        int[] iArr = new int[1];
        this.f275b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f276c = ofInt;
        ofInt.addUpdateListener(new t1(22, this, iArr));
        ((ValueAnimator) this.f276c).addListener(new ji(this, i10, iArr, 1));
        ((ValueAnimator) this.f276c).setDuration(j3);
        ((ValueAnimator) this.f276c).setInterpolator(interpolator);
        ((ValueAnimator) this.f276c).start();
    }

    public List w(CharSequence charSequence) {
        charSequence.getClass();
        pb.c cVar = (pb.c) this.d;
        cVar.getClass();
        d9.h hVar = new d9.h(cVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void x(int i10, long j3, long j10) {
        c0 c0Var = new c0(1, i10, null, 3, null, e2.d0.e0(j3), e2.d0.e0(j10));
        g0 g0Var = (g0) this.f276c;
        g0Var.getClass();
        g(new bi.t8(this, g0Var, c0Var, 3));
    }

    public void y(String str, k6.c cVar) {
        int i10 = this.f275b + 1;
        Object[] objArr = (Object[]) this.f276c;
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
                this.f276c = Arrays.copyOf(objArr, i12);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f276c;
        int i13 = this.f275b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f275b = i13 + 1;
    }

    public void z(String str, l lVar) {
        Map map = (Map) this.f276c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f275b > 0) {
                new com.google.android.gms.internal.cast.c0(Looper.getMainLooper(), 4).post(new c5.v(this, lVar, str, false, 5));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a4.a.p("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public a(int i10, int i11) {
        this.f274a = i11;
        switch (i11) {
            case 6:
                this.f276c = new Object[i10 * 2];
                this.f275b = 0;
                return;
            default:
                this.f275b = i10;
                return;
        }
    }

    public a(Object obj, int i10, Object obj2, int i11) {
        this.f274a = i11;
        this.d = obj;
        this.f275b = i10;
        this.f276c = obj2;
    }

    public a(int i10, byte b10) {
        this.f274a = i10;
        switch (i10) {
            case 14:
                this.f276c = new fh.a();
                return;
            case 19:
                this.f276c = new Object[8];
                this.f275b = 0;
                return;
            case 25:
                int i11 = e.f45111y;
                this.f276c = new a0[i11];
                this.d = new Bitmap[i11];
                return;
            default:
                this.f276c = DesugarCollections.synchronizedMap(new a0.l(0));
                this.f275b = 0;
                return;
        }
    }

    public a(n nVar, int i10) {
        this.f274a = 24;
        this.d = new Object();
        this.f276c = nVar;
        ia.b();
        this.f275b = i10;
    }

    public a(String str, String[] strArr) {
        String sb2;
        this.f274a = 17;
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
        this.f276c = str;
        int i10 = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.f276c, i10)) {
            i10++;
        }
        this.f275b = i10;
    }

    private final void s() {
    }

    @Override
    public void h(Throwable th2) {
    }

    public a(f fVar, int i10) {
        this.f274a = 22;
        this.d = new Object();
        this.f276c = fVar;
        d9.b();
        this.f275b = i10;
    }

    public a(r3 r3Var, int i10) {
        this.f274a = 26;
        this.d = new Object();
        this.f276c = r3Var;
        zf.b();
        this.f275b = i10;
    }

    public a(vl0 vl0Var) {
        this.f274a = 16;
        this.d = vl0Var;
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f274a = 13;
        this.f276c = rectF;
        this.f275b = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e) {
            FileLog.e(e);
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public a(gg.g0 g0Var) {
        this.f274a = 21;
        this.f276c = new SparseArray();
        this.d = g0Var;
        this.f275b = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i10) {
        this.f274a = 7;
        this.f276c = shader;
        this.d = colorStateList;
        this.f275b = i10;
    }

    public a(String str) {
        this.f274a = 0;
        this.f276c = str;
        this.d = null;
        this.f275b = 0;
    }

    public a(u uVar, int i10) {
        this.f274a = 8;
        this.f276c = uVar;
        this.f275b = i10;
        this.d = new Object();
    }

    public a(int i10, b0 b0Var) {
        this.f274a = 10;
        this.f275b = i10;
        this.f276c = b0Var;
        this.d = new v();
    }

    public a(byte[] bArr) {
        this.f274a = 0;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f276c = null;
        this.f275b = 1;
    }

    public a(g gVar) {
        this.f274a = 11;
        b2.p pVar = new b2.p(6);
        pVar.f1870c = new rb.a(28);
        this.d = pVar;
        this.f276c = gVar;
        this.f275b = 1;
    }

    public a(pb.c cVar) {
        this.f274a = 4;
        this.d = cVar;
        this.f276c = d9.c.f6335a;
        this.f275b = Integer.MAX_VALUE;
    }

    public a(m4.l0 l0Var, m4.r rVar, int i10) {
        this.f274a = 12;
        this.d = l0Var;
        this.f276c = rVar;
        this.f275b = i10;
    }
}
