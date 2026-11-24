package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.ImageView;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.Utilities;
public class kq implements nj0, ts4 {
    public final byte a;
    public int b;
    public Object c;
    public Object d;

    public kq(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.c = new sk0();
                return;
            case 17:
                this.c = new Object[8];
                this.b = 0;
                return;
            default:
                int i = dl0.y;
                this.c = new do5[i];
                this.d = new Bitmap[i];
                return;
        }
    }

    public static defpackage.kq g(android.content.res.Resources r28, int r29, android.content.res.Resources.Theme r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq.g(android.content.res.Resources, int, android.content.res.Resources$Theme):kq");
    }

    public final void A(long j, int i, long j2) {
        ft6 ft6Var = new ft6(1, i, null, 3, null, hac.i0(j), hac.i0(j2));
        rz6 rz6Var = (rz6) this.c;
        rz6Var.getClass();
        h(new wu2(this, rz6Var, ft6Var, (byte) 18));
    }

    public final void B(String str, o94 o94Var) {
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        int i = (this.b + 1) << 1;
        if (i > length) {
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                objArr = Arrays.copyOf(objArr, i2);
                this.c = objArr;
            } else {
                bh7.j("cannot store more than MAX_VALUE elements");
                return;
            }
        }
        int i3 = this.b;
        int i4 = i3 << 1;
        objArr[i4] = str;
        objArr[i4 + 1] = o94Var;
        this.b = i3 + 1;
    }

    public final void a(int i, int i2) {
        boolean z;
        int i3 = (i2 << 16) + i;
        if (this.b != i3) {
            z = true;
        } else {
            z = false;
        }
        this.b = i3;
        for (int i4 = 0; i4 < dl0.y; i4++) {
            if (z || ((Bitmap[]) this.d)[i4] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i4];
                if (bitmap != null) {
                    Utilities.e.c(new f00(bitmap, (byte) 10));
                }
                ((Bitmap[]) this.d)[i4] = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            }
            do5[] do5VarArr = (do5[]) this.c;
            if (do5VarArr[i4] == null) {
                do5VarArr[i4] = new do5((i2 * i) << 1);
            }
        }
    }

    @Override
    public final mj0 b(vb3 vb3Var, long j) {
        long j2;
        switch (this.a) {
            case 4:
                long j3 = vb3Var.d;
                long k = k(vb3Var);
                long f = vb3Var.f();
                vb3Var.a(Math.max(6, ((gk4) this.c).c), false);
                long k2 = k(vb3Var);
                long f2 = vb3Var.f();
                if (k <= j && k2 > j) {
                    return new mj0(-9223372036854775807L, 0, f);
                }
                if (k2 <= j) {
                    return new mj0(k2, -2, f2);
                }
                return new mj0(k, -1, j3);
            default:
                long j4 = vb3Var.d;
                int min = (int) Math.min(112800L, vb3Var.c - j4);
                yw7 yw7Var = (yw7) this.d;
                yw7Var.K(min);
                vb3Var.d(yw7Var.a, 0, min, false);
                int i = yw7Var.c;
                long j5 = -1;
                long j6 = -1;
                long j7 = -9223372036854775807L;
                while (true) {
                    if (yw7Var.a() >= 188) {
                        byte[] bArr = yw7Var.a;
                        int i2 = yw7Var.b;
                        while (true) {
                            if (i2 < i) {
                                j2 = -9223372036854775807L;
                                if (bArr[i2] != 71) {
                                    i2++;
                                }
                            } else {
                                j2 = -9223372036854775807L;
                            }
                        }
                        int i3 = i2 + 188;
                        if (i3 <= i) {
                            long a = bye.a(yw7Var, i2, this.b);
                            if (a != j2) {
                                long b = ((vqb) this.c).b(a);
                                if (b > j) {
                                    if (j7 == j2) {
                                        return new mj0(b, -1, j4);
                                    }
                                    return new mj0(-9223372036854775807L, 0, j4 + j6);
                                }
                                j7 = b;
                                if (100000 + j7 > j) {
                                    return new mj0(-9223372036854775807L, 0, j4 + i2);
                                }
                                j6 = i2;
                            }
                            yw7Var.N(i3);
                            j5 = i3;
                        }
                    } else {
                        j2 = -9223372036854775807L;
                    }
                }
                if (j7 != j2) {
                    return new mj0(j7, -2, j4 + j5);
                }
                return mj0.d;
        }
    }

    @Override
    public final void c() {
        switch (this.a) {
            case 4:
                return;
            default:
                byte[] bArr = hac.b;
                ((yw7) this.d).L(bArr.length, bArr);
                return;
        }
    }

    public final void d() {
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            vr3.a(drawable);
            s34 s34Var = (s34) this.d;
            if (s34Var != null) {
                int[] drawableState = imageView.getDrawableState();
                PorterDuff.Mode mode = fq.b;
                hc9.n(drawable, s34Var, drawableState);
            }
        }
    }

    public final d89 e(boolean z) {
        po5 po5Var;
        po5 po5Var2;
        if (z && (po5Var2 = (po5) this.d) != null) {
            throw po5Var2.a();
        }
        d89 g = d89.g(this.b, (Object[]) this.c, this);
        if (z && (po5Var = (po5) this.d) != null) {
            throw po5Var.a();
        }
        return g;
    }

    public qo5 f() {
        return e(false);
    }

    public final void h(fu2 fu2Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            uz6 uz6Var = (uz6) it.next();
            hac.X(uz6Var.a, new lj6(fu2Var, uz6Var.b, (byte) 18));
        }
    }

    public final void i(int i, go4 go4Var, int i2, Object obj, long j) {
        h(new cz6(this, new ft6(1, i, go4Var, i2, obj, hac.i0(j), -9223372036854775807L), (byte) 3));
    }

    public final long k(vb3 vb3Var) {
        long j;
        boolean a;
        int h;
        long j2 = vb3Var.c;
        u21 u21Var = (u21) this.d;
        gk4 gk4Var = (gk4) this.c;
        while (true) {
            if (vb3Var.f() < j2 - 6) {
                int i = this.b;
                long f = vb3Var.f();
                yw7 yw7Var = new yw7(17);
                vb3Var.d(yw7Var.a, 0, 2, false);
                if (yw7Var.g(0, ByteOrder.BIG_ENDIAN) != i) {
                    vb3Var.f = 0;
                    vb3Var.a((int) (f - vb3Var.d), false);
                    a = false;
                    j = 6;
                } else {
                    byte[] bArr = yw7Var.a;
                    int i2 = 0;
                    j = 6;
                    while (i2 < 15 && (h = vb3Var.h(2 + i2, 15 - i2, bArr)) != -1) {
                        i2 += h;
                    }
                    yw7Var.M(i2 + 2);
                    vb3Var.f = 0;
                    vb3Var.a((int) (f - vb3Var.d), false);
                    a = oie.a(yw7Var, gk4Var, i, u21Var);
                }
                if (a) {
                    break;
                }
                vb3Var.a(1, false);
            } else {
                j = 6;
                break;
            }
        }
        if (vb3Var.f() >= j2 - j) {
            vb3Var.a((int) (j2 - vb3Var.f()), false);
            return gk4Var.j;
        }
        return u21Var.a;
    }

    public final Object l(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i2 = this.b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    public final String m() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof y6a) {
                y6a y6aVar = (y6a) obj;
                boolean a = rr5.a(y6aVar.e(), xbb.c);
                int[] iArr = (int[]) this.d;
                if (a) {
                    if (iArr[i2] != -1) {
                        sb.append("[");
                        sb.append(((int[]) this.d)[i2]);
                        sb.append("]");
                    }
                } else {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(y6aVar.g(i3));
                    }
                }
            } else if (obj != kg7.c) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final boolean n() {
        ColorStateList colorStateList;
        if (((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public final void o(ea6 ea6Var, int i, int i2, go4 go4Var, int i3, Object obj, long j, long j2) {
        h(new tz6(this, ea6Var, new ft6(i, i2, go4Var, i3, obj, hac.i0(j), hac.i0(j2)), (byte) 1));
    }

    @Override
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        ly6 ly6Var = (ly6) this.d;
        tx6 tx6Var = ly6Var.j;
        sw6 sw6Var = (sw6) this.c;
        int i = this.b;
        tx6Var.getClass();
        tx6 tx6Var2 = ly6Var.j;
        if (i == -1) {
            tx6Var2.t();
            tx6Var2.t.w0(list);
        } else {
            tx6Var2.t();
            tx6Var2.t.Z(i, list);
        }
        me8 me8Var = new me8();
        me8Var.a.b(20);
        me8Var.b();
        tx6Var2.n(sw6Var);
    }

    public final void p(ea6 ea6Var, int i) {
        q(ea6Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void q(ea6 ea6Var, int i, int i2, go4 go4Var, int i3, Object obj, long j, long j2) {
        h(new tz6(this, ea6Var, new ft6(i, i2, go4Var, i3, obj, hac.i0(j), hac.i0(j2)), (byte) 0));
    }

    public final void r(ea6 ea6Var, int i, int i2, go4 go4Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        h(new og(this, ea6Var, new ft6(i, i2, go4Var, i3, obj, hac.i0(j), hac.i0(j2)), iOException, z));
    }

    public final void s(ea6 ea6Var, int i, IOException iOException, boolean z) {
        r(ea6Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public final void t(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = k09.f;
        wm9 v = wm9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        kfc.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = kod.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                vr3.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(v.i(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(vr3.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            v.y();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 6:
                return m();
            default:
                return super.toString();
        }
    }

    public final void u(ea6 ea6Var, int i, int i2, go4 go4Var, int i3, Object obj, long j, long j2, int i4) {
        h(new zn(this, ea6Var, new ft6(i, i2, go4Var, i3, obj, hac.i0(j), hac.i0(j2)), i4, (byte) 5));
    }

    public kq w(Object obj, Object obj2) {
        int i = (this.b + 1) << 1;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, fo5.b(objArr.length, i));
        }
        ntd.a(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 << 1;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public kq x(Set set) {
        if (wi8.A(set)) {
            int size = (set.size() + this.b) << 1;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, fo5.b(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            w(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final void y(int i) {
        z(i, 200L, d53.f);
    }

    public final void z(int i, long j, d53 d53Var) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        this.c = ofInt;
        ofInt.addUpdateListener(new pl(this, iArr, (byte) 24));
        ((ValueAnimator) this.c).addListener(new q12(this, i, iArr, (byte) 1));
        ((ValueAnimator) this.c).setDuration(j);
        ((ValueAnimator) this.c).setInterpolator(d53Var);
        ((ValueAnimator) this.c).start();
    }

    private final void v() {
    }

    @Override
    public final void j(Throwable th) {
    }

    public kq(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 18;
        this.b = i;
        this.d = str;
        this.c = arrayList;
    }

    public kq(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public kq(r59 r59Var) {
        this.a = (byte) 12;
        this.d = r59Var;
    }

    public kq(ImageView imageView) {
        this.a = (byte) 0;
        this.b = 0;
        this.c = imageView;
    }

    public kq(dq9 dq9Var) {
        this.a = (byte) 14;
        this.c = new SparseArray();
        this.d = dq9Var;
        this.b = -1;
    }

    public kq(gk4 gk4Var, int i) {
        this.a = (byte) 4;
        this.c = gk4Var;
        this.b = i;
        this.d = new Object();
    }

    public kq(int i, vqb vqbVar) {
        this.a = (byte) 16;
        this.b = i;
        this.c = vqbVar;
        this.d = new yw7();
    }

    public kq(CopyOnWriteArrayList copyOnWriteArrayList, int i, rz6 rz6Var) {
        this.a = (byte) 9;
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = rz6Var;
    }

    public kq(int i) {
        this.a = (byte) 5;
        this.c = new Object[i << 1];
        this.b = 0;
    }

    public kq(byte b, boolean z) {
        this.a = b;
    }

    public kq(go4 go4Var, int i, String str) {
        this.a = (byte) 7;
        this.c = go4Var;
        this.b = i;
        this.d = str;
    }

    public kq(ly6 ly6Var, sw6 sw6Var, int i) {
        this.a = (byte) 8;
        this.d = ly6Var;
        this.c = sw6Var;
        this.b = i;
    }
}
