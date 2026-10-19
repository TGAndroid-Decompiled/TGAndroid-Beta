package l;

import ai.m6;
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
import r0.i0;
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context f15722b;
    public final k f15723c;
    public final h d;
    public final boolean e;
    public final int f15724f;
    public final int h;
    public final k2 f15725n;
    public PopupWindow.OnDismissListener v;
    public View f15728w;
    public View f15729x;
    public w f15730y;
    public final androidx.mediarouter.app.i f15726r = new androidx.mediarouter.app.i(this, 2);
    public final m6 f15727s = new m6(this, 4);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z10) {
        this.f15722b = context;
        this.f15723c = kVar;
        this.e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f15724f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f15728w = view;
        this.f15725n = new e2(context, null, i10);
        kVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f15725n.O.isShowing()) {
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
        if (kVar == this.f15723c) {
            dismiss();
            w wVar = this.f15730y;
            if (wVar != null) {
                wVar.d(kVar, z10);
            }
        }
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f15725n.dismiss();
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
        return this.f15725n.f16188c;
    }

    @Override
    public final void g() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f15728w) != null) {
            this.f15729x = view;
            k2 k2Var = this.f15725n;
            m.y yVar = k2Var.O;
            m.y yVar2 = k2Var.O;
            yVar.setOnDismissListener(this);
            k2Var.F = this;
            k2Var.N = true;
            yVar2.setFocusable(true);
            View view2 = this.f15729x;
            if (this.E == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f15726r);
            }
            view2.addOnAttachStateChangeListener(this.f15727s);
            k2Var.E = view2;
            k2Var.f16193w = this.I;
            boolean z11 = this.G;
            Context context = this.f15722b;
            h hVar = this.d;
            if (!z11) {
                this.H = s.m(hVar, context, this.f15724f);
                this.G = true;
            }
            k2Var.r(this.H);
            yVar2.setInputMethodMode(2);
            Rect rect2 = this.f15808a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            k2Var.M = rect;
            k2Var.g();
            s1 s1Var = k2Var.f16188c;
            s1Var.setOnKeyListener(this);
            if (this.J) {
                k kVar = this.f15723c;
                if (kVar.f15764m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) s1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f15764m);
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
        this.f15730y = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f15722b, d0Var, this.f15729x, this.e, this.h, 0);
            w wVar = this.f15730y;
            vVar.h = wVar;
            s sVar = vVar.f15815i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f15758f.size();
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
            vVar.f15814g = z10;
            s sVar2 = vVar.f15815i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.f15816j = this.v;
            this.v = null;
            this.f15723c.c(false);
            k2 k2Var = this.f15725n;
            int i11 = k2Var.f16189f;
            int n10 = k2Var.n();
            int i12 = this.I;
            View view = this.f15728w;
            WeakHashMap weakHashMap = i0.f44816a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f15728w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i11, n10, true, true);
                }
            }
            w wVar2 = this.f15730y;
            if (wVar2 != null) {
                wVar2.r(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f15728w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f15752c = z10;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f15723c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f15729x.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f15726r);
            this.E = null;
        }
        this.f15729x.removeOnAttachStateChangeListener(this.f15727s);
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
        this.f15725n.f16189f = i10;
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
        this.f15725n.k(i10);
    }

    @Override
    public final void l(k kVar) {
    }
}
