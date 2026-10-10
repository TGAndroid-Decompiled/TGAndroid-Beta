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
    public int f8526a;
    public final Object f8527b;
    public final Object f8528c;
    public Object d;
    public Object f8529e;
    public Object f8530f;

    public c(View view) {
        this.f8526a = -1;
        this.f8527b = view;
        this.f8528c = m.q.a();
    }

    public void a(long r9, e2.v r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.v):void");
    }

    public void b() {
        View view = (View) this.f8527b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((c3) this.d) != null) {
                if (((c3) this.f8530f) == null) {
                    this.f8530f = new Object();
                }
                c3 c3Var = (c3) this.f8530f;
                c3Var.f15646c = null;
                c3Var.f15645b = false;
                c3Var.d = null;
                c3Var.f15644a = false;
                WeakHashMap weakHashMap = i0.f46810a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    c3Var.f15645b = true;
                    c3Var.f15646c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    c3Var.f15644a = true;
                    c3Var.d = d;
                }
                if (c3Var.f15645b || c3Var.f15644a) {
                    m.q.d(background, c3Var, view.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.f8529e;
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
        PriorityQueue priorityQueue = (PriorityQueue) this.f8529e;
        while (priorityQueue.size() > i10) {
            f2.s sVar = (f2.s) priorityQueue.poll();
            String str = d0.f8532a;
            int i11 = 0;
            while (true) {
                arrayList = sVar.f9622a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.t) this.f8527b).b(sVar.f9623b, (v) arrayList.get(i11));
                ((ArrayDeque) this.f8528c).push((v) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.s sVar2 = (f2.s) this.f8530f;
            if (sVar2 != null && sVar2.f9623b == sVar.f9623b) {
                this.f8530f = null;
            }
            ((ArrayDeque) this.d).push(sVar);
        }
    }

    public ColorStateList d() {
        c3 c3Var = (c3) this.f8529e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f15646c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        c3 c3Var = (c3) this.f8529e;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    public void f(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = (View) this.f8527b;
        Context context = view.getContext();
        int[] iArr = f.a.f9548z;
        la.h R = la.h.R(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) R.f15467c;
        View view2 = (View) this.f8527b;
        i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) R.f15467c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f8526a = typedArray.getResourceId(0, -1);
                m.q qVar = (m.q) this.f8528c;
                Context context2 = view.getContext();
                int i12 = this.f8526a;
                synchronized (qVar) {
                    i11 = qVar.f15795a.i(context2, i12);
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
        this.f8526a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f8526a = i10;
        m.q qVar = (m.q) this.f8528c;
        if (qVar != null) {
            Context context = ((View) this.f8527b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f15795a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        z zVar = (z) this.f8527b;
        if (!zVar.f8593a.getLooper().getThread().isAlive()) {
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
            c3Var.f15646c = colorStateList;
            c3Var.f15645b = true;
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
        this.f8526a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((c3) this.f8529e) == null) {
            this.f8529e = new Object();
        }
        c3 c3Var = (c3) this.f8529e;
        c3Var.f15646c = colorStateList;
        c3Var.f15645b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((c3) this.f8529e) == null) {
            this.f8529e = new Object();
        }
        c3 c3Var = (c3) this.f8529e;
        c3Var.d = mode;
        c3Var.f15644a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.f8529e;
        this.f8529e = obj;
        if (!obj2.equals(obj)) {
            f0 f0Var = ((i2.x) this.d).f11934b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            f0Var.D1();
            f0Var.r1(1, 10, num);
            f0Var.r1(2, 10, num);
            f0Var.f11676m.e(21, new i2.w(intValue, 1));
        }
    }

    public c(f2.t tVar) {
        this.f8527b = tVar;
        this.f8528c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.f8529e = new PriorityQueue();
        this.f8526a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, x xVar, i2.x xVar2) {
        this.f8527b = xVar.a(looper, null);
        this.f8528c = xVar.a(looper2, null);
        this.f8529e = obj;
        this.f8530f = obj;
        this.d = xVar2;
    }
}
