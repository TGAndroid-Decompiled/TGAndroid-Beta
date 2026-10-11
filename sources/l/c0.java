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
import m.d2;
import m.j2;
import m.r1;
import r0.i0;
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context f15237b;
    public final k f15238c;
    public final h d;
    public final boolean f15239e;
    public final int f15240f;
    public final int h;
    public final j2 f15241n;
    public PopupWindow.OnDismissListener v;
    public View f15244w;
    public View f15245x;
    public w f15246y;
    public final androidx.mediarouter.app.j f15242r = new androidx.mediarouter.app.j(this, 2);
    public final v2 f15243s = new v2(this, 3);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z10) {
        this.f15237b = context;
        this.f15238c = kVar;
        this.f15239e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f15240f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f15244w = view;
        this.f15241n = new d2(context, null, i10);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f15241n.O.isShowing()) {
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
        if (kVar == this.f15238c) {
            dismiss();
            w wVar = this.f15246y;
            if (wVar != null) {
                wVar.d(kVar, z10);
            }
        }
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f15241n.dismiss();
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
    public final r1 f() {
        return this.f15241n.f15713c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f15244w) != null) {
            this.f15245x = view;
            j2 j2Var = this.f15241n;
            m.x xVar = j2Var.O;
            m.x xVar2 = j2Var.O;
            xVar.setOnDismissListener(this);
            j2Var.F = this;
            j2Var.N = true;
            xVar2.setFocusable(true);
            View view2 = this.f15245x;
            if (this.E == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f15242r);
            }
            view2.addOnAttachStateChangeListener(this.f15243s);
            j2Var.E = view2;
            j2Var.f15719w = this.I;
            boolean z11 = this.G;
            Context context = this.f15237b;
            h hVar = this.d;
            if (!z11) {
                this.H = s.m(hVar, context, this.f15240f);
                this.G = true;
            }
            j2Var.p(this.H);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f15329a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.M = rect;
            j2Var.g();
            r1 r1Var = j2Var.f15713c;
            r1Var.setOnKeyListener(this);
            if (this.J) {
                k kVar = this.f15238c;
                if (kVar.f15284m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f15284m);
                    }
                    frameLayout.setEnabled(false);
                    r1Var.addHeaderView(frameLayout, null, false);
                }
            }
            j2Var.n(hVar);
            j2Var.g();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(w wVar) {
        this.f15246y = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f15237b, d0Var, this.f15245x, this.f15239e, this.h, 0);
            w wVar = this.f15246y;
            vVar.h = wVar;
            s sVar = vVar.f15337i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f15278f.size();
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
            vVar.f15336g = z10;
            s sVar2 = vVar.f15337i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f15338j = this.v;
            this.v = null;
            this.f15238c.c(false);
            j2 j2Var = this.f15241n;
            int i11 = j2Var.f15715f;
            int m10 = j2Var.m();
            int i12 = this.I;
            View view = this.f15244w;
            WeakHashMap weakHashMap = i0.f46890a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f15244w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f15334e != null) {
                    vVar.d(i11, m10, true, true);
                }
            }
            w wVar2 = this.f15246y;
            if (wVar2 != null) {
                wVar2.v(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f15244w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f15270c = z10;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f15238c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f15245x.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f15242r);
            this.E = null;
        }
        this.f15245x.removeOnAttachStateChangeListener(this.f15243s);
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
        this.f15241n.f15715f = i10;
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
        this.f15241n.j(i10);
    }

    @Override
    public final void l(k kVar) {
    }
}
