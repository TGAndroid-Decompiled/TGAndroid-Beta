package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.g2;
import m.h2;
import m.k2;
import m.s1;
import r0.j0;

public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean H;
    public x I;
    public ViewTreeObserver J;
    public PopupWindow.OnDismissListener K;
    public boolean L;

    public final Context f15287b;

    public final int f15288c;
    public final int d;

    public final boolean f15289e;

    public final Handler f15290f;

    public View f15296y;
    public final ArrayList h = new ArrayList();

    public final ArrayList f15291n = new ArrayList();

    public final d f15292r = new d(this, 0);

    public final bf.b f15293s = new bf.b(this, 6);
    public final a9.i v = new a9.i(this, 23);

    public int f15294w = 0;

    public int f15295x = 0;
    public boolean G = false;

    public f(Context context, View view, int i10, boolean z10) {
        this.f15287b = context;
        this.f15296y = view;
        this.d = i10;
        this.f15289e = z10;
        WeakHashMap weakHashMap = j0.f46605a;
        this.B = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f15288c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f15290f = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.f15291n;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f15283a.K.isShowing();
    }

    @Override
    public final void b(l lVar, boolean z10) {
        ArrayList arrayList = this.f15291n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((e) arrayList.get(i10)).f15284b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((e) arrayList.get(i11)).f15284b.c(false);
        }
        e eVar = (e) arrayList.remove(i10);
        l lVar2 = eVar.f15284b;
        k2 k2Var = eVar.f15283a;
        m.y yVar = k2Var.K;
        lVar2.r(this);
        if (this.L) {
            if (Build.VERSION.SDK_INT >= 23) {
                g2.b(yVar, null);
            }
            yVar.setAnimationStyle(0);
        }
        k2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.B = ((e) arrayList.get(size2 - 1)).f15285c;
        } else {
            View view = this.f15296y;
            WeakHashMap weakHashMap = j0.f46605a;
            this.B = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((e) arrayList.get(0)).f15284b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.I;
        if (xVar != null) {
            xVar.b(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.J.removeGlobalOnLayoutListener(this.f15292r);
            }
            this.J = null;
        }
        this.A.removeOnAttachStateChangeListener(this.f15293s);
        this.K.onDismiss();
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f15291n;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                e eVar = eVarArr[i10];
                if (eVar.f15283a.K.isShowing()) {
                    eVar.f15283a.dismiss();
                }
            }
        }
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f15291n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((e) obj).f15283a.f17307c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final s1 f() {
        ArrayList arrayList = this.f15291n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) i0.a.i(1, arrayList)).f15283a.f17307c;
    }

    @Override
    public final void g() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u((l) obj);
        }
        arrayList.clear();
        View view = this.f15296y;
        this.A = view;
        if (view != null) {
            boolean z10 = this.J == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.J = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f15292r);
            }
            this.A.addOnAttachStateChangeListener(this.f15293s);
        }
    }

    @Override
    public final void h(x xVar) {
        this.I = xVar;
    }

    @Override
    public final boolean j(e0 e0Var) {
        ArrayList arrayList = this.f15291n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e eVar = (e) obj;
            if (e0Var == eVar.f15284b) {
                eVar.f15283a.f17307c.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        l(e0Var);
        x xVar = this.I;
        if (xVar != null) {
            xVar.l(e0Var);
        }
        return true;
    }

    @Override
    public final void l(l lVar) {
        lVar.b(this, this.f15287b);
        if (a()) {
            u(lVar);
        } else {
            this.h.add(lVar);
        }
    }

    @Override
    public final void n(View view) {
        if (this.f15296y != view) {
            this.f15296y = view;
            int i10 = this.f15294w;
            WeakHashMap weakHashMap = j0.f46605a;
            this.f15295x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override
    public final void o(boolean z10) {
        this.G = z10;
    }

    @Override
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f15291n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i10);
            if (!eVar.f15283a.K.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (eVar != null) {
            eVar.f15284b.c(false);
        }
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override
    public final void p(int i10) {
        if (this.f15294w != i10) {
            this.f15294w = i10;
            View view = this.f15296y;
            WeakHashMap weakHashMap = j0.f46605a;
            this.f15295x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
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

    public final void u(l lVar) {
        boolean z10;
        char c10;
        View childAt;
        e eVar;
        int i10;
        int i11;
        int i12;
        int width;
        MenuItem item;
        i iVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f15287b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        i iVar2 = new i(lVar, layoutInflaterFrom, this.f15289e, 2131492875);
        if (!a() && this.G) {
            iVar2.f15306c = true;
        } else if (a()) {
            int size = lVar.f15314f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item2 = lVar.getItem(i13);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            iVar2.f15306c = z10;
        }
        int iM = t.m(iVar2, context, this.f15288c);
        k2 k2Var = new k2(context, null, this.d);
        k2Var.O = this.v;
        k2Var.B = this;
        m.y yVar = k2Var.K;
        yVar.setOnDismissListener(this);
        k2Var.A = this.f15296y;
        k2Var.f17313w = this.f15295x;
        k2Var.J = true;
        yVar.setFocusable(true);
        yVar.setInputMethodMode(2);
        k2Var.o(iVar2);
        k2Var.q(iM);
        k2Var.f17313w = this.f15295x;
        ArrayList arrayList = this.f15291n;
        if (arrayList.size() > 0) {
            eVar = (e) i0.a.i(1, arrayList);
            l lVar2 = eVar.f15284b;
            int size2 = lVar2.f15314f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    item = null;
                    break;
                }
                item = lVar2.getItem(i14);
                if (item.hasSubMenu() && lVar == item.getSubMenu()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (item == null) {
                childAt = null;
                c10 = 0;
            } else {
                s1 s1Var = eVar.f15283a.f17307c;
                ListAdapter adapter = s1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    iVar = (i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    iVar = (i) adapter;
                    headersCount = 0;
                }
                int count = iVar.getCount();
                int i15 = 0;
                c10 = 0;
                while (true) {
                    if (i15 >= count) {
                        i15 = -1;
                        break;
                    } else if (item == iVar.getItem(i15)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                childAt = (i15 != -1 && (firstVisiblePosition = (i15 + headersCount) - s1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < s1Var.getChildCount()) ? s1Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c10 = 0;
            childAt = null;
            eVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = k2.P;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c10] = Boolean.FALSE;
                        method.invoke(yVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                h2.a(yVar, false);
            }
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 23) {
                g2.a(yVar, null);
            }
            s1 s1Var2 = ((e) i0.a.i(1, arrayList)).f15283a.f17307c;
            int[] iArr = new int[2];
            s1Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.A.getWindowVisibleDisplayFrame(rect);
            if (this.B == 1) {
                if (s1Var2.getWidth() + iArr[0] + iM > rect.right) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z11 = i10 == 1;
            this.B = i10;
            if (i16 >= 26) {
                k2Var.A = childAt;
                i11 = 0;
                i12 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f15296y.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f15295x & 7) == 5) {
                    iArr2[0] = this.f15296y.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i17 = iArr3[0] - iArr2[0];
                i11 = iArr3[1] - iArr2[1];
                i12 = i17;
            }
            if ((this.f15295x & 5) != 5) {
                width = z11 ? i12 + childAt.getWidth() : i12 - iM;
            } else if (z11) {
                width = i12 + iM;
            } else {
                iM = childAt.getWidth();
            }
            k2Var.f17309f = width;
            k2Var.v = true;
            k2Var.f17312s = true;
            k2Var.k(i11);
        } else {
            if (this.C) {
                k2Var.f17309f = this.E;
            }
            if (this.D) {
                k2Var.k(this.F);
            }
            Rect rect2 = this.f15365a;
            k2Var.I = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new e(k2Var, lVar, this.B));
        k2Var.g();
        s1 s1Var3 = k2Var.f17307c;
        s1Var3.setOnKeyListener(this);
        if (eVar == null && this.H && lVar.f15320m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(2131492882, (ViewGroup) s1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(lVar.f15320m);
            s1Var3.addHeaderView(frameLayout, null, false);
            k2Var.g();
        }
    }
}
