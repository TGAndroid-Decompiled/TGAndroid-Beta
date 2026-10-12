package e2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import i2.f0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.d3;
import m.f3;
import m.m1;
import r0.i0;
public final class c {
    public int f8523a;
    public final Object f8524b;
    public final Object f8525c;
    public Object d;
    public Object f8526e;
    public Object f8527f;

    public c(View view) {
        this.f8523a = -1;
        this.f8524b = view;
        this.f8525c = m.q.a();
    }

    public void a(long r9, e2.v r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.v):void");
    }

    public void b() {
        View view = (View) this.f8524b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((d3) this.d) != null) {
                if (((d3) this.f8527f) == null) {
                    this.f8527f = new Object();
                }
                d3 d3Var = (d3) this.f8527f;
                d3Var.f15407c = null;
                d3Var.f15406b = false;
                d3Var.d = null;
                d3Var.f15405a = false;
                WeakHashMap weakHashMap = i0.f46989a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    d3Var.f15406b = true;
                    d3Var.f15407c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    d3Var.f15405a = true;
                    d3Var.d = d;
                }
                if (d3Var.f15406b || d3Var.f15405a) {
                    m.q.d(background, d3Var, view.getDrawableState());
                    return;
                }
            }
            d3 d3Var2 = (d3) this.f8526e;
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
        PriorityQueue priorityQueue = (PriorityQueue) this.f8526e;
        while (priorityQueue.size() > i10) {
            f2.s sVar = (f2.s) priorityQueue.poll();
            String str = d0.f8529a;
            int i11 = 0;
            while (true) {
                arrayList = sVar.f9619a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.t) this.f8524b).b(sVar.f9620b, (v) arrayList.get(i11));
                ((ArrayDeque) this.f8525c).push((v) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.s sVar2 = (f2.s) this.f8527f;
            if (sVar2 != null && sVar2.f9620b == sVar.f9620b) {
                this.f8527f = null;
            }
            ((ArrayDeque) this.d).push(sVar);
        }
    }

    public ColorStateList d() {
        d3 d3Var = (d3) this.f8526e;
        if (d3Var != null) {
            return (ColorStateList) d3Var.f15407c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        d3 d3Var = (d3) this.f8526e;
        if (d3Var != null) {
            return (PorterDuff.Mode) d3Var.d;
        }
        return null;
    }

    public void f(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = (View) this.f8524b;
        Context context = view.getContext();
        int[] iArr = f.a.f9545z;
        f3 Q = f3.Q(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) Q.f15425c;
        View view2 = (View) this.f8524b;
        i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) Q.f15425c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f8523a = typedArray.getResourceId(0, -1);
                m.q qVar = (m.q) this.f8525c;
                Context context2 = view.getContext();
                int i12 = this.f8523a;
                synchronized (qVar) {
                    i11 = qVar.f15539a.i(context2, i12);
                }
                if (i11 != null) {
                    j(i11);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, Q.D(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, m1.b(typedArray.getInt(2, -1), null));
            }
            Q.R();
        } catch (Throwable th2) {
            Q.R();
            throw th2;
        }
    }

    public void g() {
        this.f8523a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f8523a = i10;
        m.q qVar = (m.q) this.f8525c;
        if (qVar != null) {
            Context context = ((View) this.f8524b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f15539a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        z zVar = (z) this.f8524b;
        if (!zVar.f8590a.getLooper().getThread().isAlive()) {
            return;
        }
        zVar.c(runnable);
    }

    public void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((d3) this.d) == null) {
                this.d = new Object();
            }
            d3 d3Var = (d3) this.d;
            d3Var.f15407c = colorStateList;
            d3Var.f15406b = true;
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
        d.g(z10);
        this.f8523a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((d3) this.f8526e) == null) {
            this.f8526e = new Object();
        }
        d3 d3Var = (d3) this.f8526e;
        d3Var.f15407c = colorStateList;
        d3Var.f15406b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((d3) this.f8526e) == null) {
            this.f8526e = new Object();
        }
        d3 d3Var = (d3) this.f8526e;
        d3Var.d = mode;
        d3Var.f15405a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.f8526e;
        this.f8526e = obj;
        if (!obj2.equals(obj)) {
            f0 f0Var = ((i2.x) this.d).f11932b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            f0Var.D1();
            f0Var.r1(1, 10, num);
            f0Var.r1(2, 10, num);
            f0Var.f11674m.e(21, new i2.w(intValue, 1));
        }
    }

    public c(f2.t tVar) {
        this.f8524b = tVar;
        this.f8525c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.f8526e = new PriorityQueue();
        this.f8523a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, x xVar, i2.x xVar2) {
        this.f8524b = xVar.a(looper, null);
        this.f8525c = xVar.a(looper2, null);
        this.f8526e = obj;
        this.f8527f = obj;
        this.d = xVar2;
    }
}
