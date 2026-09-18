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
    public int f7882a;
    public final Object f7883b;
    public final Object f7884c;
    public Object d;
    public Object e;
    public Object f7885f;

    public c(View view) {
        this.f7882a = -1;
        this.f7883b = view;
        this.f7884c = m.q.a();
    }

    public void a(long r9, e2.v r11) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.v):void");
    }

    public void b() {
        View view = (View) this.f7883b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : ((c3) this.d) != null) {
                if (((c3) this.f7885f) == null) {
                    this.f7885f = new Object();
                }
                c3 c3Var = (c3) this.f7885f;
                c3Var.f14333c = null;
                c3Var.f14332b = false;
                c3Var.d = null;
                c3Var.f14331a = false;
                WeakHashMap weakHashMap = i0.f42096a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    c3Var.f14332b = true;
                    c3Var.f14333c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    c3Var.f14331a = true;
                    c3Var.d = d;
                }
                if (c3Var.f14332b || c3Var.f14331a) {
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
            String str = d0.f7887a;
            int i11 = 0;
            while (true) {
                arrayList = rVar.f8854a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.s) this.f7883b).b(rVar.f8855b, (v) arrayList.get(i11));
                ((ArrayDeque) this.f7884c).push((v) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.r rVar2 = (f2.r) this.f7885f;
            if (rVar2 != null && rVar2.f8855b == rVar.f8855b) {
                this.f7885f = null;
            }
            ((ArrayDeque) this.d).push(rVar);
        }
    }

    public ColorStateList d() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f14333c;
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
        this.f7882a = -1;
        j(null);
        b();
    }

    public void h(int i10) {
        ColorStateList colorStateList;
        this.f7882a = i10;
        m.q qVar = (m.q) this.f7884c;
        if (qVar != null) {
            Context context = ((View) this.f7883b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f14473a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        j(colorStateList);
        b();
    }

    public void i(Runnable runnable) {
        z zVar = (z) this.f7883b;
        if (!zVar.f7942a.getLooper().getThread().isAlive()) {
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
            c3Var.f14333c = colorStateList;
            c3Var.f14332b = true;
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
        this.f7882a = i10;
        c(i10);
    }

    public void l(ColorStateList colorStateList) {
        if (((c3) this.e) == null) {
            this.e = new Object();
        }
        c3 c3Var = (c3) this.e;
        c3Var.f14333c = colorStateList;
        c3Var.f14332b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        if (((c3) this.e) == null) {
            this.e = new Object();
        }
        c3 c3Var = (c3) this.e;
        c3Var.d = mode;
        c3Var.f14331a = true;
        b();
    }

    public void n(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            e0 e0Var = ((i2.w) this.d).f10915b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            e0Var.B1();
            e0Var.p1(1, 10, num);
            e0Var.p1(2, 10, num);
            e0Var.f10667m.e(21, new i2.v(intValue, 1));
        }
    }

    public c(f2.s sVar) {
        this.f7883b = sVar;
        this.f7884c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.f7882a = -1;
    }

    public c(Object obj, Looper looper, Looper looper2, x xVar, i2.w wVar) {
        this.f7883b = xVar.a(looper, null);
        this.f7884c = xVar.a(looper2, null);
        this.e = obj;
        this.f7885f = obj;
        this.d = wVar;
    }
}
