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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.ld0;
import org.telegram.ui.yl;
public class xa implements f3.i, m9.t {
    public final int f712a;
    public int f713b;
    public Object f714c;
    public Object d;

    public xa(char c10, int i7) {
        this.f712a = i7;
    }

    public static a8.xa f(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        throw new UnsupportedOperationException("Method not decompiled: a8.xa.f(android.content.res.Resources, int, android.content.res.Resources$Theme):a8.xa");
    }

    public void A(String str, n6.c cVar) {
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

    public void B(String str, com.google.android.gms.common.api.internal.k kVar) {
        Map map = (Map) this.f714c;
        if (!map.containsKey(str)) {
            map.put(str, kVar);
            if (this.f713b > 0) {
                new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 4).post(new a9.h(this, kVar, str, false, 1));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(org.telegram.ui.Cells.y0.m("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
    }

    public void C(Bundle bundle) {
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

    public byte[] D() {
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
                    HashMap hashMap = new HashMap((HashMap) a0Var.f1713b);
                    HashMap hashMap2 = new HashMap((HashMap) a0Var.f1714c);
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
                y7.g9 g9Var = y7.g9.f60257c;
                xi.e eVar = (xi.e) this.f714c;
                ((u9) this.d).h = false;
                u9 u9Var2 = (u9) this.d;
                u9Var2.f661f = Boolean.FALSE;
                eVar.f60055a = new y7.h8(u9Var2);
                try {
                    y7.g9.b();
                    y7.m6 m6Var = new y7.m6(eVar);
                    ld0 ld0Var = new ld0(26);
                    g9Var.a(ld0Var);
                    HashMap hashMap3 = new HashMap((HashMap) ld0Var.f48972b);
                    HashMap hashMap4 = new HashMap((HashMap) ld0Var.f48973c);
                    y7.i iVar = (y7.i) ld0Var.d;
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
                xf xfVar = xf.f4783c;
                ga.d dVar4 = (ga.d) this.f714c;
                ((u9) this.d).h = false;
                u9 u9Var3 = (u9) this.d;
                u9Var3.f661f = Boolean.FALSE;
                dVar4.f12963b = new ue(u9Var3);
                try {
                    xf.b();
                    c8.gb gbVar = new c8.gb(dVar4);
                    android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(14);
                    xfVar.a(a0Var2);
                    HashMap hashMap5 = new HashMap((HashMap) a0Var2.f1713b);
                    HashMap hashMap6 = new HashMap((HashMap) a0Var2.f1714c);
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

    public void E(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f714c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((com.google.android.gms.common.api.internal.k) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override
    public f3.h W(f3.p pVar, long j3) {
        long j10;
        switch (this.f712a) {
            case 11:
                long position = pVar.getPosition();
                long j11 = j(pVar);
                long j12 = pVar.j();
                pVar.k(Math.max(6, ((f3.u) this.f714c).f10883c));
                long j13 = j(pVar);
                long j14 = pVar.j();
                if (j11 <= j3 && j13 > j3) {
                    return new f3.h(-9223372036854775807L, 0, j12);
                }
                if (j13 <= j3) {
                    return new f3.h(j13, -2, j14);
                }
                return new f3.h(j11, -1, position);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                h2.x xVar = (h2.x) this.d;
                xVar.K(min);
                pVar.c(0, min, xVar.f13521a);
                int i7 = xVar.f13523c;
                long j15 = -1;
                long j16 = -1;
                long j17 = -9223372036854775807L;
                while (true) {
                    if (xVar.a() >= 188) {
                        byte[] bArr = xVar.f13521a;
                        int i10 = xVar.f13522b;
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
                            long a10 = c8.n9.a(xVar, i10, this.f713b);
                            if (a10 != j10) {
                                long b10 = ((h2.k0) this.f714c).b(a10);
                                if (b10 > j3) {
                                    if (j17 == j10) {
                                        return new f3.h(b10, -1, position2);
                                    }
                                    return new f3.h(-9223372036854775807L, 0, position2 + j16);
                                } else if (100000 + b10 > j3) {
                                    return new f3.h(-9223372036854775807L, 0, position2 + i10);
                                } else {
                                    j17 = b10;
                                    j16 = i10;
                                }
                            }
                            xVar.N(i11);
                            j15 = i11;
                        }
                    } else {
                        j10 = -9223372036854775807L;
                    }
                }
                if (j17 != j10) {
                    return new f3.h(j17, -2, position2 + j15);
                }
                return f3.h.d;
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
        for (int i12 = 0; i12 < bg.i.f3256y; i12++) {
            if (z10 || ((Bitmap[]) this.d)[i12] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i12];
                if (bitmap != null) {
                    Utilities.f22416e.c(new a3.f(bitmap, 15));
                }
                ((Bitmap[]) this.d)[i12] = Bitmap.createBitmap(i10, i7, Bitmap.Config.ARGB_8888);
            }
            bg.d0[] d0VarArr = (bg.d0[]) this.f714c;
            if (d0VarArr[i12] == null) {
                d0VarArr[i12] = new bg.d0(i10 * i7 * 2);
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

    public h9.x1 c(boolean z10) {
        h9.k0 k0Var;
        h9.k0 k0Var2;
        if (z10 && (k0Var2 = (h9.k0) this.d) != null) {
            throw k0Var2.a();
        }
        h9.x1 g10 = h9.x1.g(this.f713b, (Object[]) this.f714c, this);
        if (z10 && (k0Var = (h9.k0) this.d) != null) {
            throw k0Var.a();
        }
        return g10;
    }

    public h9.l0 d() {
        return c(false);
    }

    public void e(int i7) {
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

    public void g(h2.j jVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            x2.i0 i0Var = (x2.i0) it.next();
            h2.l0.W(i0Var.f59556a, new ug.t1(16, jVar, i0Var.f59557b));
        }
    }

    public void i(int i7, e2.u uVar, int i10, Object obj, long j3) {
        g(new org.telegram.ui.Wallet.k8(29, this, new x2.b0(1, i7, uVar, i10, obj, h2.l0.h0(j3), -9223372036854775807L)));
    }

    public long j(f3.p pVar) {
        int e10;
        f3.s sVar = (f3.s) this.d;
        f3.u uVar = (f3.u) this.f714c;
        while (pVar.j() < pVar.getLength() - 6) {
            int i7 = this.f713b;
            long j3 = pVar.j();
            h2.x xVar = new h2.x(17);
            int i10 = 0;
            boolean a10 = false;
            pVar.c(0, 2, xVar.f13521a);
            if (xVar.g(0, ByteOrder.BIG_ENDIAN) != i7) {
                pVar.l();
                pVar.k((int) (j3 - pVar.getPosition()));
            } else {
                byte[] bArr = xVar.f13521a;
                while (i10 < 15 && (e10 = pVar.e(2 + i10, 15 - i10, bArr)) != -1) {
                    i10 += e10;
                }
                xVar.M(i10 + 2);
                pVar.l();
                pVar.k((int) (j3 - pVar.getPosition()));
                a10 = f3.b.a(xVar, uVar, i7, sVar);
            }
            if (a10) {
                break;
            }
            pVar.k(1);
        }
        if (pVar.j() >= pVar.getLength() - 6) {
            pVar.k((int) (pVar.getLength() - pVar.j()));
            return uVar.f10888j;
        }
        return sVar.f10877a;
    }

    public Object k(int i7) {
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

    public String l() {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = this.f713b + 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = ((Object[]) this.f714c)[i10];
            if (obj instanceof me.d) {
                me.d dVar = (me.d) obj;
                if (kotlin.jvm.internal.j.a(dVar.e(), me.f.f20611c)) {
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
            } else if (obj != qe.g.f55542a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "toString(...)");
        return sb3;
    }

    public boolean m() {
        ColorStateList colorStateList;
        if (((Shader) this.f714c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void n(x2.t tVar, int i7, int i10, e2.u uVar, int i11, Object obj, long j3, long j10) {
        g(new x2.h0(this, tVar, new x2.b0(i7, i10, uVar, i11, obj, h2.l0.h0(j3), h2.l0.h0(j10)), 1));
    }

    public void o(x2.t tVar, int i7, int i10, e2.u uVar, int i11, Object obj, long j3, long j10) {
        g(new x2.h0(this, tVar, new x2.b0(i7, i10, uVar, i11, obj, h2.l0.h0(j3), h2.l0.h0(j10)), 0));
    }

    @Override
    public void onSuccess(Object obj) {
        List list = (List) obj;
        p4.d0 d0Var = ((p4.m0) this.d).h;
        Handler handler = d0Var.f54627l;
        p4.v vVar = (p4.v) this.f714c;
        h2.l0.W(handler, new org.telegram.ui.web.e1(d0Var, vVar, new sp0(this, this.f713b, list, vVar, 21)));
    }

    public void p(x2.t tVar, int i7, int i10, e2.u uVar, int i11, Object obj, long j3, long j10, IOException iOException, boolean z10) {
        g(new yl(this, tVar, new x2.b0(i7, i10, uVar, i11, obj, h2.l0.h0(j3), h2.l0.h0(j10)), iOException, z10));
    }

    public void q(x2.t tVar, int i7, IOException iOException, boolean z10) {
        p(tVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void r(AttributeSet attributeSet, int i7) {
        int resourceId;
        ImageView imageView = (ImageView) this.f714c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f10675f;
        h6.m z10 = h6.m.z(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) z10.f13625c;
        r0.i0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) z10.f13625c, i7);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = b5.a.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m.l1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(z10.o(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(m.l1.b(typedArray.getInt(3, -1), null));
            }
            z10.D();
        } catch (Throwable th2) {
            z10.D();
            throw th2;
        }
    }

    @Override
    public void r0() {
        switch (this.f712a) {
            case 11:
                return;
            default:
                h2.x xVar = (h2.x) this.d;
                byte[] bArr = h2.l0.f13472b;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                return;
        }
    }

    public void s(x2.t tVar, int i7, int i10, e2.u uVar, int i11, Object obj, long j3, long j10, int i12) {
        g(new bg.f0(this, tVar, new x2.b0(i7, i10, uVar, i11, obj, h2.l0.h0(j3), h2.l0.h0(j10)), i12, 11));
    }

    public String toString() {
        switch (this.f712a) {
            case 21:
                return l();
            default:
                return super.toString();
        }
    }

    public xa u(Object obj, Object obj2) {
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

    public xa v(Iterable iterable) {
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
            u(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void w(int i7) {
        x(i7, 200L, er.f34419f);
    }

    public void x(int i7, long j3, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f714c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f714c).cancel();
        }
        int[] iArr = new int[1];
        this.f713b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i7);
        this.f714c = ofInt;
        ofInt.addUpdateListener(new ch.v(23, this, iArr));
        ((ValueAnimator) this.f714c).addListener(new di.y3(this, i7, iArr, 2));
        ((ValueAnimator) this.f714c).setDuration(j3);
        ((ValueAnimator) this.f714c).setInterpolator(interpolator);
        ((ValueAnimator) this.f714c).start();
    }

    public List y(CharSequence charSequence) {
        charSequence.getClass();
        d6.i iVar = (d6.i) this.d;
        iVar.getClass();
        g9.s sVar = new g9.s(iVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (sVar.hasNext()) {
            arrayList.add((String) sVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void z(long j3, int i7, long j10) {
        x2.b0 b0Var = new x2.b0(1, i7, null, 3, null, h2.l0.h0(j3), h2.l0.h0(j10));
        x2.f0 f0Var = (x2.f0) this.f714c;
        f0Var.getClass();
        g(new km(this, f0Var, b0Var, 17));
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

    public xa(uj0 uj0Var) {
        this.f712a = 19;
        this.d = uj0Var;
    }

    public xa(ByteBuffer byteBuffer, int i7, RectF rectF) {
        this.f712a = 22;
        this.f714c = rectF;
        this.f713b = i7;
        try {
            this.d = File.createTempFile("paint", ".bin", org.telegram.messenger.t0.f26609b.getCacheDir());
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

    private final void t() {
    }

    @Override
    public void h(Throwable th2) {
    }

    public xa(ImageView imageView) {
        this.f712a = 13;
        this.f713b = 0;
        this.f714c = imageView;
    }

    public xa(ug.x xVar) {
        this.f712a = 26;
        this.f714c = new SparseArray();
        this.d = xVar;
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
        obj.f3348c = new nb.a(6);
        obj.f3347b = 3;
        this.d = obj;
        this.f714c = gVar;
        this.f713b = 1;
    }

    public xa(d6.i iVar) {
        this.f712a = 8;
        g9.b bVar = g9.b.f12929f;
        this.d = iVar;
        this.f714c = bVar;
        this.f713b = Integer.MAX_VALUE;
    }

    public xa(CopyOnWriteArrayList copyOnWriteArrayList, int i7, x2.f0 f0Var) {
        this.f712a = 25;
        this.d = copyOnWriteArrayList;
        this.f713b = i7;
        this.f714c = f0Var;
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
                int i10 = bg.i.f3256y;
                this.f714c = new bg.d0[i10];
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
