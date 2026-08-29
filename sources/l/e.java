package l;

import ag.o1;
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
import j7.l1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.g2;
import m.k2;
import m.s1;
import r0.j0;
public final class e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean H;
    public w I;
    public ViewTreeObserver J;
    public PopupWindow.OnDismissListener K;
    public boolean L;
    public final Context f13959b;
    public final int f13960c;
    public final int d;
    public final boolean f13961e;
    public final Handler f13962f;
    public View f13968y;
    public final ArrayList h = new ArrayList();
    public final ArrayList f13963n = new ArrayList();
    public final androidx.mediarouter.app.h f13964r = new androidx.mediarouter.app.h(this, 1);
    public final df.b f13965s = new df.b(this, 5);
    public final o1 v = new o1(this, 19);
    public int f13966w = 0;
    public int f13967x = 0;
    public boolean G = false;

    public e(Context context, View view, int i10, boolean z10) {
        this.f13959b = context;
        this.f13968y = view;
        this.d = i10;
        this.f13961e = z10;
        WeakHashMap weakHashMap = j0.f46829a;
        this.B = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f13960c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f13962f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f13963n;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f13955a.K.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(k kVar, boolean z10) {
        int i10;
        ArrayList arrayList = this.f13963n;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (kVar == ((d) arrayList.get(i11)).f13956b) {
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
                ((d) arrayList.get(i12)).f13956b.c(false);
            }
            d dVar = (d) arrayList.remove(i11);
            k kVar2 = dVar.f13956b;
            k2 k2Var = dVar.f13955a;
            m.y yVar = k2Var.K;
            kVar2.r(this);
            if (this.L) {
                if (Build.VERSION.SDK_INT >= 23) {
                    g2.b(yVar, null);
                }
                yVar.setAnimationStyle(0);
            }
            k2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.B = ((d) arrayList.get(size2 - 1)).f13957c;
            } else {
                View view = this.f13968y;
                WeakHashMap weakHashMap = j0.f46829a;
                if (view.getLayoutDirection() == 1) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                this.B = i10;
            }
            if (size2 == 0) {
                dismiss();
                w wVar = this.I;
                if (wVar != null) {
                    wVar.b(kVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.J;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.J.removeGlobalOnLayoutListener(this.f13964r);
                    }
                    this.J = null;
                }
                this.A.removeOnAttachStateChangeListener(this.f13965s);
                this.K.onDismiss();
            } else if (z10) {
                ((d) arrayList.get(0)).f13956b.c(false);
            }
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f13963n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f13955a.K.isShowing()) {
                    dVar.f13955a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f13963n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((d) obj).f13955a.f16531c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final s1 f() {
        ArrayList arrayList = this.f13963n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) l1.i(1, arrayList)).f13955a.f16531c;
    }

    @Override
    public final void g(w wVar) {
        this.I = wVar;
    }

    @Override
    public final void h() {
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
            View view = this.f13968y;
            this.A = view;
            if (view != null) {
                if (this.J == null) {
                    z10 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.J = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f13964r);
                }
                this.A.addOnAttachStateChangeListener(this.f13965s);
            }
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        ArrayList arrayList = this.f13963n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            if (d0Var == dVar.f13956b) {
                dVar.f13955a.f16531c.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.I;
        if (wVar != null) {
            wVar.h(d0Var);
        }
        return true;
    }

    @Override
    public final void l(k kVar) {
        kVar.b(this, this.f13959b);
        if (a()) {
            u(kVar);
        } else {
            this.h.add(kVar);
        }
    }

    @Override
    public final void n(View view) {
        if (this.f13968y != view) {
            this.f13968y = view;
            int i10 = this.f13966w;
            WeakHashMap weakHashMap = j0.f46829a;
            this.f13967x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z10) {
        this.G = z10;
    }

    @Override
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f13963n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                dVar = (d) arrayList.get(i10);
                if (!dVar.f13955a.K.isShowing()) {
                    break;
                }
                i10++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f13956b.c(false);
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
        if (this.f13966w != i10) {
            this.f13966w = i10;
            View view = this.f13968y;
            WeakHashMap weakHashMap = j0.f46829a;
            this.f13967x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override
    public final void q(int i10) {
        this.C = true;
        this.E = i10;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.K = onDismissListener;
    }

    @Override
    public final void s(boolean z10) {
        this.H = z10;
    }

    @Override
    public final void t(int i10) {
        this.D = true;
        this.F = i10;
    }

    public final void u(l.k r20) {
        throw new UnsupportedOperationException("Method not decompiled: l.e.u(l.k):void");
    }
}
