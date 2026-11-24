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
public final class yma extends i07 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public r07 E;
    public ViewTreeObserver F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean K;
    public final Context b;
    public final yz6 c;
    public final vz6 d;
    public final boolean e;
    public final int f;
    public final int h;
    public final q07 n;
    public j07 w;
    public View x;
    public View y;
    public final up r = new up(this, (byte) 6);
    public final wc s = new wc(this, (byte) 18);
    public int J = 0;

    public yma(Context context, yz6 yz6Var, View view, int i, boolean z) {
        this.b = context;
        this.c = yz6Var;
        this.e = z;
        this.d = new vz6(yz6Var, LayoutInflater.from(context), z, 2131492883);
        this.h = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.x = view;
        this.n = new o56(context, null, i);
        yz6Var.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.G && this.n.P.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(bab babVar) {
        boolean z;
        if (babVar.hasVisibleItems()) {
            l07 l07Var = new l07(this.b, babVar, this.y, this.e, this.h, 0);
            r07 r07Var = this.E;
            l07Var.h = r07Var;
            i07 i07Var = l07Var.i;
            if (i07Var != null) {
                i07Var.h(r07Var);
            }
            int size = babVar.f.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    MenuItem item = babVar.getItem(i);
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
            l07Var.g = z;
            i07 i07Var2 = l07Var.i;
            if (i07Var2 != null) {
                i07Var2.o(z);
            }
            l07Var.j = this.w;
            this.w = null;
            this.c.c(false);
            q07 q07Var = this.n;
            int i2 = q07Var.f;
            int n = q07Var.n();
            int i3 = this.J;
            View view = this.x;
            WeakHashMap weakHashMap = jdc.a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.x.getWidth();
            }
            if (!l07Var.b()) {
                if (l07Var.e != null) {
                    l07Var.d(i2, n, true, true);
                }
            }
            r07 r07Var2 = this.E;
            if (r07Var2 != null) {
                r07Var2.J(babVar);
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
    public final void d(yz6 yz6Var, boolean z) {
        if (yz6Var == this.c) {
            dismiss();
            r07 r07Var = this.E;
            if (r07Var != null) {
                r07Var.d(yz6Var, z);
            }
        }
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.n.dismiss();
        }
    }

    @Override
    public final er3 e() {
        return this.n.c;
    }

    @Override
    public final void f() {
        View view;
        boolean z;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.G && (view = this.x) != null) {
            this.y = view;
            q07 q07Var = this.n;
            np npVar = q07Var.P;
            np npVar2 = q07Var.P;
            npVar.setOnDismissListener(this);
            q07Var.G = this;
            q07Var.O = true;
            npVar2.setFocusable(true);
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
            q07Var.F = view2;
            q07Var.x = this.J;
            boolean z2 = this.H;
            Context context = this.b;
            vz6 vz6Var = this.d;
            if (!z2) {
                this.I = i07.m(vz6Var, context, this.f);
                this.H = true;
            }
            q07Var.r(this.I);
            npVar2.setInputMethodMode(2);
            Rect rect2 = this.a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            q07Var.N = rect;
            q07Var.f();
            er3 er3Var = q07Var.c;
            er3Var.setOnKeyListener(this);
            if (this.K) {
                yz6 yz6Var = this.c;
                if (yz6Var.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) er3Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(yz6Var.m);
                    }
                    frameLayout.setEnabled(false);
                    er3Var.addHeaderView(frameLayout, null, false);
                }
            }
            q07Var.o(vz6Var);
            q07Var.f();
            return;
        }
        sc8.j("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(r07 r07Var) {
        this.E = r07Var;
    }

    @Override
    public final void j() {
        this.H = false;
        vz6 vz6Var = this.d;
        if (vz6Var != null) {
            vz6Var.notifyDataSetChanged();
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
        j07 j07Var = this.w;
        if (j07Var != null) {
            j07Var.onDismiss();
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
        this.w = (j07) onDismissListener;
    }

    @Override
    public final void s(boolean z) {
        this.K = z;
    }

    @Override
    public final void t(int i) {
        this.n.k(i);
    }
}
