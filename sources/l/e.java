package l;

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
import bi.x1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.f2;
import m.j2;
import m.r1;
import r0.i0;
public final class e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public View F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean M;
    public w N;
    public ViewTreeObserver O;
    public PopupWindow.OnDismissListener P;
    public boolean Q;
    public final Context f18790b;
    public final int f18791c;
    public final int d;
    public final boolean f18792e;
    public final Handler f18793f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f18794n = new ArrayList();
    public final androidx.mediarouter.app.i f18795r = new androidx.mediarouter.app.i(this, 1);
    public final x1 f18796s = new x1(this, 7);
    public final ia.d f18797w = new ia.d(this, 6);
    public int f18798x = 0;
    public int f18799y = 0;
    public boolean L = false;

    public e(Context context, View view, int i7, boolean z10) {
        this.f18790b = context;
        this.E = view;
        this.d = i7;
        this.f18792e = z10;
        WeakHashMap weakHashMap = i0.f55671a;
        this.G = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f18791c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f18793f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f18794n;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f18786a.P.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d() {
        ArrayList arrayList = this.f18794n;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ListAdapter adapter = ((d) obj).f18786a.f19672c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f18794n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                d dVar = dVarArr[i7];
                if (dVar.f18786a.P.isShowing()) {
                    dVar.f18786a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e(k kVar, boolean z10) {
        int i7;
        ArrayList arrayList = this.f18794n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((d) arrayList.get(i10)).f18787b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            int i11 = i10 + 1;
            if (i11 < arrayList.size()) {
                ((d) arrayList.get(i11)).f18787b.c(false);
            }
            d dVar = (d) arrayList.remove(i10);
            k kVar2 = dVar.f18787b;
            j2 j2Var = dVar.f18786a;
            m.x xVar = j2Var.P;
            kVar2.r(this);
            if (this.Q) {
                f2.b(xVar, null);
                xVar.setAnimationStyle(0);
            }
            j2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.G = ((d) arrayList.get(size2 - 1)).f18788c;
            } else {
                View view = this.E;
                WeakHashMap weakHashMap = i0.f55671a;
                if (view.getLayoutDirection() == 1) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                this.G = i7;
            }
            if (size2 == 0) {
                dismiss();
                w wVar = this.N;
                if (wVar != null) {
                    wVar.e(kVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.O;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.O.removeGlobalOnLayoutListener(this.f18795r);
                    }
                    this.O = null;
                }
                this.F.removeOnAttachStateChangeListener(this.f18796s);
                this.P.onDismiss();
            } else if (z10) {
                ((d) arrayList.get(0)).f18787b.c(false);
            }
        }
    }

    @Override
    public final r1 f() {
        ArrayList arrayList = this.f18794n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) i5.c.h(1, arrayList)).f18786a.f19672c;
    }

    @Override
    public final void g() {
        if (!a()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            boolean z10 = false;
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                u((k) obj);
            }
            arrayList.clear();
            View view = this.E;
            this.F = view;
            if (view != null) {
                if (this.O == null) {
                    z10 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.O = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f18795r);
                }
                this.F.addOnAttachStateChangeListener(this.f18796s);
            }
        }
    }

    @Override
    public final void h(w wVar) {
        this.N = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        ArrayList arrayList = this.f18794n;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d dVar = (d) obj;
            if (d0Var == dVar.f18787b) {
                dVar.f18786a.f19672c.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.N;
        if (wVar != null) {
            wVar.y(d0Var);
        }
        return true;
    }

    @Override
    public final void l(k kVar) {
        kVar.b(this, this.f18790b);
        if (a()) {
            u(kVar);
        } else {
            this.h.add(kVar);
        }
    }

    @Override
    public final void n(View view) {
        if (this.E != view) {
            this.E = view;
            int i7 = this.f18798x;
            WeakHashMap weakHashMap = i0.f55671a;
            this.f18799y = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z10) {
        this.L = z10;
    }

    @Override
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f18794n;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                dVar = (d) arrayList.get(i7);
                if (!dVar.f18786a.P.isShowing()) {
                    break;
                }
                i7++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f18787b.c(false);
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
        if (this.f18798x != i7) {
            this.f18798x = i7;
            View view = this.E;
            WeakHashMap weakHashMap = i0.f55671a;
            this.f18799y = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override
    public final void q(int i7) {
        this.H = true;
        this.J = i7;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.P = onDismissListener;
    }

    @Override
    public final void s(boolean z10) {
        this.M = z10;
    }

    @Override
    public final void t(int i7) {
        this.I = true;
        this.K = i7;
    }

    public final void u(l.k r20) {
        throw new UnsupportedOperationException("Method not decompiled: l.e.u(l.k):void");
    }
}
