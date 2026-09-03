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
import m.e2;
import m.k2;
import m.s1;
import r0.j0;
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean G;
    public final Context f11117b;
    public final k f11118c;
    public final h d;
    public final boolean e;
    public final int f11119f;
    public final int h;
    public final k2 f11120n;
    public PopupWindow.OnDismissListener v;
    public View f11123w;
    public View f11124x;
    public w f11125y;
    public final androidx.mediarouter.app.k f11121r = new androidx.mediarouter.app.k(this, 2);
    public final ef.b f11122s = new ef.b(this, 5);
    public int F = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z4) {
        this.f11117b = context;
        this.f11118c = kVar;
        this.e = z4;
        this.d = new h(kVar, LayoutInflater.from(context), z4, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f11119f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f11123w = view;
        this.f11120n = new e2(context, null, i10);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.C && this.f11120n.L.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(k kVar, boolean z4) {
        if (kVar == this.f11118c) {
            dismiss();
            w wVar = this.f11125y;
            if (wVar != null) {
                wVar.c(kVar, z4);
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
            this.f11120n.dismiss();
        }
    }

    @Override
    public final void e() {
        this.D = false;
        h hVar = this.d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override
    public final s1 f() {
        return this.f11120n.f13476c;
    }

    @Override
    public final void g() {
        View view;
        boolean z4;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.C && (view = this.f11123w) != null) {
            this.f11124x = view;
            k2 k2Var = this.f11120n;
            m.x xVar = k2Var.L;
            m.x xVar2 = k2Var.L;
            xVar.setOnDismissListener(this);
            k2Var.C = this;
            k2Var.K = true;
            xVar2.setFocusable(true);
            View view2 = this.f11124x;
            if (this.B == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.B = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f11121r);
            }
            view2.addOnAttachStateChangeListener(this.f11122s);
            k2Var.B = view2;
            k2Var.f13481w = this.F;
            boolean z10 = this.D;
            Context context = this.f11117b;
            h hVar = this.d;
            if (!z10) {
                this.E = s.m(hVar, context, this.f11119f);
                this.D = true;
            }
            k2Var.r(this.E);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f11203a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            k2Var.J = rect;
            k2Var.g();
            s1 s1Var = k2Var.f13476c;
            s1Var.setOnKeyListener(this);
            if (this.G) {
                k kVar = this.f11118c;
                if (kVar.f11159m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) s1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f11159m);
                    }
                    frameLayout.setEnabled(false);
                    s1Var.addHeaderView(frameLayout, null, false);
                }
            }
            k2Var.p(hVar);
            k2Var.g();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(w wVar) {
        this.f11125y = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z4;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f11117b, d0Var, this.f11124x, this.e, this.h, 0);
            w wVar = this.f11125y;
            vVar.h = wVar;
            s sVar = vVar.f11210i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f11153f.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    MenuItem item = d0Var.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z4 = true;
                        break;
                    }
                    i10++;
                } else {
                    z4 = false;
                    break;
                }
            }
            vVar.f11209g = z4;
            s sVar2 = vVar.f11210i;
            if (sVar2 != null) {
                sVar2.o(z4);
            }
            vVar.f11211j = this.v;
            this.v = null;
            this.f11118c.c(false);
            k2 k2Var = this.f11120n;
            int i11 = k2Var.f13477f;
            int o10 = k2Var.o();
            int i12 = this.F;
            View view = this.f11123w;
            WeakHashMap weakHashMap = j0.f43142a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f11123w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i11, o10, true, true);
                }
            }
            w wVar2 = this.f11125y;
            if (wVar2 != null) {
                wVar2.p(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f11123w = view;
    }

    @Override
    public final void o(boolean z4) {
        this.d.f11147c = z4;
    }

    @Override
    public final void onDismiss() {
        this.C = true;
        this.f11118c.c(true);
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.B = this.f11124x.getViewTreeObserver();
            }
            this.B.removeGlobalOnLayoutListener(this.f11121r);
            this.B = null;
        }
        this.f11124x.removeOnAttachStateChangeListener(this.f11122s);
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
        this.F = i10;
    }

    @Override
    public final void q(int i10) {
        this.f11120n.f13477f = i10;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.v = onDismissListener;
    }

    @Override
    public final void s(boolean z4) {
        this.G = z4;
    }

    @Override
    public final void t(int i10) {
        this.f11120n.k(i10);
    }

    @Override
    public final void l(k kVar) {
    }
}
