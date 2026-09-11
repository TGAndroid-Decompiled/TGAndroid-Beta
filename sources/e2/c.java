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
    public int f8731a;
    public final Object f8732b;
    public final Object f8733c;
    public Object d;
    public Object f8734e;
    public Object f8735f;

    public c(View view) {
        this.f8731a = -1;
        this.f8732b = view;
        this.f8733c = m.q.a();
    }

    public void a(long r9, e2.v r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.v):void");
    }

    public void b() {
        View view = (View) this.f8732b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : ((c3) this.d) != null) {
                if (((c3) this.f8735f) == null) {
                    this.f8735f = new Object();
                }
                c3 c3Var = (c3) this.f8735f;
                c3Var.f15489c = null;
                c3Var.f15488b = false;
                c3Var.d = null;
                c3Var.f15487a = false;
                WeakHashMap weakHashMap = i0.f44697a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    c3Var.f15488b = true;
                    c3Var.f15489c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    c3Var.f15487a = true;
                    c3Var.d = d;
                }
                if (c3Var.f15488b || c3Var.f15487a) {
                    m.q.d(background, c3Var, view.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.f8734e;
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
        PriorityQueue priorityQueue = (PriorityQueue) this.f8734e;
        while (priorityQueue.size() > i10) {
            f2.s sVar = (f2.s) priorityQueue.poll();
            String str = d0.f8737a;
            int i11 = 0;
            while (true) {
                arrayList = sVar.f9234a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.t) this.f8732b).a(sVar.f9235b, (v) arrayList.get(i11));
                ((ArrayDeque) this.f8733c).push((v) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.s sVar2 = (f2.s) this.f8735f;
            if (sVar2 != null && sVar2.f9235b == sVar.f9235b) {
                this.f8735f = null;
            }
            ((ArrayDeque) this.d).push(sVar);
        }
    }

    public ColorStateList d() {
        c3 c3Var = (c3) this.f8734e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f15489c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        c3 c3Var = (c3) this.f8734e;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    public void f(android.util.AttributeSet r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.f(android.util.AttributeSet, int):void");
    }

    public void g() {
        this.f8731a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f8731a = i10;
        m.q qVar = (m.q) this.f8733c;
        if (qVar != null) {
            Context context = ((View) this.f8732b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f15641a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        z zVar = (z) this.f8732b;
        if (!zVar.f8798a.getLooper().getThread().isAlive()) {
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
            c3Var.f15489c = colorStateList;
            c3Var.f15488b = true;
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
        this.f8731a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((c3) this.f8734e) == null) {
            this.f8734e = new Object();
        }
        c3 c3Var = (c3) this.f8734e;
        c3Var.f15489c = colorStateList;
        c3Var.f15488b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((c3) this.f8734e) == null) {
            this.f8734e = new Object();
        }
        c3 c3Var = (c3) this.f8734e;
        c3Var.d = mode;
        c3Var.f15487a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.f8734e;
        this.f8734e = obj;
        if (!obj2.equals(obj)) {
            f0 f0Var = ((i2.x) this.d).f11776b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            f0Var.B1();
            f0Var.p1(1, 10, num);
            f0Var.p1(2, 10, num);
            f0Var.f11526m.e(21, new i2.w(intValue, 1));
        }
    }

    public c(f2.t tVar) {
        this.f8732b = tVar;
        this.f8733c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.f8734e = new PriorityQueue();
        this.f8731a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, x xVar, i2.x xVar2) {
        this.f8732b = xVar.a(looper, null);
        this.f8733c = xVar.a(looper2, null);
        this.f8734e = obj;
        this.f8735f = obj;
        this.d = xVar2;
    }
}
