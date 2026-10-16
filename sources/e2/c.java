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
import m.f3;
import m.h3;
import m.n1;
import v7.u6;
public final class c {
    public int f8325a;
    public final Object f8326b;
    public final Object f8327c;
    public Object d;
    public Object e;
    public Object f8328f;

    public c(View view) {
        this.f8325a = -1;
        this.f8326b = view;
        this.f8327c = m.s.a();
    }

    public void a(long r10, e2.x r12) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.x):void");
    }

    public void b() {
        View view = (View) this.f8326b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((f3) this.d) != null) {
                if (((f3) this.f8328f) == null) {
                    this.f8328f = new Object();
                }
                f3 f3Var = (f3) this.f8328f;
                f3Var.f14845c = null;
                f3Var.f14844b = false;
                f3Var.d = null;
                f3Var.f14843a = false;
                WeakHashMap weakHashMap = r0.i0.f43485a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    f3Var.f14844b = true;
                    f3Var.f14845c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    f3Var.f14843a = true;
                    f3Var.d = d;
                }
                if (f3Var.f14844b || f3Var.f14843a) {
                    m.s.d(background, f3Var, view.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = (f3) this.e;
            if (f3Var2 != null) {
                m.s.d(background, f3Var2, view.getDrawableState());
                return;
            }
            f3 f3Var3 = (f3) this.d;
            if (f3Var3 != null) {
                m.s.d(background, f3Var3, view.getDrawableState());
            }
        }
    }

    public void c(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i10) {
            f2.u uVar = (f2.u) priorityQueue.poll();
            String str = m0.f8375a;
            int i11 = 0;
            while (true) {
                arrayList = uVar.f8912a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.v) this.f8326b).a(uVar.f8913b, (x) arrayList.get(i11));
                ((ArrayDeque) this.f8327c).push((x) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.u uVar2 = (f2.u) this.f8328f;
            if (uVar2 != null && uVar2.f8913b == uVar.f8913b) {
                this.f8328f = null;
            }
            ((ArrayDeque) this.d).push(uVar);
        }
    }

    public ColorStateList d() {
        f3 f3Var = (f3) this.e;
        if (f3Var != null) {
            return (ColorStateList) f3Var.f14845c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        f3 f3Var = (f3) this.e;
        if (f3Var != null) {
            return (PorterDuff.Mode) f3Var.d;
        }
        return null;
    }

    public void f(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = (View) this.f8326b;
        Context context = view.getContext();
        int[] iArr = f.a.f8826z;
        h3 P = h3.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.f14851c;
        View view2 = (View) this.f8326b;
        r0.i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) P.f14851c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f8325a = typedArray.getResourceId(0, -1);
                m.s sVar = (m.s) this.f8327c;
                Context context2 = view.getContext();
                int i12 = this.f8325a;
                synchronized (sVar) {
                    i11 = sVar.f14960a.i(context2, i12);
                }
                if (i11 != null) {
                    j(i11);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, P.E(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, n1.b(typedArray.getInt(2, -1), null));
            }
            P.Q();
        } catch (Throwable th2) {
            P.Q();
            throw th2;
        }
    }

    public void g() {
        this.f8325a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f8325a = i10;
        m.s sVar = (m.s) this.f8327c;
        if (sVar != null) {
            Context context = ((View) this.f8326b).getContext();
            synchronized (sVar) {
                colorStateList = sVar.f14960a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        i0 i0Var = (i0) this.f8326b;
        if (!i0Var.f8360a.getLooper().getThread().isAlive()) {
            return;
        }
        i0Var.d(runnable);
    }

    public void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((f3) this.d) == null) {
                this.d = new Object();
            }
            f3 f3Var = (f3) this.d;
            f3Var.f14845c = colorStateList;
            f3Var.f14844b = true;
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
        this.f8325a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((f3) this.e) == null) {
            this.e = new Object();
        }
        f3 f3Var = (f3) this.e;
        f3Var.f14845c = colorStateList;
        f3Var.f14844b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((f3) this.e) == null) {
            this.e = new Object();
        }
        f3 f3Var = (f3) this.e;
        f3Var.d = mode;
        f3Var.f14843a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            i2.h0 h0Var = ((i2.w) this.d).f11214b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            h0Var.F1();
            h0Var.t1(1, 10, num);
            h0Var.t1(2, 10, num);
            h0Var.f11005m.e(21, new i2.v(intValue, 1));
        }
    }

    public c(f2.v vVar) {
        this.f8326b = vVar;
        this.f8327c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.f8325a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, g0 g0Var, i2.w wVar) {
        this.f8326b = g0Var.a(looper, null);
        this.f8327c = g0Var.a(looper2, null);
        this.e = obj;
        this.f8328f = obj;
        this.d = wVar;
    }
}
