package e2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import i2.f0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.c3;
import r0.i0;
public final class c {
    public int f8759a;
    public final Object f8760b;
    public final Object f8761c;
    public Object d;
    public Object f8762e;
    public Object f8763f;

    public c(View view) {
        this.f8759a = -1;
        this.f8760b = view;
        this.f8761c = m.q.a();
    }

    public void a(long r9, e2.v r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.v):void");
    }

    public void b() {
        View view = (View) this.f8760b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : ((c3) this.d) != null) {
                if (((c3) this.f8763f) == null) {
                    this.f8763f = new Object();
                }
                c3 c3Var = (c3) this.f8763f;
                c3Var.f15516c = null;
                c3Var.f15515b = false;
                c3Var.d = null;
                c3Var.f15514a = false;
                WeakHashMap weakHashMap = i0.f44725a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    c3Var.f15515b = true;
                    c3Var.f15516c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    c3Var.f15514a = true;
                    c3Var.d = d;
                }
                if (c3Var.f15515b || c3Var.f15514a) {
                    m.q.d(background, c3Var, view.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.f8762e;
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
        PriorityQueue priorityQueue = (PriorityQueue) this.f8762e;
        while (priorityQueue.size() > i10) {
            f2.s sVar = (f2.s) priorityQueue.poll();
            String str = d0.f8765a;
            int i11 = 0;
            while (true) {
                arrayList = sVar.f9262a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.t) this.f8760b).a(sVar.f9263b, (v) arrayList.get(i11));
                ((ArrayDeque) this.f8761c).push((v) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.s sVar2 = (f2.s) this.f8763f;
            if (sVar2 != null && sVar2.f9263b == sVar.f9263b) {
                this.f8763f = null;
            }
            ((ArrayDeque) this.d).push(sVar);
        }
    }

    public ColorStateList d() {
        c3 c3Var = (c3) this.f8762e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f15516c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        c3 c3Var = (c3) this.f8762e;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    public void f(android.util.AttributeSet r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.f(android.util.AttributeSet, int):void");
    }

    public void g() {
        this.f8759a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f8759a = i10;
        m.q qVar = (m.q) this.f8761c;
        if (qVar != null) {
            Context context = ((View) this.f8760b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f15668a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        z zVar = (z) this.f8760b;
        if (!zVar.f8826a.getLooper().getThread().isAlive()) {
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
            c3Var.f15516c = colorStateList;
            c3Var.f15515b = true;
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
        this.f8759a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((c3) this.f8762e) == null) {
            this.f8762e = new Object();
        }
        c3 c3Var = (c3) this.f8762e;
        c3Var.f15516c = colorStateList;
        c3Var.f15515b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((c3) this.f8762e) == null) {
            this.f8762e = new Object();
        }
        c3 c3Var = (c3) this.f8762e;
        c3Var.d = mode;
        c3Var.f15514a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.f8762e;
        this.f8762e = obj;
        if (!obj2.equals(obj)) {
            f0 f0Var = ((i2.x) this.d).f11802b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            f0Var.B1();
            f0Var.p1(1, 10, num);
            f0Var.p1(2, 10, num);
            f0Var.f11552m.e(21, new i2.w(intValue, 1));
        }
    }

    public c(f2.t tVar) {
        this.f8760b = tVar;
        this.f8761c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.f8762e = new PriorityQueue();
        this.f8759a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, x xVar, i2.x xVar2) {
        this.f8760b = xVar.a(looper, null);
        this.f8761c = xVar.a(looper2, null);
        this.f8762e = obj;
        this.f8763f = obj;
        this.d = xVar2;
    }
}
