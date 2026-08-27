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
import m.k2;
import m.s1;
import r0.j0;

public final class d0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean F;

    public final Context f15273b;

    public final l f15274c;
    public final i d;

    public final boolean f15275e;

    public final int f15276f;
    public final int h;

    public final k2 f15277n;
    public PopupWindow.OnDismissListener v;

    public View f15280w;

    public View f15281x;

    public x f15282y;

    public final d f15278r = new d(this, 1);

    public final bf.b f15279s = new bf.b(this, 7);
    public int E = 0;

    public d0(Context context, l lVar, View view, int i10, boolean z10) {
        this.f15273b = context;
        this.f15274c = lVar;
        this.f15275e = z10;
        this.d = new i(lVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f15276f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f15280w = view;
        this.f15277n = new k2(context, null, i10);
        lVar.b(this, context);
    }

    @Override
    public final boolean a() {
        return !this.B && this.f15277n.K.isShowing();
    }

    @Override
    public final void b(l lVar, boolean z10) {
        if (lVar != this.f15274c) {
            return;
        }
        dismiss();
        x xVar = this.f15282y;
        if (xVar != null) {
            xVar.b(lVar, z10);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f15277n.dismiss();
        }
    }

    @Override
    public final void e() {
        this.C = false;
        i iVar = this.d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override
    public final s1 f() {
        return this.f15277n.f17307c;
    }

    @Override
    public final void g() {
        View view;
        if (a()) {
            return;
        }
        if (this.B || (view = this.f15280w) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f15281x = view;
        k2 k2Var = this.f15277n;
        m.y yVar = k2Var.K;
        m.y yVar2 = k2Var.K;
        yVar.setOnDismissListener(this);
        k2Var.B = this;
        k2Var.J = true;
        yVar2.setFocusable(true);
        View view2 = this.f15281x;
        boolean z10 = this.A == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f15278r);
        }
        view2.addOnAttachStateChangeListener(this.f15279s);
        k2Var.A = view2;
        k2Var.f17313w = this.E;
        boolean z11 = this.C;
        Context context = this.f15273b;
        i iVar = this.d;
        if (!z11) {
            this.D = t.m(iVar, context, this.f15276f);
            this.C = true;
        }
        k2Var.q(this.D);
        yVar2.setInputMethodMode(2);
        Rect rect = this.f15365a;
        k2Var.I = rect != null ? new Rect(rect) : null;
        k2Var.g();
        s1 s1Var = k2Var.f17307c;
        s1Var.setOnKeyListener(this);
        if (this.F) {
            l lVar = this.f15274c;
            if (lVar.f15320m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) s1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(16908310);
                if (textView != null) {
                    textView.setText(lVar.f15320m);
                }
                frameLayout.setEnabled(false);
                s1Var.addHeaderView(frameLayout, null, false);
            }
        }
        k2Var.o(iVar);
        k2Var.g();
    }

    @Override
    public final void h(x xVar) {
        this.f15282y = xVar;
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f15273b, e0Var, this.f15281x, this.f15275e, this.h, 0);
            x xVar = this.f15282y;
            wVar.h = xVar;
            t tVar = wVar.f15373i;
            if (tVar != null) {
                tVar.h(xVar);
            }
            int size = e0Var.f15314f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            wVar.f15372g = z10;
            t tVar2 = wVar.f15373i;
            if (tVar2 != null) {
                tVar2.o(z10);
            }
            wVar.f15374j = this.v;
            this.v = null;
            this.f15274c.c(false);
            k2 k2Var = this.f15277n;
            int width = k2Var.f17309f;
            int iN = k2Var.n();
            int i11 = this.E;
            View view = this.f15280w;
            WeakHashMap weakHashMap = j0.f46605a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                width += this.f15280w.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f15370e != null) {
                    wVar.d(width, iN, true, true);
                }
            }
            x xVar2 = this.f15282y;
            if (xVar2 != null) {
                xVar2.l(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f15280w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f15306c = z10;
    }

    @Override
    public final void onDismiss() {
        this.B = true;
        this.f15274c.c(true);
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A = this.f15281x.getViewTreeObserver();
            }
            this.A.removeGlobalOnLayoutListener(this.f15278r);
            this.A = null;
        }
        this.f15281x.removeOnAttachStateChangeListener(this.f15279s);
        PopupWindow.OnDismissListener onDismissListener = this.v;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override
    public final void p(int i10) {
        this.E = i10;
    }

    @Override
    public final void q(int i10) {
        this.f15277n.f17309f = i10;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.v = onDismissListener;
    }

    @Override
    public final void s(boolean z10) {
        this.F = z10;
    }

    @Override
    public final void t(int i10) {
        this.f15277n.k(i10);
    }

    @Override
    public final void l(l lVar) {
    }
}
