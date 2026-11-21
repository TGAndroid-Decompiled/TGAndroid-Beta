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
import bi.v2;
import java.util.WeakHashMap;
import m.d2;
import m.j2;
import m.r1;
import r0.i0;
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public w E;
    public ViewTreeObserver F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean K;
    public final Context f19168b;
    public final k f19169c;
    public final h d;
    public final boolean f19170e;
    public final int f19171f;
    public final int h;
    public final j2 f19172n;
    public PopupWindow.OnDismissListener f19175w;
    public View f19176x;
    public View f19177y;
    public final androidx.mediarouter.app.i f19173r = new androidx.mediarouter.app.i(this, 2);
    public final v2 f19174s = new v2(this, 8);
    public int J = 0;

    public c0(Context context, k kVar, View view, int i7, boolean z10) {
        this.f19168b = context;
        this.f19169c = kVar;
        this.f19170e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i7;
        Resources resources = context.getResources();
        this.f19171f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f19176x = view;
        this.f19172n = new d2(context, null, i7);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.G && this.f19172n.P.isShowing()) {
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
        if (kVar == this.f19169c) {
            dismiss();
            w wVar = this.E;
            if (wVar != null) {
                wVar.d(kVar, z10);
            }
        }
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f19172n.dismiss();
        }
    }

    @Override
    public final void e() {
        this.H = false;
        h hVar = this.d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override
    public final r1 f() {
        return this.f19172n.f20064c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.G && (view = this.f19176x) != null) {
            this.f19177y = view;
            j2 j2Var = this.f19172n;
            m.x xVar = j2Var.P;
            m.x xVar2 = j2Var.P;
            xVar.setOnDismissListener(this);
            j2Var.G = this;
            j2Var.O = true;
            xVar2.setFocusable(true);
            View view2 = this.f19177y;
            if (this.F == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.F = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f19173r);
            }
            view2.addOnAttachStateChangeListener(this.f19174s);
            j2Var.F = view2;
            j2Var.f20071x = this.J;
            boolean z11 = this.H;
            Context context = this.f19168b;
            h hVar = this.d;
            if (!z11) {
                this.I = s.m(hVar, context, this.f19171f);
                this.H = true;
            }
            j2Var.r(this.I);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f19260a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.N = rect;
            j2Var.g();
            r1 r1Var = j2Var.f20064c;
            r1Var.setOnKeyListener(this);
            if (this.K) {
                k kVar = this.f19169c;
                if (kVar.f19215m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f19215m);
                    }
                    frameLayout.setEnabled(false);
                    r1Var.addHeaderView(frameLayout, null, false);
                }
            }
            j2Var.p(hVar);
            j2Var.g();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(w wVar) {
        this.E = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f19168b, d0Var, this.f19177y, this.f19170e, this.h, 0);
            w wVar = this.E;
            vVar.h = wVar;
            s sVar = vVar.f19268i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f19209f.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    MenuItem item = d0Var.getItem(i7);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i7++;
                } else {
                    z10 = false;
                    break;
                }
            }
            vVar.f19267g = z10;
            s sVar2 = vVar.f19268i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f19269j = this.f19175w;
            this.f19175w = null;
            this.f19169c.c(false);
            j2 j2Var = this.f19172n;
            int i10 = j2Var.f20066f;
            int o4 = j2Var.o();
            int i11 = this.J;
            View view = this.f19176x;
            WeakHashMap weakHashMap = i0.f56285a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i10 += this.f19176x.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f19265e != null) {
                    vVar.d(i10, o4, true, true);
                }
            }
            w wVar2 = this.E;
            if (wVar2 != null) {
                wVar2.C(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f19176x = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f19201c = z10;
    }

    @Override
    public final void onDismiss() {
        this.G = true;
        this.f19169c.c(true);
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.F = this.f19177y.getViewTreeObserver();
            }
            this.F.removeGlobalOnLayoutListener(this.f19173r);
            this.F = null;
        }
        this.f19177y.removeOnAttachStateChangeListener(this.f19174s);
        PopupWindow.OnDismissListener onDismissListener = this.f19175w;
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
        this.J = i7;
    }

    @Override
    public final void q(int i7) {
        this.f19172n.f20066f = i7;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f19175w = onDismissListener;
    }

    @Override
    public final void s(boolean z10) {
        this.K = z10;
    }

    @Override
    public final void t(int i7) {
        this.f19172n.k(i7);
    }

    @Override
    public final void l(k kVar) {
    }
}
