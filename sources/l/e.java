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
import bi.r2;
import hi.u5;
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
    public final Context f19154b;
    public final int f19155c;
    public final int d;
    public final boolean f19156e;
    public final Handler f19157f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f19158n = new ArrayList();
    public final androidx.mediarouter.app.i f19159r = new androidx.mediarouter.app.i(this, 1);
    public final r2 f19160s = new r2(this, 7);
    public final u5 f19161w = new u5(this, 9);
    public int f19162x = 0;
    public int f19163y = 0;
    public boolean L = false;

    public e(Context context, View view, int i7, boolean z10) {
        this.f19154b = context;
        this.E = view;
        this.d = i7;
        this.f19156e = z10;
        WeakHashMap weakHashMap = i0.f56244a;
        this.G = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f19155c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f19157f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f19158n;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f19150a.P.isShowing()) {
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
        int i7;
        ArrayList arrayList = this.f19158n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((d) arrayList.get(i10)).f19151b) {
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
                ((d) arrayList.get(i11)).f19151b.c(false);
            }
            d dVar = (d) arrayList.remove(i10);
            k kVar2 = dVar.f19151b;
            j2 j2Var = dVar.f19150a;
            m.x xVar = j2Var.P;
            kVar2.r(this);
            if (this.Q) {
                f2.b(xVar, null);
                xVar.setAnimationStyle(0);
            }
            j2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.G = ((d) arrayList.get(size2 - 1)).f19152c;
            } else {
                View view = this.E;
                WeakHashMap weakHashMap = i0.f56244a;
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
                    wVar.d(kVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.O;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.O.removeGlobalOnLayoutListener(this.f19159r);
                    }
                    this.O = null;
                }
                this.F.removeOnAttachStateChangeListener(this.f19160s);
                this.P.onDismiss();
            } else if (z10) {
                ((d) arrayList.get(0)).f19151b.c(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f19158n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                d dVar = dVarArr[i7];
                if (dVar.f19150a.P.isShowing()) {
                    dVar.f19150a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f19158n;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ListAdapter adapter = ((d) obj).f19150a.f20036c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final r1 f() {
        ArrayList arrayList = this.f19158n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) i5.c.h(1, arrayList)).f19150a.f20036c;
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
                    viewTreeObserver.addOnGlobalLayoutListener(this.f19159r);
                }
                this.F.addOnAttachStateChangeListener(this.f19160s);
            }
        }
    }

    @Override
    public final void h(w wVar) {
        this.N = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        ArrayList arrayList = this.f19158n;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d dVar = (d) obj;
            if (d0Var == dVar.f19151b) {
                dVar.f19150a.f20036c.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.N;
        if (wVar != null) {
            wVar.C(d0Var);
        }
        return true;
    }

    @Override
    public final void l(k kVar) {
        kVar.b(this, this.f19154b);
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
            int i7 = this.f19162x;
            WeakHashMap weakHashMap = i0.f56244a;
            this.f19163y = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z10) {
        this.L = z10;
    }

    @Override
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f19158n;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                dVar = (d) arrayList.get(i7);
                if (!dVar.f19150a.P.isShowing()) {
                    break;
                }
                i7++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f19151b.c(false);
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
        if (this.f19162x != i7) {
            this.f19162x = i7;
            View view = this.E;
            WeakHashMap weakHashMap = i0.f56244a;
            this.f19163y = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
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
