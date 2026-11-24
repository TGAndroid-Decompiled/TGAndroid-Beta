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
public class kp implements ni0, sq4 {
    public final byte a;
    public int b;
    public Object c;
    public Object d;

    public kp(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.c = new sj0();
                return;
            case 17:
                this.c = new Object[8];
                this.b = 0;
                return;
            default:
                int i = dk0.y;
                this.c = new dm5[i];
                this.d = new Bitmap[i];
                return;
        }
    }

    public static defpackage.kp g(android.content.res.Resources r28, int r29, android.content.res.Resources.Theme r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp.g(android.content.res.Resources, int, android.content.res.Resources$Theme):kp");
    }

    public final void A(long j, int i, long j2) {
        fr6 fr6Var = new fr6(1, i, null, 3, null, g8c.i0(j), g8c.i0(j2));
        rx6 rx6Var = (rx6) this.c;
        rx6Var.getClass();
        h(new lt2(this, rx6Var, fr6Var, (byte) 18));
    }

    public final void B(String str, f84 f84Var) {
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
                fi7.g("cannot store more than MAX_VALUE elements");
                return;
            }
        }
        int i3 = this.b;
        int i4 = i3 << 1;
        objArr[i4] = str;
        objArr[i4 + 1] = f84Var;
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
        for (int i4 = 0; i4 < dk0.y; i4++) {
            if (z || ((Bitmap[]) this.d)[i4] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i4];
                if (bitmap != null) {
                    Utilities.e.c(new oz(bitmap, (byte) 8));
                }
                ((Bitmap[]) this.d)[i4] = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            }
            dm5[] dm5VarArr = (dm5[]) this.c;
            if (dm5VarArr[i4] == null) {
                dm5VarArr[i4] = new dm5((i2 * i) << 1);
            }
        }
    }

    public final void b() {
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            lq3.a(drawable);
            h24 h24Var = (h24) this.d;
            if (h24Var != null) {
                int[] drawableState = imageView.getDrawableState();
                PorterDuff.Mode mode = fp.b;
                ha9.n(drawable, h24Var, drawableState);
            }
        }
    }

    public final b69 c(boolean z) {
        pm5 pm5Var;
        pm5 pm5Var2;
        if (z && (pm5Var2 = (pm5) this.d) != null) {
            throw pm5Var2.a();
        }
        b69 g = b69.g(this.b, (Object[]) this.c, this);
        if (z && (pm5Var = (pm5) this.d) != null) {
            throw pm5Var.a();
        }
        return g;
    }

    @Override
    public final mi0 d(ja3 ja3Var, long j) {
        long j2;
        switch (this.a) {
            case 4:
                long j3 = ja3Var.d;
                long j4 = j(ja3Var);
                long f = ja3Var.f();
                ja3Var.a(Math.max(6, ((ci4) this.c).c), false);
                long j5 = j(ja3Var);
                long f2 = ja3Var.f();
                if (j4 <= j && j5 > j) {
                    return new mi0(-9223372036854775807L, 0, f);
                }
                if (j5 <= j) {
                    return new mi0(j5, -2, f2);
                }
                return new mi0(j4, -1, j3);
            default:
                long j6 = ja3Var.d;
                int min = (int) Math.min(112800L, ja3Var.c - j6);
                xu7 xu7Var = (xu7) this.d;
                xu7Var.K(min);
                ja3Var.d(xu7Var.a, 0, min, false);
                int i = xu7Var.c;
                long j7 = -1;
                long j8 = -1;
                long j9 = -9223372036854775807L;
                while (true) {
                    if (xu7Var.a() >= 188) {
                        byte[] bArr = xu7Var.a;
                        int i2 = xu7Var.b;
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
                            long a = zve.a(xu7Var, i2, this.b);
                            if (a != j2) {
                                long b = ((uob) this.c).b(a);
                                if (b > j) {
                                    if (j9 == j2) {
                                        return new mi0(b, -1, j6);
                                    }
                                    return new mi0(-9223372036854775807L, 0, j6 + j8);
                                }
                                j9 = b;
                                if (100000 + j9 > j) {
                                    return new mi0(-9223372036854775807L, 0, j6 + i2);
                                }
                                j8 = i2;
                            }
                            xu7Var.N(i3);
                            j7 = i3;
                        }
                    } else {
                        j2 = -9223372036854775807L;
                    }
                }
                if (j9 != j2) {
                    return new mi0(j9, -2, j6 + j7);
                }
                return mi0.d;
        }
    }

    public qm5 e() {
        return c(false);
    }

    @Override
    public final void f() {
        switch (this.a) {
            case 4:
                return;
            default:
                byte[] bArr = g8c.b;
                ((xu7) this.d).L(bArr.length, bArr);
                return;
        }
    }

    public final void h(us2 us2Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ux6 ux6Var = (ux6) it.next();
            g8c.X(ux6Var.a, new oh6(us2Var, ux6Var.b, (byte) 17));
        }
    }

    public final void i(int i, fm4 fm4Var, int i2, Object obj, long j) {
        h(new dx6(this, new fr6(1, i, fm4Var, i2, obj, g8c.i0(j), -9223372036854775807L), (byte) 2));
    }

    public final long j(ja3 ja3Var) {
        long j;
        boolean a;
        int i;
        long j2 = ja3Var.c;
        m11 m11Var = (m11) this.d;
        ci4 ci4Var = (ci4) this.c;
        while (true) {
            if (ja3Var.f() < j2 - 6) {
                int i2 = this.b;
                long f = ja3Var.f();
                xu7 xu7Var = new xu7(17);
                ja3Var.d(xu7Var.a, 0, 2, false);
                if (xu7Var.g(0, ByteOrder.BIG_ENDIAN) != i2) {
                    ja3Var.f = 0;
                    ja3Var.a((int) (f - ja3Var.d), false);
                    a = false;
                    j = 6;
                } else {
                    byte[] bArr = xu7Var.a;
                    int i3 = 0;
                    j = 6;
                    while (i3 < 15 && (i = ja3Var.i(2 + i3, 15 - i3, bArr)) != -1) {
                        i3 += i;
                    }
                    xu7Var.M(i3 + 2);
                    ja3Var.f = 0;
                    ja3Var.a((int) (f - ja3Var.d), false);
                    a = nge.a(xu7Var, ci4Var, i2, m11Var);
                }
                if (a) {
                    break;
                }
                ja3Var.a(1, false);
            } else {
                j = 6;
                break;
            }
        }
        if (ja3Var.f() >= j2 - j) {
            ja3Var.a((int) (j2 - ja3Var.f()), false);
            return ci4Var.j;
        }
        return m11Var.a;
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
            if (obj instanceof w4a) {
                w4a w4aVar = (w4a) obj;
                boolean a = rp5.a(w4aVar.e(), v9b.c);
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
                        sb.append(w4aVar.g(i3));
                    }
                }
            } else if (obj != ie7.c) {
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

    public final void o(f86 f86Var, int i, int i2, fm4 fm4Var, int i3, Object obj, long j, long j2) {
        h(new tx6(this, f86Var, new fr6(i, i2, fm4Var, i3, obj, g8c.i0(j), g8c.i0(j2)), (byte) 1));
    }

    @Override
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        lw6 lw6Var = (lw6) this.d;
        tv6 tv6Var = lw6Var.j;
        su6 su6Var = (su6) this.c;
        int i = this.b;
        tv6Var.getClass();
        tv6 tv6Var2 = lw6Var.j;
        if (i == -1) {
            tv6Var2.t();
            tv6Var2.t.w0(list);
        } else {
            tv6Var2.t();
            tv6Var2.t.Z(i, list);
        }
        jc8 jc8Var = new jc8();
        jc8Var.a.b(20);
        jc8Var.b();
        tv6Var2.n(su6Var);
    }

    public final void p(f86 f86Var, int i) {
        q(f86Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void q(f86 f86Var, int i, int i2, fm4 fm4Var, int i3, Object obj, long j, long j2) {
        h(new tx6(this, f86Var, new fr6(i, i2, fm4Var, i3, obj, g8c.i0(j), g8c.i0(j2)), (byte) 0));
    }

    public final void r(f86 f86Var, int i, int i2, fm4 fm4Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        h(new pf(this, f86Var, new fr6(i, i2, fm4Var, i3, obj, g8c.i0(j), g8c.i0(j2)), iOException, z));
    }

    public final void s(f86 f86Var, int i, IOException iOException, boolean z) {
        r(f86Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public final void t(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = jy8.f;
        vk9 v = vk9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        jdc.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = hmd.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                lq3.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(v.m(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(lq3.b(typedArray.getInt(3, -1), null));
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

    public final void u(f86 f86Var, int i, int i2, fm4 fm4Var, int i3, Object obj, long j, long j2, int i4) {
        h(new zm(this, f86Var, new fr6(i, i2, fm4Var, i3, obj, g8c.i0(j), g8c.i0(j2)), i4, (byte) 5));
    }

    public kp w(Object obj, Object obj2) {
        int i = (this.b + 1) << 1;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, fm5.b(objArr.length, i));
        }
        krd.a(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 << 1;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public kp x(Set set) {
        if (ug8.A(set)) {
            int size = (set.size() + this.b) << 1;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, fm5.b(objArr.length, size));
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
        z(i, 200L, s33.f);
    }

    public final void z(int i, long j, s33 s33Var) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        this.c = ofInt;
        ofInt.addUpdateListener(new pk(this, iArr, (byte) 24));
        ((ValueAnimator) this.c).addListener(new f02(this, i, iArr, (byte) 1));
        ((ValueAnimator) this.c).setDuration(j);
        ((ValueAnimator) this.c).setInterpolator(s33Var);
        ((ValueAnimator) this.c).start();
    }

    private final void v() {
    }

    @Override
    public final void k(Throwable th) {
    }

    public kp(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 18;
        this.b = i;
        this.d = str;
        this.c = arrayList;
    }

    public kp(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public kp(o39 o39Var) {
        this.a = (byte) 12;
        this.d = o39Var;
    }

    public kp(ImageView imageView) {
        this.a = (byte) 0;
        this.b = 0;
        this.c = imageView;
    }

    public kp(ho9 ho9Var) {
        this.a = (byte) 14;
        this.c = new SparseArray();
        this.d = ho9Var;
        this.b = -1;
    }

    public kp(ci4 ci4Var, int i) {
        this.a = (byte) 4;
        this.c = ci4Var;
        this.b = i;
        this.d = new Object();
    }

    public kp(int i, uob uobVar) {
        this.a = (byte) 16;
        this.b = i;
        this.c = uobVar;
        this.d = new xu7();
    }

    public kp(CopyOnWriteArrayList copyOnWriteArrayList, int i, rx6 rx6Var) {
        this.a = (byte) 9;
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = rx6Var;
    }

    public kp(int i) {
        this.a = (byte) 5;
        this.c = new Object[i << 1];
        this.b = 0;
    }

    public kp(byte b, boolean z) {
        this.a = b;
    }

    public kp(fm4 fm4Var, int i, String str) {
        this.a = (byte) 7;
        this.c = fm4Var;
        this.b = i;
        this.d = str;
    }

    public kp(lw6 lw6Var, su6 su6Var, int i) {
        this.a = (byte) 8;
        this.d = lw6Var;
        this.c = su6Var;
        this.b = i;
    }
}
