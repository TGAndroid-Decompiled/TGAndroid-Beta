package l;

import ai.u2;
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
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.f2;
import m.j2;
import m.r1;
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
    public final Context f15148b;
    public final int f15149c;
    public final int d;
    public final boolean f15150e;
    public final Handler f15151f;
    public View f15157y;
    public final ArrayList h = new ArrayList();
    public final ArrayList f15152n = new ArrayList();
    public final androidx.mediarouter.app.j f15153r = new androidx.mediarouter.app.j(this, 1);
    public final u2 f15154s = new u2(this, 2);
    public final a4.m v = new a4.m(this, 25);
    public int f15155w = 0;
    public int f15156x = 0;
    public boolean K = false;

    public e(Context context, View view, int i10, boolean z10) {
        this.f15148b = context;
        this.f15157y = view;
        this.d = i10;
        this.f15150e = z10;
        WeakHashMap weakHashMap = i0.f45603a;
        this.F = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f15149c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f15151f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f15152n;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f15144a.O.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(k kVar, boolean z10) {
        int i10;
        ArrayList arrayList = this.f15152n;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (kVar == ((d) arrayList.get(i11)).f15145b) {
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
                ((d) arrayList.get(i12)).f15145b.c(false);
            }
            d dVar = (d) arrayList.remove(i11);
            k kVar2 = dVar.f15145b;
            j2 j2Var = dVar.f15144a;
            m.x xVar = j2Var.O;
            kVar2.r(this);
            if (this.P) {
                if (Build.VERSION.SDK_INT >= 23) {
                    f2.b(xVar, null);
                }
                xVar.setAnimationStyle(0);
            }
            j2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.F = ((d) arrayList.get(size2 - 1)).f15146c;
            } else {
                View view = this.f15157y;
                WeakHashMap weakHashMap = i0.f45603a;
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
                    wVar.c(kVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.N;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.N.removeGlobalOnLayoutListener(this.f15153r);
                    }
                    this.N = null;
                }
                this.E.removeOnAttachStateChangeListener(this.f15154s);
                this.O.onDismiss();
            } else if (z10) {
                ((d) arrayList.get(0)).f15145b.c(false);
            }
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f15152n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f15144a.O.isShowing()) {
                    dVar.f15144a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f15152n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((d) obj).f15144a.f15719c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final r1 f() {
        ArrayList arrayList = this.f15152n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) hg.c.g(1, arrayList)).f15144a.f15719c;
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
            View view = this.f15157y;
            this.E = view;
            if (view != null) {
                if (this.N == null) {
                    z10 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.N = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f15153r);
                }
                this.E.addOnAttachStateChangeListener(this.f15154s);
            }
        }
    }

    @Override
    public final void h(w wVar) {
        this.M = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        ArrayList arrayList = this.f15152n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            if (d0Var == dVar.f15145b) {
                dVar.f15144a.f15719c.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.M;
        if (wVar != null) {
            wVar.v(d0Var);
        }
        return true;
    }

    @Override
    public final void l(k kVar) {
        kVar.b(this, this.f15148b);
        if (a()) {
            u(kVar);
        } else {
            this.h.add(kVar);
        }
    }

    @Override
    public final void n(View view) {
        if (this.f15157y != view) {
            this.f15157y = view;
            int i10 = this.f15155w;
            WeakHashMap weakHashMap = i0.f45603a;
            this.f15156x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z10) {
        this.K = z10;
    }

    @Override
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f15152n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                dVar = (d) arrayList.get(i10);
                if (!dVar.f15144a.O.isShowing()) {
                    break;
                }
                i10++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f15145b.c(false);
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
        if (this.f15155w != i10) {
            this.f15155w = i10;
            View view = this.f15157y;
            WeakHashMap weakHashMap = i0.f45603a;
            this.f15156x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
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
