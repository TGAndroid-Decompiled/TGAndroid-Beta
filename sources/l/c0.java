package l;

import ai.v2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.WeakHashMap;
import m.e2;
import m.k2;
import m.s1;
import r0.i0;
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context f14947b;
    public final k f14948c;
    public final h d;
    public final boolean f14949e;
    public final int f14950f;
    public final int h;
    public final k2 f14951n;
    public PopupWindow.OnDismissListener v;
    public View f14954w;
    public View f14955x;
    public w f14956y;
    public final androidx.mediarouter.app.j f14952r = new androidx.mediarouter.app.j(this, 2);
    public final v2 f14953s = new v2(this, 3);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z10) {
        this.f14947b = context;
        this.f14948c = kVar;
        this.f14949e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f14950f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f14954w = view;
        this.f14951n = new e2(context, null, i10);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f14951n.O.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d(k kVar, boolean z10) {
        if (kVar == this.f14948c) {
            dismiss();
            w wVar = this.f14956y;
            if (wVar != null) {
                wVar.d(kVar, z10);
            }
        }
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f14951n.dismiss();
        }
    }

    @Override
    public final void e() {
        this.G = false;
        h hVar = this.d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override
    public final s1 f() {
        return this.f14951n.f15412c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f14954w) != null) {
            this.f14955x = view;
            k2 k2Var = this.f14951n;
            m.x xVar = k2Var.O;
            m.x xVar2 = k2Var.O;
            xVar.setOnDismissListener(this);
            k2Var.F = this;
            k2Var.N = true;
            xVar2.setFocusable(true);
            View view2 = this.f14955x;
            if (this.E == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f14952r);
            }
            view2.addOnAttachStateChangeListener(this.f14953s);
            k2Var.E = view2;
            k2Var.f15418w = this.I;
            boolean z11 = this.G;
            Context context = this.f14947b;
            h hVar = this.d;
            if (!z11) {
                this.H = s.m(hVar, context, this.f14950f);
                this.G = true;
            }
            k2Var.r(this.H);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f15039a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            k2Var.M = rect;
            k2Var.g();
            s1 s1Var = k2Var.f15412c;
            s1Var.setOnKeyListener(this);
            if (this.J) {
                k kVar = this.f14948c;
                if (kVar.f14994m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) s1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f14994m);
                    }
                    frameLayout.setEnabled(false);
                    s1Var.addHeaderView(frameLayout, null, false);
                }
            }
            k2Var.p(hVar);
            k2Var.g();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(w wVar) {
        this.f14956y = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f14947b, d0Var, this.f14955x, this.f14949e, this.h, 0);
            w wVar = this.f14956y;
            vVar.h = wVar;
            s sVar = vVar.f15047i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f14988f.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    MenuItem item = d0Var.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            vVar.f15046g = z10;
            s sVar2 = vVar.f15047i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f15048j = this.v;
            this.v = null;
            this.f14948c.c(false);
            k2 k2Var = this.f14951n;
            int i11 = k2Var.f15414f;
            int o9 = k2Var.o();
            int i12 = this.I;
            View view = this.f14954w;
            WeakHashMap weakHashMap = i0.f46989a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f14954w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f15044e != null) {
                    vVar.d(i11, o9, true, true);
                }
            }
            w wVar2 = this.f14956y;
            if (wVar2 != null) {
                wVar2.x(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f14954w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f14980c = z10;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f14948c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f14955x.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f14952r);
            this.E = null;
        }
        this.f14955x.removeOnAttachStateChangeListener(this.f14953s);
        PopupWindow.OnDismissListener onDismissListener = this.v;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override
    public final void p(int i10) {
        this.I = i10;
    }

    @Override
    public final void q(int i10) {
        this.f14951n.f15414f = i10;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.v = onDismissListener;
    }

    @Override
    public final void s(boolean z10) {
        this.J = z10;
    }

    @Override
    public final void t(int i10) {
        this.f14951n.k(i10);
    }

    @Override
    public final void l(k kVar) {
    }
}
