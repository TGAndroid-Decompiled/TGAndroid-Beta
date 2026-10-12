package l;

import ai.v2;
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
import m.g2;
import m.k2;
import m.s1;
import r0.i0;
public final class e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public boolean L;
    public w M;
    public ViewTreeObserver N;
    public PopupWindow.OnDismissListener O;
    public boolean P;
    public final Context f14961b;
    public final int f14962c;
    public final int d;
    public final boolean f14963e;
    public final Handler f14964f;
    public View f14970y;
    public final ArrayList h = new ArrayList();
    public final ArrayList f14965n = new ArrayList();
    public final androidx.mediarouter.app.j f14966r = new androidx.mediarouter.app.j(this, 1);
    public final v2 f14967s = new v2(this, 2);
    public final xa.c v = new xa.c(this, 29);
    public int f14968w = 0;
    public int f14969x = 0;
    public boolean K = false;

    public e(Context context, View view, int i10, boolean z10) {
        this.f14961b = context;
        this.f14970y = view;
        this.d = i10;
        this.f14963e = z10;
        WeakHashMap weakHashMap = i0.f46989a;
        this.F = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f14962c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f14964f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f14965n;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f14957a.O.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d(k kVar, boolean z10) {
        int i10;
        ArrayList arrayList = this.f14965n;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (kVar == ((d) arrayList.get(i11)).f14958b) {
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
                ((d) arrayList.get(i12)).f14958b.c(false);
            }
            d dVar = (d) arrayList.remove(i11);
            k kVar2 = dVar.f14958b;
            k2 k2Var = dVar.f14957a;
            m.x xVar = k2Var.O;
            kVar2.r(this);
            if (this.P) {
                g2.b(xVar, null);
                xVar.setAnimationStyle(0);
            }
            k2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.F = ((d) arrayList.get(size2 - 1)).f14959c;
            } else {
                View view = this.f14970y;
                WeakHashMap weakHashMap = i0.f46989a;
                if (view.getLayoutDirection() == 1) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                this.F = i10;
            }
            if (size2 == 0) {
                dismiss();
                w wVar = this.M;
                if (wVar != null) {
                    wVar.d(kVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.N;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.N.removeGlobalOnLayoutListener(this.f14966r);
                    }
                    this.N = null;
                }
                this.E.removeOnAttachStateChangeListener(this.f14967s);
                this.O.onDismiss();
            } else if (z10) {
                ((d) arrayList.get(0)).f14958b.c(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f14965n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f14957a.O.isShowing()) {
                    dVar.f14957a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f14965n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((d) obj).f14957a.f15412c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final s1 f() {
        ArrayList arrayList = this.f14965n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) hg.c.h(1, arrayList)).f14957a.f15412c;
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
                u((k) obj);
            }
            arrayList.clear();
            View view = this.f14970y;
            this.E = view;
            if (view != null) {
                if (this.N == null) {
                    z10 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.N = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f14966r);
                }
                this.E.addOnAttachStateChangeListener(this.f14967s);
            }
        }
    }

    @Override
    public final void h(w wVar) {
        this.M = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        ArrayList arrayList = this.f14965n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            if (d0Var == dVar.f14958b) {
                dVar.f14957a.f15412c.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.M;
        if (wVar != null) {
            wVar.x(d0Var);
        }
        return true;
    }

    @Override
    public final void l(k kVar) {
        kVar.b(this, this.f14961b);
        if (a()) {
            u(kVar);
        } else {
            this.h.add(kVar);
        }
    }

    @Override
    public final void n(View view) {
        if (this.f14970y != view) {
            this.f14970y = view;
            int i10 = this.f14968w;
            WeakHashMap weakHashMap = i0.f46989a;
            this.f14969x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z10) {
        this.K = z10;
    }

    @Override
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f14965n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                dVar = (d) arrayList.get(i10);
                if (!dVar.f14957a.O.isShowing()) {
                    break;
                }
                i10++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f14958b.c(false);
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
        if (this.f14968w != i10) {
            this.f14968w = i10;
            View view = this.f14970y;
            WeakHashMap weakHashMap = i0.f46989a;
            this.f14969x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
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

    public final void u(l.k r20) {
        throw new UnsupportedOperationException("Method not decompiled: l.e.u(l.k):void");
    }
}
