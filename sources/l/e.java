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
import bi.m6;
import h9.f1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.g2;
import m.k2;
import m.s1;
import r0.i0;
public final class e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View D;
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
    public final Context f17645b;
    public final int f17646c;
    public final int d;
    public final boolean f17647e;
    public final Handler f17648f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f17649n = new ArrayList();
    public final androidx.mediarouter.app.i f17650r = new androidx.mediarouter.app.i(this, 1);
    public final m6 f17651s = new m6(this, 3);
    public final f1 f17652w = new f1(this, 6);
    public int f17653x = 0;
    public int f17654y = 0;
    public boolean K = false;

    public e(Context context, View view, int i7, boolean z9) {
        this.f17645b = context;
        this.D = view;
        this.d = i7;
        this.f17647e = z9;
        WeakHashMap weakHashMap = i0.f54098a;
        this.F = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f17646c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f17648f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f17649n;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f17641a.O.isShowing()) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(k kVar, boolean z9) {
        int i7;
        ArrayList arrayList = this.f17649n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((d) arrayList.get(i10)).f17642b) {
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
                ((d) arrayList.get(i11)).f17642b.c(false);
            }
            d dVar = (d) arrayList.remove(i10);
            k kVar2 = dVar.f17642b;
            k2 k2Var = dVar.f17641a;
            m.y yVar = k2Var.O;
            kVar2.r(this);
            if (this.P) {
                g2.b(yVar, null);
                yVar.setAnimationStyle(0);
            }
            k2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.F = ((d) arrayList.get(size2 - 1)).f17643c;
            } else {
                View view = this.D;
                WeakHashMap weakHashMap = i0.f54098a;
                if (view.getLayoutDirection() == 1) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                this.F = i7;
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
                        this.N.removeGlobalOnLayoutListener(this.f17650r);
                    }
                    this.N = null;
                }
                this.E.removeOnAttachStateChangeListener(this.f17651s);
                this.O.onDismiss();
            } else if (z9) {
                ((d) arrayList.get(0)).f17642b.c(false);
            }
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f17649n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                d dVar = dVarArr[i7];
                if (dVar.f17641a.O.isShowing()) {
                    dVar.f17641a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f17649n;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ListAdapter adapter = ((d) obj).f17641a.f19087c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final s1 f() {
        ArrayList arrayList = this.f17649n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) jg.g.i(1, arrayList)).f17641a.f19087c;
    }

    @Override
    public final void g() {
        if (!a()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            boolean z9 = false;
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                u((k) obj);
            }
            arrayList.clear();
            View view = this.D;
            this.E = view;
            if (view != null) {
                if (this.N == null) {
                    z9 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.N = viewTreeObserver;
                if (z9) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f17650r);
                }
                this.E.addOnAttachStateChangeListener(this.f17651s);
            }
        }
    }

    @Override
    public final void h(w wVar) {
        this.M = wVar;
    }

    @Override
    public final boolean j(d0 d0Var) {
        ArrayList arrayList = this.f17649n;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d dVar = (d) obj;
            if (d0Var == dVar.f17642b) {
                dVar.f17641a.f19087c.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.M;
        if (wVar != null) {
            wVar.A(d0Var);
        }
        return true;
    }

    @Override
    public final void l(k kVar) {
        kVar.b(this, this.f17645b);
        if (a()) {
            u(kVar);
        } else {
            this.h.add(kVar);
        }
    }

    @Override
    public final void n(View view) {
        if (this.D != view) {
            this.D = view;
            int i7 = this.f17653x;
            WeakHashMap weakHashMap = i0.f54098a;
            this.f17654y = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z9) {
        this.K = z9;
    }

    @Override
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f17649n;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                dVar = (d) arrayList.get(i7);
                if (!dVar.f17641a.O.isShowing()) {
                    break;
                }
                i7++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f17642b.c(false);
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
        if (this.f17653x != i7) {
            this.f17653x = i7;
            View view = this.D;
            WeakHashMap weakHashMap = i0.f54098a;
            this.f17654y = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override
    public final void q(int i7) {
        this.G = true;
        this.I = i7;
    }

    @Override
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.O = onDismissListener;
    }

    @Override
    public final void s(boolean z9) {
        this.L = z9;
    }

    @Override
    public final void t(int i7) {
        this.H = true;
        this.J = i7;
    }

    public final void u(l.k r20) {
        throw new UnsupportedOperationException("Method not decompiled: l.e.u(l.k):void");
    }
}
