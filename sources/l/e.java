package l;

import ai.f2;
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
import gi.v5;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k2.p1;
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
    public final Context f17394b;
    public final int f17395c;
    public final int d;
    public final boolean f17396e;
    public final Handler f17397f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f17398n = new ArrayList();
    public final androidx.mediarouter.app.i f17399r = new androidx.mediarouter.app.i(this, 1);
    public final f2 f17400s = new f2(this, 7);
    public final v5 f17401w = new v5(this, 8);
    public int f17402x = 0;
    public int f17403y = 0;
    public boolean L = false;

    public e(Context context, View view, int i3, boolean z10) {
        this.f17394b = context;
        this.E = view;
        this.d = i3;
        this.f17396e = z10;
        WeakHashMap weakHashMap = i0.f54015a;
        this.G = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f17395c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f17397f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f17398n;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f17390a.P.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(k kVar, boolean z10) {
        int i3;
        ArrayList arrayList = this.f17398n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((d) arrayList.get(i10)).f17391b) {
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
                ((d) arrayList.get(i11)).f17391b.c(false);
            }
            d dVar = (d) arrayList.remove(i10);
            k kVar2 = dVar.f17391b;
            j2 j2Var = dVar.f17390a;
            m.x xVar = j2Var.P;
            kVar2.r(this);
            if (this.Q) {
                m.f2.b(xVar, null);
                xVar.setAnimationStyle(0);
            }
            j2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.G = ((d) arrayList.get(size2 - 1)).f17392c;
            } else {
                View view = this.E;
                WeakHashMap weakHashMap = i0.f54015a;
                if (view.getLayoutDirection() == 1) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                this.G = i3;
            }
            if (size2 == 0) {
                dismiss();
                w wVar = this.N;
                if (wVar != null) {
                    wVar.b(kVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.O;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.O.removeGlobalOnLayoutListener(this.f17399r);
                    }
                    this.O = null;
                }
                this.F.removeOnAttachStateChangeListener(this.f17400s);
                this.P.onDismiss();
            } else if (z10) {
                ((d) arrayList.get(0)).f17391b.c(false);
            }
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f17398n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                d dVar = dVarArr[i3];
                if (dVar.f17390a.P.isShowing()) {
                    dVar.f17390a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f17398n;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ListAdapter adapter = ((d) obj).f17390a.f18560c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final r1 f() {
        ArrayList arrayList = this.f17398n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) p1.h(1, arrayList)).f17390a.f18560c;
    }

    @Override
    public final void g() {
        if (!a()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            boolean z10 = false;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
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
                    viewTreeObserver.addOnGlobalLayoutListener(this.f17399r);
                }
                this.F.addOnAttachStateChangeListener(this.f17400s);
            }
        }
    }

    @Override
    public final void h(w wVar) {
        this.N = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        ArrayList arrayList = this.f17398n;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            d dVar = (d) obj;
            if (d0Var == dVar.f17391b) {
                dVar.f17390a.f18560c.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.N;
        if (wVar != null) {
            wVar.E(d0Var);
        }
        return true;
    }

    @Override
    public final void l(k kVar) {
        kVar.b(this, this.f17394b);
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
            int i3 = this.f17402x;
            WeakHashMap weakHashMap = i0.f54015a;
            this.f17403y = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z10) {
        this.L = z10;
    }

    @Override
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f17398n;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                dVar = (d) arrayList.get(i3);
                if (!dVar.f17390a.P.isShowing()) {
                    break;
                }
                i3++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f17391b.c(false);
        }
    }

    @Override
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i3 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override
    public final void p(int i3) {
        if (this.f17402x != i3) {
            this.f17402x = i3;
            View view = this.E;
            WeakHashMap weakHashMap = i0.f54015a;
            this.f17403y = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override
    public final void q(int i3) {
        this.H = true;
        this.J = i3;
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
    public final void t(int i3) {
        this.I = true;
        this.K = i3;
    }

    public final void u(l.k r20) {
        throw new UnsupportedOperationException("Method not decompiled: l.e.u(l.k):void");
    }
}
