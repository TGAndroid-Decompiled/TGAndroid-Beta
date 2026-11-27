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
public class lp implements oi0, ws4, aea {
    public final byte a;
    public int b;
    public Object c;
    public Object d;

    public lp(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.c = new tj0();
                return;
            case 18:
                this.c = new Object[8];
                this.b = 0;
                return;
            default:
                int i = ek0.y;
                this.c = new go5[i];
                this.d = new Bitmap[i];
                return;
        }
    }

    public static defpackage.lp g(android.content.res.Resources r28, int r29, android.content.res.Resources.Theme r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.g(android.content.res.Resources, int, android.content.res.Resources$Theme):lp");
    }

    public final void A(int i, long j, k43 k43Var) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        this.c = ofInt;
        ofInt.addUpdateListener(new lk(this, iArr, (byte) 24));
        ((ValueAnimator) this.c).addListener(new v02(this, i, iArr, (byte) 1));
        ((ValueAnimator) this.c).setDuration(j);
        ((ValueAnimator) this.c).setInterpolator(k43Var);
        ((ValueAnimator) this.c).start();
    }

    public final void B(long j, int i, long j2) {
        jt6 jt6Var = new jt6(1, i, null, 3, null, gcc.i0(j), gcc.i0(j2));
        vz6 vz6Var = (vz6) this.c;
        vz6Var.getClass();
        h(new fu2(this, vz6Var, jt6Var, (byte) 18));
    }

    public final void C(String str, a94 a94Var) {
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
                hz6.e("cannot store more than MAX_VALUE elements");
                return;
            }
        }
        int i3 = this.b;
        int i4 = i3 << 1;
        objArr[i4] = str;
        objArr[i4 + 1] = a94Var;
        this.b = i3 + 1;
    }

    @Override
    public final boolean E() {
        lm7 lm7Var = (lm7) this.d;
        lm7Var.F0(lm7Var.n0(this.b, (r47) this.c, "forward", "copy_link"));
        return false;
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
        for (int i4 = 0; i4 < ek0.y; i4++) {
            if (z || ((Bitmap[]) this.d)[i4] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i4];
                if (bitmap != null) {
                    Utilities.e.c(new pz(bitmap, (byte) 8));
                }
                ((Bitmap[]) this.d)[i4] = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            }
            go5[] go5VarArr = (go5[]) this.c;
            if (go5VarArr[i4] == null) {
                go5VarArr[i4] = new go5((i2 * i) << 1);
            }
        }
    }

    public final void b() {
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            cr3.a(drawable);
            c34 c34Var = (c34) this.d;
            if (c34Var != null) {
                int[] drawableState = imageView.getDrawableState();
                PorterDuff.Mode mode = gp.b;
                vd9.n(drawable, c34Var, drawableState);
            }
        }
    }

    @Override
    public final ni0 c(cb3 cb3Var, long j) {
        long j2;
        switch (this.a) {
            case 4:
                long j3 = cb3Var.d;
                long j4 = j(cb3Var);
                long e = cb3Var.e();
                cb3Var.a(Math.max(6, ((gk4) this.c).c), false);
                long j5 = j(cb3Var);
                long e2 = cb3Var.e();
                if (j4 <= j && j5 > j) {
                    return new ni0(-9223372036854775807L, 0, e);
                }
                if (j5 <= j) {
                    return new ni0(j5, -2, e2);
                }
                return new ni0(j4, -1, j3);
            default:
                long j6 = cb3Var.d;
                int min = (int) Math.min(112800L, cb3Var.c - j6);
                ey7 ey7Var = (ey7) this.d;
                ey7Var.K(min);
                cb3Var.d(ey7Var.a, 0, min, false);
                int i = ey7Var.c;
                long j7 = -1;
                long j8 = -1;
                long j9 = -9223372036854775807L;
                while (true) {
                    if (ey7Var.a() >= 188) {
                        byte[] bArr = ey7Var.a;
                        int i2 = ey7Var.b;
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
                            long a = r0f.a(ey7Var, i2, this.b);
                            if (a != j2) {
                                long b = ((usb) this.c).b(a);
                                if (b > j) {
                                    if (j9 == j2) {
                                        return new ni0(b, -1, j6);
                                    }
                                    return new ni0(-9223372036854775807L, 0, j6 + j8);
                                }
                                j9 = b;
                                if (100000 + j9 > j) {
                                    return new ni0(-9223372036854775807L, 0, j6 + i2);
                                }
                                j8 = i2;
                            }
                            ey7Var.N(i3);
                            j7 = i3;
                        }
                    } else {
                        j2 = -9223372036854775807L;
                    }
                }
                if (j9 != j2) {
                    return new ni0(j9, -2, j6 + j7);
                }
                return ni0.d;
        }
    }

    public final o99 d(boolean z) {
        so5 so5Var;
        so5 so5Var2;
        if (z && (so5Var2 = (so5) this.d) != null) {
            throw so5Var2.a();
        }
        o99 g = o99.g(this.b, (Object[]) this.c, this);
        if (z && (so5Var = (so5) this.d) != null) {
            throw so5Var.a();
        }
        return g;
    }

    public to5 e() {
        return d(false);
    }

    @Override
    public final void f() {
        switch (this.a) {
            case 4:
                return;
            default:
                byte[] bArr = gcc.b;
                ((ey7) this.d).L(bArr.length, bArr);
                return;
        }
    }

    public final void h(ot2 ot2Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            yz6 yz6Var = (yz6) it.next();
            gcc.X(yz6Var.a, new mn6(ot2Var, yz6Var.b, (byte) 14));
        }
    }

    public final void i(int i, ko4 ko4Var, int i2, Object obj, long j) {
        h(new rm6(this, new jt6(1, i, ko4Var, i2, obj, gcc.i0(j), -9223372036854775807L), (byte) 7));
    }

    public final long j(cb3 cb3Var) {
        long j;
        boolean a;
        int i;
        long j2 = cb3Var.c;
        v11 v11Var = (v11) this.d;
        gk4 gk4Var = (gk4) this.c;
        while (true) {
            if (cb3Var.e() < j2 - 6) {
                int i2 = this.b;
                long e = cb3Var.e();
                ey7 ey7Var = new ey7(17);
                cb3Var.d(ey7Var.a, 0, 2, false);
                if (ey7Var.g(0, ByteOrder.BIG_ENDIAN) != i2) {
                    cb3Var.f = 0;
                    cb3Var.a((int) (e - cb3Var.d), false);
                    a = false;
                    j = 6;
                } else {
                    byte[] bArr = ey7Var.a;
                    int i3 = 0;
                    j = 6;
                    while (i3 < 15 && (i = cb3Var.i(2 + i3, 15 - i3, bArr)) != -1) {
                        i3 += i;
                    }
                    ey7Var.M(i3 + 2);
                    cb3Var.f = 0;
                    cb3Var.a((int) (e - cb3Var.d), false);
                    a = hle.a(ey7Var, gk4Var, i2, v11Var);
                }
                if (a) {
                    break;
                }
                cb3Var.a(1, false);
            } else {
                j = 6;
                break;
            }
        }
        if (cb3Var.e() >= j2 - j) {
            cb3Var.a((int) (j2 - cb3Var.e()), false);
            return gk4Var.j;
        }
        return v11Var.a;
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
            if (obj instanceof o8a) {
                o8a o8aVar = (o8a) obj;
                boolean a = ur5.a(o8aVar.e(), tdb.c);
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
                        sb.append(o8aVar.g(i3));
                    }
                }
            } else if (obj != rg7.c) {
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

    public final void o(ja6 ja6Var, int i, int i2, ko4 ko4Var, int i3, Object obj, long j, long j2) {
        h(new xz6(this, ja6Var, new jt6(i, i2, ko4Var, i3, obj, gcc.i0(j), gcc.i0(j2)), (byte) 1));
    }

    @Override
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        qy6 qy6Var = (qy6) this.d;
        yx6 yx6Var = qy6Var.j;
        xw6 xw6Var = (xw6) this.c;
        int i = this.b;
        yx6Var.getClass();
        yx6 yx6Var2 = qy6Var.j;
        if (i == -1) {
            yx6Var2.t();
            yx6Var2.t.w0(list);
        } else {
            yx6Var2.t();
            yx6Var2.t.Z(i, list);
        }
        yf8 yf8Var = new yf8();
        yf8Var.a.b(20);
        yf8Var.b();
        yx6Var2.n(xw6Var);
    }

    public final void p(ja6 ja6Var, int i) {
        q(ja6Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void q(ja6 ja6Var, int i, int i2, ko4 ko4Var, int i3, Object obj, long j, long j2) {
        h(new xz6(this, ja6Var, new jt6(i, i2, ko4Var, i3, obj, gcc.i0(j), gcc.i0(j2)), (byte) 0));
    }

    public final void r(ja6 ja6Var, int i, int i2, ko4 ko4Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        h(new sf(this, ja6Var, new jt6(i, i2, ko4Var, i3, obj, gcc.i0(j), gcc.i0(j2)), iOException, z));
    }

    public final void s(ja6 ja6Var, int i, IOException iOException, boolean z) {
        r(ja6Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public final void t(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = w19.f;
        ko9 v = ko9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        ihc.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = yqd.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                cr3.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(v.m(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(cr3.b(typedArray.getInt(3, -1), null));
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

    public final void v(ja6 ja6Var, int i, int i2, ko4 ko4Var, int i3, Object obj, long j, long j2, int i4) {
        h(new an(this, ja6Var, new jt6(i, i2, ko4Var, i3, obj, gcc.i0(j), gcc.i0(j2)), i4, (byte) 5));
    }

    public lp x(Object obj, Object obj2) {
        int i = (this.b + 1) << 1;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, io5.b(objArr.length, i));
        }
        awd.a(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 << 1;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public lp y(Set set) {
        if (ik8.A(set)) {
            int size = (set.size() + this.b) << 1;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, io5.b(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            x(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final void z(int i) {
        A(i, 200L, k43.f);
    }

    private final void w() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void k(Throwable th) {
    }

    public lp(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 19;
        this.b = i;
        this.d = str;
        this.c = arrayList;
    }

    public lp(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }

    public lp(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public lp(d79 d79Var) {
        this.a = (byte) 13;
        this.d = d79Var;
    }

    public lp(ImageView imageView) {
        this.a = (byte) 0;
        this.b = 0;
        this.c = imageView;
    }

    public lp(vr9 vr9Var) {
        this.a = (byte) 15;
        this.c = new SparseArray();
        this.d = vr9Var;
        this.b = -1;
    }

    public lp(gk4 gk4Var, int i) {
        this.a = (byte) 4;
        this.c = gk4Var;
        this.b = i;
        this.d = new Object();
    }

    public lp(int i, usb usbVar) {
        this.a = (byte) 17;
        this.b = i;
        this.c = usbVar;
        this.d = new ey7();
    }

    public lp(int i) {
        this.a = (byte) 5;
        this.c = new Object[i << 1];
        this.b = 0;
    }

    public lp(byte b, boolean z) {
        this.a = b;
    }

    public lp(ko4 ko4Var, int i, String str) {
        this.a = (byte) 7;
        this.c = ko4Var;
        this.b = i;
        this.d = str;
    }

    public lp(qy6 qy6Var, xw6 xw6Var, int i) {
        this.a = (byte) 8;
        this.d = qy6Var;
        this.c = xw6Var;
        this.b = i;
    }
}
