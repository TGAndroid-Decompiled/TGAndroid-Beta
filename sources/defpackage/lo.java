package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
public final class lo {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public lo() {
        this.b = new a98();
        this.c = new a98();
        this.d = new a98();
        this.e = new a98();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a(long r10, defpackage.ey7 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo.a(long, ey7):void");
    }

    public final void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((c34) this.d) != null) {
                c34 c34Var = (c34) this.f;
                c34 c34Var2 = c34Var;
                if (c34Var == null) {
                    Object obj = new Object();
                    this.f = obj;
                    c34Var2 = obj;
                }
                c34Var2.c = null;
                c34Var2.b = false;
                c34Var2.d = null;
                c34Var2.a = false;
                WeakHashMap weakHashMap = ihc.a;
                ColorStateList c = ahc.c(view);
                if (c != null) {
                    c34Var2.b = true;
                    c34Var2.c = c;
                }
                PorterDuff.Mode d = ahc.d(view);
                if (d != null) {
                    c34Var2.a = true;
                    c34Var2.d = d;
                }
                if (c34Var2.b || c34Var2.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = gp.b;
                    vd9.n(background, c34Var2, drawableState);
                    return;
                }
            }
            c34 c34Var3 = (c34) this.e;
            if (c34Var3 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = gp.b;
                vd9.n(background, c34Var3, drawableState2);
                return;
            }
            c34 c34Var4 = (c34) this.d;
            if (c34Var4 != null) {
                int[] drawableState3 = view.getDrawableState();
                PorterDuff.Mode mode3 = gp.b;
                vd9.n(background, c34Var4, drawableState3);
            }
        }
    }

    public final void c() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f;
        byteBuffer.position(0);
        a98 a98Var = (a98) this.b;
        if (a98Var.f == null) {
            a98Var.a();
        }
        float[] fArr = a98Var.f;
        a98 a98Var2 = (a98) this.c;
        if (a98Var2.f == null) {
            a98Var2.a();
        }
        float[] fArr2 = a98Var2.f;
        a98 a98Var3 = (a98) this.d;
        if (a98Var3.f == null) {
            a98Var3.a();
        }
        float[] fArr3 = a98Var3.f;
        a98 a98Var4 = (a98) this.e;
        if (a98Var4.f == null) {
            a98Var4.a();
        }
        float[] fArr4 = a98Var4.f;
        for (int i = 0; i < 200; i++) {
            byteBuffer.put((byte) (fArr2[i] * 255.0f));
            byteBuffer.put((byte) (fArr3[i] * 255.0f));
            byteBuffer.put((byte) (fArr4[i] * 255.0f));
            byteBuffer.put((byte) (fArr[i] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final void d(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            sa9 sa9Var = (sa9) priorityQueue.poll();
            String str = gcc.a;
            int i2 = 0;
            while (true) {
                arrayList = sa9Var.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((ta9) this.b).n(sa9Var.b, (ey7) arrayList.get(i2));
                ((ArrayDeque) this.c).push((ey7) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            sa9 sa9Var2 = (sa9) this.f;
            if (sa9Var2 != null && sa9Var2.b == sa9Var.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(sa9Var);
        }
    }

    public final ColorStateList e() {
        c34 c34Var = (c34) this.e;
        if (c34Var != null) {
            return (ColorStateList) c34Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode f() {
        c34 c34Var = (c34) this.e;
        if (c34Var != null) {
            return (PorterDuff.Mode) c34Var.d;
        }
        return null;
    }

    public final void g(AttributeSet attributeSet, int i) {
        ColorStateList i2;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = w19.z;
        ko9 v = ko9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        View view2 = (View) this.b;
        ihc.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                gp gpVar = (gp) this.c;
                Context context2 = view.getContext();
                int i3 = this.a;
                synchronized (gpVar) {
                    i2 = gpVar.a.i(context2, i3);
                }
                if (i2 != null) {
                    k(i2);
                }
            }
            if (typedArray.hasValue(1)) {
                ahc.f(view, v.m(1));
            }
            if (typedArray.hasValue(2)) {
                ahc.g(view, cr3.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            v.y();
        }
    }

    public final void h() {
        this.a = -1;
        k(null);
        b();
    }

    public final void i(int i) {
        ColorStateList colorStateList;
        this.a = i;
        gp gpVar = (gp) this.c;
        if (gpVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (gpVar) {
                colorStateList = gpVar.a.i(context, i);
            }
        } else {
            colorStateList = null;
        }
        k(colorStateList);
        b();
    }

    public final void j(Runnable runnable) {
        xgb xgbVar = (xgb) this.b;
        if (!xgbVar.a.getLooper().getThread().isAlive()) {
            return;
        }
        xgbVar.e(runnable);
    }

    public final void k(ColorStateList colorStateList) {
        if (colorStateList != null) {
            c34 c34Var = (c34) this.d;
            c34 c34Var2 = c34Var;
            if (c34Var == null) {
                Object obj = new Object();
                this.d = obj;
                c34Var2 = obj;
            }
            c34Var2.c = colorStateList;
            c34Var2.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public final void l(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        this.a = i;
        d(i);
    }

    public final void m(ColorStateList colorStateList) {
        c34 c34Var = (c34) this.e;
        c34 c34Var2 = c34Var;
        if (c34Var == null) {
            Object obj = new Object();
            this.e = obj;
            c34Var2 = obj;
        }
        c34Var2.c = colorStateList;
        c34Var2.b = true;
        b();
    }

    public final void n(PorterDuff.Mode mode) {
        c34 c34Var = (c34) this.e;
        c34 c34Var2 = c34Var;
        if (c34Var == null) {
            Object obj = new Object();
            this.e = obj;
            c34Var2 = obj;
        }
        c34Var2.d = mode;
        c34Var2.a = true;
        b();
    }

    public final boolean o() {
        if (((a98) this.b).b() && ((a98) this.c).b() && ((a98) this.d).b() && ((a98) this.e).b()) {
            return true;
        }
        return false;
    }

    public final void p(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            s64 s64Var = ((j64) this.d).b;
            ((Integer) obj2).getClass();
            int intValue = ((Integer) obj).intValue();
            s64Var.y1();
            s64Var.l.h.b(40, intValue, 0).b();
            s64Var.m.e(21, new yd(intValue, (byte) 4));
        }
    }

    public lo(ta9 ta9Var) {
        this.b = ta9Var;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public lo(Object obj, Looper looper, Looper looper2, vgb vgbVar, j64 j64Var) {
        this.b = vgbVar.a(looper, null);
        this.c = vgbVar.a(looper2, null);
        this.e = obj;
        this.f = obj;
        this.d = j64Var;
    }

    public lo(int[] iArr, u1c[] u1cVarArr, int[] iArr2, int[][][] iArr3, u1c u1cVar) {
        this.b = iArr;
        this.c = u1cVarArr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = u1cVar;
        this.a = iArr.length;
    }

    public lo(View view) {
        this.a = -1;
        this.b = view;
        this.c = gp.a();
    }
}
