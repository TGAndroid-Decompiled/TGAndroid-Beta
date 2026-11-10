package l;

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
import bi.m6;
import java.util.WeakHashMap;
import m.e2;
import m.k2;
import m.s1;
import r0.i0;
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public w D;
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context f17637b;
    public final k f17638c;
    public final h d;
    public final boolean f17639e;
    public final int f17640f;
    public final int h;
    public final k2 f17641n;
    public PopupWindow.OnDismissListener f17644w;
    public View f17645x;
    public View f17646y;
    public final androidx.mediarouter.app.i f17642r = new androidx.mediarouter.app.i(this, 2);
    public final m6 f17643s = new m6(this, 4);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i7, boolean z9) {
        this.f17637b = context;
        this.f17638c = kVar;
        this.f17639e = z9;
        this.d = new h(kVar, LayoutInflater.from(context), z9, 2131492883);
        this.h = i7;
        Resources resources = context.getResources();
        this.f17640f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f17645x = view;
        this.f17641n = new e2(context, null, i7);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f17641n.O.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(k kVar, boolean z9) {
        if (kVar == this.f17638c) {
            dismiss();
            w wVar = this.D;
            if (wVar != null) {
                wVar.c(kVar, z9);
            }
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f17641n.dismiss();
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
        return this.f17641n.f19095c;
    }

    @Override
    public final void g() {
        View view;
        boolean z9;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f17645x) != null) {
            this.f17646y = view;
            k2 k2Var = this.f17641n;
            m.y yVar = k2Var.O;
            m.y yVar2 = k2Var.O;
            yVar.setOnDismissListener(this);
            k2Var.F = this;
            k2Var.N = true;
            yVar2.setFocusable(true);
            View view2 = this.f17646y;
            if (this.E == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z9) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f17642r);
            }
            view2.addOnAttachStateChangeListener(this.f17643s);
            k2Var.E = view2;
            k2Var.f19102x = this.I;
            boolean z10 = this.G;
            Context context = this.f17637b;
            h hVar = this.d;
            if (!z10) {
                this.H = s.m(hVar, context, this.f17640f);
                this.G = true;
            }
            k2Var.p(this.H);
            yVar2.setInputMethodMode(2);
            Rect rect2 = this.f17729a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            k2Var.M = rect;
            k2Var.g();
            s1 s1Var = k2Var.f19095c;
            s1Var.setOnKeyListener(this);
            if (this.J) {
                k kVar = this.f17638c;
                if (kVar.f17684m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) s1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f17684m);
                    }
                    frameLayout.setEnabled(false);
                    s1Var.addHeaderView(frameLayout, null, false);
                }
            }
            k2Var.n(hVar);
            k2Var.g();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(w wVar) {
        this.D = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z9;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f17637b, d0Var, this.f17646y, this.f17639e, this.h, 0);
            w wVar = this.D;
            vVar.h = wVar;
            s sVar = vVar.f17737i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f17678f.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    MenuItem item = d0Var.getItem(i7);
                    if (item.isVisible() && item.getIcon() != null) {
                        z9 = true;
                        break;
                    }
                    i7++;
                } else {
                    z9 = false;
                    break;
                }
            }
            vVar.f17736g = z9;
            s sVar2 = vVar.f17737i;
            if (sVar2 != null) {
                sVar2.o(z9);
            }
            vVar.f17738j = this.f17644w;
            this.f17644w = null;
            this.f17638c.c(false);
            k2 k2Var = this.f17641n;
            int i10 = k2Var.f19097f;
            int m10 = k2Var.m();
            int i11 = this.I;
            View view = this.f17645x;
            WeakHashMap weakHashMap = i0.f54202a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i10 += this.f17645x.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f17734e != null) {
                    vVar.d(i10, m10, true, true);
                }
            }
            w wVar2 = this.D;
            if (wVar2 != null) {
                wVar2.A(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f17645x = view;
    }

    @Override
    public final void o(boolean z9) {
        this.d.f17670c = z9;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f17638c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f17646y.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f17642r);
            this.E = null;
        }
        this.f17646y.removeOnAttachStateChangeListener(this.f17643s);
        PopupWindow.OnDismissListener onDismissListener = this.f17644w;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i7 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override
    public final void p(int i7) {
        this.I = i7;
    }

    @Override
    public final void q(int i7) {
        this.f17641n.f19097f = i7;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f17644w = onDismissListener;
    }

    @Override
    public final void s(boolean z9) {
        this.J = z9;
    }

    @Override
    public final void t(int i7) {
        this.f17641n.j(i7);
    }

    @Override
    public final void l(k kVar) {
    }
}
