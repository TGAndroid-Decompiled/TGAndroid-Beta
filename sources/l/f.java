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
import m.f2;
import m.j2;
import m.r1;
import r0.j0;
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean I;
    public x J;
    public ViewTreeObserver K;
    public PopupWindow.OnDismissListener L;
    public boolean M;
    public final Context f11372b;
    public final int f11373c;
    public final int d;
    public final boolean f11374e;
    public final Handler f11375f;
    public View f11381y;
    public final ArrayList h = new ArrayList();
    public final ArrayList f11376n = new ArrayList();
    public final androidx.mediarouter.app.k f11377r = new androidx.mediarouter.app.k(this, 1);
    public final ff.b f11378s = new ff.b(this, 1);
    public final f0 v = new f0(this, 16);
    public int f11379w = 0;
    public int f11380x = 0;
    public boolean H = false;

    public f(Context context, View view, int i10, boolean z4) {
        this.f11372b = context;
        this.f11381y = view;
        this.d = i10;
        this.f11374e = z4;
        WeakHashMap weakHashMap = j0.f46469a;
        this.C = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f11373c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f11375f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f11376n;
        if (arrayList.size() <= 0 || !((e) arrayList.get(0)).f11368a.L.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(l lVar, boolean z4) {
        int i10;
        ArrayList arrayList = this.f11376n;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (lVar == ((e) arrayList.get(i11)).f11369b) {
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
                ((e) arrayList.get(i12)).f11369b.c(false);
            }
            e eVar = (e) arrayList.remove(i11);
            l lVar2 = eVar.f11369b;
            j2 j2Var = eVar.f11368a;
            m.x xVar = j2Var.L;
            lVar2.r(this);
            if (this.M) {
                if (Build.VERSION.SDK_INT >= 23) {
                    f2.b(xVar, null);
                }
                xVar.setAnimationStyle(0);
            }
            j2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.C = ((e) arrayList.get(size2 - 1)).f11370c;
            } else {
                View view = this.f11381y;
                WeakHashMap weakHashMap = j0.f46469a;
                if (view.getLayoutDirection() == 1) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                this.C = i10;
            }
            if (size2 == 0) {
                dismiss();
                x xVar2 = this.J;
                if (xVar2 != null) {
                    xVar2.c(lVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.K;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.K.removeGlobalOnLayoutListener(this.f11377r);
                    }
                    this.K = null;
                }
                this.B.removeOnAttachStateChangeListener(this.f11378s);
                this.L.onDismiss();
            } else if (z4) {
                ((e) arrayList.get(0)).f11369b.c(false);
            }
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f11376n;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                e eVar = eVarArr[i10];
                if (eVar.f11368a.L.isShowing()) {
                    eVar.f11368a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f11376n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((e) obj).f11368a.f13172c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final r1 f() {
        ArrayList arrayList = this.f11376n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) d.i(1, arrayList)).f11368a.f13172c;
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
                u((l) obj);
            }
            arrayList.clear();
            View view = this.f11381y;
            this.B = view;
            if (view != null) {
                if (this.K == null) {
                    z4 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.K = viewTreeObserver;
                if (z4) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f11377r);
                }
                this.B.addOnAttachStateChangeListener(this.f11378s);
            }
        }
    }

    @Override
    public final void h(x xVar) {
        this.J = xVar;
    }

    @Override
    public final boolean j(e0 e0Var) {
        ArrayList arrayList = this.f11376n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e eVar = (e) obj;
            if (e0Var == eVar.f11369b) {
                eVar.f11368a.f13172c.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        l(e0Var);
        x xVar = this.J;
        if (xVar != null) {
            xVar.d0(e0Var);
        }
        return true;
    }

    @Override
    public final void l(l lVar) {
        lVar.b(this, this.f11372b);
        if (a()) {
            u(lVar);
        } else {
            this.h.add(lVar);
        }
    }

    @Override
    public final void n(View view) {
        if (this.f11381y != view) {
            this.f11381y = view;
            int i10 = this.f11379w;
            WeakHashMap weakHashMap = j0.f46469a;
            this.f11380x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z4) {
        this.H = z4;
    }

    @Override
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f11376n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                eVar = (e) arrayList.get(i10);
                if (!eVar.f11368a.L.isShowing()) {
                    break;
                }
                i10++;
            } else {
                eVar = null;
                break;
            }
        }
        if (eVar != null) {
            eVar.f11369b.c(false);
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
        if (this.f11379w != i10) {
            this.f11379w = i10;
            View view = this.f11381y;
            WeakHashMap weakHashMap = j0.f46469a;
            this.f11380x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
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

    public final void u(l.l r20) {
        throw new UnsupportedOperationException("Method not decompiled: l.f.u(l.l):void");
    }
}
