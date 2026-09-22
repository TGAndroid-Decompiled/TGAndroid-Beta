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
    public final Context f13701b;
    public final k f13702c;
    public final h d;
    public final boolean e;
    public final int f13703f;
    public final int h;
    public final j2 f13704n;
    public PopupWindow.OnDismissListener v;
    public View f13707w;
    public View f13708x;
    public w f13709y;
    public final androidx.mediarouter.app.j f13705r = new androidx.mediarouter.app.j(this, 2);
    public final u2 f13706s = new u2(this, 3);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z10) {
        this.f13701b = context;
        this.f13702c = kVar;
        this.e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f13703f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f13707w = view;
        this.f13704n = new d2(context, null, i10);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f13704n.O.isShowing()) {
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
        h hVar = this.d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f13704n.dismiss();
        }
    }

    @Override
    public final void e(w wVar) {
        this.f13709y = wVar;
    }

    @Override
    public final r1 f() {
        return this.f13704n.f14155c;
    }

    @Override
    public final void g(k kVar, boolean z10) {
        if (kVar == this.f13702c) {
            dismiss();
            w wVar = this.f13709y;
            if (wVar != null) {
                wVar.g(kVar, z10);
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
        if (!this.F && (view = this.f13707w) != null) {
            this.f13708x = view;
            j2 j2Var = this.f13704n;
            m.x xVar = j2Var.O;
            m.x xVar2 = j2Var.O;
            xVar.setOnDismissListener(this);
            j2Var.F = this;
            j2Var.N = true;
            xVar2.setFocusable(true);
            View view2 = this.f13708x;
            if (this.E == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f13705r);
            }
            view2.addOnAttachStateChangeListener(this.f13706s);
            j2Var.E = view2;
            j2Var.f14160w = this.I;
            boolean z11 = this.G;
            Context context = this.f13701b;
            h hVar = this.d;
            if (!z11) {
                this.H = s.m(hVar, context, this.f13703f);
                this.G = true;
            }
            j2Var.p(this.H);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f13787a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.M = rect;
            j2Var.h();
            r1 r1Var = j2Var.f14155c;
            r1Var.setOnKeyListener(this);
            if (this.J) {
                k kVar = this.f13702c;
                if (kVar.f13743m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f13743m);
                    }
                    frameLayout.setEnabled(false);
                    r1Var.addHeaderView(frameLayout, null, false);
                }
            }
            j2Var.n(hVar);
            j2Var.h();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f13701b, d0Var, this.f13708x, this.e, this.h, 0);
            w wVar = this.f13709y;
            vVar.h = wVar;
            s sVar = vVar.f13794i;
            if (sVar != null) {
                sVar.e(wVar);
            }
            int size = d0Var.f13737f.size();
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
            vVar.f13793g = z10;
            s sVar2 = vVar.f13794i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f13795j = this.v;
            this.v = null;
            this.f13702c.c(false);
            j2 j2Var = this.f13704n;
            int i11 = j2Var.f14156f;
            int m10 = j2Var.m();
            int i12 = this.I;
            View view = this.f13707w;
            WeakHashMap weakHashMap = i0.f41839a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f13707w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i11, m10, true, true);
                }
            }
            w wVar2 = this.f13709y;
            if (wVar2 != null) {
                wVar2.v(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f13707w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f13731c = z10;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f13702c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f13708x.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f13705r);
            this.E = null;
        }
        this.f13708x.removeOnAttachStateChangeListener(this.f13706s);
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
        this.f13704n.f14156f = i10;
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
        this.f13704n.j(i10);
    }

    @Override
    public final void l(k kVar) {
    }
}
