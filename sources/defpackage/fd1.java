package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class fd1 extends p27 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public View F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean M;
    public y27 N;
    public ViewTreeObserver O;
    public q27 P;
    public boolean Q;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final vp r = new vp(this, (byte) 2);
    public final xc s = new xc(this, (byte) 5);
    public final zm9 w = new zm9(this, (byte) 14);
    public int x = 0;
    public int y = 0;
    public boolean L = false;

    public fd1(Context context, View view, int i, boolean z) {
        this.b = context;
        this.E = view;
        this.d = i;
        this.e = z;
        WeakHashMap weakHashMap = ihc.a;
        this.G = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.n;
        if (arrayList.size() <= 0 || !((ed1) arrayList.get(0)).a.P.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(zdb zdbVar) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ed1 ed1Var = (ed1) obj;
            if (zdbVar == ed1Var.b) {
                ed1Var.a.c.requestFocus();
                return true;
            }
        }
        if (!zdbVar.hasVisibleItems()) {
            return false;
        }
        l(zdbVar);
        y27 y27Var = this.N;
        if (y27Var != null) {
            y27Var.z0(zdbVar);
        }
        return true;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final vr3 d() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((ed1) c00.g(1, arrayList)).a.c;
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            ed1[] ed1VarArr = (ed1[]) arrayList.toArray(new ed1[size]);
            for (int i = size - 1; i >= 0; i--) {
                ed1 ed1Var = ed1VarArr[i];
                if (ed1Var.a.P.isShowing()) {
                    ed1Var.a.dismiss();
                }
            }
        }
    }

    @Override
    public final void f(f27 f27Var, boolean z) {
        int i;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (f27Var == ((ed1) arrayList.get(i2)).b) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < arrayList.size()) {
                ((ed1) arrayList.get(i3)).b.c(false);
            }
            ed1 ed1Var = (ed1) arrayList.remove(i2);
            f27 f27Var2 = ed1Var.b;
            x27 x27Var = ed1Var.a;
            op opVar = x27Var.P;
            f27Var2.r(this);
            if (this.Q) {
                t27.b(opVar, null);
                opVar.setAnimationStyle(0);
            }
            x27Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.G = ((ed1) arrayList.get(size2 - 1)).c;
            } else {
                View view = this.E;
                WeakHashMap weakHashMap = ihc.a;
                if (view.getLayoutDirection() == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.G = i;
            }
            if (size2 == 0) {
                dismiss();
                y27 y27Var = this.N;
                if (y27Var != null) {
                    y27Var.f(f27Var, true);
                }
                ViewTreeObserver viewTreeObserver = this.O;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.O.removeGlobalOnLayoutListener(this.r);
                    }
                    this.O = null;
                }
                this.F.removeOnAttachStateChangeListener(this.s);
                this.P.onDismiss();
            } else if (z) {
                ((ed1) arrayList.get(0)).b.c(false);
            }
        }
    }

    @Override
    public final void g() {
        if (!a()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                u((f27) obj);
            }
            arrayList.clear();
            View view = this.E;
            this.F = view;
            if (view != null) {
                if (this.O == null) {
                    z = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.O = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.r);
                }
                this.F.addOnAttachStateChangeListener(this.s);
            }
        }
    }

    @Override
    public final void h(y27 y27Var) {
        this.N = y27Var;
    }

    @Override
    public final void j() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((ed1) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((c27) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final void l(f27 f27Var) {
        f27Var.b(this, this.b);
        if (a()) {
            u(f27Var);
        } else {
            this.h.add(f27Var);
        }
    }

    @Override
    public final void n(View view) {
        if (this.E != view) {
            this.E = view;
            int i = this.x;
            WeakHashMap weakHashMap = ihc.a;
            this.y = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z) {
        this.L = z;
    }

    @Override
    public final void onDismiss() {
        ed1 ed1Var;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                ed1Var = (ed1) arrayList.get(i);
                if (!ed1Var.a.P.isShowing()) {
                    break;
                }
                i++;
            } else {
                ed1Var = null;
                break;
            }
        }
        if (ed1Var != null) {
            ed1Var.b.c(false);
        }
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override
    public final void p(int i) {
        if (this.x != i) {
            this.x = i;
            View view = this.E;
            WeakHashMap weakHashMap = ihc.a;
            this.y = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override
    public final void q(int i) {
        this.H = true;
        this.J = i;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.P = (q27) onDismissListener;
    }

    @Override
    public final void s(boolean z) {
        this.M = z;
    }

    @Override
    public final void t(int i) {
        this.I = true;
        this.K = i;
    }

    public final void u(defpackage.f27 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd1.u(f27):void");
    }
}
