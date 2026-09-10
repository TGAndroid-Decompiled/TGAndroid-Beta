package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
public final class h implements l.y {
    public int E;
    public int F;
    public boolean G;
    public d I;
    public d J;
    public f K;
    public e L;
    public final Context f13019a;
    public Context f13020b;
    public l.l f13021c;
    public final LayoutInflater d;
    public l.x e;
    public l.a0 f13023n;
    public g f13024r;
    public Drawable f13025s;
    public boolean v;
    public boolean f13026w;
    public boolean f13027x;
    public int f13028y;
    public final int f13022f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray H = new SparseBooleanArray();
    public final a6.i M = new a6.i(this, 29);

    public h(Context context) {
        this.f13019a = context;
        this.d = LayoutInflater.from(context);
    }

    public final View a(l.n nVar, View view, ViewGroup viewGroup) {
        l.z zVar;
        View actionView = nVar.getActionView();
        int i10 = 0;
        if (actionView == null || nVar.e()) {
            if (view instanceof l.z) {
                zVar = (l.z) view;
            } else {
                zVar = (l.z) this.d.inflate(this.h, viewGroup, false);
            }
            zVar.b(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) zVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f13023n);
            if (this.L == null) {
                this.L = new e(this);
            }
            actionMenuItemView.setPopupCallback(this.L);
            actionView = (View) zVar;
        }
        if (nVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof j)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override
    public final boolean b(l.n nVar) {
        return false;
    }

    @Override
    public final void c(l.l lVar, boolean z10) {
        f();
        d dVar = this.J;
        if (dVar != null && dVar.b()) {
            dVar.f12688i.dismiss();
        }
        l.x xVar = this.e;
        if (xVar != null) {
            xVar.c(lVar, z10);
        }
    }

