package a8;

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
import bi.de;
import c8.ue;
import c8.xf;
import j$.util.DesugarCollections;
import j$.util.Objects;
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
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.am;
import org.telegram.ui.ly0;
public class wa implements f3.i, m9.t {
    public final int f699a;
    public int f700b;
    public Object f701c;
    public Object d;

    public wa(char c10, int i7) {
        this.f699a = i7;
    }

    public static a8.wa g(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        throw new UnsupportedOperationException("Method not decompiled: a8.wa.g(android.content.res.Resources, int, android.content.res.Resources$Theme):a8.wa");
    }

    public void A(long j3, int i7, long j10) {
        x2.b0 b0Var = new x2.b0(1, i7, null, 3, null, h2.m0.h0(j3), h2.m0.h0(j10));
        x2.f0 f0Var = (x2.f0) this.f701c;
        f0Var.getClass();
        i(new gr(this, f0Var, b0Var, 16));
    }

    public void B(String str, n6.c cVar) {
        int i7 = this.f700b + 1;
        Object[] objArr = (Object[]) this.f701c;
        int length = objArr.length;
        int i10 = i7 + i7;
        if (i10 > length) {
            if (i10 >= 0) {
                int i11 = length + (length >> 1) + 1;
                if (i11 < i10) {
                    int highestOneBit = Integer.highestOneBit(i10 - 1);
                    i11 = highestOneBit + highestOneBit;
                }
                if (i11 < 0) {
                    i11 = Integer.MAX_VALUE;
                }
                this.f701c = Arrays.copyOf(objArr, i11);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f701c;
        int i12 = this.f700b;
        int i13 = i12 + i12;
        objArr2[i13] = str;
        objArr2[i13 + 1] = cVar;
        this.f700b = i12 + 1;
    }

    public void C(String str, com.google.android.gms.common.api.internal.k kVar) {
        Map map = (Map) this.f701c;
        if (!map.containsKey(str)) {
            map.put(str, kVar);
            if (this.f700b > 0) {
                new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 4).post(new a9.h(this, kVar, str, false, 1));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(org.telegram.ui.Cells.f1.n("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
    }

    public void D(Bundle bundle) {
        Bundle bundle2;
        this.f700b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f701c).entrySet()) {
            com.google.android.gms.common.api.internal.k kVar = (com.google.android.gms.common.api.internal.k) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            kVar.onCreate(bundle2);
        }
    }

    public byte[] E() {
        q0 q0Var;
        na.d dVar;
        c8.y yVar;
        na.d dVar2;
        y7.j jVar;
        na.d dVar3;
        switch (this.f699a) {
            case 0:
                bb bbVar = bb.f342c;
                b8 b8Var = (b8) this.f701c;
                ((s9) this.d).h = false;
                s9 s9Var = (s9) this.d;
                s9Var.f640f = Boolean.FALSE;
                b8Var.f335a = new t9(s9Var);
                try {
                    bb.b();
                    c8 c8Var = new c8(b8Var);
                    android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(1);
                    bbVar.a(a0Var);
                    HashMap hashMap = new HashMap((HashMap) a0Var.f1763b);
                    HashMap hashMap2 = new HashMap((HashMap) a0Var.f1764c);
                    o0 o0Var = (o0) a0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        q0Var = new q0(byteArrayOutputStream, hashMap, hashMap2, o0Var);
                        dVar = (na.d) hashMap.get(c8.class);
                    } catch (IOException unused) {
                    }
                    if (dVar != null) {
                        dVar.a(c8Var, q0Var);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(c8.class)));
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 1:
            default:
                y7.h9 h9Var = y7.h9.f59048c;
                ab.b0 b0Var = (ab.b0) this.f701c;
                ((s9) this.d).h = false;
                s9 s9Var2 = (s9) this.d;
                s9Var2.f640f = Boolean.FALSE;
                b0Var.f907b = new y7.i8(s9Var2);
                try {
                    y7.h9.b();
                    y7.o6 o6Var = new y7.o6(b0Var);
                    ly0 ly0Var = new ly0(27);
                    h9Var.a(ly0Var);
                    HashMap hashMap3 = new HashMap((HashMap) ly0Var.f47746b);
                    HashMap hashMap4 = new HashMap((HashMap) ly0Var.f47747c);
                    y7.i iVar = (y7.i) ly0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        jVar = new y7.j(byteArrayOutputStream2, hashMap3, hashMap4, iVar);
                        dVar3 = (na.d) hashMap3.get(y7.o6.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar3 != null) {
                        dVar3.a(o6Var, jVar);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(y7.o6.class)));
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
            case 2:
                xf xfVar = xf.f5961c;
                ga.d dVar4 = (ga.d) this.f701c;
                ((s9) this.d).h = false;
                s9 s9Var3 = (s9) this.d;
                s9Var3.f640f = Boolean.FALSE;
                dVar4.f13618b = new ue(s9Var3);
                try {
                    xf.b();
                    c8.gb gbVar = new c8.gb(dVar4);
                    android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(14);
                    xfVar.a(a0Var2);
                    HashMap hashMap5 = new HashMap((HashMap) a0Var2.f1763b);
                    HashMap hashMap6 = new HashMap((HashMap) a0Var2.f1764c);
                    c8.x xVar = (c8.x) a0Var2.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        yVar = new c8.y(byteArrayOutputStream3, hashMap5, hashMap6, xVar);
                        dVar2 = (na.d) hashMap5.get(c8.gb.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar2 != null) {
                        dVar2.a(gbVar, yVar);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(c8.gb.class)));
                } catch (UnsupportedEncodingException e12) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
                }
        }
    }

