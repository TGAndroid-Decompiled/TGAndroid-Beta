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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.rm;
import org.telegram.ui.nd0;
import org.telegram.ui.wc1;
import org.telegram.ui.zl;
public class xa implements f3.i, m9.t {
    public final int f712a;
    public int f713b;
    public Object f714c;
    public Object d;

    public xa(char c10, int i7) {
        this.f712a = i7;
    }

    public static a8.xa g(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        throw new UnsupportedOperationException("Method not decompiled: a8.xa.g(android.content.res.Resources, int, android.content.res.Resources$Theme):a8.xa");
    }

    public List A(CharSequence charSequence) {
        charSequence.getClass();
        ob.c cVar = (ob.c) this.d;
        cVar.getClass();
        g9.s sVar = new g9.s(cVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (sVar.hasNext()) {
            arrayList.add((String) sVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void B(long j3, int i7, long j10) {
        x2.c0 c0Var = new x2.c0(1, i7, null, 3, null, h2.l0.h0(j3), h2.l0.h0(j10));
        x2.g0 g0Var = (x2.g0) this.f714c;
        g0Var.getClass();
        i(new rm(this, g0Var, c0Var, 17));
    }

    public void C(String str, n6.c cVar) {
        int i7 = this.f713b + 1;
        Object[] objArr = (Object[]) this.f714c;
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
                this.f714c = Arrays.copyOf(objArr, i11);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f714c;
        int i12 = this.f713b;
        int i13 = i12 + i12;
        objArr2[i13] = str;
        objArr2[i13 + 1] = cVar;
        this.f713b = i12 + 1;
    }

    public void D(String str, com.google.android.gms.common.api.internal.k kVar) {
        Map map = (Map) this.f714c;
        if (!map.containsKey(str)) {
            map.put(str, kVar);
            if (this.f713b > 0) {
                new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 4).post(new a9.h(this, kVar, str, false, 1));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(p5.c.m("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
    }

    public void E(Bundle bundle) {
        Bundle bundle2;
        this.f713b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f714c).entrySet()) {
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
        q0 q0Var;
        na.d dVar;
        c8.y yVar;
        na.d dVar2;
        y7.j jVar;
        na.d dVar3;
        switch (this.f712a) {
            case 0:
                cb cbVar = cb.f360c;
                b8 b8Var = (b8) this.f714c;
                ((u9) this.d).h = false;
                u9 u9Var = (u9) this.d;
                u9Var.f661f = Boolean.FALSE;
                b8Var.f341a = new v9(u9Var);
                try {
                    cb.b();
                    c8 c8Var = new c8(b8Var);
                    android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(1);
                    cbVar.a(a0Var);
                    HashMap hashMap = new HashMap((HashMap) a0Var.f1705b);
                    HashMap hashMap2 = new HashMap((HashMap) a0Var.f1706c);
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
                y7.g9 g9Var = y7.g9.f60823c;
                xi.e eVar = (xi.e) this.f714c;
                ((u9) this.d).h = false;
                u9 u9Var2 = (u9) this.d;
                u9Var2.f661f = Boolean.FALSE;
                eVar.f60621a = new y7.h8(u9Var2);
                try {
                    y7.g9.b();
                    y7.m6 m6Var = new y7.m6(eVar);
                    nd0 nd0Var = new nd0(26);
                    g9Var.a(nd0Var);
                    HashMap hashMap3 = new HashMap((HashMap) nd0Var.f50148b);
                    HashMap hashMap4 = new HashMap((HashMap) nd0Var.f50149c);
                    y7.i iVar = (y7.i) nd0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        jVar = new y7.j(byteArrayOutputStream2, hashMap3, hashMap4, iVar);
                        dVar3 = (na.d) hashMap3.get(y7.m6.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar3 != null) {
                        dVar3.a(m6Var, jVar);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(y7.m6.class)));
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
            case 2:
                xf xfVar = xf.f5062c;
                ga.d dVar4 = (ga.d) this.f714c;
                ((u9) this.d).h = false;
                u9 u9Var3 = (u9) this.d;
                u9Var3.f661f = Boolean.FALSE;
                dVar4.f13277b = new ue(u9Var3);
                try {
                    xf.b();
                    c8.gb gbVar = new c8.gb(dVar4);
                    android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(14);
                    xfVar.a(a0Var2);
                    HashMap hashMap5 = new HashMap((HashMap) a0Var2.f1705b);
                    HashMap hashMap6 = new HashMap((HashMap) a0Var2.f1706c);
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

    public void G(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f714c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((com.google.android.gms.common.api.internal.k) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void a(int i7, int i10) {
        boolean z10;
        int i11 = (i10 << 16) + i7;
        if (this.f713b != i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f713b = i11;
        for (int i12 = 0; i12 < bg.i.f3247y; i12++) {
            if (z10 || ((Bitmap[]) this.d)[i12] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i12];
                if (bitmap != null) {
                    Utilities.f22779e.c(new a3.f(bitmap, 16));
                }
                ((Bitmap[]) this.d)[i12] = Bitmap.createBitmap(i10, i7, Bitmap.Config.ARGB_8888);
            }
            bg.e0[] e0VarArr = (bg.e0[]) this.f714c;
            if (e0VarArr[i12] == null) {
                e0VarArr[i12] = new bg.e0(i10 * i7 * 2);
            }
        }
    }

    public void b() {
        m.b3 b3Var;
        ImageView imageView = (ImageView) this.f714c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m.l1.a(drawable);
        }
        if (drawable != null && (b3Var = (m.b3) this.d) != null) {
            m.q.d(drawable, b3Var, imageView.getDrawableState());
        }
    }

    public h9.y1 c(boolean z10) {
        h9.k0 k0Var;
        h9.k0 k0Var2;
        if (z10 && (k0Var2 = (h9.k0) this.d) != null) {
            throw k0Var2.a();
        }
        h9.y1 g10 = h9.y1.g(this.f713b, (Object[]) this.f714c, this);
        if (z10 && (k0Var = (h9.k0) this.d) != null) {
            throw k0Var.a();
        }
        return g10;
    }

    public h9.l0 d() {
        return c(false);
    }

    @Override
    public f3.h e(f3.p pVar, long j3) {
        long j10;
        switch (this.f712a) {
            case 11:
                long position = pVar.getPosition();
                long k10 = k(pVar);
                long l10 = pVar.l();
                pVar.m(Math.max(6, ((f3.u) this.f714c).f11202c));
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
                pVar.b(0, min, xVar.f13833a);
                int i7 = xVar.f13835c;
                long j11 = -1;
                long j12 = -1;
                long j13 = -9223372036854775807L;
                while (true) {
                    if (xVar.a() >= 188) {
                        byte[] bArr = xVar.f13833a;
                        int i10 = xVar.f13834b;
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
                            long a10 = c8.p9.a(xVar, i10, this.f713b);
                            if (a10 != j10) {
                                long b10 = ((h2.k0) this.f714c).b(a10);
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

    public void f(int i7) {
        String str;
        int i10 = this.f713b;
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
            x2.j0 j0Var = (x2.j0) it.next();
            h2.l0.W(j0Var.f60115a, new wg.r(8, jVar, j0Var.f60116b));
        }
    }

    public void j(int i7, e2.u uVar, int i10, Object obj, long j3) {
        i(new wc1(27, this, new x2.c0(1, i7, uVar, i10, obj, h2.l0.h0(j3), -9223372036854775807L)));
    }

    public long k(f3.p pVar) {
        int d;
        f3.s sVar = (f3.s) this.d;
        f3.u uVar = (f3.u) this.f714c;
        while (pVar.l() < pVar.getLength() - 6) {
            int i7 = this.f713b;
            long l10 = pVar.l();
            h2.x xVar = new h2.x(17);
            int i10 = 0;
            boolean a10 = false;
            pVar.b(0, 2, xVar.f13833a);
            if (xVar.g(0, ByteOrder.BIG_ENDIAN) != i7) {
                pVar.n();
                pVar.m((int) (l10 - pVar.getPosition()));
            } else {
                byte[] bArr = xVar.f13833a;
                while (i10 < 15 && (d = pVar.d(2 + i10, 15 - i10, bArr)) != -1) {
                    i10 += d;
                }
                xVar.M(i10 + 2);
                pVar.n();
                pVar.m((int) (l10 - pVar.getPosition()));
                a10 = f3.b.a(xVar, uVar, i7, sVar);
            }
            if (a10) {
                break;
            }
            pVar.m(1);
        }
        if (pVar.l() >= pVar.getLength() - 6) {
            pVar.m((int) (pVar.getLength() - pVar.l()));
            return uVar.f11207j;
        }
        return sVar.f11196a;
    }

    public Object l(int i7) {
        SparseArray sparseArray = (SparseArray) this.f714c;
        if (this.f713b == -1) {
            this.f713b = 0;
        }
        while (true) {
            int i10 = this.f713b;
            if (i10 <= 0 || i7 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f713b--;
        }
        while (this.f713b < sparseArray.size() - 1 && i7 >= sparseArray.keyAt(this.f713b + 1)) {
            this.f713b++;
        }
        return sparseArray.valueAt(this.f713b);
    }

    public String m() {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = this.f713b + 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = ((Object[]) this.f714c)[i10];
            if (obj instanceof me.d) {
                me.d dVar = (me.d) obj;
                if (kotlin.jvm.internal.j.a(dVar.e(), me.f.f20972c)) {
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
            } else if (obj != qe.g.f56116a) {
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
        if (((Shader) this.f714c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void o(x2.u uVar, int i7, int i10, e2.u uVar2, int i11, Object obj, long j3, long j10) {
        i(new x2.i0(this, uVar, new x2.c0(i7, i10, uVar2, i11, obj, h2.l0.h0(j3), h2.l0.h0(j10)), 1));
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        p4.d0 d0Var = ((p4.m0) this.d).h;
        Handler handler = d0Var.f55187l;
        p4.v vVar = (p4.v) this.f714c;
        h2.l0.W(handler, new org.telegram.ui.Wallet.c5(d0Var, vVar, new kp0(this, this.f713b, list, vVar, 22)));
    }

    public void p(x2.u uVar, int i7, int i10, e2.u uVar2, int i11, Object obj, long j3, long j10) {
        i(new x2.i0(this, uVar, new x2.c0(i7, i10, uVar2, i11, obj, h2.l0.h0(j3), h2.l0.h0(j10)), 0));
    }

    public void q(x2.u uVar, int i7, int i10, e2.u uVar2, int i11, Object obj, long j3, long j10, IOException iOException, boolean z10) {
        i(new zl(this, uVar, new x2.c0(i7, i10, uVar2, i11, obj, h2.l0.h0(j3), h2.l0.h0(j10)), iOException, z10));
    }

    public void r(x2.u uVar, int i7, IOException iOException, boolean z10) {
        q(uVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void s(AttributeSet attributeSet, int i7) {
        int resourceId;
        ImageView imageView = (ImageView) this.f714c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f10992f;
        h6.m D = h6.m.D(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) D.f13937c;
        r0.i0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) D.f13937c, i7);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = c8.z.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m.l1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(D.s(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(m.l1.b(typedArray.getInt(3, -1), null));
            }
            D.G();
        } catch (Throwable th2) {
            D.G();
            throw th2;
        }
    }

    @Override
    public void t() {
        switch (this.f712a) {
            case 11:
                return;
            default:
                h2.x xVar = (h2.x) this.d;
                byte[] bArr = h2.l0.f13784b;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                return;
        }
    }

    public String toString() {
        switch (this.f712a) {
            case 21:
                return m();
            default:
                return super.toString();
        }
    }

    public void u(x2.u uVar, int i7, int i10, e2.u uVar2, int i11, Object obj, long j3, long j10, int i12) {
        i(new bg.g0(this, uVar, new x2.c0(i7, i10, uVar2, i11, obj, h2.l0.h0(j3), h2.l0.h0(j10)), i12, 11));
    }

    public xa w(Object obj, Object obj2) {
        int i7 = (this.f713b + 1) * 2;
        Object[] objArr = (Object[]) this.f714c;
        if (i7 > objArr.length) {
            this.f714c = Arrays.copyOf(objArr, h9.c0.b(objArr.length, i7));
        }
        h9.o.f(obj, obj2);
        Object[] objArr2 = (Object[]) this.f714c;
        int i10 = this.f713b;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f713b = i10 + 1;
        return this;
    }

    public xa x(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f713b) * 2;
            Object[] objArr = (Object[]) this.f714c;
            if (size > objArr.length) {
                this.f714c = Arrays.copyOf(objArr, h9.c0.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            w(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void y(int i7) {
        z(i7, 200L, lr.f37208f);
    }

    public void z(int i7, long j3, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f714c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f714c).cancel();
        }
        int[] iArr = new int[1];
        this.f713b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i7);
        this.f714c = ofInt;
        ofInt.addUpdateListener(new ch.w(23, this, iArr));
        ((ValueAnimator) this.f714c).addListener(new di.a4(this, i7, iArr, 2));
        ((ValueAnimator) this.f714c).setDuration(j3);
        ((ValueAnimator) this.f714c).setInterpolator(interpolator);
        ((ValueAnimator) this.f714c).start();
    }

    public xa(int i7, int i10) {
        this.f712a = i10;
        switch (i10) {
            case 10:
                this.f714c = new Object[i7 * 2];
                this.f713b = 0;
                return;
            default:
                this.f713b = i7;
                return;
        }
    }

    public xa(int i7, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f712a = 7;
        this.f713b = i7;
        this.d = str;
        this.f714c = arrayList;
    }

    public xa(Object obj, Object obj2, int i7, int i10) {
        this.f712a = i10;
        this.f714c = obj;
        this.d = obj2;
        this.f713b = i7;
    }

    public xa(b8 b8Var, int i7) {
        this.f712a = 0;
        this.d = new Object();
        this.f714c = b8Var;
        cb.b();
        this.f713b = i7;
    }

    public xa(ga.d dVar, int i7) {
        this.f712a = 2;
        this.d = new Object();
        this.f714c = dVar;
        xf.b();
        this.f713b = i7;
    }

    public xa(xi.e eVar, int i7) {
        this.f712a = 27;
        this.d = new Object();
        this.f714c = eVar;
        y7.g9.b();
        this.f713b = i7;
    }

    public xa(ck0 ck0Var) {
        this.f712a = 19;
        this.d = ck0Var;
    }

    public xa(ByteBuffer byteBuffer, int i7, RectF rectF) {
        this.f712a = 22;
        this.f714c = rectF;
        this.f713b = i7;
        try {
            this.d = File.createTempFile("paint", ".bin", org.telegram.messenger.t0.f26913b.getCacheDir());
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

    public xa(ImageView imageView) {
        this.f712a = 13;
        this.f713b = 0;
        this.f714c = imageView;
    }

    public xa(x2.z0 z0Var) {
        this.f712a = 26;
        this.f714c = new SparseArray();
        this.d = z0Var;
        this.f713b = -1;
    }

    public xa(String str) {
        this.f712a = 6;
        this.f714c = str;
        this.d = null;
        this.f713b = 0;
    }

    public xa(f3.u uVar, int i7) {
        this.f712a = 11;
        this.f714c = uVar;
        this.f713b = i7;
        this.d = new Object();
    }

    public xa(int i7, h2.k0 k0Var) {
        this.f712a = 15;
        this.f713b = i7;
        this.f714c = k0Var;
        this.d = new h2.x();
    }

    public xa(byte[] bArr) {
        this.f712a = 6;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.f714c = null;
        this.f713b = 1;
    }

    public xa(j2.g gVar) {
        this.f712a = 16;
        ?? obj = new Object();
        obj.f3356c = new nb.a(6);
        obj.f3355b = 3;
        this.d = obj;
        this.f714c = gVar;
        this.f713b = 1;
    }

    public xa(ob.c cVar) {
        this.f712a = 8;
        g9.b bVar = g9.b.f13243f;
        this.d = cVar;
        this.f714c = bVar;
        this.f713b = Integer.MAX_VALUE;
    }

    public xa(CopyOnWriteArrayList copyOnWriteArrayList, int i7, x2.g0 g0Var) {
        this.f712a = 25;
        this.d = copyOnWriteArrayList;
        this.f713b = i7;
        this.f714c = g0Var;
    }

    public xa(int i7, byte b10) {
        this.f712a = i7;
        switch (i7) {
            case 3:
                this.f714c = DesugarCollections.synchronizedMap(new a0.l(0));
                this.f713b = 0;
                return;
            case 17:
                this.f714c = new ih.a();
                return;
            case 24:
                this.f714c = new Object[8];
                this.f713b = 0;
                return;
            default:
                int i10 = bg.i.f3247y;
                this.f714c = new bg.e0[i10];
                this.d = new Bitmap[i10];
                return;
        }
    }

    public xa(e2.u uVar, int i7, String str) {
        this.f712a = 14;
        this.f714c = uVar;
        this.f713b = i7;
        this.d = str;
    }

    public xa(p4.m0 m0Var, p4.v vVar, int i7) {
        this.f712a = 20;
        this.d = m0Var;
        this.f714c = vVar;
        this.f713b = i7;
    }
}
