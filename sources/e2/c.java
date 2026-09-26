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
    public int f7865a;
    public final Object f7866b;
    public final Object f7867c;
    public Object d;
    public Object e;
    public Object f7868f;

    public c(View view) {
        this.f7865a = -1;
        this.f7866b = view;
        this.f7867c = m.q.a();
    }

    public void a(long r9, e2.v r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.v):void");
    }

    public void b() {
        View view = (View) this.f7866b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : ((c3) this.d) != null) {
                if (((c3) this.f7868f) == null) {
                    this.f7868f = new Object();
                }
                c3 c3Var = (c3) this.f7868f;
                c3Var.f14389c = null;
                c3Var.f14388b = false;
                c3Var.d = null;
                c3Var.f14387a = false;
                WeakHashMap weakHashMap = i0.f42127a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    c3Var.f14388b = true;
                    c3Var.f14389c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    c3Var.f14387a = true;
                    c3Var.d = d;
                }
                if (c3Var.f14388b || c3Var.f14387a) {
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
            String str = d0.f7870a;
            int i11 = 0;
            while (true) {
                arrayList = rVar.f8837a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.s) this.f7866b).b(rVar.f8838b, (v) arrayList.get(i11));
                ((ArrayDeque) this.f7867c).push((v) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.r rVar2 = (f2.r) this.f7868f;
            if (rVar2 != null && rVar2.f8838b == rVar.f8838b) {
                this.f7868f = null;
            }
            ((ArrayDeque) this.d).push(rVar);
        }
    }

    public ColorStateList d() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f14389c;
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
        this.f7865a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f7865a = i10;
        m.q qVar = (m.q) this.f7867c;
        if (qVar != null) {
            Context context = ((View) this.f7866b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f14529a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        z zVar = (z) this.f7866b;
        if (!zVar.f7925a.getLooper().getThread().isAlive()) {
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
            c3Var.f14389c = colorStateList;
            c3Var.f14388b = true;
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
        this.f7865a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((c3) this.e) == null) {
            this.e = new Object();
        }
        c3 c3Var = (c3) this.e;
        c3Var.f14389c = colorStateList;
        c3Var.f14388b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((c3) this.e) == null) {
            this.e = new Object();
        }
        c3 c3Var = (c3) this.e;
        c3Var.d = mode;
        c3Var.f14387a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            f0 f0Var = ((i2.x) this.d).f10908b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            f0Var.B1();
            f0Var.p1(1, 10, num);
            f0Var.p1(2, 10, num);
            f0Var.f10668m.e(21, new i2.w(intValue, 1));
        }
    }

    public c(f2.s sVar) {
        this.f7866b = sVar;
        this.f7867c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.f7865a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, x xVar, i2.x xVar2) {
        this.f7866b = xVar.a(looper, null);
        this.f7867c = xVar.a(looper2, null);
        this.e = obj;
        this.f7868f = obj;
        this.d = xVar2;
    }
}