    @Override
    public final boolean d() {
        ArrayList arrayList;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        h hVar = this;
        l.l lVar = hVar.f13021c;
        if (lVar != null) {
            arrayList = lVar.l();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i12 = hVar.F;
        int i13 = hVar.E;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) hVar.f13023n;
        int i14 = 0;
        boolean z14 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            l.n nVar = (l.n) arrayList.get(i14);
            int i17 = nVar.f12671y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z14 = true;
            }
            if (hVar.G && nVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (hVar.f13026w && (z14 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = hVar.H;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            l.n nVar2 = (l.n) arrayList.get(i19);
            int i21 = nVar2.f12671y;
            if ((i21 & 2) == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i22 = nVar2.f12652b;
            if (z11) {
                View a2 = hVar.a(nVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                nVar2.f(z10);
            } else if ((i21 & 1) == z10) {
                boolean z15 = sparseBooleanArray.get(i22);
                if ((i18 > 0 || z15) && i13 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    View a10 = hVar.a(nVar2, null, viewGroup);
                    a10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a10.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    if (i13 + i20 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z12 &= z13;
                }
                if (z12 && i22 != 0) {
                    sparseBooleanArray.put(i22, true);
                } else if (z15) {
                    sparseBooleanArray.put(i22, false);
                    for (int i23 = 0; i23 < i19; i23++) {
                        l.n nVar3 = (l.n) arrayList.get(i23);
                        if (nVar3.f12652b == i22) {
                            if ((nVar3.f12670x & 32) == 32) {
                                i18++;
                            }
                            nVar3.f(false);
                        }
                    }
                }
                if (z12) {
                    i18--;
                }
                nVar2.f(z12);
            } else {
                nVar2.f(false);
                i19++;
                i11 = 2;
                hVar = this;
                z10 = true;
            }
            i19++;
            i11 = 2;
            hVar = this;
            z10 = true;
        }
        return true;
    }

    @Override
    public final void e() {
        int i10;
        l.n nVar;
        ViewGroup viewGroup = (ViewGroup) this.f13023n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.l lVar = this.f13021c;
            if (lVar != null) {
                lVar.i();
                ArrayList l4 = this.f13021c.l();
                int size = l4.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.n nVar2 = (l.n) l4.get(i11);
                    if ((nVar2.f12670x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof l.z) {
                            nVar = ((l.z) childAt).getItemData();
                        } else {
                            nVar = null;
                        }
                        View a2 = a(nVar2, childAt, viewGroup);
                        if (nVar2 != nVar) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f13023n).addView(a2, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f13024r) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f13023n).requestLayout();
        l.l lVar2 = this.f13021c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f12633i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                l.o oVar = ((l.n) arrayList2.get(i12)).A;
            }
        }
        l.l lVar3 = this.f13021c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f12634j;
        }
        if (this.f13026w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.n) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f13024r == null) {
                this.f13024r = new g(this, this.f13019a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f13024r.getParent();
            if (viewGroup3 != this.f13023n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f13024r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f13023n;
                g gVar = this.f13024r;
                actionMenuView.getClass();
                j i13 = ActionMenuView.i();
                i13.f13040a = true;
                actionMenuView.addView(gVar, i13);
            }
        } else {
            g gVar2 = this.f13024r;
            if (gVar2 != null) {
                ViewParent parent = gVar2.getParent();
                l.a0 a0Var = this.f13023n;
                if (parent == a0Var) {
                    ((ViewGroup) a0Var).removeView(this.f13024r);
                }
            }
        }
        ((ActionMenuView) this.f13023n).setOverflowReserved(this.f13026w);
    }

    public final boolean f() {
        l.a0 a0Var;
        f fVar = this.K;
        if (fVar != null && (a0Var = this.f13023n) != null) {
            ((View) a0Var).removeCallbacks(fVar);
            this.K = null;
            return true;
        }
        d dVar = this.I;
        if (dVar != null) {
            if (dVar.b()) {
                dVar.f12688i.dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean g() {
        d dVar = this.I;
        if (dVar != null && dVar.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(l.x xVar) {
        throw null;
    }

    @Override
    public final void i(Context context, l.l lVar) {
        this.f13020b = context;
        LayoutInflater.from(context);
        this.f13021c = lVar;
        Resources resources = context.getResources();
        if (!this.f13027x) {
            this.f13026w = true;
        }
        int i10 = 2;
        this.f13028y = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
            if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                if (i11 >= 360) {
                    i10 = 3;
                }
            } else {
                i10 = 4;
            }
        } else {
            i10 = 5;
        }
        this.F = i10;
        int i13 = this.f13028y;
        if (this.f13026w) {
            if (this.f13024r == null) {
                g gVar = new g(this, this.f13019a);
                this.f13024r = gVar;
                if (this.v) {
                    gVar.setImageDrawable(this.f13025s);
                    this.f13025s = null;
                    this.v = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f13024r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f13024r.getMeasuredWidth();
        } else {
            this.f13024r = null;
        }
        this.E = i13;
        float f7 = resources.getDisplayMetrics().density;
    }

    @Override
    public final boolean j(l.e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            l.e0 e0Var2 = e0Var;
            while (true) {
                l.l lVar = e0Var2.f12607z;
                if (lVar == this.f13021c) {
                    break;
                }
                e0Var2 = (l.e0) lVar;
            }
            l.n nVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f13023n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof l.z) && ((l.z) childAt).getItemData() == nVar) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
            }
            if (view != null) {
                e0Var.A.getClass();
                int size = e0Var.f12631f.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        MenuItem item = e0Var.getItem(i11);
                        if (item.isVisible() && item.getIcon() != null) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                d dVar = new d(this, this.f13020b, e0Var, view);
                this.J = dVar;
                dVar.f12687g = z10;
                l.t tVar = dVar.f12688i;
                if (tVar != null) {
                    tVar.o(z10);
                }
                d dVar2 = this.J;
                if (!dVar2.b()) {
                    if (dVar2.e != null) {
                        dVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                l.x xVar = this.e;
                if (xVar != null) {
                    xVar.u(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean k(l.n nVar) {
        return false;
    }

    public final boolean l() {
        l.l lVar;
        if (this.f13026w && !g() && (lVar = this.f13021c) != null && this.f13023n != null && this.K == null) {
            lVar.i();
            if (!lVar.f12634j.isEmpty()) {
                f fVar = new f(this, new d(this, this.f13020b, this.f13021c, this.f13024r));
                this.K = fVar;
                ((View) this.f13023n).post(fVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