    public void F(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f701c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((com.google.android.gms.common.api.internal.k) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override
    public void M() {
        switch (this.f699a) {
            case 12:
                return;
            default:
                h2.x xVar = (h2.x) this.d;
                byte[] bArr = h2.m0.f14115b;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                return;
        }
    }

    @Override
    public f3.h a(f3.p pVar, long j3) {
        long j10;
        switch (this.f699a) {
            case 12:
                long position = pVar.getPosition();
                long k10 = k(pVar);
                long l10 = pVar.l();
                pVar.m(Math.max(6, ((f3.u) this.f701c).f11081c));
                long k11 = k(pVar);
                long l11 = pVar.l();
                if (k10 <= j3 && k11 > j3) {
                    return new f3.h(-9223372036854775807L, 0, l10);
                }
                if (k11 <= j3) {
                    return new f3.h(k11, -2, l11);
                }
                return new f3.h(k10, -1, position);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                h2.x xVar = (h2.x) this.d;
                xVar.K(min);
                pVar.b(0, min, xVar.f14164a);
                int i7 = xVar.f14166c;
                long j11 = -1;
                long j12 = -1;
                long j13 = -9223372036854775807L;
                while (true) {
                    if (xVar.a() >= 188) {
                        byte[] bArr = xVar.f14164a;
                        int i10 = xVar.f14165b;
                        while (true) {
                            if (i10 < i7) {
                                j10 = -9223372036854775807L;
                                if (bArr[i10] != 71) {
                                    i10++;
                                }
                            } else {
                                j10 = -9223372036854775807L;
                            }
                        }
                        int i11 = i10 + 188;
                        if (i11 <= i7) {
                            long a10 = c8.o9.a(xVar, i10, this.f700b);
                            if (a10 != j10) {
                                long b10 = ((h2.k0) this.f701c).b(a10);
                                if (b10 > j3) {
                                    if (j13 == j10) {
                                        return new f3.h(b10, -1, position2);
                                    }
                                    return new f3.h(-9223372036854775807L, 0, position2 + j12);
                                } else if (100000 + b10 > j3) {
                                    return new f3.h(-9223372036854775807L, 0, position2 + i10);
                                } else {
                                    j13 = b10;
                                    j12 = i10;
                                }
                            }
                            xVar.N(i11);
                            j11 = i11;
                        }
                    } else {
                        j10 = -9223372036854775807L;
                    }
                }
                if (j13 != j10) {
                    return new f3.h(j13, -2, position2 + j11);
                }
                return f3.h.d;
        }
    }

    public void b(int i7, int i10) {
        boolean z9;
        int i11 = (i10 << 16) + i7;
        if (this.f700b != i11) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f700b = i11;
        for (int i12 = 0; i12 < bg.i.f3298y; i12++) {
            if (z9 || ((Bitmap[]) this.d)[i12] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i12];
                if (bitmap != null) {
                    Utilities.f21341e.c(new a3.f(bitmap, 12));
                }
                ((Bitmap[]) this.d)[i12] = Bitmap.createBitmap(i10, i7, Bitmap.Config.ARGB_8888);
            }
            bg.d0[] d0VarArr = (bg.d0[]) this.f701c;
            if (d0VarArr[i12] == null) {
                d0VarArr[i12] = new bg.d0(i10 * i7 * 2);
            }
        }
    }

    public void c() {
        m.c3 c3Var;
        ImageView imageView = (ImageView) this.f701c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m.m1.a(drawable);
        }
        if (drawable != null && (c3Var = (m.c3) this.d) != null) {
            m.r.d(drawable, c3Var, imageView.getDrawableState());
        }
    }

