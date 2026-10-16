package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tm0;
public final class j2 implements View.OnAttachStateChangeListener {
    public final int f3203a;
    public final Object f3204b;

    public j2(Object obj, int i10) {
        this.f3203a = i10;
        this.f3204b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3203a) {
            case 0:
                ((k2) this.f3204b).f3233f.onAttachedToWindow();
                return;
            case 1:
                androidx.biometric.e eVar = (androidx.biometric.e) this.f3204b;
                ih.j jVar = (ih.j) eVar.f1201c;
                ViewTreeObserver viewTreeObserver = ((View) eVar.f1200b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) eVar.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) eVar.d).removeOnPreDrawListener(jVar);
                        }
                        eVar.d = null;
                    }
                    eVar.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(jVar);
                        return;
                    }
                    return;
                }
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((yh.k2) this.f3204b).a(view);
                return;
            case 5:
                org.telegram.ui.Components.la laVar = (org.telegram.ui.Components.la) this.f3204b;
                ArrayList arrayList = laVar.f26703c;
                arrayList.clear();
                for (View view2 = laVar.f26702b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 6:
                return;
            case 7:
                ((er) this.f3204b).a();
                return;
            case 8:
                tm0 tm0Var = (tm0) this.f3204b;
                org.telegram.ui.Components.q5 q5Var = tm0Var.f29163t;
                if (q5Var != null) {
                    q5Var.a();
                }
                org.telegram.ui.Components.q5 q5Var2 = tm0Var.f29164u;
                if (q5Var2 != null) {
                    q5Var2.a();
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ((org.telegram.ui.Components.q5) this.f3204b).a();
                return;
            case 11:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f3204b;
                if (view == ((View) sVar.f6210c)) {
                    sVar.u(view.getViewTreeObserver());
                    return;
                }
                return;
            case 12:
                ((yh.e1) this.f3204b).f48831l.a();
                return;
            case 13:
                yh.o3 o3Var = (yh.o3) this.f3204b;
                yh.m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.a(o3Var.f19421c);
                    return;
                }
                return;
            case 14:
                yh.r3 r3Var = (yh.r3) this.f3204b;
                yh.p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.a(r3Var.f19421c);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((zh.e3) this.f3204b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    zh.c3 c3Var = (zh.c3) obj;
                    if (c3Var.f50342c) {
                        c3Var.d.onAttachedToWindow();
                    }
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3203a) {
            case 0:
                ((k2) this.f3204b).f3233f.onDetachedFromWindow();
                return;
            case 1:
                androidx.biometric.e eVar = (androidx.biometric.e) this.f3204b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) eVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) eVar.d).removeOnPreDrawListener((ih.j) eVar.f1201c);
                    }
                    eVar.d = null;
                    return;
                }
                return;
            case 2:
                l.e eVar2 = (l.e) this.f3204b;
                ViewTreeObserver viewTreeObserver2 = eVar2.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar2.N = view.getViewTreeObserver();
                    }
                    eVar2.N.removeGlobalOnLayoutListener(eVar2.f14399r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                l.c0 c0Var = (l.c0) this.f3204b;
                ViewTreeObserver viewTreeObserver3 = c0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.E = view.getViewTreeObserver();
                    }
                    c0Var.E.removeGlobalOnLayoutListener(c0Var.f14386r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                ((yh.k2) this.f3204b).o(view);
                return;
            case 5:
                ((org.telegram.ui.Components.la) this.f3204b).f26703c.clear();
                return;
            case 6:
                sc scVar = (sc) this.f3204b;
                scVar.e.removeOnAttachStateChangeListener(this);
                scVar.c(0L, false);
                return;
            case 7:
                ((er) this.f3204b).b();
                return;
            case 8:
                tm0 tm0Var = (tm0) this.f3204b;
                org.telegram.ui.Components.q5 q5Var = tm0Var.f29163t;
                if (q5Var != null) {
                    q5Var.b();
                }
                org.telegram.ui.Components.q5 q5Var2 = tm0Var.f29164u;
                if (q5Var2 != null) {
                    q5Var2.a();
                    return;
                }
                return;
            case 9:
                view.removeCallbacks((Runnable) ((dp0) this.f3204b).f24160a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 10:
                ((org.telegram.ui.Components.q5) this.f3204b).b();
                return;
            case 11:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f3204b;
                if (view == ((View) sVar.f6210c)) {
                    sVar.u(null);
                    return;
                }
                return;
            case 12:
                ((yh.e1) this.f3204b).f48831l.b();
                return;
            case 13:
                yh.o3 o3Var = (yh.o3) this.f3204b;
                yh.m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.o(o3Var.f19421c);
                    return;
                }
                return;
            case 14:
                yh.r3 r3Var = (yh.r3) this.f3204b;
                yh.p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.o(r3Var.f19421c);
                    return;
                }
                return;
            default:
                ArrayList arrayList = ((zh.e3) this.f3204b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((zh.c3) obj).a();
                }
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
