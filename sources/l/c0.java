package l;

import ai.u2;
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
    public final Context f15133b;
    public final k f15134c;
    public final h d;
    public final boolean f15135e;
    public final int f15136f;
    public final int h;
    public final j2 f15137n;
    public PopupWindow.OnDismissListener v;
    public View f15140w;
    public View f15141x;
    public w f15142y;
    public final androidx.mediarouter.app.j f15138r = new androidx.mediarouter.app.j(this, 2);
    public final u2 f15139s = new u2(this, 3);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z10) {
        this.f15133b = context;
        this.f15134c = kVar;
        this.f15135e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f15136f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f15140w = view;
        this.f15137n = new d2(context, null, i10);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f15137n.O.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(k kVar, boolean z10) {
        if (kVar == this.f15134c) {
            dismiss();
            w wVar = this.f15142y;
            if (wVar != null) {
                wVar.c(kVar, z10);
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
            this.f15137n.dismiss();
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
        return this.f15137n.f15715c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f15140w) != null) {
            this.f15141x = view;
            j2 j2Var = this.f15137n;
            m.x xVar = j2Var.O;
            m.x xVar2 = j2Var.O;
            xVar.setOnDismissListener(this);
            j2Var.F = this;
            j2Var.N = true;
            xVar2.setFocusable(true);
            View view2 = this.f15141x;
            if (this.E == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f15138r);
            }
            view2.addOnAttachStateChangeListener(this.f15139s);
            j2Var.E = view2;
            j2Var.f15721w = this.I;
            boolean z11 = this.G;
            Context context = this.f15133b;
            h hVar = this.d;
            if (!z11) {
                this.H = s.m(hVar, context, this.f15136f);
                this.G = true;
            }
            j2Var.p(this.H);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f15225a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.M = rect;
            j2Var.g();
            r1 r1Var = j2Var.f15715c;
            r1Var.setOnKeyListener(this);
            if (this.J) {
                k kVar = this.f15134c;
                if (kVar.f15180m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f15180m);
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
        this.f15142y = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f15133b, d0Var, this.f15141x, this.f15135e, this.h, 0);
            w wVar = this.f15142y;
            vVar.h = wVar;
            s sVar = vVar.f15233i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f15174f.size();
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
            vVar.f15232g = z10;
            s sVar2 = vVar.f15233i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f15234j = this.v;
            this.v = null;
            this.f15134c.c(false);
            j2 j2Var = this.f15137n;
            int i11 = j2Var.f15717f;
            int m10 = j2Var.m();
            int i12 = this.I;
            View view = this.f15140w;
            WeakHashMap weakHashMap = i0.f45596a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f15140w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f15230e != null) {
                    vVar.d(i11, m10, true, true);
                }
            }
            w wVar2 = this.f15142y;
            if (wVar2 != null) {
                wVar2.v(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f15140w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f15166c = z10;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f15134c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f15141x.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f15138r);
            this.E = null;
        }
        this.f15141x.removeOnAttachStateChangeListener(this.f15139s);
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
        this.f15137n.f15717f = i10;
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
        this.f15137n.j(i10);
    }

    @Override
    public final void l(k kVar) {
    }
}
