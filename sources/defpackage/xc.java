package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
public final class xc implements View.OnAttachStateChangeListener {
    public final byte a;
    public Object b;

    public xc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i = 0;
        switch (this.a) {
            case 0:
                ((zx) this.b).c(null);
                return;
            case 1:
                ((yt8) this.b).b(view);
                return;
            case 2:
                ((gc0) this.b).b.I();
                return;
            case 3:
                tl0 tl0Var = (tl0) this.b;
                ArrayList arrayList = tl0Var.c;
                arrayList.clear();
                for (View view2 = tl0Var.b; view2 != null; view2 = (View) view2.getParent()) {
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
                ((rp2) this.b).a();
                return;
            case 7:
                jn7.e().b((nv2) this.b, 263);
                return;
            case 8:
                ((da7) this.b).run();
                return;
            case 9:
                ((px4) this.b).l.a();
                return;
            case 10:
                ((rn5) this.b).b.I();
                return;
            case 11:
                ((av7) this.b).f.I();
                return;
            case 12:
                ul ulVar = ((b48) this.b).i;
                if (ulVar != null) {
                    ulVar.a();
                    return;
                }
                return;
            case 13:
                ab9 ab9Var = (ab9) this.b;
                ul ulVar2 = ab9Var.t;
                if (ulVar2 != null) {
                    ulVar2.a();
                }
                ul ulVar3 = ab9Var.u;
                if (ulVar3 != null) {
                    ulVar3.a();
                    return;
                }
                return;
            case 14:
                tc9 tc9Var = (tc9) this.b;
                rc9 rc9Var = tc9Var.b0;
                if (rc9Var != null) {
                    rc9Var.b(tc9Var.c);
                    return;
                }
                return;
            case 15:
                zc9 zc9Var = (zc9) this.b;
                xc9 xc9Var = zc9Var.b0;
                if (xc9Var != null) {
                    xc9Var.b(zc9Var.c);
                    return;
                }
                return;
            case 16:
                cd9 cd9Var = (cd9) this.b;
                ad9 ad9Var = cd9Var.b0;
                if (ad9Var != null) {
                    ad9Var.b(cd9Var.c);
                    return;
                }
                return;
            case 17:
                return;
            case 18:
                oba obaVar = (oba) this.b;
                obaVar.h.a();
                obaVar.n.a();
                return;
            case 19:
                return;
            case 20:
                ArrayList arrayList2 = ((iua) this.b).e;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    gua guaVar = (gua) obj;
                    if (guaVar.c) {
                        guaVar.d.I();
                    }
                }
                return;
            default:
                ko9 ko9Var = (ko9) this.b;
                yic yicVar = (yic) ko9Var.c;
                ViewTreeObserver viewTreeObserver = ((View) ko9Var.b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) ko9Var.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) ko9Var.d).removeOnPreDrawListener(yicVar);
                        }
                        ko9Var.d = null;
                    }
                    ko9Var.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(yicVar);
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
                ((zx) this.b).b(null);
                return;
            case 1:
                ((yt8) this.b).o(view);
                return;
            case 2:
                ((gc0) this.b).b.K();
                return;
            case 3:
                ((tl0) this.b).c.clear();
                return;
            case 4:
                v21 v21Var = (v21) this.b;
                v21Var.e.removeOnAttachStateChangeListener(this);
                v21Var.c(0L, false);
                return;
            case 5:
                fd1 fd1Var = (fd1) this.b;
                ViewTreeObserver viewTreeObserver = fd1Var.O;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fd1Var.O = view.getViewTreeObserver();
                    }
                    fd1Var.O.removeGlobalOnLayoutListener(fd1Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 6:
                ((rp2) this.b).b();
                return;
            case 7:
                jn7.e().n((nv2) this.b, 263);
                return;
            case 8:
                return;
            case 9:
                ((px4) this.b).l.b();
                return;
            case 10:
                ((rn5) this.b).b.K();
                return;
            case 11:
                ((av7) this.b).f.K();
                return;
            case 12:
                ul ulVar = ((b48) this.b).i;
                if (ulVar != null) {
                    ulVar.b();
                    return;
                }
                return;
            case 13:
                ab9 ab9Var = (ab9) this.b;
                ul ulVar2 = ab9Var.t;
                if (ulVar2 != null) {
                    ulVar2.b();
                }
                ul ulVar3 = ab9Var.u;
                if (ulVar3 != null) {
                    ulVar3.a();
                    return;
                }
                return;
            case 14:
                tc9 tc9Var = (tc9) this.b;
                rc9 rc9Var = tc9Var.b0;
                if (rc9Var != null) {
                    rc9Var.o(tc9Var.c);
                    return;
                }
                return;
            case 15:
                zc9 zc9Var = (zc9) this.b;
                xc9 xc9Var = zc9Var.b0;
                if (xc9Var != null) {
                    xc9Var.o(zc9Var.c);
                    return;
                }
                return;
            case 16:
                cd9 cd9Var = (cd9) this.b;
                ad9 ad9Var = cd9Var.b0;
                if (ad9Var != null) {
                    ad9Var.o(cd9Var.c);
                    return;
                }
                return;
            case 17:
                view.removeCallbacks((Runnable) ((sy9) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 18:
                oba obaVar = (oba) this.b;
                obaVar.h.b();
                obaVar.n.b();
                return;
            case 19:
                vqa vqaVar = (vqa) this.b;
                ViewTreeObserver viewTreeObserver2 = vqaVar.F;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        vqaVar.F = view.getViewTreeObserver();
                    }
                    vqaVar.F.removeGlobalOnLayoutListener(vqaVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 20:
                ArrayList arrayList = ((iua) this.b).e;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((gua) obj).a();
                }
                return;
            default:
                ko9 ko9Var = (ko9) this.b;
                ViewTreeObserver viewTreeObserver3 = (ViewTreeObserver) ko9Var.d;
                if (viewTreeObserver3 != null) {
                    if (viewTreeObserver3.isAlive()) {
                        ((ViewTreeObserver) ko9Var.d).removeOnPreDrawListener((yic) ko9Var.c);
                    }
                    ko9Var.d = null;
                    return;
                }
                return;
        }
    }

    public xc() {
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
