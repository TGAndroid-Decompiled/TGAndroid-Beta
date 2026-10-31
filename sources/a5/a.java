package a5;

import a1.g;
import ag.g3;
import ag.p2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import c3.i;
import c3.p;
import c3.u;
import c5.w;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.internal.cast.z;
import d9.s;
import e2.k0;
import e2.l0;
import e9.c2;
import e9.p0;
import e9.q0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j2.f;
import j9.t;
import ja.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import k6.h;
import li.k;
import m.c3;
import m.l1;
import m.p3;
import m.q;
import m4.f0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.w0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.tm;
import ph.x1;
import r0.h0;
import rf.e;
import th.m1;
import th.o0;
import u2.c0;
import u2.g0;
import u2.i0;
import u2.j0;
import v7.a8;
import v7.b8;
import v7.c9;
import v7.h6;
import v7.j;
import v7.l8;
import v7.r7;
import x7.d0;
import x7.e0;
import x7.j9;
import x7.ja;
import x7.p7;
import xa.n;
import z7.ag;
import z7.ib;
import z7.x;
import z7.xe;
import z7.y;
public class a implements i, t {
    public final int f280a;
    public int f281b;
    public Object f282c;
    public Object d;

    public a(char c10, int i10) {
        this.f280a = i10;
    }

    public static a5.a j(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: a5.a.j(android.content.res.Resources, int, android.content.res.Resources$Theme):a5.a");
    }

