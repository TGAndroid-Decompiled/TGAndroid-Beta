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
    public final Context f16517b;
    public final k f16518c;
    public final h d;
    public final boolean f16519e;
    public final int f16520f;
    public final int h;
    public final k2 f16521n;
    public PopupWindow.OnDismissListener v;
    public View f16524w;
    public View f16525x;
    public w f16526y;
    public final androidx.mediarouter.app.k f16522r = new androidx.mediarouter.app.k(this, 2);
    public final af.b f16523s = new af.b(this, 7);
    public int E = 0;

    public c0(Context context, k kVar, View view, int i9, boolean z10) {
        this.f16517b = context;
        this.f16518c = kVar;
        this.f16519e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i9;
        Resources resources = context.getResources();
        this.f16520f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f16524w = view;
        this.f16521n = new e2(context, null, i9);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.B && this.f16521n.K.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(k kVar, boolean z10) {
        if (kVar == this.f16518c) {
            dismiss();
            w wVar = this.f16526y;
            if (wVar != null) {
                wVar.c(kVar, z10);
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
            this.f16521n.dismiss();
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
        return this.f16521n.f16932c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.B && (view = this.f16524w) != null) {
            this.f16525x = view;
            k2 k2Var = this.f16521n;
            m.y yVar = k2Var.K;
            m.y yVar2 = k2Var.K;
            yVar.setOnDismissListener(this);
            k2Var.B = this;
            k2Var.J = true;
            yVar2.setFocusable(true);
            View view2 = this.f16525x;
            if (this.A == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.A = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f16522r);
            }
            view2.addOnAttachStateChangeListener(this.f16523s);
            k2Var.A = view2;
            k2Var.f16938w = this.E;
            boolean z11 = this.C;
            Context context = this.f16517b;
            h hVar = this.d;
            if (!z11) {
                this.D = s.m(hVar, context, this.f16520f);
                this.C = true;
            }
            k2Var.q(this.D);
            yVar2.setInputMethodMode(2);
            Rect rect2 = this.f16609a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            k2Var.I = rect;
            k2Var.g();
            s1 s1Var = k2Var.f16932c;
            s1Var.setOnKeyListener(this);
            if (this.F) {
                k kVar = this.f16518c;
                if (kVar.f16564m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) s1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f16564m);
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
        this.f16526y = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f16517b, d0Var, this.f16525x, this.f16519e, this.h, 0);
            w wVar = this.f16526y;
            vVar.h = wVar;
            s sVar = vVar.f16617i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f16558f.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    MenuItem item = d0Var.getItem(i9);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i9++;
                } else {
                    z10 = false;
                    break;
                }
            }
            vVar.f16616g = z10;
            s sVar2 = vVar.f16617i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f16618j = this.v;
            this.v = null;
            this.f16518c.c(false);
            k2 k2Var = this.f16521n;
            int i10 = k2Var.f16934f;
            int n10 = k2Var.n();
            int i11 = this.E;
            View view = this.f16524w;
            WeakHashMap weakHashMap = j0.f46915a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i10 += this.f16524w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f16614e != null) {
                    vVar.d(i10, n10, true, true);
                }
            }
            w wVar2 = this.f16526y;
            if (wVar2 != null) {
                wVar2.j(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f16524w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f16550c = z10;
    }

    @Override
    public final void onDismiss() {
        this.B = true;
        this.f16518c.c(true);
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A = this.f16525x.getViewTreeObserver();
            }
            this.A.removeGlobalOnLayoutListener(this.f16522r);
            this.A = null;
        }
        this.f16525x.removeOnAttachStateChangeListener(this.f16523s);
        PopupWindow.OnDismissListener onDismissListener = this.v;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i9 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override
    public final void p(int i9) {
        this.E = i9;
    }

    @Override
    public final void q(int i9) {
        this.f16521n.f16934f = i9;
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
    public final void t(int i9) {
        this.f16521n.j(i9);
    }

    @Override
    public final void l(k kVar) {
    }
}
