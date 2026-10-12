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
import java.util.WeakHashMap;
import m.d2;
import m.j2;
import m.r1;
import r0.j0;
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context f14380b;
    public final k f14381c;
    public final h d;
    public final boolean e;
    public final int f14382f;
    public final int h;
    public final j2 f14383n;
    public PopupWindow.OnDismissListener v;
    public View f14386w;
    public View f14387x;
    public w f14388y;
    public final androidx.mediarouter.app.i f14384r = new androidx.mediarouter.app.i(this, 2);
    public final bi.j2 f14385s = new bi.j2(this, 3);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z10) {
        this.f14380b = context;
        this.f14381c = kVar;
        this.e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f14382f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f14386w = view;
        this.f14383n = new d2(context, null, i10);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f14383n.O.isShowing()) {
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
        if (kVar == this.f14381c) {
            dismiss();
            w wVar = this.f14388y;
            if (wVar != null) {
                wVar.d(kVar, z10);
            }
        }
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f14383n.dismiss();
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
        return this.f14383n.f15085c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f14386w) != null) {
            this.f14387x = view;
            j2 j2Var = this.f14383n;
            m.x xVar = j2Var.O;
            m.x xVar2 = j2Var.O;
            xVar.setOnDismissListener(this);
            j2Var.F = this;
            j2Var.N = true;
            xVar2.setFocusable(true);
            View view2 = this.f14387x;
            if (this.E == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f14384r);
            }
            view2.addOnAttachStateChangeListener(this.f14385s);
            j2Var.E = view2;
            j2Var.f15090w = this.I;
            boolean z11 = this.G;
            Context context = this.f14380b;
            h hVar = this.d;
            if (!z11) {
                this.H = s.m(hVar, context, this.f14382f);
                this.G = true;
            }
            j2Var.q(this.H);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f14466a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.M = rect;
            j2Var.g();
            r1 r1Var = j2Var.f15085c;
            r1Var.setOnKeyListener(this);
            if (this.J) {
                k kVar = this.f14381c;
                if (kVar.f14422m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f14422m);
                    }
                    frameLayout.setEnabled(false);
                    r1Var.addHeaderView(frameLayout, null, false);
                }
            }
            j2Var.o(hVar);
            j2Var.g();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(w wVar) {
        this.f14388y = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f14380b, d0Var, this.f14387x, this.e, this.h, 0);
            w wVar = this.f14388y;
            vVar.h = wVar;
            s sVar = vVar.f14473i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f14416f.size();
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
            vVar.f14472g = z10;
            s sVar2 = vVar.f14473i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f14474j = this.v;
            this.v = null;
            this.f14381c.c(false);
            j2 j2Var = this.f14383n;
            int i11 = j2Var.f15086f;
            int n10 = j2Var.n();
            int i12 = this.I;
            View view = this.f14386w;
            WeakHashMap weakHashMap = j0.f43732a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f14386w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i11, n10, true, true);
                }
            }
            w wVar2 = this.f14388y;
            if (wVar2 != null) {
                wVar2.q(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f14386w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f14410c = z10;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f14381c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f14387x.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f14384r);
            this.E = null;
        }
        this.f14387x.removeOnAttachStateChangeListener(this.f14385s);
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
        this.f14383n.f15086f = i10;
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
        this.f14383n.k(i10);
    }

    @Override
    public final void l(k kVar) {
    }
}
