package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import bi.i2;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.f2;
import m.j2;
import m.r1;
import r0.i0;
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public boolean L;
    public x M;
    public ViewTreeObserver N;
    public PopupWindow.OnDismissListener O;
    public boolean P;
    public final Context f15087b;
    public final int f15088c;
    public final int d;
    public final boolean f15089e;
    public final Handler f15090f;
    public View f15096y;
    public final ArrayList h = new ArrayList();
    public final ArrayList f15091n = new ArrayList();
    public final androidx.mediarouter.app.j f15092r = new androidx.mediarouter.app.j(this, 1);
    public final i2 f15093s = new i2(this, 1);
    public final d v = new d(this, 0);
    public int f15094w = 0;
    public int f15095x = 0;
    public boolean K = false;

    public f(Context context, View view, int i10, boolean z10) {
        this.f15087b = context;
        this.f15096y = view;
        this.d = i10;
        this.f15089e = z10;
        WeakHashMap weakHashMap = i0.f44697a;
        this.F = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f15088c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f15090f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f15091n;
        if (arrayList.size() <= 0 || !((e) arrayList.get(0)).f15083a.O.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d(l lVar, boolean z10) {
        int i10;
        ArrayList arrayList = this.f15091n;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (lVar == ((e) arrayList.get(i11)).f15084b) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            int i12 = i11 + 1;
            if (i12 < arrayList.size()) {
                ((e) arrayList.get(i12)).f15084b.c(false);
            }
            e eVar = (e) arrayList.remove(i11);
            l lVar2 = eVar.f15084b;
            j2 j2Var = eVar.f15083a;
            m.x xVar = j2Var.O;
            lVar2.r(this);
            if (this.P) {
                if (Build.VERSION.SDK_INT >= 23) {
                    f2.b(xVar, null);
                }
                xVar.setAnimationStyle(0);
            }
            j2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.F = ((e) arrayList.get(size2 - 1)).f15085c;
            } else {
                View view = this.f15096y;
                WeakHashMap weakHashMap = i0.f44697a;
                if (view.getLayoutDirection() == 1) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                this.F = i10;
            }
            if (size2 == 0) {
                dismiss();
                x xVar2 = this.M;
                if (xVar2 != null) {
                    xVar2.d(lVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.N;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.N.removeGlobalOnLayoutListener(this.f15092r);
                    }
                    this.N = null;
                }
                this.E.removeOnAttachStateChangeListener(this.f15093s);
                this.O.onDismiss();
            } else if (z10) {
                ((e) arrayList.get(0)).f15084b.c(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f15091n;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                e eVar = eVarArr[i10];
                if (eVar.f15083a.O.isShowing()) {
                    eVar.f15083a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f15091n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((e) obj).f15083a.f15499c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final r1 f() {
        ArrayList arrayList = this.f15091n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) i2.g.h(1, arrayList)).f15083a.f15499c;
    }

    @Override
    public final void g() {
        if (!a()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            boolean z10 = false;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                u((l) obj);
            }
            arrayList.clear();
            View view = this.f15096y;
            this.E = view;
            if (view != null) {
                if (this.N == null) {
                    z10 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.N = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f15092r);
                }
                this.E.addOnAttachStateChangeListener(this.f15093s);
            }
        }
    }

    @Override
    public final void h(x xVar) {
        this.M = xVar;
    }

    @Override
    public final boolean j(e0 e0Var) {
        ArrayList arrayList = this.f15091n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e eVar = (e) obj;
            if (e0Var == eVar.f15084b) {
                eVar.f15083a.f15499c.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        l(e0Var);
        x xVar = this.M;
        if (xVar != null) {
            xVar.q(e0Var);
        }
        return true;
    }

    @Override
    public final void l(l lVar) {
        lVar.b(this, this.f15087b);
        if (a()) {
            u(lVar);
        } else {
            this.h.add(lVar);
        }
    }

    @Override
    public final void n(View view) {
        if (this.f15096y != view) {
            this.f15096y = view;
            int i10 = this.f15094w;
            WeakHashMap weakHashMap = i0.f44697a;
            this.f15095x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z10) {
        this.K = z10;
    }

    @Override
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f15091n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                eVar = (e) arrayList.get(i10);
                if (!eVar.f15083a.O.isShowing()) {
                    break;
                }
                i10++;
            } else {
                eVar = null;
                break;
            }
        }
        if (eVar != null) {
            eVar.f15084b.c(false);
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
        if (this.f15094w != i10) {
            this.f15094w = i10;
            View view = this.f15096y;
            WeakHashMap weakHashMap = i0.f44697a;
            this.f15095x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override
    public final void q(int i10) {
        this.G = true;
        this.I = i10;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.O = onDismissListener;
    }

    @Override
    public final void s(boolean z10) {
        this.L = z10;
    }

    @Override
    public final void t(int i10) {
        this.H = true;
        this.J = i10;
    }

    public final void u(l.l r20) {
        throw new UnsupportedOperationException("Method not decompiled: l.f.u(l.l):void");
    }
}
