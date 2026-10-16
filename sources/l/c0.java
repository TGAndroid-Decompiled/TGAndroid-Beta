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
import bi.j2;
import java.util.WeakHashMap;
import m.f2;
import m.l2;
import m.t1;
import r0.i0;
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context f14382b;
    public final k f14383c;
    public final h d;
    public final boolean e;
    public final int f14384f;
    public final int h;
    public final l2 f14385n;
    public PopupWindow.OnDismissListener v;
    public View f14388w;
    public View f14389x;
    public w f14390y;
    public final androidx.mediarouter.app.i f14386r = new androidx.mediarouter.app.i(this, 2);
    public final j2 f14387s = new j2(this, 3);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z10) {
        this.f14382b = context;
        this.f14383c = kVar;
        this.e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f14384f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f14388w = view;
        this.f14385n = new f2(context, null, i10);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f14385n.O.isShowing()) {
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
        if (kVar == this.f14383c) {
            dismiss();
            w wVar = this.f14390y;
            if (wVar != null) {
                wVar.d(kVar, z10);
            }
        }
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f14385n.dismiss();
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
    public final t1 f() {
        return this.f14385n.f14835c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f14388w) != null) {
            this.f14389x = view;
            l2 l2Var = this.f14385n;
            m.z zVar = l2Var.O;
            m.z zVar2 = l2Var.O;
            zVar.setOnDismissListener(this);
            l2Var.F = this;
            l2Var.N = true;
            zVar2.setFocusable(true);
            View view2 = this.f14389x;
            if (this.E == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f14386r);
            }
            view2.addOnAttachStateChangeListener(this.f14387s);
            l2Var.E = view2;
            l2Var.f14840w = this.I;
            boolean z11 = this.G;
            Context context = this.f14382b;
            h hVar = this.d;
            if (!z11) {
                this.H = s.m(hVar, context, this.f14384f);
                this.G = true;
            }
            l2Var.p(this.H);
            zVar2.setInputMethodMode(2);
            Rect rect2 = this.f14468a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            l2Var.M = rect;
            l2Var.g();
            t1 t1Var = l2Var.f14835c;
            t1Var.setOnKeyListener(this);
            if (this.J) {
                k kVar = this.f14383c;
                if (kVar.f14424m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) t1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f14424m);
                    }
                    frameLayout.setEnabled(false);
                    t1Var.addHeaderView(frameLayout, null, false);
                }
            }
            l2Var.n(hVar);
            l2Var.g();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(w wVar) {
        this.f14390y = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f14382b, d0Var, this.f14389x, this.e, this.h, 0);
            w wVar = this.f14390y;
            vVar.h = wVar;
            s sVar = vVar.f14475i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f14418f.size();
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
            vVar.f14474g = z10;
            s sVar2 = vVar.f14475i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f14476j = this.v;
            this.v = null;
            this.f14383c.c(false);
            l2 l2Var = this.f14385n;
            int i11 = l2Var.f14836f;
            int m10 = l2Var.m();
            int i12 = this.I;
            View view = this.f14388w;
            WeakHashMap weakHashMap = i0.f43485a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f14388w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i11, m10, true, true);
                }
            }
            w wVar2 = this.f14390y;
            if (wVar2 != null) {
                wVar2.q(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f14388w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f14412c = z10;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f14383c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f14389x.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f14386r);
            this.E = null;
        }
        this.f14389x.removeOnAttachStateChangeListener(this.f14387s);
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
        this.f14385n.f14836f = i10;
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
        this.f14385n.j(i10);
    }

    @Override
    public final void l(k kVar) {
    }
}
