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
import j3.r0;
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
    public final Context f16531b;
    public final int f16532c;
    public final int d;
    public final boolean f16533e;
    public final Handler f16534f;
    public View f16540y;
    public final ArrayList h = new ArrayList();
    public final ArrayList f16535n = new ArrayList();
    public final androidx.mediarouter.app.k f16536r = new androidx.mediarouter.app.k(this, 1);
    public final af.b f16537s = new af.b(this, 6);
    public final k5.i v = new k5.i(this, 24);
    public int f16538w = 0;
    public int f16539x = 0;
    public boolean G = false;

    public e(Context context, View view, int i9, boolean z10) {
        this.f16531b = context;
        this.f16540y = view;
        this.d = i9;
        this.f16533e = z10;
        WeakHashMap weakHashMap = j0.f46915a;
        this.B = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f16532c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f16534f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f16535n;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f16527a.K.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(k kVar, boolean z10) {
        int i9;
        ArrayList arrayList = this.f16535n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((d) arrayList.get(i10)).f16528b) {
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
                ((d) arrayList.get(i11)).f16528b.c(false);
            }
            d dVar = (d) arrayList.remove(i10);
            k kVar2 = dVar.f16528b;
            k2 k2Var = dVar.f16527a;
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
                this.B = ((d) arrayList.get(size2 - 1)).f16529c;
            } else {
                View view = this.f16540y;
                WeakHashMap weakHashMap = j0.f46915a;
                if (view.getLayoutDirection() == 1) {
                    i9 = 0;
                } else {
                    i9 = 1;
                }
                this.B = i9;
            }
            if (size2 == 0) {
                dismiss();
                w wVar = this.I;
                if (wVar != null) {
                    wVar.c(kVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.J;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.J.removeGlobalOnLayoutListener(this.f16536r);
                    }
                    this.J = null;
                }
                this.A.removeOnAttachStateChangeListener(this.f16537s);
                this.K.onDismiss();
            } else if (z10) {
                ((d) arrayList.get(0)).f16528b.c(false);
            }
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f16535n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i9 = size - 1; i9 >= 0; i9--) {
                d dVar = dVarArr[i9];
                if (dVar.f16527a.K.isShowing()) {
                    dVar.f16527a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f16535n;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ListAdapter adapter = ((d) obj).f16527a.f16932c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final s1 f() {
        ArrayList arrayList = this.f16535n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) r0.j(1, arrayList)).f16527a.f16932c;
    }

    @Override
    public final void g() {
        if (!a()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            boolean z10 = false;
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                u((k) obj);
            }
            arrayList.clear();
            View view = this.f16540y;
            this.A = view;
            if (view != null) {
                if (this.J == null) {
                    z10 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.J = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f16536r);
                }
                this.A.addOnAttachStateChangeListener(this.f16537s);
            }
        }
    }

    @Override
    public final void h(w wVar) {
        this.I = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        ArrayList arrayList = this.f16535n;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            d dVar = (d) obj;
            if (d0Var == dVar.f16528b) {
                dVar.f16527a.f16932c.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.I;
        if (wVar != null) {
            wVar.j(d0Var);
        }
        return true;
    }

    @Override
    public final void l(k kVar) {
        kVar.b(this, this.f16531b);
        if (a()) {
            u(kVar);
        } else {
            this.h.add(kVar);
        }
    }

    @Override
    public final void n(View view) {
        if (this.f16540y != view) {
            this.f16540y = view;
            int i9 = this.f16538w;
            WeakHashMap weakHashMap = j0.f46915a;
            this.f16539x = Gravity.getAbsoluteGravity(i9, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z10) {
        this.G = z10;
    }

    @Override
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f16535n;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                dVar = (d) arrayList.get(i9);
                if (!dVar.f16527a.K.isShowing()) {
                    break;
                }
                i9++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f16528b.c(false);
        }
    }

    @Override
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i9 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override
    public final void p(int i9) {
        if (this.f16538w != i9) {
            this.f16538w = i9;
            View view = this.f16540y;
            WeakHashMap weakHashMap = j0.f46915a;
            this.f16539x = Gravity.getAbsoluteGravity(i9, view.getLayoutDirection());
        }
    }

    @Override
    public final void q(int i9) {
        this.C = true;
        this.E = i9;
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
    public final void t(int i9) {
        this.D = true;
        this.F = i9;
    }

    public final void u(l.k r20) {
        throw new UnsupportedOperationException("Method not decompiled: l.e.u(l.k):void");
    }
}
