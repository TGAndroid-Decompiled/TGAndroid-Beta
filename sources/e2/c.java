package e2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.d3;
import m.l1;
import v7.u6;
public final class c {
    public int f8322a;
    public final Object f8323b;
    public final Object f8324c;
    public Object d;
    public Object e;
    public Object f8325f;

    public c(View view) {
        this.f8322a = -1;
        this.f8323b = view;
        this.f8324c = m.q.a();
    }

    public void a(long r10, e2.x r12) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.x):void");
    }

    public void b() {
        View view = (View) this.f8323b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((d3) this.d) != null) {
                if (((d3) this.f8325f) == null) {
                    this.f8325f = new Object();
                }
                d3 d3Var = (d3) this.f8325f;
                d3Var.f15095c = null;
                d3Var.f15094b = false;
                d3Var.d = null;
                d3Var.f15093a = false;
                WeakHashMap weakHashMap = r0.j0.f43732a;
                ColorStateList c10 = r0.b0.c(view);
                if (c10 != null) {
                    d3Var.f15094b = true;
                    d3Var.f15095c = c10;
                }
                PorterDuff.Mode d = r0.b0.d(view);
                if (d != null) {
                    d3Var.f15093a = true;
                    d3Var.d = d;
                }
                if (d3Var.f15094b || d3Var.f15093a) {
                    m.q.d(background, d3Var, view.getDrawableState());
                    return;
                }
            }
            d3 d3Var2 = (d3) this.e;
            if (d3Var2 != null) {
                m.q.d(background, d3Var2, view.getDrawableState());
                return;
            }
            d3 d3Var3 = (d3) this.d;
            if (d3Var3 != null) {
                m.q.d(background, d3Var3, view.getDrawableState());
            }
        }
    }

    public void c(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i10) {
            f2.u uVar = (f2.u) priorityQueue.poll();
            String str = m0.f8372a;
            int i11 = 0;
            while (true) {
                arrayList = uVar.f8909a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.v) this.f8323b).a(uVar.f8910b, (x) arrayList.get(i11));
                ((ArrayDeque) this.f8324c).push((x) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.u uVar2 = (f2.u) this.f8325f;
            if (uVar2 != null && uVar2.f8910b == uVar.f8910b) {
                this.f8325f = null;
            }
            ((ArrayDeque) this.d).push(uVar);
        }
    }

    public ColorStateList d() {
        d3 d3Var = (d3) this.e;
        if (d3Var != null) {
            return (ColorStateList) d3Var.f15095c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        d3 d3Var = (d3) this.e;
        if (d3Var != null) {
            return (PorterDuff.Mode) d3Var.d;
        }
        return null;
    }

    public void f(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = (View) this.f8323b;
        Context context = view.getContext();
        int[] iArr = f.a.f8823z;
        li.k P = li.k.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.f14821c;
        View view2 = (View) this.f8323b;
        r0.j0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) P.f14821c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f8322a = typedArray.getResourceId(0, -1);
                m.q qVar = (m.q) this.f8324c;
                Context context2 = view.getContext();
                int i12 = this.f8322a;
                synchronized (qVar) {
                    i11 = qVar.f15215a.i(context2, i12);
                }
                if (i11 != null) {
                    j(i11);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.b0.f(view, P.E(1));
            }
            if (typedArray.hasValue(2)) {
                r0.b0.g(view, l1.b(typedArray.getInt(2, -1), null));
            }
            P.Q();
        } catch (Throwable th2) {
            P.Q();
            throw th2;
        }
    }

    public void g() {
        this.f8322a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f8322a = i10;
        m.q qVar = (m.q) this.f8324c;
        if (qVar != null) {
            Context context = ((View) this.f8323b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f15215a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        i0 i0Var = (i0) this.f8323b;
        if (!i0Var.f8357a.getLooper().getThread().isAlive()) {
            return;
        }
        i0Var.d(runnable);
    }

    public void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((d3) this.d) == null) {
                this.d = new Object();
            }
            d3 d3Var = (d3) this.d;
            d3Var.f15095c = colorStateList;
            d3Var.f15094b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void k(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        this.f8322a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((d3) this.e) == null) {
            this.e = new Object();
        }
        d3 d3Var = (d3) this.e;
        d3Var.f15095c = colorStateList;
        d3Var.f15094b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((d3) this.e) == null) {
            this.e = new Object();
        }
        d3 d3Var = (d3) this.e;
        d3Var.d = mode;
        d3Var.f15093a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            i2.h0 h0Var = ((i2.w) this.d).f11210b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            h0Var.F1();
            h0Var.t1(1, 10, num);
            h0Var.t1(2, 10, num);
            h0Var.f11001m.e(21, new i2.v(intValue, 1));
        }
    }

    public c(f2.v vVar) {
        this.f8323b = vVar;
        this.f8324c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.f8322a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, g0 g0Var, i2.w wVar) {
        this.f8323b = g0Var.a(looper, null);
        this.f8324c = g0Var.a(looper2, null);
        this.e = obj;
        this.f8325f = obj;
        this.d = wVar;
    }
}
