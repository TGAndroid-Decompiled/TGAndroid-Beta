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
import bi.r2;
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
    public final Context f19143b;
    public final k f19144c;
    public final h d;
    public final boolean f19145e;
    public final int f19146f;
    public final int h;
    public final j2 f19147n;
    public PopupWindow.OnDismissListener f19150w;
    public View f19151x;
    public View f19152y;
    public final androidx.mediarouter.app.i f19148r = new androidx.mediarouter.app.i(this, 2);
    public final r2 f19149s = new r2(this, 8);
    public int J = 0;

    public c0(Context context, k kVar, View view, int i7, boolean z10) {
        this.f19143b = context;
        this.f19144c = kVar;
        this.f19145e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i7;
        Resources resources = context.getResources();
        this.f19146f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f19151x = view;
        this.f19147n = new d2(context, null, i7);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.G && this.f19147n.P.isShowing()) {
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
        if (kVar == this.f19144c) {
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
            this.f19147n.dismiss();
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
        return this.f19147n.f20039c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.G && (view = this.f19151x) != null) {
            this.f19152y = view;
            j2 j2Var = this.f19147n;
            m.x xVar = j2Var.P;
            m.x xVar2 = j2Var.P;
            xVar.setOnDismissListener(this);
            j2Var.G = this;
            j2Var.O = true;
            xVar2.setFocusable(true);
            View view2 = this.f19152y;
            if (this.F == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.F = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f19148r);
            }
            view2.addOnAttachStateChangeListener(this.f19149s);
            j2Var.F = view2;
            j2Var.f20046x = this.J;
            boolean z11 = this.H;
            Context context = this.f19143b;
            h hVar = this.d;
            if (!z11) {
                this.I = s.m(hVar, context, this.f19146f);
                this.H = true;
            }
            j2Var.r(this.I);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f19235a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.N = rect;
            j2Var.g();
            r1 r1Var = j2Var.f20039c;
            r1Var.setOnKeyListener(this);
            if (this.K) {
                k kVar = this.f19144c;
                if (kVar.f19190m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f19190m);
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
            v vVar = new v(this.f19143b, d0Var, this.f19152y, this.f19145e, this.h, 0);
            w wVar = this.E;
            vVar.h = wVar;
            s sVar = vVar.f19243i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f19184f.size();
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
            vVar.f19242g = z10;
            s sVar2 = vVar.f19243i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f19244j = this.f19150w;
            this.f19150w = null;
            this.f19144c.c(false);
            j2 j2Var = this.f19147n;
            int i10 = j2Var.f20041f;
            int o4 = j2Var.o();
            int i11 = this.J;
            View view = this.f19151x;
            WeakHashMap weakHashMap = i0.f56244a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i10 += this.f19151x.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f19240e != null) {
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
        this.f19151x = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f19176c = z10;
    }

    @Override
    public final void onDismiss() {
        this.G = true;
        this.f19144c.c(true);
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.F = this.f19152y.getViewTreeObserver();
            }
            this.F.removeGlobalOnLayoutListener(this.f19148r);
            this.F = null;
        }
        this.f19152y.removeOnAttachStateChangeListener(this.f19149s);
        PopupWindow.OnDismissListener onDismissListener = this.f19150w;
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
        this.f19147n.f20041f = i7;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f19150w = onDismissListener;
    }

    @Override
    public final void s(boolean z10) {
        this.K = z10;
    }

    @Override
    public final void t(int i7) {
        this.f19147n.k(i7);
    }

    @Override
    public final void l(k kVar) {
    }
}
