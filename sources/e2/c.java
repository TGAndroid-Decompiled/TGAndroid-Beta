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
import m.e3;
import m.g3;
import m.m1;
import v7.u6;
public final class c {
    public int f8202a;
    public final Object f8203b;
    public final Object f8204c;
    public Object d;
    public Object e;
    public Object f8205f;

    public c(View view) {
        this.f8202a = -1;
        this.f8203b = view;
        this.f8204c = m.r.a();
    }

    public void a(long r10, e2.x r12) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.x):void");
    }

    public void b() {
        View view = (View) this.f8203b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((e3) this.d) != null) {
                if (((e3) this.f8205f) == null) {
                    this.f8205f = new Object();
                }
                e3 e3Var = (e3) this.f8205f;
                e3Var.f16196c = null;
                e3Var.f16195b = false;
                e3Var.d = null;
                e3Var.f16194a = false;
                WeakHashMap weakHashMap = r0.i0.f44826a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    e3Var.f16195b = true;
                    e3Var.f16196c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    e3Var.f16194a = true;
                    e3Var.d = d;
                }
                if (e3Var.f16195b || e3Var.f16194a) {
                    m.r.d(background, e3Var, view.getDrawableState());
                    return;
                }
            }
            e3 e3Var2 = (e3) this.e;
            if (e3Var2 != null) {
                m.r.d(background, e3Var2, view.getDrawableState());
                return;
            }
            e3 e3Var3 = (e3) this.d;
            if (e3Var3 != null) {
                m.r.d(background, e3Var3, view.getDrawableState());
            }
        }
    }

    public void c(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i10) {
            f2.v vVar = (f2.v) priorityQueue.poll();
            String str = m0.f8252a;
            int i11 = 0;
            while (true) {
                arrayList = vVar.f10355a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.w) this.f8203b).c(vVar.f10356b, (x) arrayList.get(i11));
                ((ArrayDeque) this.f8204c).push((x) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.v vVar2 = (f2.v) this.f8205f;
            if (vVar2 != null && vVar2.f10356b == vVar.f10356b) {
                this.f8205f = null;
            }
            ((ArrayDeque) this.d).push(vVar);
        }
    }

    public ColorStateList d() {
        e3 e3Var = (e3) this.e;
        if (e3Var != null) {
            return (ColorStateList) e3Var.f16196c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        e3 e3Var = (e3) this.e;
        if (e3Var != null) {
            return (PorterDuff.Mode) e3Var.d;
        }
        return null;
    }

    public void f(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = (View) this.f8203b;
        Context context = view.getContext();
        int[] iArr = f.a.f10270z;
        g3 P = g3.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.f16203c;
        View view2 = (View) this.f8203b;
        r0.i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) P.f16203c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f8202a = typedArray.getResourceId(0, -1);
                m.r rVar = (m.r) this.f8204c;
                Context context2 = view.getContext();
                int i12 = this.f8202a;
                synchronized (rVar) {
                    i11 = rVar.f16311a.i(context2, i12);
                }
                if (i11 != null) {
                    j(i11);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, P.E(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, m1.b(typedArray.getInt(2, -1), null));
            }
            P.Q();
        } catch (Throwable th2) {
            P.Q();
            throw th2;
        }
    }

    public void g() {
        this.f8202a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f8202a = i10;
        m.r rVar = (m.r) this.f8204c;
        if (rVar != null) {
            Context context = ((View) this.f8203b).getContext();
            synchronized (rVar) {
                colorStateList = rVar.f16311a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        i0 i0Var = (i0) this.f8203b;
        if (!i0Var.f8237a.getLooper().getThread().isAlive()) {
            return;
        }
        i0Var.d(runnable);
    }

    public void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((e3) this.d) == null) {
                this.d = new Object();
            }
            e3 e3Var = (e3) this.d;
            e3Var.f16196c = colorStateList;
            e3Var.f16195b = true;
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
        this.f8202a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((e3) this.e) == null) {
            this.e = new Object();
        }
        e3 e3Var = (e3) this.e;
        e3Var.f16196c = colorStateList;
        e3Var.f16195b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((e3) this.e) == null) {
            this.e = new Object();
        }
        e3 e3Var = (e3) this.e;
        e3Var.d = mode;
        e3Var.f16194a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            i2.i0 i0Var = ((i2.x) this.d).f12602b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            i0Var.F1();
            i0Var.t1(1, 10, num);
            i0Var.t1(2, 10, num);
            i0Var.f12402m.e(21, new i2.w(intValue, 1));
        }
    }

    public c(f2.w wVar) {
        this.f8203b = wVar;
        this.f8204c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.f8202a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, g0 g0Var, i2.x xVar) {
        this.f8203b = g0Var.a(looper, null);
        this.f8204c = g0Var.a(looper2, null);
        this.e = obj;
        this.f8205f = obj;
        this.d = xVar;
    }
}
