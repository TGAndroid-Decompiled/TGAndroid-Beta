package defpackage;

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
public final class vqa extends p27 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public y27 E;
    public ViewTreeObserver F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean K;
    public final Context b;
    public final f27 c;
    public final c27 d;
    public final boolean e;
    public final int f;
    public final int h;
    public final x27 n;
    public q27 w;
    public View x;
    public View y;
    public final vp r = new vp(this, (byte) 6);
    public final xc s = new xc(this, (byte) 19);
    public int J = 0;

    public vqa(Context context, f27 f27Var, View view, int i, boolean z) {
        this.b = context;
        this.c = f27Var;
        this.e = z;
        this.d = new c27(f27Var, LayoutInflater.from(context), z, 2131492883);
        this.h = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.x = view;
        this.n = new s76(context, null, i);
        f27Var.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.G && this.n.P.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(zdb zdbVar) {
        boolean z;
        if (zdbVar.hasVisibleItems()) {
            s27 s27Var = new s27(this.b, zdbVar, this.y, this.e, this.h, 0);
            y27 y27Var = this.E;
            s27Var.h = y27Var;
            p27 p27Var = s27Var.i;
            if (p27Var != null) {
                p27Var.h(y27Var);
            }
            int size = zdbVar.f.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    MenuItem item = zdbVar.getItem(i);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            s27Var.g = z;
            p27 p27Var2 = s27Var.i;
            if (p27Var2 != null) {
                p27Var2.o(z);
            }
            s27Var.j = this.w;
            this.w = null;
            this.c.c(false);
            x27 x27Var = this.n;
            int i2 = x27Var.f;
            int m = x27Var.m();
            int i3 = this.J;
            View view = this.x;
            WeakHashMap weakHashMap = ihc.a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.x.getWidth();
            }
            if (!s27Var.b()) {
                if (s27Var.e != null) {
                    s27Var.d(i2, m, true, true);
                }
            }
            y27 y27Var2 = this.E;
            if (y27Var2 != null) {
                y27Var2.z0(zdbVar);
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final vr3 d() {
        return this.n.c;
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.n.dismiss();
        }
    }

    @Override
    public final void f(f27 f27Var, boolean z) {
        if (f27Var == this.c) {
            dismiss();
            y27 y27Var = this.E;
            if (y27Var != null) {
                y27Var.f(f27Var, z);
            }
        }
    }

    @Override
    public final void g() {
        View view;
        boolean z;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.G && (view = this.x) != null) {
            this.y = view;
            x27 x27Var = this.n;
            op opVar = x27Var.P;
            op opVar2 = x27Var.P;
            opVar.setOnDismissListener(this);
            x27Var.G = this;
            x27Var.O = true;
            opVar2.setFocusable(true);
            View view2 = this.y;
            if (this.F == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.F = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.r);
            }
            view2.addOnAttachStateChangeListener(this.s);
            x27Var.F = view2;
            x27Var.x = this.J;
            boolean z2 = this.H;
            Context context = this.b;
            c27 c27Var = this.d;
            if (!z2) {
                this.I = p27.m(c27Var, context, this.f);
                this.H = true;
            }
            x27Var.p(this.I);
            opVar2.setInputMethodMode(2);
            Rect rect2 = this.a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            x27Var.N = rect;
            x27Var.g();
            vr3 vr3Var = x27Var.c;
            vr3Var.setOnKeyListener(this);
            if (this.K) {
                f27 f27Var = this.c;
                if (f27Var.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) vr3Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(f27Var.m);
                    }
                    frameLayout.setEnabled(false);
                    vr3Var.addHeaderView(frameLayout, null, false);
                }
            }
            x27Var.n(c27Var);
            x27Var.g();
            return;
        }
        grb.i("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(y27 y27Var) {
        this.E = y27Var;
    }

    @Override
    public final void j() {
        this.H = false;
        c27 c27Var = this.d;
        if (c27Var != null) {
            c27Var.notifyDataSetChanged();
        }
    }

    @Override
    public final void n(View view) {
        this.x = view;
    }

    @Override
    public final void o(boolean z) {
        this.d.c = z;
    }

    @Override
    public final void onDismiss() {
        this.G = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.F = this.y.getViewTreeObserver();
            }
            this.F.removeGlobalOnLayoutListener(this.r);
            this.F = null;
        }
        this.y.removeOnAttachStateChangeListener(this.s);
        q27 q27Var = this.w;
        if (q27Var != null) {
            q27Var.onDismiss();
        }
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override
    public final void p(int i) {
        this.J = i;
    }

    @Override
    public final void q(int i) {
        this.n.f = i;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.w = (q27) onDismissListener;
    }

    @Override
    public final void s(boolean z) {
        this.K = z;
    }

    @Override
    public final void t(int i) {
        this.n.j(i);
    }
}
