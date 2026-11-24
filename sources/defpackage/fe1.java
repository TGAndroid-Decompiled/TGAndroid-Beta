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
public final class fe1 extends i27 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public View F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean M;
    public r27 N;
    public ViewTreeObserver O;
    public j27 P;
    public boolean Q;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final uq r = new uq(this, (byte) 2);
    public final wd s = new wd(this, (byte) 5);
    public final nl9 w = new nl9(this, (byte) 14);
    public int x = 0;
    public int y = 0;
    public boolean L = false;

    public fe1(Context context, View view, int i, boolean z) {
        this.b = context;
        this.E = view;
        this.d = i;
        this.e = z;
        WeakHashMap weakHashMap = kfc.a;
        this.G = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.n;
        if (arrayList.size() <= 0 || !((ee1) arrayList.get(0)).a.P.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(dcb dcbVar) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ee1 ee1Var = (ee1) obj;
            if (dcbVar == ee1Var.b) {
                ee1Var.a.c.requestFocus();
                return true;
            }
        }
        if (!dcbVar.hasVisibleItems()) {
            return false;
        }
        l(dcbVar);
        r27 r27Var = this.N;
        if (r27Var != null) {
            r27Var.w0(dcbVar);
        }
        return true;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d(y17 y17Var, boolean z) {
        int i;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (y17Var == ((ee1) arrayList.get(i2)).b) {
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
                ((ee1) arrayList.get(i3)).b.c(false);
            }
            ee1 ee1Var = (ee1) arrayList.remove(i2);
            y17 y17Var2 = ee1Var.b;
            q27 q27Var = ee1Var.a;
            nq nqVar = q27Var.P;
            y17Var2.r(this);
            if (this.Q) {
                m27.b(nqVar, null);
                nqVar.setAnimationStyle(0);
            }
            q27Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.G = ((ee1) arrayList.get(size2 - 1)).c;
            } else {
                View view = this.E;
                WeakHashMap weakHashMap = kfc.a;
                if (view.getLayoutDirection() == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.G = i;
            }
            if (size2 == 0) {
                dismiss();
                r27 r27Var = this.N;
                if (r27Var != null) {
                    r27Var.d(y17Var, true);
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
                ((ee1) arrayList.get(0)).b.c(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            ee1[] ee1VarArr = (ee1[]) arrayList.toArray(new ee1[size]);
            for (int i = size - 1; i >= 0; i--) {
                ee1 ee1Var = ee1VarArr[i];
                if (ee1Var.a.P.isShowing()) {
                    ee1Var.a.dismiss();
                }
            }
        }
    }

    @Override
    public final os3 e() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((ee1) b10.f(1, arrayList)).a.c;
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
                u((y17) obj);
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
    public final void h(r27 r27Var) {
        this.N = r27Var;
    }

    @Override
    public final void j() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((ee1) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((v17) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final void l(y17 y17Var) {
        y17Var.b(this, this.b);
        if (a()) {
            u(y17Var);
        } else {
            this.h.add(y17Var);
        }
    }

    @Override
    public final void n(View view) {
        if (this.E != view) {
            this.E = view;
            int i = this.x;
            WeakHashMap weakHashMap = kfc.a;
            this.y = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z) {
        this.L = z;
    }

    @Override
    public final void onDismiss() {
        ee1 ee1Var;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                ee1Var = (ee1) arrayList.get(i);
                if (!ee1Var.a.P.isShowing()) {
                    break;
                }
                i++;
            } else {
                ee1Var = null;
                break;
            }
        }
        if (ee1Var != null) {
            ee1Var.b.c(false);
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
            WeakHashMap weakHashMap = kfc.a;
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
        this.P = (j27) onDismissListener;
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

    public final void u(defpackage.y17 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe1.u(y17):void");
    }
}
