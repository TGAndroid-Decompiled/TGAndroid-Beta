package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
public final class wc implements View.OnAttachStateChangeListener {
    public final byte a;
    public Object b;

    public wc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i = 0;
        switch (this.a) {
            case 0:
                ((yx) this.b).c(null);
                return;
            case 1:
                ((nq8) this.b).b(view);
                return;
            case 2:
                ((ec0) this.b).b.I();
                return;
            case 3:
                sl0 sl0Var = (sl0) this.b;
                ArrayList arrayList = sl0Var.c;
                arrayList.clear();
                for (View view2 = sl0Var.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 4:
            case 5:
                return;
            case 6:
                ((yo2) this.b).a();
                return;
            case 7:
                kk7.e().b((su2) this.b, 262);
                return;
            case 8:
                ((o77) this.b).run();
                return;
            case 9:
                ((kv4) this.b).l.a();
                return;
            case 10:
                ((ol5) this.b).b.I();
                return;
            case 11:
                ((ur7) this.b).f.I();
                return;
            case 12:
                tl tlVar = ((u08) this.b).i;
                if (tlVar != null) {
                    tlVar.a();
                    return;
                }
                return;
            case 13:
                n79 n79Var = (n79) this.b;
                tl tlVar2 = n79Var.t;
                if (tlVar2 != null) {
                    tlVar2.a();
                }
                tl tlVar3 = n79Var.u;
                if (tlVar3 != null) {
                    tlVar3.a();
                    return;
                }
                return;
            case 14:
                l99 l99Var = (l99) this.b;
                j99 j99Var = l99Var.b0;
                if (j99Var != null) {
                    j99Var.b(l99Var.c);
                    return;
                }
                return;
            case 15:
                o99 o99Var = (o99) this.b;
                m99 m99Var = o99Var.b0;
                if (m99Var != null) {
                    m99Var.b(o99Var.c);
                    return;
                }
                return;
            case 16:
                return;
            case 17:
                y7a y7aVar = (y7a) this.b;
                y7aVar.h.a();
                y7aVar.n.a();
                return;
            case 18:
                return;
            case 19:
                ArrayList arrayList2 = ((hqa) this.b).e;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    fqa fqaVar = (fqa) obj;
                    if (fqaVar.c) {
                        fqaVar.d.I();
                    }
                }
                return;
            default:
                vk9 vk9Var = (vk9) this.b;
                zec zecVar = (zec) vk9Var.c;
                ViewTreeObserver viewTreeObserver = ((View) vk9Var.b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) vk9Var.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) vk9Var.d).removeOnPreDrawListener(zecVar);
                        }
                        vk9Var.d = null;
                    }
                    vk9Var.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(zecVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        int i = 0;
        switch (this.a) {
            case 0:
                ((yx) this.b).b(null);
                return;
            case 1:
                ((nq8) this.b).o(view);
                return;
            case 2:
                ((ec0) this.b).b.K();
                return;
            case 3:
                ((sl0) this.b).c.clear();
                return;
            case 4:
                m21 m21Var = (m21) this.b;
                m21Var.e.removeOnAttachStateChangeListener(this);
                m21Var.c(0L, false);
                return;
            case 5:
                xc1 xc1Var = (xc1) this.b;
                ViewTreeObserver viewTreeObserver = xc1Var.O;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        xc1Var.O = view.getViewTreeObserver();
                    }
                    xc1Var.O.removeGlobalOnLayoutListener(xc1Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 6:
                ((yo2) this.b).b();
                return;
            case 7:
                kk7.e().n((su2) this.b, 262);
                return;
            case 8:
                return;
            case 9:
                ((kv4) this.b).l.b();
                return;
            case 10:
                ((ol5) this.b).b.K();
                return;
            case 11:
                ((ur7) this.b).f.K();
                return;
            case 12:
                tl tlVar = ((u08) this.b).i;
                if (tlVar != null) {
                    tlVar.b();
                    return;
                }
                return;
            case 13:
                n79 n79Var = (n79) this.b;
                tl tlVar2 = n79Var.t;
                if (tlVar2 != null) {
                    tlVar2.b();
                }
                tl tlVar3 = n79Var.u;
                if (tlVar3 != null) {
                    tlVar3.a();
                    return;
                }
                return;
            case 14:
                l99 l99Var = (l99) this.b;
                j99 j99Var = l99Var.b0;
                if (j99Var != null) {
                    j99Var.o(l99Var.c);
                    return;
                }
                return;
            case 15:
                o99 o99Var = (o99) this.b;
                m99 m99Var = o99Var.b0;
                if (m99Var != null) {
                    m99Var.o(o99Var.c);
                    return;
                }
                return;
            case 16:
                view.removeCallbacks((Runnable) ((yu9) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 17:
                y7a y7aVar = (y7a) this.b;
                y7aVar.h.b();
                y7aVar.n.b();
                return;
            case 18:
                yma ymaVar = (yma) this.b;
                ViewTreeObserver viewTreeObserver2 = ymaVar.F;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        ymaVar.F = view.getViewTreeObserver();
                    }
                    ymaVar.F.removeGlobalOnLayoutListener(ymaVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 19:
                ArrayList arrayList = ((hqa) this.b).e;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((fqa) obj).a();
                }
                return;
            default:
                vk9 vk9Var = (vk9) this.b;
                ViewTreeObserver viewTreeObserver3 = (ViewTreeObserver) vk9Var.d;
                if (viewTreeObserver3 != null) {
                    if (viewTreeObserver3.isAlive()) {
                        ((ViewTreeObserver) vk9Var.d).removeOnPreDrawListener((zec) vk9Var.c);
                    }
                    vk9Var.d = null;
                    return;
                }
                return;
        }
    }

    public wc() {
        this.a = (byte) 7;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
