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
import r0.j0;
public final class d0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean G;
    public final Context f11358b;
    public final l f11359c;
    public final i d;
    public final boolean f11360e;
    public final int f11361f;
    public final int h;
    public final j2 f11362n;
    public PopupWindow.OnDismissListener v;
    public View f11365w;
    public View f11366x;
    public x f11367y;
    public final androidx.mediarouter.app.k f11363r = new androidx.mediarouter.app.k(this, 2);
    public final ff.b f11364s = new ff.b(this, 2);
    public int F = 0;

    public d0(Context context, l lVar, View view, int i10, boolean z4) {
        this.f11358b = context;
        this.f11359c = lVar;
        this.f11360e = z4;
        this.d = new i(lVar, LayoutInflater.from(context), z4, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f11361f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f11365w = view;
        this.f11362n = new d2(context, null, i10);
        lVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.C && this.f11362n.L.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(l lVar, boolean z4) {
        if (lVar == this.f11359c) {
            dismiss();
            x xVar = this.f11367y;
            if (xVar != null) {
                xVar.c(lVar, z4);
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
            this.f11362n.dismiss();
        }
    }

    @Override
    public final void e() {
        this.D = false;
        i iVar = this.d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override
    public final r1 f() {
        return this.f11362n.f13172c;
    }

    @Override
    public final void g() {
        View view;
        boolean z4;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.C && (view = this.f11365w) != null) {
            this.f11366x = view;
            j2 j2Var = this.f11362n;
            m.x xVar = j2Var.L;
            m.x xVar2 = j2Var.L;
            xVar.setOnDismissListener(this);
            j2Var.C = this;
            j2Var.K = true;
            xVar2.setFocusable(true);
            View view2 = this.f11366x;
            if (this.B == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.B = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f11363r);
            }
            view2.addOnAttachStateChangeListener(this.f11364s);
            j2Var.B = view2;
            j2Var.f13178w = this.F;
            boolean z10 = this.D;
            Context context = this.f11358b;
            i iVar = this.d;
            if (!z10) {
                this.E = t.m(iVar, context, this.f11361f);
                this.D = true;
            }
            j2Var.q(this.E);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f11450a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.J = rect;
            j2Var.g();
            r1 r1Var = j2Var.f13172c;
            r1Var.setOnKeyListener(this);
            if (this.G) {
                l lVar = this.f11359c;
                if (lVar.f11405m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(lVar.f11405m);
                    }
                    frameLayout.setEnabled(false);
                    r1Var.addHeaderView(frameLayout, null, false);
                }
            }
            j2Var.o(iVar);
            j2Var.g();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(x xVar) {
        this.f11367y = xVar;
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean z4;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f11358b, e0Var, this.f11366x, this.f11360e, this.h, 0);
            x xVar = this.f11367y;
            wVar.h = xVar;
            t tVar = wVar.f11458i;
            if (tVar != null) {
                tVar.h(xVar);
            }
            int size = e0Var.f11399f.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    MenuItem item = e0Var.getItem(i10);
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
            wVar.f11457g = z4;
            t tVar2 = wVar.f11458i;
            if (tVar2 != null) {
                tVar2.o(z4);
            }
            wVar.f11459j = this.v;
            this.v = null;
            this.f11359c.c(false);
            j2 j2Var = this.f11362n;
            int i11 = j2Var.f13174f;
            int n10 = j2Var.n();
            int i12 = this.F;
            View view = this.f11365w;
            WeakHashMap weakHashMap = j0.f46469a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f11365w.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f11455e != null) {
                    wVar.d(i11, n10, true, true);
                }
            }
            x xVar2 = this.f11367y;
            if (xVar2 != null) {
                xVar2.d0(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f11365w = view;
    }

    @Override
    public final void o(boolean z4) {
        this.d.f11391c = z4;
    }

    @Override
    public final void onDismiss() {
        this.C = true;
        this.f11359c.c(true);
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.B = this.f11366x.getViewTreeObserver();
            }
            this.B.removeGlobalOnLayoutListener(this.f11363r);
            this.B = null;
        }
        this.f11366x.removeOnAttachStateChangeListener(this.f11364s);
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
        this.f11362n.f13174f = i10;
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
        this.f11362n.k(i10);
    }

    @Override
    public final void l(l lVar) {
    }
}
