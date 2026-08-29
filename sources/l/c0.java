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
    public ViewTreeObserver A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean F;
    public final Context f13945b;
    public final k f13946c;
    public final h d;
    public final boolean f13947e;
    public final int f13948f;
    public final int h;
    public final k2 f13949n;
    public PopupWindow.OnDismissListener v;
    public View f13952w;
    public View f13953x;
    public w f13954y;
    public final androidx.mediarouter.app.h f13950r = new androidx.mediarouter.app.h(this, 2);
    public final df.b f13951s = new df.b(this, 6);
    public int E = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z10) {
        this.f13945b = context;
        this.f13946c = kVar;
        this.f13947e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f13948f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f13952w = view;
        this.f13949n = new e2(context, null, i10);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.B && this.f13949n.K.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(k kVar, boolean z10) {
        if (kVar == this.f13946c) {
            dismiss();
            w wVar = this.f13954y;
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
            this.f13949n.dismiss();
        }
    }

    @Override
    public final void e() {
        this.C = false;
        h hVar = this.d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override
    public final s1 f() {
        return this.f13949n.f16531c;
    }

    @Override
    public final void g(w wVar) {
        this.f13954y = wVar;
    }

    @Override
    public final void h() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.B && (view = this.f13952w) != null) {
            this.f13953x = view;
            k2 k2Var = this.f13949n;
            m.y yVar = k2Var.K;
            m.y yVar2 = k2Var.K;
            yVar.setOnDismissListener(this);
            k2Var.B = this;
            k2Var.J = true;
            yVar2.setFocusable(true);
            View view2 = this.f13953x;
            if (this.A == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.A = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f13950r);
            }
            view2.addOnAttachStateChangeListener(this.f13951s);
            k2Var.A = view2;
            k2Var.f16537w = this.E;
            boolean z11 = this.C;
            Context context = this.f13945b;
            h hVar = this.d;
            if (!z11) {
                this.D = s.m(hVar, context, this.f13948f);
                this.C = true;
            }
            k2Var.r(this.D);
            yVar2.setInputMethodMode(2);
            Rect rect2 = this.f14037a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            k2Var.I = rect;
            k2Var.h();
            s1 s1Var = k2Var.f16531c;
            s1Var.setOnKeyListener(this);
            if (this.F) {
                k kVar = this.f13946c;
                if (kVar.f13992m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) s1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f13992m);
                    }
                    frameLayout.setEnabled(false);
                    s1Var.addHeaderView(frameLayout, null, false);
                }
            }
            k2Var.p(hVar);
            k2Var.h();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f13945b, d0Var, this.f13953x, this.f13947e, this.h, 0);
            w wVar = this.f13954y;
            vVar.h = wVar;
            s sVar = vVar.f14045i;
            if (sVar != null) {
                sVar.g(wVar);
            }
            int size = d0Var.f13986f.size();
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
            vVar.f14044g = z10;
            s sVar2 = vVar.f14045i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f14046j = this.v;
            this.v = null;
            this.f13946c.c(false);
            k2 k2Var = this.f13949n;
            int i11 = k2Var.f16533f;
            int n10 = k2Var.n();
            int i12 = this.E;
            View view = this.f13952w;
            WeakHashMap weakHashMap = j0.f46829a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f13952w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f14042e != null) {
                    vVar.d(i11, n10, true, true);
                }
            }
            w wVar2 = this.f13954y;
            if (wVar2 != null) {
                wVar2.h(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f13952w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f13978c = z10;
    }

    @Override
    public final void onDismiss() {
        this.B = true;
        this.f13946c.c(true);
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A = this.f13953x.getViewTreeObserver();
            }
            this.A.removeGlobalOnLayoutListener(this.f13950r);
            this.A = null;
        }
        this.f13953x.removeOnAttachStateChangeListener(this.f13951s);
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
        this.E = i10;
    }

    @Override
    public final void q(int i10) {
        this.f13949n.f16533f = i10;
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
        this.f13949n.k(i10);
    }

    @Override
    public final void l(k kVar) {
    }
}