    public List A(CharSequence charSequence) {
        charSequence.getClass();
        h hVar = (h) this.d;
        hVar.getClass();
        s sVar = new s(hVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (sVar.hasNext()) {
            arrayList.add((String) sVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void B(long j10, int i10, long j11) {
        c0 c0Var = new c0(1, i10, null, 3, null, l0.h0(j10), l0.h0(j11));
        g0 g0Var = (g0) this.f282c;
        g0Var.getClass();
        k(new q5.a(this, g0Var, c0Var, 7));
    }

    public void C(String str, k6.c cVar) {
        int i10 = this.f281b + 1;
        Object[] objArr = (Object[]) this.f282c;
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
                this.f282c = Arrays.copyOf(objArr, i12);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f282c;
        int i13 = this.f281b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f281b = i13 + 1;
    }

    public void D(String str, l lVar) {
        Map map = (Map) this.f282c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f281b > 0) {
                new z(Looper.getMainLooper(), 4).post(new w(this, lVar, str, false, 3));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(g.n("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public byte[] E() {
        j jVar;
        d dVar;
        e0 e0Var;
        d dVar2;
        y yVar;
        d dVar3;
        switch (this.f280a) {
            case 24:
                c9 c9Var = c9.f50417c;
                n nVar = (n) this.f282c;
                ((a8) this.d).h = false;
                a8 a8Var = (a8) this.d;
                a8Var.f50387f = Boolean.FALSE;
                nVar.f53554a = new b8(a8Var);
                try {
                    c9.b();
                    h6 h6Var = new h6(nVar);
                    q5.d dVar4 = new q5.d(9);
                    c9Var.a(dVar4);
                    HashMap hashMap = new HashMap((HashMap) dVar4.f45487b);
                    HashMap hashMap2 = new HashMap((HashMap) dVar4.f45488c);
                    v7.i iVar = (v7.i) dVar4.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jVar = new j(byteArrayOutputStream, hashMap, hashMap2, iVar);
                        dVar = (d) hashMap.get(h6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar != null) {
                        dVar.a(h6Var, jVar);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(h6.class)));
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 25:
                ja jaVar = ja.f53215c;
                f fVar = (f) this.f282c;
                ((a8) this.d).h = false;
                a8 a8Var2 = (a8) this.d;
                a8Var2.f50387f = Boolean.FALSE;
                fVar.f9347a = new j9(a8Var2);
                try {
                    ja.b();
                    p7 p7Var = new p7(fVar);
                    q5.d dVar5 = new q5.d(18);
                    jaVar.a(dVar5);
                    HashMap hashMap3 = new HashMap((HashMap) dVar5.f45487b);
                    HashMap hashMap4 = new HashMap((HashMap) dVar5.f45488c);
                    d0 d0Var = (d0) dVar5.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        e0Var = new e0(byteArrayOutputStream2, hashMap3, hashMap4, d0Var);
                        dVar2 = (d) hashMap3.get(p7.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 != null) {
                        dVar2.a(p7Var, e0Var);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(p7.class)));
                } catch (UnsupportedEncodingException e7) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
                }
            default:
                ag agVar = ag.f54644c;
                p3 p3Var = (p3) this.f282c;
                ((a8) this.d).h = false;
                a8 a8Var3 = (a8) this.d;
                a8Var3.f50387f = Boolean.FALSE;
                p3Var.f12518a = new xe(a8Var3);
                try {
                    ag.b();
                    ib ibVar = new ib(p3Var);
                    q5.d dVar6 = new q5.d(26);
                    agVar.a(dVar6);
                    HashMap hashMap5 = new HashMap((HashMap) dVar6.f45487b);
                    HashMap hashMap6 = new HashMap((HashMap) dVar6.f45488c);
                    x xVar = (x) dVar6.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        yVar = new y(byteArrayOutputStream3, hashMap5, hashMap6, xVar);
                        dVar3 = (d) hashMap5.get(ib.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 != null) {
                        dVar3.a(ibVar, yVar);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(ib.class)));
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
        }
    }

    public void F(Bundle bundle) {
        Bundle bundle2;
        this.f281b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f282c).entrySet()) {
            l lVar = (l) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lVar.onCreate(bundle2);
        }
    }

    public void G(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f282c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void a(int i10, int i11) {
        boolean z10;
        int i12 = (i11 << 16) + i10;
        if (this.f281b != i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f281b = i12;
        for (int i13 = 0; i13 < e.f46506y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.e.c(new x1(bitmap, 5));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            rf.x[] xVarArr = (rf.x[]) this.f282c;
            if (xVarArr[i13] == null) {
                xVarArr[i13] = new rf.x(i11 * i10 * 2);
            }
        }
    }

    @Override
    public c3.h b(p pVar, long j10) {
        long j11;
        switch (this.f280a) {
            case 8:
                long position = pVar.getPosition();
                long m10 = m(pVar);
                long k10 = pVar.k();
                pVar.l(Math.max(6, ((u) this.f282c).f3693c));
                long m11 = m(pVar);
                long k11 = pVar.k();
                if (m10 <= j10 && m11 > j10) {
                    return new c3.h(-9223372036854775807L, 0, k10);
                }
                if (m11 <= j10) {
                    return new c3.h(m11, -2, k11);
                }
                return new c3.h(m10, -1, position);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                e2.x xVar = (e2.x) this.d;
                xVar.K(min);
                pVar.b(0, min, xVar.f6207a);
                int i10 = xVar.f6209c;
                long j12 = -1;
                long j13 = -1;
                long j14 = -9223372036854775807L;
                while (true) {
                    if (xVar.a() >= 188) {
                        byte[] bArr = xVar.f6207a;
                        int i11 = xVar.f6208b;
                        while (true) {
                            if (i11 < i10) {
                                j11 = -9223372036854775807L;
                                if (bArr[i11] != 71) {
                                    i11++;
                                }
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        int i12 = i11 + 188;
                        if (i12 <= i10) {
                            long a2 = l8.a(xVar, i11, this.f281b);
                            if (a2 != j11) {
                                long b10 = ((k0) this.f282c).b(a2);
                                if (b10 > j10) {
                                    if (j14 == j11) {
                                        return new c3.h(b10, -1, position2);
                                    }
                                    return new c3.h(-9223372036854775807L, 0, position2 + j13);
                                } else if (100000 + b10 > j10) {
                                    return new c3.h(-9223372036854775807L, 0, position2 + i11);
                                } else {
                                    j14 = b10;
                                    j13 = i11;
                                }
                            }
                            xVar.N(i12);
                            j12 = i12;
                        }
                    } else {
                        j11 = -9223372036854775807L;
                    }
                }
                if (j14 != j11) {
                    return new c3.h(j14, -2, position2 + j12);
                }
                return c3.h.d;
        }
    }

    public void c() {
        c3 c3Var;
        ImageView imageView = (ImageView) this.f282c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            l1.a(drawable);
        }
        if (drawable != null && (c3Var = (c3) this.d) != null) {
            q.d(drawable, c3Var, imageView.getDrawableState());
        }
    }

    public c2 d(boolean z10) {
        p0 p0Var;
        p0 p0Var2;
        if (z10 && (p0Var2 = (p0) this.d) != null) {
            throw p0Var2.a();
        }
        c2 f7 = c2.f(this.f281b, (Object[]) this.f282c, this);
        if (z10 && (p0Var = (p0) this.d) != null) {
            throw p0Var.a();
        }
        return f7;
    }

    @Override
    public void e() {
        switch (this.f280a) {
            case 8:
                return;
            default:
                e2.x xVar = (e2.x) this.d;
                byte[] bArr = l0.f6166b;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                return;
        }
    }

    public ta.b f() {
        if ("".isEmpty()) {
            return new ta.b((String) this.f282c, ((Long) this.d).longValue(), this.f281b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public q0 g() {
        return d(false);
    }

    public void h(int i10) {
        String str;
        int i11 = this.f281b;
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

    public void k(e2.j jVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            l0.W(j0Var.f49901a, new o0(25, jVar, j0Var.f49902b));
        }
    }

    public void l(int i10, b2.x xVar, int i11, Object obj, long j10) {
        k(new org.telegram.ui.web.k0(22, this, new c0(1, i10, xVar, i11, obj, l0.h0(j10), -9223372036854775807L)));
    }

    public long m(p pVar) {
        int h;
        c3.s sVar = (c3.s) this.d;
        u uVar = (u) this.f282c;
        while (pVar.k() < pVar.getLength() - 6) {
            int i10 = this.f281b;
            long k10 = pVar.k();
            e2.x xVar = new e2.x(17);
            int i11 = 0;
            boolean a2 = false;
            pVar.b(0, 2, xVar.f6207a);
            if (xVar.g(0, ByteOrder.BIG_ENDIAN) != i10) {
                pVar.m();
                pVar.l((int) (k10 - pVar.getPosition()));
            } else {
                byte[] bArr = xVar.f6207a;
                while (i11 < 15 && (h = pVar.h(2 + i11, 15 - i11, bArr)) != -1) {
                    i11 += h;
                }
                xVar.M(i11 + 2);
                pVar.m();
                pVar.l((int) (k10 - pVar.getPosition()));
                a2 = c3.b.a(xVar, uVar, i10, sVar);
            }
            if (a2) {
                break;
            }
            pVar.l(1);
        }
        if (pVar.k() >= pVar.getLength() - 6) {
            pVar.l((int) (pVar.getLength() - pVar.k()));
            return uVar.f3697j;
        }
        return sVar.f3687a;
    }

    public Object n(int i10) {
        SparseArray sparseArray = (SparseArray) this.f282c;
        if (this.f281b == -1) {
            this.f281b = 0;
        }
        while (true) {
            int i11 = this.f281b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f281b--;
        }
        while (this.f281b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f281b + 1)) {
            this.f281b++;
        }
        return sparseArray.valueAt(this.f281b);
    }

    public boolean o() {
        ColorStateList colorStateList;
        if (((Shader) this.f282c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        f0 f0Var = ((m4.p0) this.d).h;
        Handler handler = f0Var.f12746l;
        m4.w wVar = (m4.w) this.f282c;
        l0.W(handler, new k2.u(f0Var, wVar, new g3(this, this.f281b, list, wVar, 4)));
    }

    public void p(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11) {
        k(new i0(this, uVar, new c0(i10, i11, xVar, i12, obj, l0.h0(j10), l0.h0(j11)), 1));
    }

    public void q(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11) {
        k(new i0(this, uVar, new c0(i10, i11, xVar, i12, obj, l0.h0(j10), l0.h0(j11)), 0));
    }

    public void r(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        k(new tm(this, uVar, new c0(i10, i11, xVar, i12, obj, l0.h0(j10), l0.h0(j11)), iOException, z10));
    }

    public void s(u2.u uVar, int i10, IOException iOException, boolean z10) {
        r(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void t(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f282c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f6697f;
        k G = k.G(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) G.f12101c;
        h0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) G.f12101c, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = r7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                l1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(G.v(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(l1.b(typedArray.getInt(3, -1), null));
            }
            G.I();
        } catch (Throwable th2) {
            G.I();
            throw th2;
        }
    }

    public void u(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11, int i13) {
        k(new mg.i0(this, uVar, new c0(i10, i11, xVar, i12, obj, l0.h0(j10), l0.h0(j11)), i13, 11));
    }

    public a w(Object obj, Object obj2) {
        int i10 = (this.f281b + 1) * 2;
        Object[] objArr = (Object[]) this.f282c;
        if (i10 > objArr.length) {
            this.f282c = Arrays.copyOf(objArr, e9.h0.b(objArr.length, i10));
        }
        e9.s.e(obj, obj2);
        Object[] objArr2 = (Object[]) this.f282c;
        int i11 = this.f281b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f281b = i11 + 1;
        return this;
    }

    public a x(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f281b) * 2;
            Object[] objArr = (Object[]) this.f282c;
            if (size > objArr.length) {
                this.f282c = Arrays.copyOf(objArr, e9.h0.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            w(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void y(int i10) {
        z(i10, 200L, gr.f26495f);
    }

    public void z(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f282c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f282c).cancel();
        }
        int[] iArr = new int[1];
        this.f281b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f282c = ofInt;
        ofInt.addUpdateListener(new p2(23, this, iArr));
        ((ValueAnimator) this.f282c).addListener(new jh(this, i10, iArr, 1));
        ((ValueAnimator) this.f282c).setDuration(j10);
        ((ValueAnimator) this.f282c).setInterpolator(interpolator);
        ((ValueAnimator) this.f282c).start();
    }

    public a(int i10, int i11) {
        this.f280a = i11;
        switch (i11) {
            case 6:
                this.f282c = new Object[i10 * 2];
                this.f281b = 0;
                return;
            default:
                this.f281b = i10;
                return;
        }
    }

    public a(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f280a = 1;
        this.f281b = i10;
        this.f282c = str;
        this.d = arrayList;
    }

    public a(Object obj, int i10, Object obj2, int i11) {
        this.f280a = i11;
        this.d = obj;
        this.f281b = i10;
        this.f282c = obj2;
    }

    public a(int i10, byte b10) {
        this.f280a = i10;
        switch (i10) {
            case 15:
                this.f282c = new yg.a();
                return;
            case 19:
                int i11 = e.f46506y;
                this.f282c = new rf.x[i11];
                this.d = new Bitmap[i11];
                return;
            case 20:
                this.f282c = new Object[8];
                this.f281b = 0;
                return;
            default:
                this.f282c = DesugarCollections.synchronizedMap(new a0.l(0));
                this.f281b = 0;
                return;
        }
    }

    public a(f fVar, int i10) {
        this.f280a = 25;
        this.d = new Object();
        this.f282c = fVar;
        ja.b();
        this.f281b = i10;
    }

    public a(p3 p3Var, int i10) {
        this.f280a = 27;
        this.d = new Object();
        this.f282c = p3Var;
        ag.b();
        this.f281b = i10;
    }

    private final void v() {
    }

    public a(n nVar, int i10) {
        this.f280a = 24;
        this.d = new Object();
        this.f282c = nVar;
        c9.b();
        this.f281b = i10;
    }

    public a(tk0 tk0Var) {
        this.f280a = 17;
        this.d = tk0Var;
    }

    @Override
    public void i(Throwable th2) {
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f280a = 9;
        this.f282c = rectF;
        this.f281b = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", w0.f19025b.getCacheDir());
        } catch (Exception e) {
            f8.g(e, true);
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
            f8.g(e7, true);
        }
    }

    public a(ImageView imageView) {
        this.f280a = 13;
        this.f281b = 0;
        this.f282c = imageView;
    }

    public a(m1 m1Var) {
        this.f280a = 23;
        this.f282c = new SparseArray();
        this.d = m1Var;
        this.f281b = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i10) {
        this.f280a = 7;
        this.f282c = shader;
        this.d = colorStateList;
        this.f281b = i10;
    }

    public a(String str) {
        this.f280a = 0;
        this.f282c = str;
        this.d = null;
        this.f281b = 0;
    }

    public a(u uVar, int i10) {
        this.f280a = 8;
        this.f282c = uVar;
        this.f281b = i10;
        this.d = new Object();
    }

    public a(int i10, k0 k0Var) {
        this.f280a = 11;
        this.f281b = i10;
        this.f282c = k0Var;
        this.d = new e2.x();
    }

    public a(byte[] bArr) {
        this.f280a = 0;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f282c = null;
        this.f281b = 1;
    }

    public a(g2.g gVar) {
        this.f280a = 12;
        ?? obj = new Object();
        obj.f3777c = new t7.u(28);
        obj.f3775a = 3;
        this.d = obj;
        this.f282c = gVar;
        this.f281b = 1;
    }

    public a(h hVar) {
        this.f280a = 5;
        d9.b bVar = d9.b.f5796f;
        this.d = hVar;
        this.f282c = bVar;
        this.f281b = Integer.MAX_VALUE;
    }

    public a(m4.p0 p0Var, m4.w wVar, int i10) {
        this.f280a = 14;
        this.d = p0Var;
        this.f282c = wVar;
        this.f281b = i10;
    }
}
