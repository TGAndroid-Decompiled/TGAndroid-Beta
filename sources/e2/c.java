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
    public int f8531a;
    public final Object f8532b;
    public final Object f8533c;
    public Object d;
    public Object f8534e;
    public Object f8535f;

    public c(View view) {
        this.f8531a = -1;
        this.f8532b = view;
        this.f8533c = m.q.a();
    }

    public void a(long r9, e2.v r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.v):void");
    }

    public void b() {
        View view = (View) this.f8532b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : ((c3) this.d) != null) {
                if (((c3) this.f8535f) == null) {
                    this.f8535f = new Object();
                }
                c3 c3Var = (c3) this.f8535f;
                c3Var.f15705c = null;
                c3Var.f15704b = false;
                c3Var.d = null;
                c3Var.f15703a = false;
                WeakHashMap weakHashMap = i0.f45596a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    c3Var.f15704b = true;
                    c3Var.f15705c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    c3Var.f15703a = true;
                    c3Var.d = d;
                }
                if (c3Var.f15704b || c3Var.f15703a) {
                    m.q.d(background, c3Var, view.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.f8534e;
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
        PriorityQueue priorityQueue = (PriorityQueue) this.f8534e;
        while (priorityQueue.size() > i10) {
            f2.r rVar = (f2.r) priorityQueue.poll();
            String str = d0.f8537a;
            int i11 = 0;
            while (true) {
                arrayList = rVar.f9610a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.s) this.f8532b).b(rVar.f9611b, (v) arrayList.get(i11));
                ((ArrayDeque) this.f8533c).push((v) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.r rVar2 = (f2.r) this.f8535f;
            if (rVar2 != null && rVar2.f9611b == rVar.f9611b) {
                this.f8535f = null;
            }
            ((ArrayDeque) this.d).push(rVar);
        }
    }

    public ColorStateList d() {
        c3 c3Var = (c3) this.f8534e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f15705c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        c3 c3Var = (c3) this.f8534e;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    public void f(android.util.AttributeSet r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.f(android.util.AttributeSet, int):void");
    }

    public void g() {
        this.f8531a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f8531a = i10;
        m.q qVar = (m.q) this.f8533c;
        if (qVar != null) {
            Context context = ((View) this.f8532b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f15857a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        z zVar = (z) this.f8532b;
        if (!zVar.f8598a.getLooper().getThread().isAlive()) {
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
            c3Var.f15705c = colorStateList;
            c3Var.f15704b = true;
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
        this.f8531a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((c3) this.f8534e) == null) {
            this.f8534e = new Object();
        }
        c3 c3Var = (c3) this.f8534e;
        c3Var.f15705c = colorStateList;
        c3Var.f15704b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((c3) this.f8534e) == null) {
            this.f8534e = new Object();
        }
        c3 c3Var = (c3) this.f8534e;
        c3Var.d = mode;
        c3Var.f15703a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.f8534e;
        this.f8534e = obj;
        if (!obj2.equals(obj)) {
            f0 f0Var = ((i2.x) this.d).f11883b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            f0Var.B1();
            f0Var.p1(1, 10, num);
            f0Var.p1(2, 10, num);
            f0Var.f11625m.e(21, new i2.w(intValue, 1));
        }
    }

    public c(f2.s sVar) {
        this.f8532b = sVar;
        this.f8533c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.f8534e = new PriorityQueue();
        this.f8531a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, x xVar, i2.x xVar2) {
        this.f8532b = xVar.a(looper, null);
        this.f8533c = xVar.a(looper2, null);
        this.f8534e = obj;
        this.f8535f = obj;
        this.d = xVar2;
    }
}