    public h9.y1 d(boolean z9) {
        h9.k0 k0Var;
        h9.k0 k0Var2;
        if (z9 && (k0Var2 = (h9.k0) this.d) != null) {
            throw k0Var2.a();
        }
        h9.y1 g10 = h9.y1.g(this.f700b, (Object[]) this.f701c, this);
        if (z9 && (k0Var = (h9.k0) this.d) != null) {
            throw k0Var.a();
        }
        return g10;
    }

    public h9.l0 e() {
        return d(false);
    }

    public void f(int i7) {
        String str;
        int i10 = this.f700b;
        if (i7 == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        String str2 = "String";
        if (i10 == 0) {
            str = "String";
        } else if (i10 == 1) {
            str = "ArrayBuffer";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" expected, but got ");
        if (i7 != 0) {
            if (i7 == 1) {
                str2 = "ArrayBuffer";
            } else {
                str2 = "Unknown";
            }
        }
        sb2.append(str2);
        throw new IllegalStateException(sb2.toString());
    }

    public void i(h2.j jVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            x2.i0 i0Var = (x2.i0) it.next();
            h2.m0.W(i0Var.f58375a, new u9.f(28, jVar, i0Var.f58376b));
        }
    }

    public void j(int i7, e2.u uVar, int i10, Object obj, long j3) {
        i(new org.telegram.ui.web.a0(24, this, new x2.b0(1, i7, uVar, i10, obj, h2.m0.h0(j3), -9223372036854775807L)));
    }

    public long k(f3.p pVar) {
        int i7;
        f3.s sVar = (f3.s) this.d;
        f3.u uVar = (f3.u) this.f701c;
        while (pVar.l() < pVar.getLength() - 6) {
            int i10 = this.f700b;
            long l10 = pVar.l();
            h2.x xVar = new h2.x(17);
            int i11 = 0;
            boolean a10 = false;
            pVar.b(0, 2, xVar.f14164a);
            if (xVar.g(0, ByteOrder.BIG_ENDIAN) != i10) {
                pVar.q();
                pVar.m((int) (l10 - pVar.getPosition()));
            } else {
                byte[] bArr = xVar.f14164a;
                while (i11 < 15 && (i7 = pVar.i(2 + i11, 15 - i11, bArr)) != -1) {
                    i11 += i7;
                }
                xVar.M(i11 + 2);
                pVar.q();
                pVar.m((int) (l10 - pVar.getPosition()));
                a10 = f3.b.a(xVar, uVar, i10, sVar);
            }
            if (a10) {
                break;
            }
            pVar.m(1);
        }
        if (pVar.l() >= pVar.getLength() - 6) {
            pVar.m((int) (pVar.getLength() - pVar.l()));
            return uVar.f11086j;
        }
        return sVar.f11075a;
    }

