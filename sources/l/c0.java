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
    public final Context f11007b;
    public final k f11008c;
    public final h d;
    public final boolean e;
    public final int f11009f;
    public final int h;
    public final k2 f11010n;
    public PopupWindow.OnDismissListener v;
    public View f11013w;
    public View f11014x;
    public w f11015y;
    public final androidx.mediarouter.app.k f11011r = new androidx.mediarouter.app.k(this, 2);
    public final ff.b f11012s = new ff.b(this, 5);
    public int F = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z4) {
        this.f11007b = context;
        this.f11008c = kVar;
        this.e = z4;
        this.d = new h(kVar, LayoutInflater.from(context), z4, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f11009f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f11013w = view;
        this.f11010n = new e2(context, null, i10);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.C && this.f11010n.L.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(k kVar, boolean z4) {
        if (kVar == this.f11008c) {
            dismiss();
            w wVar = this.f11015y;
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
            this.f11010n.dismiss();
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
        return this.f11010n.f13492c;
    }

    @Override
    public final void g() {
        View view;
        boolean z4;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.C && (view = this.f11013w) != null) {
            this.f11014x = view;
            k2 k2Var = this.f11010n;
            m.x xVar = k2Var.L;
            m.x xVar2 = k2Var.L;
            xVar.setOnDismissListener(this);
            k2Var.C = this;
            k2Var.K = true;
            xVar2.setFocusable(true);
            View view2 = this.f11014x;
            if (this.B == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.B = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f11011r);
            }
            view2.addOnAttachStateChangeListener(this.f11012s);
            k2Var.B = view2;
            k2Var.f13497w = this.F;
            boolean z10 = this.D;
            Context context = this.f11007b;
            h hVar = this.d;
            if (!z10) {
                this.E = s.m(hVar, context, this.f11009f);
                this.D = true;
            }
            k2Var.r(this.E);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f11093a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            k2Var.J = rect;
            k2Var.g();
            s1 s1Var = k2Var.f13492c;
            s1Var.setOnKeyListener(this);
            if (this.G) {
                k kVar = this.f11008c;
                if (kVar.f11049m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) s1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f11049m);
                    }
                    frameLayout.setEnabled(false);
                    s1Var.addHeaderView(frameLayout, null, false);
                }
            }
            k2Var.o(hVar);
            k2Var.g();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(w wVar) {
        this.f11015y = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z4;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f11007b, d0Var, this.f11014x, this.e, this.h, 0);
            w wVar = this.f11015y;
            vVar.h = wVar;
            s sVar = vVar.f11100i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f11043f.size();
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
            vVar.f11099g = z4;
            s sVar2 = vVar.f11100i;
            if (sVar2 != null) {
                sVar2.o(z4);
            }
            vVar.f11101j = this.v;
            this.v = null;
            this.f11008c.c(false);
            k2 k2Var = this.f11010n;
            int i11 = k2Var.f13493f;
            int n10 = k2Var.n();
            int i12 = this.F;
            View view = this.f11013w;
            WeakHashMap weakHashMap = j0.f43118a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f11013w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i11, n10, true, true);
                }
            }
            w wVar2 = this.f11015y;
            if (wVar2 != null) {
                wVar2.e0(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f11013w = view;
    }

    @Override
    public final void o(boolean z4) {
        this.d.f11037c = z4;
    }

    @Override
    public final void onDismiss() {
        this.C = true;
        this.f11008c.c(true);
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.B = this.f11014x.getViewTreeObserver();
            }
            this.B.removeGlobalOnLayoutListener(this.f11011r);
            this.B = null;
        }
        this.f11014x.removeOnAttachStateChangeListener(this.f11012s);
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
        this.f11010n.f13493f = i10;
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
        this.f11010n.k(i10);
    }

    @Override
    public final void l(k kVar) {
    }
}
