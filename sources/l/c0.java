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
import bi.x2;
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
    public final Context f19137b;
    public final k f19138c;
    public final h d;
    public final boolean f19139e;
    public final int f19140f;
    public final int h;
    public final j2 f19141n;
    public PopupWindow.OnDismissListener f19144w;
    public View f19145x;
    public View f19146y;
    public final androidx.mediarouter.app.i f19142r = new androidx.mediarouter.app.i(this, 2);
    public final x2 f19143s = new x2(this, 8);
    public int J = 0;

    public c0(Context context, k kVar, View view, int i7, boolean z10) {
        this.f19137b = context;
        this.f19138c = kVar;
        this.f19139e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i7;
        Resources resources = context.getResources();
        this.f19140f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f19145x = view;
        this.f19141n = new d2(context, null, i7);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.G && this.f19141n.P.isShowing()) {
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
        if (kVar == this.f19138c) {
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
            this.f19141n.dismiss();
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
        return this.f19141n.f20033c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.G && (view = this.f19145x) != null) {
            this.f19146y = view;
            j2 j2Var = this.f19141n;
            m.x xVar = j2Var.P;
            m.x xVar2 = j2Var.P;
            xVar.setOnDismissListener(this);
            j2Var.G = this;
            j2Var.O = true;
            xVar2.setFocusable(true);
            View view2 = this.f19146y;
            if (this.F == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.F = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f19142r);
            }
            view2.addOnAttachStateChangeListener(this.f19143s);
            j2Var.F = view2;
            j2Var.f20040x = this.J;
            boolean z11 = this.H;
            Context context = this.f19137b;
            h hVar = this.d;
            if (!z11) {
                this.I = s.m(hVar, context, this.f19140f);
                this.H = true;
            }
            j2Var.r(this.I);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f19229a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.N = rect;
            j2Var.g();
            r1 r1Var = j2Var.f20033c;
            r1Var.setOnKeyListener(this);
            if (this.K) {
                k kVar = this.f19138c;
                if (kVar.f19184m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f19184m);
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
            v vVar = new v(this.f19137b, d0Var, this.f19146y, this.f19139e, this.h, 0);
            w wVar = this.E;
            vVar.h = wVar;
            s sVar = vVar.f19237i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f19178f.size();
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
            vVar.f19236g = z10;
            s sVar2 = vVar.f19237i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f19238j = this.f19144w;
            this.f19144w = null;
            this.f19138c.c(false);
            j2 j2Var = this.f19141n;
            int i10 = j2Var.f20035f;
            int o4 = j2Var.o();
            int i11 = this.J;
            View view = this.f19145x;
            WeakHashMap weakHashMap = i0.f56254a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i10 += this.f19145x.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f19234e != null) {
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
        this.f19145x = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f19170c = z10;
    }

    @Override
    public final void onDismiss() {
        this.G = true;
        this.f19138c.c(true);
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.F = this.f19146y.getViewTreeObserver();
            }
            this.F.removeGlobalOnLayoutListener(this.f19142r);
            this.F = null;
        }
        this.f19146y.removeOnAttachStateChangeListener(this.f19143s);
        PopupWindow.OnDismissListener onDismissListener = this.f19144w;
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
        this.f19141n.f20035f = i7;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f19144w = onDismissListener;
    }

    @Override
    public final void s(boolean z10) {
        this.K = z10;
    }

    @Override
    public final void t(int i7) {
        this.f19141n.k(i7);
    }

    @Override
    public final void l(k kVar) {
    }
}
