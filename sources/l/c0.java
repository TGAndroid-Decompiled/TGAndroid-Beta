package l;

import ai.f2;
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
    public w E;
    public ViewTreeObserver F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean K;
    public final Context f17380b;
    public final k f17381c;
    public final h d;
    public final boolean f17382e;
    public final int f17383f;
    public final int h;
    public final j2 f17384n;
    public PopupWindow.OnDismissListener f17387w;
    public View f17388x;
    public View f17389y;
    public final androidx.mediarouter.app.i f17385r = new androidx.mediarouter.app.i(this, 2);
    public final f2 f17386s = new f2(this, 8);
    public int J = 0;

    public c0(Context context, k kVar, View view, int i3, boolean z10) {
        this.f17380b = context;
        this.f17381c = kVar;
        this.f17382e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i3;
        Resources resources = context.getResources();
        this.f17383f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f17388x = view;
        this.f17384n = new d2(context, null, i3);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.G && this.f17384n.P.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(k kVar, boolean z10) {
        if (kVar == this.f17381c) {
            dismiss();
            w wVar = this.E;
            if (wVar != null) {
                wVar.b(kVar, z10);
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
            this.f17384n.dismiss();
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
        return this.f17384n.f18560c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.G && (view = this.f17388x) != null) {
            this.f17389y = view;
            j2 j2Var = this.f17384n;
            m.x xVar = j2Var.P;
            m.x xVar2 = j2Var.P;
            xVar.setOnDismissListener(this);
            j2Var.G = this;
            j2Var.O = true;
            xVar2.setFocusable(true);
            View view2 = this.f17389y;
            if (this.F == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.F = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f17385r);
            }
            view2.addOnAttachStateChangeListener(this.f17386s);
            j2Var.F = view2;
            j2Var.f18567x = this.J;
            boolean z11 = this.H;
            Context context = this.f17380b;
            h hVar = this.d;
            if (!z11) {
                this.I = s.m(hVar, context, this.f17383f);
                this.H = true;
            }
            j2Var.q(this.I);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f17472a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.N = rect;
            j2Var.g();
            r1 r1Var = j2Var.f18560c;
            r1Var.setOnKeyListener(this);
            if (this.K) {
                k kVar = this.f17381c;
                if (kVar.f17427m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f17427m);
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
        this.E = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f17380b, d0Var, this.f17389y, this.f17382e, this.h, 0);
            w wVar = this.E;
            vVar.h = wVar;
            s sVar = vVar.f17480i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f17421f.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    MenuItem item = d0Var.getItem(i3);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i3++;
                } else {
                    z10 = false;
                    break;
                }
            }
            vVar.f17479g = z10;
            s sVar2 = vVar.f17480i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f17481j = this.f17387w;
            this.f17387w = null;
            this.f17381c.c(false);
            j2 j2Var = this.f17384n;
            int i10 = j2Var.f18562f;
            int n4 = j2Var.n();
            int i11 = this.J;
            View view = this.f17388x;
            WeakHashMap weakHashMap = i0.f54015a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i10 += this.f17388x.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f17477e != null) {
                    vVar.d(i10, n4, true, true);
                }
            }
            w wVar2 = this.E;
            if (wVar2 != null) {
                wVar2.E(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f17388x = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f17413c = z10;
    }

    @Override
    public final void onDismiss() {
        this.G = true;
        this.f17381c.c(true);
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.F = this.f17389y.getViewTreeObserver();
            }
            this.F.removeGlobalOnLayoutListener(this.f17385r);
            this.F = null;
        }
        this.f17389y.removeOnAttachStateChangeListener(this.f17386s);
        PopupWindow.OnDismissListener onDismissListener = this.f17387w;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i3 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override
    public final void p(int i3) {
        this.J = i3;
    }

    @Override
    public final void q(int i3) {
        this.f17384n.f18562f = i3;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f17387w = onDismissListener;
    }

    @Override
    public final void s(boolean z10) {
        this.K = z10;
    }

    @Override
    public final void t(int i3) {
        this.f17384n.k(i3);
    }

    @Override
    public final void l(k kVar) {
    }
}
