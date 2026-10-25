package e2;

import a8.yb;
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
public final class c {
    public int f9637a;
    public final Object f9638b;
    public final Object f9639c;
    public Object d;
    public Object e;
    public Object f9640f;

    public c(View view) {
        this.f9637a = -1;
        this.f9638b = view;
        this.f9639c = m.q.a();
    }

    public void a(long r10, e2.x r12) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.x):void");
    }

    public void b() {
        View view = (View) this.f9638b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((d3) this.d) != null) {
                if (((d3) this.f9640f) == null) {
                    this.f9640f = new Object();
                }
                d3 d3Var = (d3) this.f9640f;
                d3Var.f17707c = null;
                d3Var.f17706b = false;
                d3Var.d = null;
                d3Var.f17705a = false;
                WeakHashMap weakHashMap = r0.i0.f47105a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    d3Var.f17706b = true;
                    d3Var.f17707c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    d3Var.f17705a = true;
                    d3Var.d = d;
                }
                if (d3Var.f17706b || d3Var.f17705a) {
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
            f2.v vVar = (f2.v) priorityQueue.poll();
            String str = n0.f9692a;
            int i11 = 0;
            while (true) {
                arrayList = vVar.f10131a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.w) this.f9638b).e(vVar.f10132b, (x) arrayList.get(i11));
                ((ArrayDeque) this.f9639c).push((x) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.v vVar2 = (f2.v) this.f9640f;
            if (vVar2 != null && vVar2.f10132b == vVar.f10132b) {
                this.f9640f = null;
            }
            ((ArrayDeque) this.d).push(vVar);
        }
    }

    public ColorStateList d() {
        d3 d3Var = (d3) this.e;
        if (d3Var != null) {
            return (ColorStateList) d3Var.f17707c;
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
        View view = (View) this.f9638b;
        Context context = view.getContext();
        int[] iArr = f.a.f10046z;
        k6.c D = k6.c.D(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) D.f16407c;
        View view2 = (View) this.f9638b;
        r0.i0.j(view2, view2.getContext(), iArr, attributeSet, (TypedArray) D.f16407c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f9637a = typedArray.getResourceId(0, -1);
                m.q qVar = (m.q) this.f9639c;
                Context context2 = view.getContext();
                int i12 = this.f9637a;
                synchronized (qVar) {
                    i11 = qVar.f17821a.i(context2, i12);
                }
                if (i11 != null) {
                    j(i11);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, D.v(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, l1.b(typedArray.getInt(2, -1), null));
            }
            D.E();
        } catch (Throwable th2) {
            D.E();
            throw th2;
        }
    }

    public void g() {
        this.f9637a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f9637a = i10;
        m.q qVar = (m.q) this.f9639c;
        if (qVar != null) {
            Context context = ((View) this.f9638b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f17821a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        i0 i0Var = (i0) this.f9638b;
        if (!i0Var.f9672a.getLooper().getThread().isAlive()) {
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
            d3Var.f17707c = colorStateList;
            d3Var.f17706b = true;
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
        yb.p(z10);
        this.f9637a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((d3) this.e) == null) {
            this.e = new Object();
        }
        d3 d3Var = (d3) this.e;
        d3Var.f17707c = colorStateList;
        d3Var.f17706b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((d3) this.e) == null) {
            this.e = new Object();
        }
        d3 d3Var = (d3) this.e;
        d3Var.d = mode;
        d3Var.f17705a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            i2.j0 j0Var = ((i2.x) this.d).f13787b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            j0Var.F1();
            j0Var.t1(1, 10, num);
            j0Var.t1(2, 10, num);
            j0Var.f13603m.e(21, new i2.w(intValue, 1));
        }
    }

    public c(f2.w wVar) {
        this.f9638b = wVar;
        this.f9639c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.f9637a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, g0 g0Var, i2.x xVar) {
        this.f9638b = g0Var.a(looper, null);
        this.f9639c = g0Var.a(looper2, null);
        this.e = obj;
        this.f9640f = obj;
        this.d = xVar;
    }
}
