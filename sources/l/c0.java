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
    public final Context f17634b;
    public final k f17635c;
    public final h d;
    public final boolean f17636e;
    public final int f17637f;
    public final int h;
    public final k2 f17638n;
    public PopupWindow.OnDismissListener f17641w;
    public View f17642x;
    public View f17643y;
    public final androidx.mediarouter.app.i f17639r = new androidx.mediarouter.app.i(this, 2);
    public final m6 f17640s = new m6(this, 4);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i7, boolean z9) {
        this.f17634b = context;
        this.f17635c = kVar;
        this.f17636e = z9;
        this.d = new h(kVar, LayoutInflater.from(context), z9, 2131492883);
        this.h = i7;
        Resources resources = context.getResources();
        this.f17637f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f17642x = view;
        this.f17638n = new e2(context, null, i7);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f17638n.O.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(k kVar, boolean z9) {
        if (kVar == this.f17635c) {
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
            this.f17638n.dismiss();
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
        return this.f17638n.f19090c;
    }

    @Override
    public final void g() {
        View view;
        boolean z9;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f17642x) != null) {
            this.f17643y = view;
            k2 k2Var = this.f17638n;
            m.y yVar = k2Var.O;
            m.y yVar2 = k2Var.O;
            yVar.setOnDismissListener(this);
            k2Var.F = this;
            k2Var.N = true;
            yVar2.setFocusable(true);
            View view2 = this.f17643y;
            if (this.E == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z9) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f17639r);
            }
            view2.addOnAttachStateChangeListener(this.f17640s);
            k2Var.E = view2;
            k2Var.f19097x = this.I;
            boolean z10 = this.G;
            Context context = this.f17634b;
            h hVar = this.d;
            if (!z10) {
                this.H = s.m(hVar, context, this.f17637f);
                this.G = true;
            }
            k2Var.p(this.H);
            yVar2.setInputMethodMode(2);
            Rect rect2 = this.f17726a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            k2Var.M = rect;
            k2Var.g();
            s1 s1Var = k2Var.f19090c;
            s1Var.setOnKeyListener(this);
            if (this.J) {
                k kVar = this.f17635c;
                if (kVar.f17681m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) s1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f17681m);
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
            v vVar = new v(this.f17634b, d0Var, this.f17643y, this.f17636e, this.h, 0);
            w wVar = this.D;
            vVar.h = wVar;
            s sVar = vVar.f17734i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f17675f.size();
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
            vVar.f17733g = z9;
            s sVar2 = vVar.f17734i;
            if (sVar2 != null) {
                sVar2.o(z9);
            }
            vVar.f17735j = this.f17641w;
            this.f17641w = null;
            this.f17635c.c(false);
            k2 k2Var = this.f17638n;
            int i10 = k2Var.f19092f;
            int m10 = k2Var.m();
            int i11 = this.I;
            View view = this.f17642x;
            WeakHashMap weakHashMap = i0.f54190a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i10 += this.f17642x.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f17731e != null) {
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
        this.f17642x = view;
    }

    @Override
    public final void o(boolean z9) {
        this.d.f17667c = z9;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f17635c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f17643y.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f17639r);
            this.E = null;
        }
        this.f17643y.removeOnAttachStateChangeListener(this.f17640s);
        PopupWindow.OnDismissListener onDismissListener = this.f17641w;
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
        this.f17638n.f19092f = i7;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f17641w = onDismissListener;
    }

    @Override
    public final void s(boolean z9) {
        this.J = z9;
    }

    @Override
    public final void t(int i7) {
        this.f17638n.j(i7);
    }

    @Override
    public final void l(k kVar) {
    }
}
