package b8;

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
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.na1;
import org.telegram.ui.ul;
public class kg implements e3.i, l9.t {
    public final int f2721a;
    public int f2722b;
    public Object f2723c;
    public Object d;

    public kg(char c2, int i3) {
        this.f2721a = i3;
    }

    public static b8.kg i(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        throw new UnsupportedOperationException("Method not decompiled: b8.kg.i(android.content.res.Resources, int, android.content.res.Resources$Theme):b8.kg");
    }

    public List A(CharSequence charSequence) {
        charSequence.getClass();
        bb.c cVar = (bb.c) this.d;
        cVar.getClass();
        f9.s sVar = new f9.s(cVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (sVar.hasNext()) {
            arrayList.add((String) sVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void B(long j10, int i3, long j11) {
        w2.c0 c0Var = new w2.c0(1, i3, null, 3, null, g2.n0.h0(j10), g2.n0.h0(j11));
        w2.g0 g0Var = (w2.g0) this.f2723c;
        g0Var.getClass();
        j(new hr(this, g0Var, c0Var, 13));
    }

    public void C(String str, m6.c cVar) {
        int i3 = this.f2722b + 1;
        Object[] objArr = (Object[]) this.f2723c;
        int length = objArr.length;
        int i10 = i3 + i3;
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
                this.f2723c = Arrays.copyOf(objArr, i11);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f2723c;
        int i12 = this.f2722b;
        int i13 = i12 + i12;
        objArr2[i13] = str;
        objArr2[i13 + 1] = cVar;
        this.f2722b = i12 + 1;
    }

    public void D(String str, com.google.android.gms.common.api.internal.k kVar) {
        Map map = (Map) this.f2723c;
        if (!map.containsKey(str)) {
            map.put(str, kVar);
            if (this.f2722b > 0) {
                new com.google.android.gms.internal.cast.z(Looper.getMainLooper(), 4).post(new com.google.android.gms.common.api.internal.j1(this, kVar, str, 0));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(org.telegram.ui.Cells.f1.r("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
    }

    public void E(Bundle bundle) {
        Bundle bundle2;
        this.f2722b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f2723c).entrySet()) {
            com.google.android.gms.common.api.internal.k kVar = (com.google.android.gms.common.api.internal.k) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            kVar.onCreate(bundle2);
        }
    }

    public byte[] F() {
        g0 g0Var;
        ma.d dVar;
        x7.j jVar;
        ma.d dVar2;
        z7.d0 d0Var;
        ma.d dVar3;
        switch (this.f2721a) {
            case 0:
                pg pgVar = pg.f3015c;
                fa.f fVar = (fa.f) this.f2723c;
                ((df) this.d).h = false;
                df dfVar = (df) this.d;
                dfVar.f2547f = Boolean.FALSE;
                fVar.f11539b = new ef(dfVar);
                try {
                    pg.b();
                    pb pbVar = new pb(fVar);
                    android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(6);
                    pgVar.a(a0Var);
                    HashMap hashMap = new HashMap((HashMap) a0Var.f1186b);
                    HashMap hashMap2 = new HashMap((HashMap) a0Var.f1187c);
                    f0 f0Var = (f0) a0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        g0Var = new g0(byteArrayOutputStream, hashMap, hashMap2, f0Var);
                        dVar = (ma.d) hashMap.get(pb.class);
                    } catch (IOException unused) {
                    }
                    if (dVar != null) {
                        dVar.a(pbVar, g0Var);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(pb.class)));
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 26:
                x7.e9 e9Var = x7.e9.f58277c;
                za.p pVar = (za.p) this.f2723c;
                ((df) this.d).h = false;
                df dfVar2 = (df) this.d;
                dfVar2.f2547f = Boolean.FALSE;
                pVar.f60311a = new x7.f8(dfVar2);
                try {
                    x7.e9.b();
                    x7.l6 l6Var = new x7.l6(pVar);
                    p7.d dVar4 = new p7.d(20);
                    e9Var.a(dVar4);
                    HashMap hashMap3 = new HashMap((HashMap) dVar4.f53345b);
                    HashMap hashMap4 = new HashMap((HashMap) dVar4.d);
                    x7.i iVar = (x7.i) dVar4.f53346c;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        jVar = new x7.j(byteArrayOutputStream2, hashMap3, hashMap4, iVar);
                        dVar2 = (ma.d) hashMap3.get(x7.l6.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 != null) {
                        dVar2.a(l6Var, jVar);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(x7.l6.class)));
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
            default:
                z7.ga gaVar = z7.ga.f59885c;
                l2.e eVar = (l2.e) this.f2723c;
                ((df) this.d).h = false;
                df dfVar3 = (df) this.d;
                dfVar3.f2547f = Boolean.FALSE;
                eVar.f17689a = new z7.h9(dfVar3);
                try {
                    z7.ga.b();
                    z7.o7 o7Var = new z7.o7(eVar);
                    p7.d dVar5 = new p7.d(28);
                    gaVar.a(dVar5);
                    HashMap hashMap5 = new HashMap((HashMap) dVar5.f53345b);
                    HashMap hashMap6 = new HashMap((HashMap) dVar5.d);
                    z7.c0 c0Var = (z7.c0) dVar5.f53346c;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        d0Var = new z7.d0(byteArrayOutputStream3, hashMap5, hashMap6, c0Var);
                        dVar3 = (ma.d) hashMap5.get(z7.o7.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 != null) {
                        dVar3.a(o7Var, d0Var);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(z7.o7.class)));
                } catch (UnsupportedEncodingException e12) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
                }
        }
    }

    public void G(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f2723c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((com.google.android.gms.common.api.internal.k) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override
    public e3.h a(e3.p pVar, long j10) {
        long j11;
        switch (this.f2721a) {
            case 11:
                long position = pVar.getPosition();
                long l10 = l(pVar);
                long k10 = pVar.k();
                pVar.n(Math.max(6, ((e3.u) this.f2723c).f9512c));
                long l11 = l(pVar);
                long k11 = pVar.k();
                if (l10 <= j10 && l11 > j10) {
                    return new e3.h(-9223372036854775807L, 0, k10);
                }
                if (l11 <= j10) {
                    return new e3.h(l11, -2, k11);
                }
                return new e3.h(l10, -1, position);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                g2.y yVar = (g2.y) this.d;
                yVar.K(min);
                pVar.c(0, min, yVar.f11923a);
                int i3 = yVar.f11925c;
                long j12 = -1;
                long j13 = -1;
                long j14 = -9223372036854775807L;
                while (true) {
                    if (yVar.a() >= 188) {
                        byte[] bArr = yVar.f11923a;
                        int i10 = yVar.f11924b;
                        while (true) {
                            if (i10 < i3) {
                                j11 = -9223372036854775807L;
                                if (bArr[i10] != 71) {
                                    i10++;
                                }
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        int i11 = i10 + 188;
                        if (i11 <= i3) {
                            long a10 = ud.a(yVar, i10, this.f2722b);
                            if (a10 != j11) {
                                long b10 = ((g2.l0) this.f2723c).b(a10);
                                if (b10 > j10) {
                                    if (j14 == j11) {
                                        return new e3.h(b10, -1, position2);
                                    }
                                    return new e3.h(-9223372036854775807L, 0, position2 + j13);
                                } else if (100000 + b10 > j10) {
                                    return new e3.h(-9223372036854775807L, 0, position2 + i10);
                                } else {
                                    j14 = b10;
                                    j13 = i10;
                                }
                            }
                            yVar.N(i11);
                            j12 = i11;
                        }
                    } else {
                        j11 = -9223372036854775807L;
                    }
                }
                if (j14 != j11) {
                    return new e3.h(j14, -2, position2 + j12);
                }
                return e3.h.d;
        }
    }

    @Override
    public void b() {
        switch (this.f2721a) {
            case 11:
                return;
            default:
                g2.y yVar = (g2.y) this.d;
                byte[] bArr = g2.n0.f11874b;
                yVar.getClass();
                yVar.L(bArr.length, bArr);
                return;
        }
    }

    public void c(int i3, int i10) {
        boolean z10;
        int i11 = (i10 << 16) + i3;
        if (this.f2722b != i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2722b = i11;
        for (int i12 = 0; i12 < cg.h.f4663y; i12++) {
            if (z10 || ((Bitmap[]) this.d)[i12] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i12];
                if (bitmap != null) {
                    Utilities.f21387e.c(new ai.s(bitmap, 22));
                }
                ((Bitmap[]) this.d)[i12] = Bitmap.createBitmap(i10, i3, Bitmap.Config.ARGB_8888);
            }
            cg.c0[] c0VarArr = (cg.c0[]) this.f2723c;
            if (c0VarArr[i12] == null) {
                c0VarArr[i12] = new cg.c0(i10 * i3 * 2);
            }
        }
    }

    public void d() {
        m.b3 b3Var;
        ImageView imageView = (ImageView) this.f2723c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m.l1.a(drawable);
        }
        if (drawable != null && (b3Var = (m.b3) this.d) != null) {
            m.q.d(drawable, b3Var, imageView.getDrawableState());
        }
    }

    public g9.x1 e(boolean z10) {
        g9.k0 k0Var;
        g9.k0 k0Var2;
        if (z10 && (k0Var2 = (g9.k0) this.d) != null) {
            throw k0Var2.a();
        }
        g9.x1 g7 = g9.x1.g(this.f2722b, (Object[]) this.f2723c, this);
        if (z10 && (k0Var = (g9.k0) this.d) != null) {
            throw k0Var.a();
        }
        return g7;
    }

    public g9.l0 f() {
        return e(false);
    }

    public void g(int i3) {
        String str;
        int i10 = this.f2722b;
        if (i3 == i10) {
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
        if (i3 != 0) {
            if (i3 == 1) {
                str2 = "ArrayBuffer";
            } else {
                str2 = "Unknown";
            }
        }
        sb2.append(str2);
        throw new IllegalStateException(sb2.toString());
    }

    public void j(g2.k kVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            w2.j0 j0Var = (w2.j0) it.next();
            g2.n0.W(j0Var.f57108a, new u9.a(14, kVar, j0Var.f57109b));
        }
    }

    public void k(int i3, d2.v vVar, int i10, Object obj, long j10) {
        j(new na1(20, this, new w2.c0(1, i3, vVar, i10, obj, g2.n0.h0(j10), -9223372036854775807L)));
    }

    public long l(e3.p pVar) {
        int e10;
        e3.s sVar = (e3.s) this.d;
        e3.u uVar = (e3.u) this.f2723c;
        while (pVar.k() < pVar.getLength() - 6) {
            int i3 = this.f2722b;
            long k10 = pVar.k();
            g2.y yVar = new g2.y(17);
            int i10 = 0;
            boolean a10 = false;
            pVar.c(0, 2, yVar.f11923a);
            if (yVar.g(0, ByteOrder.BIG_ENDIAN) != i3) {
                pVar.o();
                pVar.n((int) (k10 - pVar.getPosition()));
            } else {
                byte[] bArr = yVar.f11923a;
                while (i10 < 15 && (e10 = pVar.e(2 + i10, 15 - i10, bArr)) != -1) {
                    i10 += e10;
                }
                yVar.M(i10 + 2);
                pVar.o();
                pVar.n((int) (k10 - pVar.getPosition()));
                a10 = e3.b.a(yVar, uVar, i3, sVar);
            }
            if (a10) {
                break;
            }
            pVar.n(1);
        }
        if (pVar.k() >= pVar.getLength() - 6) {
            pVar.n((int) (pVar.getLength() - pVar.k()));
            return uVar.f9517j;
        }
        return sVar.f9506a;
    }

    public Object m(int i3) {
        SparseArray sparseArray = (SparseArray) this.f2723c;
        if (this.f2722b == -1) {
            this.f2722b = 0;
        }
        while (true) {
            int i10 = this.f2722b;
            if (i10 <= 0 || i3 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f2722b--;
        }
        while (this.f2722b < sparseArray.size() - 1 && i3 >= sparseArray.keyAt(this.f2722b + 1)) {
            this.f2722b++;
        }
        return sparseArray.valueAt(this.f2722b);
    }

    public String n() {
        StringBuilder sb2 = new StringBuilder("$");
        int i3 = this.f2722b + 1;
        for (int i10 = 0; i10 < i3; i10++) {
            Object obj = ((Object[]) this.f2723c)[i10];
            if (obj instanceof je.d) {
                je.d dVar = (je.d) obj;
                if (kotlin.jvm.internal.j.a(dVar.e(), je.f.f16246c)) {
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
            } else if (obj != ne.g.f20351a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "toString(...)");
        return sb3;
    }

    public boolean o() {
        ColorStateList colorStateList;
        if (((Shader) this.f2723c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        o4.e0 e0Var = ((o4.o0) this.d).h;
        Handler handler = e0Var.f20628l;
        o4.v vVar = (o4.v) this.f2723c;
        g2.n0.W(handler, new m2.s(e0Var, vVar, new bi.q0(this, this.f2722b, list, vVar, 10)));
    }

    public void p(w2.u uVar, int i3, int i10, d2.v vVar, int i11, Object obj, long j10, long j11) {
        j(new w2.i0(this, uVar, new w2.c0(i3, i10, vVar, i11, obj, g2.n0.h0(j10), g2.n0.h0(j11)), 1));
    }

    public void q(w2.u uVar, int i3, int i10, d2.v vVar, int i11, Object obj, long j10, long j11) {
        j(new w2.i0(this, uVar, new w2.c0(i3, i10, vVar, i11, obj, g2.n0.h0(j10), g2.n0.h0(j11)), 0));
    }

    public void r(w2.u uVar, int i3, int i10, d2.v vVar, int i11, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        j(new ul(this, uVar, new w2.c0(i3, i10, vVar, i11, obj, g2.n0.h0(j10), g2.n0.h0(j11)), iOException, z10));
    }

    public void s(w2.u uVar, int i3, IOException iOException, boolean z10) {
        r(uVar, i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void t(AttributeSet attributeSet, int i3) {
        int resourceId;
        ImageView imageView = (ImageView) this.f2723c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f11311f;
        k4.j F = k4.j.F(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) F.f16870b;
        r0.i0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) F.f16870b, i3);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = oc.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m.l1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(F.y(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(m.l1.b(typedArray.getInt(3, -1), null));
            }
            F.H();
        } catch (Throwable th2) {
            F.H();
            throw th2;
        }
    }

    public String toString() {
        switch (this.f2721a) {
            case 16:
                return n();
            default:
                return super.toString();
        }
    }

    public void u(w2.u uVar, int i3, int i10, d2.v vVar, int i11, Object obj, long j10, long j11, int i12) {
        j(new cg.e0(this, uVar, new w2.c0(i3, i10, vVar, i11, obj, g2.n0.h0(j10), g2.n0.h0(j11)), i12, 10));
    }

    public kg w(Object obj, Object obj2) {
        int i3 = (this.f2722b + 1) * 2;
        Object[] objArr = (Object[]) this.f2723c;
        if (i3 > objArr.length) {
            this.f2723c = Arrays.copyOf(objArr, g9.c0.b(objArr.length, i3));
        }
        g9.o.f(obj, obj2);
        Object[] objArr2 = (Object[]) this.f2723c;
        int i10 = this.f2722b;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f2722b = i10 + 1;
        return this;
    }

    public kg x(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f2722b) * 2;
            Object[] objArr = (Object[]) this.f2723c;
            if (size > objArr.length) {
                this.f2723c = Arrays.copyOf(objArr, g9.c0.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            w(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void y(int i3) {
        z(i3, 200L, xq.f40452f);
    }

    public void z(int i3, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f2723c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f2723c).cancel();
        }
        int[] iArr = new int[1];
        this.f2722b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i3);
        this.f2723c = ofInt;
        ofInt.addUpdateListener(new ci.uc(24, this, iArr));
        ((ValueAnimator) this.f2723c).addListener(new ci.h4(this, i3, iArr, 2));
        ((ValueAnimator) this.f2723c).setDuration(j10);
        ((ValueAnimator) this.f2723c).setInterpolator(interpolator);
        ((ValueAnimator) this.f2723c).start();
    }

    public kg(int i3, int i10) {
        this.f2721a = i10;
        switch (i10) {
            case 8:
                this.f2723c = new Object[i3 * 2];
                this.f2722b = 0;
                return;
            default:
                this.f2722b = i3;
                return;
        }
    }

    public kg(int i3, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f2721a = 6;
        this.f2722b = i3;
        this.d = str;
        this.f2723c = arrayList;
    }

    public kg(fa.f fVar, int i3) {
        this.f2721a = 0;
        this.d = new Object();
        this.f2723c = fVar;
        pg.b();
        this.f2722b = i3;
    }

    public kg(l2.e eVar, int i3) {
        this.f2721a = 27;
        this.d = new Object();
        this.f2723c = eVar;
        z7.ga.b();
        this.f2722b = i3;
    }

    public kg(za.p pVar, int i3) {
        this.f2721a = 26;
        this.d = new Object();
        this.f2723c = pVar;
        x7.e9.b();
        this.f2722b = i3;
    }

    public kg(tj0 tj0Var) {
        this.f2721a = 20;
        this.d = tj0Var;
    }

    public kg(ByteBuffer byteBuffer, int i3, RectF rectF) {
        this.f2721a = 22;
        this.f2723c = rectF;
        this.f2722b = i3;
        try {
            this.d = File.createTempFile("paint", ".bin", org.telegram.messenger.t0.f25457b.getCacheDir());
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

    private final void v() {
    }

    @Override
    public void h(Throwable th2) {
    }

    public kg(ImageView imageView) {
        this.f2721a = 14;
        this.f2722b = 0;
        this.f2723c = imageView;
    }

    public kg(u9.j jVar) {
        this.f2721a = 25;
        this.f2723c = new SparseArray();
        this.d = jVar;
        this.f2722b = -1;
    }

    public kg(Shader shader, ColorStateList colorStateList, int i3) {
        this.f2721a = 9;
        this.f2723c = shader;
        this.d = colorStateList;
        this.f2722b = i3;
    }

    public kg(String str) {
        this.f2721a = 1;
        this.f2723c = str;
        this.d = null;
        this.f2722b = 0;
    }

    public kg(e3.u uVar, int i3) {
        this.f2721a = 11;
        this.f2723c = uVar;
        this.f2722b = i3;
        this.d = new Object();
    }

    public kg(int i3, g2.l0 l0Var) {
        this.f2721a = 13;
        this.f2722b = i3;
        this.f2723c = l0Var;
        this.d = new g2.y();
    }

    public kg(byte[] bArr) {
        this.f2721a = 1;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f2723c = null;
        this.f2722b = 1;
    }

    public kg(i2.g gVar) {
        this.f2721a = 15;
        ?? obj = new Object();
        obj.f4759c = new mb.b(4);
        obj.f4758b = 3;
        this.d = obj;
        this.f2723c = gVar;
        this.f2722b = 1;
    }

    public kg(bb.c cVar) {
        this.f2721a = 7;
        f9.b bVar = f9.b.f11503f;
        this.d = cVar;
        this.f2723c = bVar;
        this.f2722b = Integer.MAX_VALUE;
    }

    public kg(CopyOnWriteArrayList copyOnWriteArrayList, int i3, w2.g0 g0Var) {
        this.f2721a = 24;
        this.d = copyOnWriteArrayList;
        this.f2722b = i3;
        this.f2723c = g0Var;
    }

    public kg(int i3, byte b10) {
        this.f2721a = i3;
        switch (i3) {
            case 3:
                this.f2723c = DesugarCollections.synchronizedMap(new a0.l(0));
                this.f2722b = 0;
                return;
            case 18:
                this.f2723c = new jh.a();
                return;
            case 23:
                this.f2723c = new Object[8];
                this.f2722b = 0;
                return;
            default:
                int i10 = cg.h.f4663y;
                this.f2723c = new cg.c0[i10];
                this.d = new Bitmap[i10];
                return;
        }
    }

    public kg(d2.v vVar, int i3, String str) {
        this.f2721a = 12;
        this.f2723c = vVar;
        this.f2722b = i3;
        this.d = str;
    }

    public kg(o4.o0 o0Var, o4.v vVar, int i3) {
        this.f2721a = 17;
        this.d = o0Var;
        this.f2723c = vVar;
        this.f2722b = i3;
    }
}
