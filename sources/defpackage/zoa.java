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
public final class zoa extends i27 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public r27 E;
    public ViewTreeObserver F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean K;
    public final Context b;
    public final y17 c;
    public final v17 d;
    public final boolean e;
    public final int f;
    public final int h;
    public final q27 n;
    public j27 w;
    public View x;
    public View y;
    public final uq r = new uq(this, (byte) 6);
    public final wd s = new wd(this, (byte) 18);
    public int J = 0;

    public zoa(Context context, y17 y17Var, View view, int i, boolean z) {
        this.b = context;
        this.c = y17Var;
        this.e = z;
        this.d = new v17(y17Var, LayoutInflater.from(context), z, 2131492883);
        this.h = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.x = view;
        this.n = new o76(context, null, i);
        y17Var.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.G && this.n.P.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(dcb dcbVar) {
        boolean z;
        if (dcbVar.hasVisibleItems()) {
            l27 l27Var = new l27(this.b, dcbVar, this.y, this.e, this.h, 0);
            r27 r27Var = this.E;
            l27Var.h = r27Var;
            i27 i27Var = l27Var.i;
            if (i27Var != null) {
                i27Var.h(r27Var);
            }
            int size = dcbVar.f.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    MenuItem item = dcbVar.getItem(i);
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
            l27Var.g = z;
            i27 i27Var2 = l27Var.i;
            if (i27Var2 != null) {
                i27Var2.o(z);
            }
            l27Var.j = this.w;
            this.w = null;
            this.c.c(false);
            q27 q27Var = this.n;
            int i2 = q27Var.f;
            int m = q27Var.m();
            int i3 = this.J;
            View view = this.x;
            WeakHashMap weakHashMap = kfc.a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.x.getWidth();
            }
            if (!l27Var.b()) {
                if (l27Var.e != null) {
                    l27Var.d(i2, m, true, true);
                }
            }
            r27 r27Var2 = this.E;
            if (r27Var2 != null) {
                r27Var2.w0(dcbVar);
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
    public final void d(y17 y17Var, boolean z) {
        if (y17Var == this.c) {
            dismiss();
            r27 r27Var = this.E;
            if (r27Var != null) {
                r27Var.d(y17Var, z);
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
    public final os3 e() {
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
            q27 q27Var = this.n;
            nq nqVar = q27Var.P;
            nq nqVar2 = q27Var.P;
            nqVar.setOnDismissListener(this);
            q27Var.G = this;
            q27Var.O = true;
            nqVar2.setFocusable(true);
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
            q27Var.F = view2;
            q27Var.x = this.J;
            boolean z2 = this.H;
            Context context = this.b;
            v17 v17Var = this.d;
            if (!z2) {
                this.I = i27.m(v17Var, context, this.f);
                this.H = true;
            }
            q27Var.p(this.I);
            nqVar2.setInputMethodMode(2);
            Rect rect2 = this.a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            q27Var.N = rect;
            q27Var.f();
            os3 os3Var = q27Var.c;
            os3Var.setOnKeyListener(this);
            if (this.K) {
                y17 y17Var = this.c;
                if (y17Var.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) os3Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(y17Var.m);
                    }
                    frameLayout.setEnabled(false);
                    os3Var.addHeaderView(frameLayout, null, false);
                }
            }
            q27Var.n(v17Var);
            q27Var.f();
            return;
        }
        dq9.m("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(r27 r27Var) {
        this.E = r27Var;
    }

    @Override
    public final void j() {
        this.H = false;
        v17 v17Var = this.d;
        if (v17Var != null) {
            v17Var.notifyDataSetChanged();
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
        j27 j27Var = this.w;
        if (j27Var != null) {
            j27Var.onDismiss();
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
        this.w = (j27) onDismissListener;
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
