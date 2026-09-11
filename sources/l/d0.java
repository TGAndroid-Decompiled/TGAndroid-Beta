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
import bi.i2;
import java.util.WeakHashMap;
import m.d2;
import m.j2;
import m.r1;
import r0.i0;
public final class d0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context f15073b;
    public final l f15074c;
    public final i d;
    public final boolean f15075e;
    public final int f15076f;
    public final int h;
    public final j2 f15077n;
    public PopupWindow.OnDismissListener v;
    public View f15080w;
    public View f15081x;
    public x f15082y;
    public final androidx.mediarouter.app.j f15078r = new androidx.mediarouter.app.j(this, 2);
    public final i2 f15079s = new i2(this, 2);
    public int I = 0;

    public d0(Context context, l lVar, View view, int i10, boolean z10) {
        this.f15073b = context;
        this.f15074c = lVar;
        this.f15075e = z10;
        this.d = new i(lVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f15076f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f15080w = view;
        this.f15077n = new d2(context, null, i10);
        lVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f15077n.O.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d(l lVar, boolean z10) {
        if (lVar == this.f15074c) {
            dismiss();
            x xVar = this.f15082y;
            if (xVar != null) {
                xVar.d(lVar, z10);
            }
        }
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f15077n.dismiss();
        }
    }

    @Override
    public final void e() {
        this.G = false;
        i iVar = this.d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override
    public final r1 f() {
        return this.f15077n.f15499c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f15080w) != null) {
            this.f15081x = view;
            j2 j2Var = this.f15077n;
            m.x xVar = j2Var.O;
            m.x xVar2 = j2Var.O;
            xVar.setOnDismissListener(this);
            j2Var.F = this;
            j2Var.N = true;
            xVar2.setFocusable(true);
            View view2 = this.f15081x;
            if (this.E == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f15078r);
            }
            view2.addOnAttachStateChangeListener(this.f15079s);
            j2Var.E = view2;
            j2Var.f15505w = this.I;
            boolean z11 = this.G;
            Context context = this.f15073b;
            i iVar = this.d;
            if (!z11) {
                this.H = t.m(iVar, context, this.f15076f);
                this.G = true;
            }
            j2Var.r(this.H);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f15165a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.M = rect;
            j2Var.g();
            r1 r1Var = j2Var.f15499c;
            r1Var.setOnKeyListener(this);
            if (this.J) {
                l lVar = this.f15074c;
                if (lVar.f15120m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(lVar.f15120m);
                    }
                    frameLayout.setEnabled(false);
                    r1Var.addHeaderView(frameLayout, null, false);
                }
            }
            j2Var.p(iVar);
            j2Var.g();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(x xVar) {
        this.f15082y = xVar;
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f15073b, e0Var, this.f15081x, this.f15075e, this.h, 0);
            x xVar = this.f15082y;
            wVar.h = xVar;
            t tVar = wVar.f15173i;
            if (tVar != null) {
                tVar.h(xVar);
            }
            int size = e0Var.f15114f.size();
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
            wVar.f15172g = z10;
            t tVar2 = wVar.f15173i;
            if (tVar2 != null) {
                tVar2.o(z10);
            }
            wVar.f15174j = this.v;
            this.v = null;
            this.f15074c.c(false);
            j2 j2Var = this.f15077n;
            int i11 = j2Var.f15501f;
            int n10 = j2Var.n();
            int i12 = this.I;
            View view = this.f15080w;
            WeakHashMap weakHashMap = i0.f44697a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f15080w.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f15170e != null) {
                    wVar.d(i11, n10, true, true);
                }
            }
            x xVar2 = this.f15082y;
            if (xVar2 != null) {
                xVar2.q(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f15080w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f15106c = z10;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f15074c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f15081x.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f15078r);
            this.E = null;
        }
        this.f15081x.removeOnAttachStateChangeListener(this.f15079s);
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
        this.f15077n.f15501f = i10;
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
        this.f15077n.k(i10);
    }

    @Override
    public final void l(l lVar) {
    }
}
