package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
public final class wd implements View.OnAttachStateChangeListener {
    public final byte a;
    public Object b;

    public wd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i = 0;
        switch (this.a) {
            case 0:
                ((zy) this.b).c(null);
                return;
            case 1:
                ((ps8) this.b).b(view);
                return;
            case 2:
                ((ed0) this.b).b.I();
                return;
            case 3:
                sm0 sm0Var = (sm0) this.b;
                ArrayList arrayList = sm0Var.c;
                arrayList.clear();
                for (View view2 = sm0Var.b; view2 != null; view2 = (View) view2.getParent()) {
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
                ((jq2) this.b).a();
                return;
            case 7:
                nm7.e().b((dw2) this.b, 264);
                return;
            case 8:
                ((r97) this.b).run();
                return;
            case 9:
                ((lx4) this.b).l.a();
                return;
            case 10:
                ((on5) this.b).b.I();
                return;
            case 11:
                ((vt7) this.b).f.I();
                return;
            case 12:
                tm tmVar = ((x28) this.b).i;
                if (tmVar != null) {
                    tmVar.a();
                    return;
                }
                return;
            case 13:
                p99 p99Var = (p99) this.b;
                tm tmVar2 = p99Var.t;
                if (tmVar2 != null) {
                    tmVar2.a();
                }
                tm tmVar3 = p99Var.u;
                if (tmVar3 != null) {
                    tmVar3.a();
                    return;
                }
                return;
            case 14:
                lb9 lb9Var = (lb9) this.b;
                jb9 jb9Var = lb9Var.b0;
                if (jb9Var != null) {
                    jb9Var.b(lb9Var.c);
                    return;
                }
                return;
            case 15:
                ob9 ob9Var = (ob9) this.b;
                mb9 mb9Var = ob9Var.b0;
                if (mb9Var != null) {
                    mb9Var.b(ob9Var.c);
                    return;
                }
                return;
            case 16:
                return;
            case 17:
                y9a y9aVar = (y9a) this.b;
                y9aVar.h.a();
                y9aVar.n.a();
                return;
            case 18:
                return;
            case 19:
                ArrayList arrayList2 = ((hsa) this.b).e;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    fsa fsaVar = (fsa) obj;
                    if (fsaVar.c) {
                        fsaVar.d.I();
                    }
                }
                return;
            default:
                wm9 wm9Var = (wm9) this.b;
                zgc zgcVar = (zgc) wm9Var.c;
                ViewTreeObserver viewTreeObserver = ((View) wm9Var.b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) wm9Var.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) wm9Var.d).removeOnPreDrawListener(zgcVar);
                        }
                        wm9Var.d = null;
                    }
                    wm9Var.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(zgcVar);
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
                ((zy) this.b).b(null);
                return;
            case 1:
                ((ps8) this.b).o(view);
                return;
            case 2:
                ((ed0) this.b).b.K();
                return;
            case 3:
                ((sm0) this.b).c.clear();
                return;
            case 4:
                u31 u31Var = (u31) this.b;
                u31Var.e.removeOnAttachStateChangeListener(this);
                u31Var.c(0L, false);
                return;
            case 5:
                fe1 fe1Var = (fe1) this.b;
                ViewTreeObserver viewTreeObserver = fe1Var.O;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fe1Var.O = view.getViewTreeObserver();
                    }
                    fe1Var.O.removeGlobalOnLayoutListener(fe1Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 6:
                ((jq2) this.b).b();
                return;
            case 7:
                nm7.e().n((dw2) this.b, 264);
                return;
            case 8:
                return;
            case 9:
                ((lx4) this.b).l.b();
                return;
            case 10:
                ((on5) this.b).b.K();
                return;
            case 11:
                ((vt7) this.b).f.K();
                return;
            case 12:
                tm tmVar = ((x28) this.b).i;
                if (tmVar != null) {
                    tmVar.b();
                    return;
                }
                return;
            case 13:
                p99 p99Var = (p99) this.b;
                tm tmVar2 = p99Var.t;
                if (tmVar2 != null) {
                    tmVar2.b();
                }
                tm tmVar3 = p99Var.u;
                if (tmVar3 != null) {
                    tmVar3.a();
                    return;
                }
                return;
            case 14:
                lb9 lb9Var = (lb9) this.b;
                jb9 jb9Var = lb9Var.b0;
                if (jb9Var != null) {
                    jb9Var.o(lb9Var.c);
                    return;
                }
                return;
            case 15:
                ob9 ob9Var = (ob9) this.b;
                mb9 mb9Var = ob9Var.b0;
                if (mb9Var != null) {
                    mb9Var.o(ob9Var.c);
                    return;
                }
                return;
            case 16:
                view.removeCallbacks((Runnable) ((bx9) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 17:
                y9a y9aVar = (y9a) this.b;
                y9aVar.h.b();
                y9aVar.n.b();
                return;
            case 18:
                zoa zoaVar = (zoa) this.b;
                ViewTreeObserver viewTreeObserver2 = zoaVar.F;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        zoaVar.F = view.getViewTreeObserver();
                    }
                    zoaVar.F.removeGlobalOnLayoutListener(zoaVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 19:
                ArrayList arrayList = ((hsa) this.b).e;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((fsa) obj).a();
                }
                return;
            default:
                wm9 wm9Var = (wm9) this.b;
                ViewTreeObserver viewTreeObserver3 = (ViewTreeObserver) wm9Var.d;
                if (viewTreeObserver3 != null) {
                    if (viewTreeObserver3.isAlive()) {
                        ((ViewTreeObserver) wm9Var.d).removeOnPreDrawListener((zgc) wm9Var.c);
                    }
                    wm9Var.d = null;
                    return;
                }
                return;
        }
    }

    public wd() {
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
