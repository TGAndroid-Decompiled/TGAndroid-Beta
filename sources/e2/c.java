package e2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import i2.e0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.c3;
import r0.i0;
public final class c {
    public int f7183a;
    public final Object f7184b;
    public final Object f7185c;
    public Object d;
    public Object e;
    public Object f7186f;

    public c(View view) {
        this.f7183a = -1;
        this.f7184b = view;
        this.f7185c = m.q.a();
    }

    public void a(long r9, e2.v r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.v):void");
    }

    public void b() {
        View view = (View) this.f7184b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : ((c3) this.d) != null) {
                if (((c3) this.f7186f) == null) {
                    this.f7186f = new Object();
                }
                c3 c3Var = (c3) this.f7186f;
                c3Var.f12981c = null;
                c3Var.f12980b = false;
                c3Var.d = null;
                c3Var.f12979a = false;
                WeakHashMap weakHashMap = i0.f41062a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    c3Var.f12980b = true;
                    c3Var.f12981c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    c3Var.f12979a = true;
                    c3Var.d = d;
                }
                if (c3Var.f12980b || c3Var.f12979a) {
                    m.q.d(background, c3Var, view.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.e;
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
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i10) {
            f2.r rVar = (f2.r) priorityQueue.poll();
            String str = d0.f7188a;
            int i11 = 0;
            while (true) {
                arrayList = rVar.f7737a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.s) this.f7184b).c(rVar.f7738b, (v) arrayList.get(i11));
                ((ArrayDeque) this.f7185c).push((v) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.r rVar2 = (f2.r) this.f7186f;
            if (rVar2 != null && rVar2.f7738b == rVar.f7738b) {
                this.f7186f = null;
            }
            ((ArrayDeque) this.d).push(rVar);
        }
    }

    public ColorStateList d() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f12981c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    public void f(android.util.AttributeSet r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.f(android.util.AttributeSet, int):void");
    }

    public void g() {
        this.f7183a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f7183a = i10;
        m.q qVar = (m.q) this.f7185c;
        if (qVar != null) {
            Context context = ((View) this.f7184b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f13114a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        z zVar = (z) this.f7184b;
        if (!zVar.f7243a.getLooper().getThread().isAlive()) {
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
            c3Var.f12981c = colorStateList;
            c3Var.f12980b = true;
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
        this.f7183a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((c3) this.e) == null) {
            this.e = new Object();
        }
        c3 c3Var = (c3) this.e;
        c3Var.f12981c = colorStateList;
        c3Var.f12980b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((c3) this.e) == null) {
            this.e = new Object();
        }
        c3 c3Var = (c3) this.e;
        c3Var.d = mode;
        c3Var.f12979a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            e0 e0Var = ((i2.w) this.d).f10393b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            e0Var.B1();
            e0Var.p1(1, 10, num);
            e0Var.p1(2, 10, num);
            e0Var.f10150m.e(21, new i2.v(intValue, 1));
        }
    }

    public c(f2.s sVar) {
        this.f7184b = sVar;
        this.f7185c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.f7183a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, x xVar, i2.w wVar) {
        this.f7184b = xVar.a(looper, null);
        this.f7185c = xVar.a(looper2, null);
        this.e = obj;
        this.f7186f = obj;
        this.d = wVar;
    }
}
