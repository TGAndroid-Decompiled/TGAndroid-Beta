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
import m.c3;
import m.l1;
import r0.i0;
public final class c {
    public int f8525a;
    public final Object f8526b;
    public final Object f8527c;
    public Object d;
    public Object f8528e;
    public Object f8529f;

    public c(View view) {
        this.f8525a = -1;
        this.f8526b = view;
        this.f8527c = m.q.a();
    }

    public void a(long r9, e2.v r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.v):void");
    }

    public void b() {
        View view = (View) this.f8526b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((c3) this.d) != null) {
                if (((c3) this.f8529f) == null) {
                    this.f8529f = new Object();
                }
                c3 c3Var = (c3) this.f8529f;
                c3Var.f15667c = null;
                c3Var.f15666b = false;
                c3Var.d = null;
                c3Var.f15665a = false;
                WeakHashMap weakHashMap = i0.f46856a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    c3Var.f15666b = true;
                    c3Var.f15667c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    c3Var.f15665a = true;
                    c3Var.d = d;
                }
                if (c3Var.f15666b || c3Var.f15665a) {
                    m.q.d(background, c3Var, view.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.f8528e;
            if (c3Var2 != null) {
                m.q.d(background, c3Var2, view.getDrawableState());
                return;
            }
            c3 c3Var3 = (c3) this.d;
            if (c3Var3 != null) {
                m.q.d(background, c3Var3, view.getDrawableState());
            }
        }
    }

    public void c(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f8528e;
        while (priorityQueue.size() > i10) {
            f2.s sVar = (f2.s) priorityQueue.poll();
            String str = d0.f8531a;
            int i11 = 0;
            while (true) {
                arrayList = sVar.f9621a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.t) this.f8526b).b(sVar.f9622b, (v) arrayList.get(i11));
                ((ArrayDeque) this.f8527c).push((v) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.s sVar2 = (f2.s) this.f8529f;
            if (sVar2 != null && sVar2.f9622b == sVar.f9622b) {
                this.f8529f = null;
            }
            ((ArrayDeque) this.d).push(sVar);
        }
    }

    public ColorStateList d() {
        c3 c3Var = (c3) this.f8528e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f15667c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        c3 c3Var = (c3) this.f8528e;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    public void f(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = (View) this.f8526b;
        Context context = view.getContext();
        int[] iArr = f.a.f9547z;
        la.h R = la.h.R(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) R.f15466c;
        View view2 = (View) this.f8526b;
        i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) R.f15466c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f8525a = typedArray.getResourceId(0, -1);
                m.q qVar = (m.q) this.f8527c;
                Context context2 = view.getContext();
                int i12 = this.f8525a;
                synchronized (qVar) {
                    i11 = qVar.f15816a.i(context2, i12);
                }
                if (i11 != null) {
                    j(i11);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, R.E(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, l1.b(typedArray.getInt(2, -1), null));
            }
            R.S();
        } catch (Throwable th2) {
            R.S();
            throw th2;
        }
    }

    public void g() {
        this.f8525a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f8525a = i10;
        m.q qVar = (m.q) this.f8527c;
        if (qVar != null) {
            Context context = ((View) this.f8526b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f15816a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        z zVar = (z) this.f8526b;
        if (!zVar.f8592a.getLooper().getThread().isAlive()) {
            return;
        }
        zVar.c(runnable);
    }

    public void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((c3) this.d) == null) {
                this.d = new Object();
            }
            c3 c3Var = (c3) this.d;
            c3Var.f15667c = colorStateList;
            c3Var.f15666b = true;
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
        this.f8525a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((c3) this.f8528e) == null) {
            this.f8528e = new Object();
        }
        c3 c3Var = (c3) this.f8528e;
        c3Var.f15667c = colorStateList;
        c3Var.f15666b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((c3) this.f8528e) == null) {
            this.f8528e = new Object();
        }
        c3 c3Var = (c3) this.f8528e;
        c3Var.d = mode;
        c3Var.f15665a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.f8528e;
        this.f8528e = obj;
        if (!obj2.equals(obj)) {
            f0 f0Var = ((i2.x) this.d).f11933b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            f0Var.D1();
            f0Var.r1(1, 10, num);
            f0Var.r1(2, 10, num);
            f0Var.f11675m.e(21, new i2.w(intValue, 1));
        }
    }

    public c(f2.t tVar) {
        this.f8526b = tVar;
        this.f8527c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.f8528e = new PriorityQueue();
        this.f8525a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, x xVar, i2.x xVar2) {
        this.f8526b = xVar.a(looper, null);
        this.f8527c = xVar.a(looper2, null);
        this.f8528e = obj;
        this.f8529f = obj;
        this.d = xVar2;
    }
}
