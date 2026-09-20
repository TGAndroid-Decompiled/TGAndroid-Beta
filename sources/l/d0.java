package l;

import ai.u2;
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
public final class d0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context f13899b;
    public final l f13900c;
    public final i d;
    public final boolean e;
    public final int f13901f;
    public final int h;
    public final j2 f13902n;
    public PopupWindow.OnDismissListener v;
    public View f13905w;
    public View f13906x;
    public x f13907y;
    public final androidx.mediarouter.app.j f13903r = new androidx.mediarouter.app.j(this, 2);
    public final u2 f13904s = new u2(this, 3);
    public int I = 0;

    public d0(Context context, l lVar, View view, int i10, boolean z10) {
        this.f13899b = context;
        this.f13900c = lVar;
        this.e = z10;
        this.d = new i(lVar, LayoutInflater.from(context), z10, 2131492883);
        this.h = i10;
        Resources resources = context.getResources();
        this.f13901f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f13905w = view;
        this.f13902n = new d2(context, null, i10);
        lVar.b(this, context);
    }

    @Override
    public final boolean a() {
        if (!this.F && this.f13902n.O.isShowing()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d() {
        this.G = false;
        i iVar = this.d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.f13902n.dismiss();
        }
    }

    @Override
    public final void e(x xVar) {
        this.f13907y = xVar;
    }

    @Override
    public final r1 f() {
        return this.f13902n.f14378c;
    }

    @Override
    public final void g(l lVar, boolean z10) {
        if (lVar == this.f13900c) {
            dismiss();
            x xVar = this.f13907y;
            if (xVar != null) {
                xVar.g(lVar, z10);
            }
        }
    }

    @Override
    public final void h() {
        View view;
        boolean z10;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.F && (view = this.f13905w) != null) {
            this.f13906x = view;
            j2 j2Var = this.f13902n;
            m.x xVar = j2Var.O;
            m.x xVar2 = j2Var.O;
            xVar.setOnDismissListener(this);
            j2Var.F = this;
            j2Var.N = true;
            xVar2.setFocusable(true);
            View view2 = this.f13906x;
            if (this.E == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f13903r);
            }
            view2.addOnAttachStateChangeListener(this.f13904s);
            j2Var.E = view2;
            j2Var.f14383w = this.I;
            boolean z11 = this.G;
            Context context = this.f13899b;
            i iVar = this.d;
            if (!z11) {
                this.H = t.m(iVar, context, this.f13901f);
                this.G = true;
            }
            j2Var.q(this.H);
            xVar2.setInputMethodMode(2);
            Rect rect2 = this.f13985a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j2Var.M = rect;
            j2Var.h();
            r1 r1Var = j2Var.f14378c;
            r1Var.setOnKeyListener(this);
            if (this.J) {
                l lVar = this.f13900c;
                if (lVar.f13941m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(lVar.f13941m);
                    }
                    frameLayout.setEnabled(false);
                    r1Var.addHeaderView(frameLayout, null, false);
                }
            }
            j2Var.n(iVar);
            j2Var.h();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f13899b, e0Var, this.f13906x, this.e, this.h, 0);
            x xVar = this.f13907y;
            wVar.h = xVar;
            t tVar = wVar.f13992i;
            if (tVar != null) {
                tVar.e(xVar);
            }
            int size = e0Var.f13935f.size();
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
            wVar.f13991g = z10;
            t tVar2 = wVar.f13992i;
            if (tVar2 != null) {
                tVar2.o(z10);
            }
            wVar.f13993j = this.v;
            this.v = null;
            this.f13900c.c(false);
            j2 j2Var = this.f13902n;
            int i11 = j2Var.f14379f;
            int m10 = j2Var.m();
            int i12 = this.I;
            View view = this.f13905w;
            WeakHashMap weakHashMap = i0.f42142a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f13905w.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.e != null) {
                    wVar.d(i11, m10, true, true);
                }
            }
            x xVar2 = this.f13907y;
            if (xVar2 != null) {
                xVar2.v(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void n(View view) {
        this.f13905w = view;
    }

    @Override
    public final void o(boolean z10) {
        this.d.f13929c = z10;
    }

    @Override
    public final void onDismiss() {
        this.F = true;
        this.f13900c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.f13906x.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f13903r);
            this.E = null;
        }
        this.f13906x.removeOnAttachStateChangeListener(this.f13904s);
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
        this.f13902n.f14379f = i10;
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
        this.f13902n.j(i10);
    }

    @Override
    public final void l(l lVar) {
    }
}
