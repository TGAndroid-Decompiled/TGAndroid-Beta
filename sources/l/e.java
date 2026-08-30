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
import androidx.biometric.f0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kh.a2;
import m.g2;
import m.k2;
import m.s1;
import r0.j0;
public final class e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean I;
    public w J;
    public ViewTreeObserver K;
    public PopupWindow.OnDismissListener L;
    public boolean M;
    public final Context f11020b;
    public final int f11021c;
    public final int d;
    public final boolean e;
    public final Handler f11022f;
    public View f11028y;
    public final ArrayList h = new ArrayList();
    public final ArrayList f11023n = new ArrayList();
    public final androidx.mediarouter.app.k f11024r = new androidx.mediarouter.app.k(this, 1);
    public final ff.b f11025s = new ff.b(this, 4);
    public final f0 v = new f0(this, 16);
    public int f11026w = 0;
    public int f11027x = 0;
    public boolean H = false;

    public e(Context context, View view, int i10, boolean z4) {
        this.f11020b = context;
        this.f11028y = view;
        this.d = i10;
        this.e = z4;
        WeakHashMap weakHashMap = j0.f43118a;
        this.C = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f11021c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f11022f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f11023n;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f11016a.L.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(k kVar, boolean z4) {
        int i10;
        ArrayList arrayList = this.f11023n;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (kVar == ((d) arrayList.get(i11)).f11017b) {
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
                ((d) arrayList.get(i12)).f11017b.c(false);
            }
            d dVar = (d) arrayList.remove(i11);
            k kVar2 = dVar.f11017b;
            k2 k2Var = dVar.f11016a;
            m.x xVar = k2Var.L;
            kVar2.r(this);
            if (this.M) {
                if (Build.VERSION.SDK_INT >= 23) {
                    g2.b(xVar, null);
                }
                xVar.setAnimationStyle(0);
            }
            k2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.C = ((d) arrayList.get(size2 - 1)).f11018c;
            } else {
                View view = this.f11028y;
                WeakHashMap weakHashMap = j0.f43118a;
                if (view.getLayoutDirection() == 1) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                this.C = i10;
            }
            if (size2 == 0) {
                dismiss();
                w wVar = this.J;
                if (wVar != null) {
                    wVar.c(kVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.K;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.K.removeGlobalOnLayoutListener(this.f11024r);
                    }
                    this.K = null;
                }
                this.B.removeOnAttachStateChangeListener(this.f11025s);
                this.L.onDismiss();
            } else if (z4) {
                ((d) arrayList.get(0)).f11017b.c(false);
            }
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f11023n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f11016a.L.isShowing()) {
                    dVar.f11016a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f11023n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((d) obj).f11016a.f13492c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final s1 f() {
        ArrayList arrayList = this.f11023n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) a2.i(1, arrayList)).f11016a.f13492c;
    }

    @Override
    public final void g() {
        if (!a()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            boolean z4 = false;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                u((k) obj);
            }
            arrayList.clear();
            View view = this.f11028y;
            this.B = view;
            if (view != null) {
                if (this.K == null) {
                    z4 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.K = viewTreeObserver;
                if (z4) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f11024r);
                }
                this.B.addOnAttachStateChangeListener(this.f11025s);
            }
        }
    }

    @Override
    public final void h(w wVar) {
        this.J = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        ArrayList arrayList = this.f11023n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            if (d0Var == dVar.f11017b) {
                dVar.f11016a.f13492c.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.J;
        if (wVar != null) {
            wVar.e0(d0Var);
        }
        return true;
    }

    @Override
    public final void l(k kVar) {
        kVar.b(this, this.f11020b);
        if (a()) {
            u(kVar);
        } else {
            this.h.add(kVar);
        }
    }

    @Override
    public final void n(View view) {
        if (this.f11028y != view) {
            this.f11028y = view;
            int i10 = this.f11026w;
            WeakHashMap weakHashMap = j0.f43118a;
            this.f11027x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z4) {
        this.H = z4;
    }

    @Override
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f11023n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                dVar = (d) arrayList.get(i10);
                if (!dVar.f11016a.L.isShowing()) {
                    break;
                }
                i10++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f11017b.c(false);
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
        if (this.f11026w != i10) {
            this.f11026w = i10;
            View view = this.f11028y;
            WeakHashMap weakHashMap = j0.f43118a;
            this.f11027x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override
    public final void q(int i10) {
        this.D = true;
        this.F = i10;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.L = onDismissListener;
    }

    @Override
    public final void s(boolean z4) {
        this.I = z4;
    }

    @Override
    public final void t(int i10) {
        this.E = true;
        this.G = i10;
    }

    public final void u(l.k r20) {
        throw new UnsupportedOperationException("Method not decompiled: l.e.u(l.k):void");
    }
}
