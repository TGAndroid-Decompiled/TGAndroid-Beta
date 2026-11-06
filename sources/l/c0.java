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
import bi.m6;
import java.util.WeakHashMap;
import m.e2;
import m.k2;
import m.s1;
import r0.i0;
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public w D;
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context f17631b;
    public final k f17632c;
    public final h d;
    public final boolean f17633e;
    public final int f17634f;
    public final int h;
    public final k2 f17635n;
    public PopupWindow.OnDismissListener f17638w;
    public View f17639x;
    public View f17640y;
    public final androidx.mediarouter.app.i f17636r = new androidx.mediarouter.app.i(this, 2);
    public final m6 f17637s = new m6(this, 4);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i7, boolean z9) {
        this.f17631b = context;
        this.f17632c = kVar;
        this.f17633e = z9;
        this.d = new h(kVar, LayoutInflater.from(context), z9, 2131492883);
        this.h = i7;
        Resources resources = context.getResources();
        this.f17634f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f17639x = view;
        this.f17635n = new e2(context, null, i7);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f17635n.O.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(k kVar, boolean z9) {
        if (kVar == this.f17632c) {
            dismiss();
            w wVar = this.D;
            if (wVar != null) {
                wVar.c(kVar, z9);
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
            this.f17635n.dismiss();
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
    public final s1 f() {
        return this.f17635n.f19087c;
    }

    @Override
    public final void g() {
        View view;
        boolean z9;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f17639x) != null) {
            this.f17640y = view;
            k2 k2Var = this.f17635n;
            m.y yVar = k2Var.O;
            m.y yVar2 = k2Var.O;
            yVar.setOnDismissListener(this);
            k2Var.F = this;
            k2Var.N = true;
            yVar2.setFocusable(true);
            View view2 = this.f17640y;
            if (this.E == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z9) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f17636r);
            }
            view2.addOnAttachStateChangeListener(this.f17637s);
            k2Var.E = view2;
            k2Var.f19094x = this.I;
            boolean z10 = this.G;
            Context context = this.f17631b;
            h hVar = this.d;
            if (!z10) {
                this.H = s.m(hVar, context, this.f17634f);
                this.G = true;
            }
            k2Var.p(this.H);
            yVar2.setInputMethodMode(2);
            Rect rect2 = this.f17723a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            k2Var.M = rect;
            k2Var.g();
            s1 s1Var = k2Var.f19087c;
            s1Var.setOnKeyListener(this);
            if (this.J) {
                k kVar = this.f17632c;
                if (kVar.f17678m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) s1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f17678m);
                    }
                    frameLayout.setEnabled(false);
                    s1Var.addHeaderView(frameLayout, null, false);
                }
            }
            k2Var.n(hVar);
            k2Var.g();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final void h(w wVar) {
        this.D = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z9;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f17631b, d0Var, this.f17640y, this.f17633e, this.h, 0);
            w wVar = this.D;
            vVar.h = wVar;
            s sVar = vVar.f17731i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f17672f.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    MenuItem item = d0Var.getItem(i7);
                    if (item.isVisible() && item.getIcon() != null) {
                        z9 = true;
                        break;
                    }
                    i7++;
                } else {
                    z9 = false;
                    break;
                }
            }
            vVar.f17730g = z9;
            s sVar2 = vVar.f17731i;
            if (sVar2 != null) {
                sVar2.o(z9);
            }
            vVar.f17732j = this.f17638w;
            this.f17638w = null;
            this.f17632c.c(false);
            k2 k2Var = this.f17635n;
            int i10 = k2Var.f19089f;
            int m10 = k2Var.m();
            int i11 = this.I;
            View view = this.f17639x;
            WeakHashMap weakHashMap = i0.f54097a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i10 += this.f17639x.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f17728e != null) {
                    vVar.d(i10, m10, true, true);
                }
            }
            w wVar2 = this.D;
            if (wVar2 != null) {
                wVar2.A(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f17639x = view;
    }

    @Override
    public final void o(boolean z9) {
        this.d.f17664c = z9;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f17632c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f17640y.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f17636r);
            this.E = null;
        }
        this.f17640y.removeOnAttachStateChangeListener(this.f17637s);
        PopupWindow.OnDismissListener onDismissListener = this.f17638w;
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
        this.I = i7;
    }

    @Override
    public final void q(int i7) {
        this.f17635n.f19089f = i7;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f17638w = onDismissListener;
    }

    @Override
    public final void s(boolean z9) {
        this.J = z9;
    }

    @Override
    public final void t(int i7) {
        this.f17635n.j(i7);
    }

    @Override
    public final void l(k kVar) {
    }
}