    public Object l(int i7) {
        SparseArray sparseArray = (SparseArray) this.f701c;
        if (this.f700b == -1) {
            this.f700b = 0;
        }
        while (true) {
            int i10 = this.f700b;
            if (i10 <= 0 || i7 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f700b--;
        }
        while (this.f700b < sparseArray.size() - 1 && i7 >= sparseArray.keyAt(this.f700b + 1)) {
            this.f700b++;
        }
        return sparseArray.valueAt(this.f700b);
    }

    public String m() {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = this.f700b + 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = ((Object[]) this.f701c)[i10];
            if (obj instanceof me.d) {
                me.d dVar = (me.d) obj;
                if (kotlin.jvm.internal.j.a(dVar.e(), me.f.f20019c)) {
                    if (((int[]) this.d)[i10] != -1) {
                        sb2.append("[");
                        sb2.append(((int[]) this.d)[i10]);
                        sb2.append("]");
                    }
                } else {
                    int i11 = ((int[]) this.d)[i10];
                    if (i11 >= 0) {
                        sb2.append(".");
                        sb2.append(dVar.g(i11));
                    }
                }
            } else if (obj != qe.g.f54107a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "toString(...)");
        return sb3;
    }

    public boolean n() {
        ColorStateList colorStateList;
        if (((Shader) this.f701c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void o(x2.t tVar, int i7, int i10, e2.u uVar, int i11, Object obj, long j3, long j10) {
        i(new x2.h0(this, tVar, new x2.b0(i7, i10, uVar, i11, obj, h2.m0.h0(j3), h2.m0.h0(j10)), 1));
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        p4.d0 d0Var = ((p4.m0) this.d).h;
        Handler handler = d0Var.f53221l;
        p4.v vVar = (p4.v) this.f701c;
        h2.m0.W(handler, new org.telegram.ui.web.s(d0Var, vVar, new pp0(this, this.f700b, list, vVar, 21)));
    }

    public void p(x2.t tVar, int i7, int i10, e2.u uVar, int i11, Object obj, long j3, long j10) {
        i(new x2.h0(this, tVar, new x2.b0(i7, i10, uVar, i11, obj, h2.m0.h0(j3), h2.m0.h0(j10)), 0));
    }

    public void q(x2.t tVar, int i7, int i10, e2.u uVar, int i11, Object obj, long j3, long j10, IOException iOException, boolean z9) {
        i(new am(this, tVar, new x2.b0(i7, i10, uVar, i11, obj, h2.m0.h0(j3), h2.m0.h0(j10)), iOException, z9));
    }

    public void r(x2.t tVar, int i7, IOException iOException, boolean z9) {
        q(tVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z9);
    }

    public void s(AttributeSet attributeSet, int i7) {
        int resourceId;
        ImageView imageView = (ImageView) this.f701c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f10864f;
        h6.m x10 = h6.m.x(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) x10.f14267c;
        r0.i0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) x10.f14267c, i7);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = b5.a.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m.m1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(x10.o(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(m.m1.b(typedArray.getInt(3, -1), null));
            }
            x10.C();
        } catch (Throwable th2) {
            x10.C();
            throw th2;
        }
    }

    public void t(x2.t tVar, int i7, int i10, e2.u uVar, int i11, Object obj, long j3, long j10, int i12) {
        i(new bg.f0(this, tVar, new x2.b0(i7, i10, uVar, i11, obj, h2.m0.h0(j3), h2.m0.h0(j10)), i12, 11));
    }

    public String toString() {
        switch (this.f699a) {
            case 21:
                return m();
            default:
                return super.toString();
        }
    }

    public wa v(Object obj, Object obj2) {
        int i7 = (this.f700b + 1) * 2;
        Object[] objArr = (Object[]) this.f701c;
        if (i7 > objArr.length) {
            this.f701c = Arrays.copyOf(objArr, h9.c0.b(objArr.length, i7));
        }
        h9.o.f(obj, obj2);
        Object[] objArr2 = (Object[]) this.f701c;
        int i10 = this.f700b;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f700b = i10 + 1;
        return this;
    }

    public wa w(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f700b) * 2;
            Object[] objArr = (Object[]) this.f701c;
            if (size > objArr.length) {
                this.f701c = Arrays.copyOf(objArr, h9.c0.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            v(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void x(int i7) {
        y(i7, 200L, wq.f40046f);
    }

    public void y(int i7, long j3, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f701c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f701c).cancel();
        }
        int[] iArr = new int[1];
        this.f700b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i7);
        this.f701c = ofInt;
        ofInt.addUpdateListener(new de(24, this, iArr));
        ((ValueAnimator) this.f701c).addListener(new bi.y4(this, i7, iArr, 2));
        ((ValueAnimator) this.f701c).setDuration(j3);
        ((ValueAnimator) this.f701c).setInterpolator(interpolator);
        ((ValueAnimator) this.f701c).start();
    }

    public List z(CharSequence charSequence) {
        charSequence.getClass();
        d6.i iVar = (d6.i) this.d;
        iVar.getClass();
        g9.t tVar = new g9.t(iVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (tVar.hasNext()) {
            arrayList.add((String) tVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public wa(int i7, int i10) {
        this.f699a = i10;
        switch (i10) {
            case 10:
                this.f701c = new Object[i7 * 2];
                this.f700b = 0;
                return;
            default:
                this.f700b = i7;
                return;
        }
    }

    public wa(int i7, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f699a = 7;
        this.f700b = i7;
        this.d = str;
        this.f701c = arrayList;
    }

    public wa(Object obj, Object obj2, int i7, int i10) {
        this.f699a = i10;
        this.f701c = obj;
        this.d = obj2;
        this.f700b = i7;
    }

    public wa(b8 b8Var, int i7) {
        this.f699a = 0;
        this.d = new Object();
        this.f701c = b8Var;
        bb.b();
        this.f700b = i7;
    }

    public wa(ab.b0 b0Var, int i7) {
        this.f699a = 28;
        this.d = new Object();
        this.f701c = b0Var;
        y7.h9.b();
        this.f700b = i7;
    }

    public wa(ga.d dVar, int i7) {
        this.f699a = 2;
        this.d = new Object();
        this.f701c = dVar;
        xf.b();
        this.f700b = i7;
    }

    public wa(pj0 pj0Var) {
        this.f699a = 19;
        this.d = pj0Var;
    }

    public wa(ByteBuffer byteBuffer, int i7, RectF rectF) {
        this.f699a = 22;
        this.f701c = rectF;
        this.f700b = i7;
        try {
            this.d = File.createTempFile("paint", ".bin", org.telegram.messenger.t0.f25570b.getCacheDir());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
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
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    private final void u() {
    }

    @Override
    public void h(Throwable th2) {
    }

    public wa(ImageView imageView) {
        this.f699a = 13;
        this.f700b = 0;
        this.f701c = imageView;
    }

    public wa(v0.j jVar) {
        this.f699a = 27;
        this.f701c = new SparseArray();
        this.d = jVar;
        this.f700b = -1;
    }

    public wa(String str) {
        this.f699a = 6;
        this.f701c = str;
        this.d = null;
        this.f700b = 0;
    }

    public wa(f3.u uVar, int i7) {
        this.f699a = 12;
        this.f701c = uVar;
        this.f700b = i7;
        this.d = new Object();
    }

    public wa(int i7, h2.k0 k0Var) {
        this.f699a = 15;
        this.f700b = i7;
        this.f701c = k0Var;
        this.d = new h2.x();
    }

    public wa(byte[] bArr) {
        this.f699a = 6;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f701c = null;
        this.f700b = 1;
    }

    public wa(j2.g gVar) {
        this.f699a = 16;
        ?? obj = new Object();
        obj.f3394c = new w7.s(5, false);
        obj.f3393b = 3;
        this.d = obj;
        this.f701c = gVar;
        this.f700b = 1;
    }

    public wa(d6.i iVar) {
        this.f699a = 8;
        g9.b bVar = g9.b.f13583f;
        this.d = iVar;
        this.f701c = bVar;
        this.f700b = Integer.MAX_VALUE;
    }

    public wa(CopyOnWriteArrayList copyOnWriteArrayList, int i7, x2.f0 f0Var) {
        this.f699a = 26;
        this.d = copyOnWriteArrayList;
        this.f700b = i7;
        this.f701c = f0Var;
    }

    public wa(int i7, byte b10) {
        this.f699a = i7;
        switch (i7) {
            case 3:
                this.f701c = DesugarCollections.synchronizedMap(new a0.l(0));
                this.f700b = 0;
                return;
            case 17:
                this.f701c = new ih.a();
                return;
            case 24:
                this.f701c = new Object[8];
                this.f700b = 0;
                return;
            default:
                int i10 = bg.i.f3298y;
                this.f701c = new bg.d0[i10];
                this.d = new Bitmap[i10];
                return;
        }
    }

    public wa(e2.u uVar, int i7, String str) {
        this.f699a = 14;
        this.f701c = uVar;
        this.f700b = i7;
        this.d = str;
    }

    public wa(p4.m0 m0Var, p4.v vVar, int i7) {
        this.f699a = 20;
        this.d = m0Var;
        this.f701c = vVar;
        this.f700b = i7;
    }
}
