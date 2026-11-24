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
public final class xc1 extends i07 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public View F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean M;
    public r07 N;
    public ViewTreeObserver O;
    public j07 P;
    public boolean Q;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final up r = new up(this, (byte) 2);
    public final wc s = new wc(this, (byte) 5);
    public final lj9 w = new lj9(this, (byte) 14);
    public int x = 0;
    public int y = 0;
    public boolean L = false;

    public xc1(Context context, View view, int i, boolean z) {
        this.b = context;
        this.E = view;
        this.d = i;
        this.e = z;
        WeakHashMap weakHashMap = jdc.a;
        this.G = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.n;
        if (arrayList.size() <= 0 || !((wc1) arrayList.get(0)).a.P.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(bab babVar) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wc1 wc1Var = (wc1) obj;
            if (babVar == wc1Var.b) {
                wc1Var.a.c.requestFocus();
                return true;
            }
        }
        if (!babVar.hasVisibleItems()) {
            return false;
        }
        l(babVar);
        r07 r07Var = this.N;
        if (r07Var != null) {
            r07Var.J(babVar);
        }
        return true;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d(yz6 yz6Var, boolean z) {
        int i;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (yz6Var == ((wc1) arrayList.get(i2)).b) {
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
                ((wc1) arrayList.get(i3)).b.c(false);
            }
            wc1 wc1Var = (wc1) arrayList.remove(i2);
            yz6 yz6Var2 = wc1Var.b;
            q07 q07Var = wc1Var.a;
            np npVar = q07Var.P;
            yz6Var2.r(this);
            if (this.Q) {
                m07.b(npVar, null);
                npVar.setAnimationStyle(0);
            }
            q07Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.G = ((wc1) arrayList.get(size2 - 1)).c;
            } else {
                View view = this.E;
                WeakHashMap weakHashMap = jdc.a;
                if (view.getLayoutDirection() == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.G = i;
            }
            if (size2 == 0) {
                dismiss();
                r07 r07Var = this.N;
                if (r07Var != null) {
                    r07Var.d(yz6Var, true);
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
                ((wc1) arrayList.get(0)).b.c(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            wc1[] wc1VarArr = (wc1[]) arrayList.toArray(new wc1[size]);
            for (int i = size - 1; i >= 0; i--) {
                wc1 wc1Var = wc1VarArr[i];
                if (wc1Var.a.P.isShowing()) {
                    wc1Var.a.dismiss();
                }
            }
        }
    }

    @Override
    public final er3 e() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((wc1) b00.f(1, arrayList)).a.c;
    }

    @Override
    public final void f() {
        if (!a()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                u((yz6) obj);
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
    public final void h(r07 r07Var) {
        this.N = r07Var;
    }

    @Override
    public final void j() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((wc1) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((vz6) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final void l(yz6 yz6Var) {
        yz6Var.b(this, this.b);
        if (a()) {
            u(yz6Var);
        } else {
            this.h.add(yz6Var);
        }
    }

    @Override
    public final void n(View view) {
        if (this.E != view) {
            this.E = view;
            int i = this.x;
            WeakHashMap weakHashMap = jdc.a;
            this.y = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z) {
        this.L = z;
    }

    @Override
    public final void onDismiss() {
        wc1 wc1Var;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                wc1Var = (wc1) arrayList.get(i);
                if (!wc1Var.a.P.isShowing()) {
                    break;
                }
                i++;
            } else {
                wc1Var = null;
                break;
            }
        }
        if (wc1Var != null) {
            wc1Var.b.c(false);
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
            WeakHashMap weakHashMap = jdc.a;
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
        this.P = (j07) onDismissListener;
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

    public final void u(defpackage.yz6 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc1.u(yz6):void");
    }
}
