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
import r0.h0;
public final class d0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public x D;
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context f11464b;
    public final l f11465c;
    public final i d;
    public final boolean e;
    public final int f11466f;
    public final int h;
    public final j2 f11467n;
    public PopupWindow.OnDismissListener f11470w;
    public View f11471x;
    public View f11472y;
    public final androidx.mediarouter.app.i f11468r = new androidx.mediarouter.app.i(this, 2);
    public final d f11469s = new d(this, 1);
    public int I = 0;

    public d0(Context context, l lVar, View view, int i10, boolean z10) {
        this.f11464b = context;
        this.f11465c = lVar;
        this.e = z10;
        this.d = new i(lVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f11466f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f11471x = view;
        this.f11467n = new d2(context, null, i10);
        lVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f11467n.O.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d() {
        this.G = false;
        i iVar = this.d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f11467n.dismiss();
        }
    }

    @Override
    public final void e(x xVar) {
        this.D = xVar;
    }

    @Override
    public final r1 f() {
        return this.f11467n.f12392c;
    }

    @Override
    public final void g(l lVar, boolean z10) {
        if (lVar == this.f11465c) {
            dismiss();
            x xVar = this.D;
            if (xVar != null) {
                xVar.g(lVar, z10);
            }
        }
    }

    @Override
    public final void h() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f11471x) != null) {
            this.f11472y = view;
            j2 j2Var = this.f11467n;
            m.x xVar = j2Var.O;
            m.x xVar2 = j2Var.O;
            xVar.setOnDismissListener(this);
            j2Var.F = this;
            j2Var.N = true;
            xVar2.setFocusable(true);
            View view2 = this.f11472y;
            if (this.E == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f11468r);
            }
            view2.addOnAttachStateChangeListener(this.f11469s);
            j2Var.E = view2;
            j2Var.f12398x = this.I;
            boolean z11 = this.G;
            Context context = this.f11464b;
            i iVar = this.d;
            if (!z11) {
                this.H = t.m(iVar, context, this.f11466f);
                this.G = true;
            }
            j2Var.q(this.H);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f11550a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.M = rect;
            j2Var.h();
            r1 r1Var = j2Var.f12392c;
            r1Var.setOnKeyListener(this);
            if (this.J) {
                l lVar = this.f11465c;
                if (lVar.f11506m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(lVar.f11506m);
                    }
                    frameLayout.setEnabled(false);
                    r1Var.addHeaderView(frameLayout, null, false);
                }
            }
            j2Var.o(iVar);
            j2Var.h();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f11464b, e0Var, this.f11472y, this.e, this.h, 0);
            x xVar = this.D;
            wVar.h = xVar;
            t tVar = wVar.f11557i;
            if (tVar != null) {
                tVar.e(xVar);
            }
            int size = e0Var.f11500f.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    MenuItem item = e0Var.getItem(i10);
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
            wVar.f11556g = z10;
            t tVar2 = wVar.f11557i;
            if (tVar2 != null) {
                tVar2.o(z10);
            }
            wVar.f11558j = this.f11470w;
            this.f11470w = null;
            this.f11465c.c(false);
            j2 j2Var = this.f11467n;
            int i11 = j2Var.f12393f;
            int n10 = j2Var.n();
            int i12 = this.I;
            View view = this.f11471x;
            WeakHashMap weakHashMap = h0.f46123a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f11471x.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.e != null) {
                    wVar.d(i11, n10, true, true);
                }
            }
            x xVar2 = this.D;
            if (xVar2 != null) {
                xVar2.B(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f11471x = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f11494c = z10;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f11465c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f11472y.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f11468r);
            this.E = null;
        }
        this.f11472y.removeOnAttachStateChangeListener(this.f11469s);
        PopupWindow.OnDismissListener onDismissListener = this.f11470w;
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
        this.f11467n.f12393f = i10;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f11470w = onDismissListener;
    }

    @Override
    public final void s(boolean z10) {
        this.J = z10;
    }

    @Override
    public final void t(int i10) {
        this.f11467n.k(i10);
    }

    @Override
    public final void l(l lVar) {
    }
}
