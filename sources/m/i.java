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
public final class i implements l.x {
    public int E;
    public int F;
    public boolean G;
    public d I;
    public d J;
    public f K;
    public e L;
    public final Context f14852a;
    public Context f14853b;
    public l.k f14854c;
    public final LayoutInflater d;
    public l.w e;
    public l.z f14856n;
    public g f14857r;
    public Drawable f14858s;
    public boolean v;
    public boolean f14859w;
    public boolean f14860x;
    public int f14861y;
    public final int f14855f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray H = new SparseBooleanArray();
    public final h M = new h(this, 0);

    public i(Context context) {
        this.f14852a = context;
        this.d = LayoutInflater.from(context);
    }

    public final View a(l.m mVar, View view, ViewGroup viewGroup) {
        l.y yVar;
        View actionView = mVar.getActionView();
        int i10 = 0;
        if (actionView == null || mVar.e()) {
            if (view instanceof l.y) {
                yVar = (l.y) view;
            } else {
                yVar = (l.y) this.d.inflate(this.h, viewGroup, false);
            }
            yVar.b(mVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f14856n);
            if (this.L == null) {
                this.L = new e(this);
            }
            actionMenuItemView.setPopupCallback(this.L);
            actionView = (View) yVar;
        }
        if (mVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof k)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override
    public final boolean b(l.m mVar) {
        return false;
    }

    @Override
    public final boolean c() {
        int i10;
        ArrayList arrayList;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        i iVar = this;
        l.k kVar = iVar.f14854c;
        if (kVar != null) {
            arrayList = kVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = iVar.F;
        int i13 = iVar.E;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) iVar.f14856n;
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
            l.m mVar = (l.m) arrayList.get(i14);
            int i17 = mVar.f14458y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z14 = true;
            }
            if (iVar.G && mVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (iVar.f14859w && (z14 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = iVar.H;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            l.m mVar2 = (l.m) arrayList.get(i19);
            int i21 = mVar2.f14458y;
            if ((i21 & 2) == i11) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i22 = mVar2.f14439b;
            if (z11) {
                View a2 = iVar.a(mVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                mVar2.f(z10);
            } else if ((i21 & 1) == z10) {
                boolean z15 = sparseBooleanArray.get(i22);
                if ((i18 > 0 || z15) && i13 > 0) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    View a10 = iVar.a(mVar2, null, viewGroup);
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
                        l.m mVar3 = (l.m) arrayList.get(i23);
                        if (mVar3.f14439b == i22) {
                            if ((mVar3.f14457x & 32) == 32) {
                                i18++;
                            }
                            mVar3.f(false);
                        }
                    }
                }
                if (z12) {
                    i18--;
                }
                mVar2.f(z12);
            } else {
                mVar2.f(false);
                i19++;
                i11 = 2;
                iVar = this;
                z10 = true;
            }
            i19++;
            i11 = 2;
            iVar = this;
            z10 = true;
        }
        return z10;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
        f();
        d dVar = this.J;
        if (dVar != null && dVar.b()) {
            dVar.f14475i.dismiss();
        }
        l.w wVar = this.e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        int i10;
        l.m mVar;
        ViewGroup viewGroup = (ViewGroup) this.f14856n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.k kVar = this.f14854c;
            if (kVar != null) {
                kVar.i();
                ArrayList l4 = this.f14854c.l();
                int size = l4.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.m mVar2 = (l.m) l4.get(i11);
                    if ((mVar2.f14457x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof l.y) {
                            mVar = ((l.y) childAt).getItemData();
                        } else {
                            mVar = null;
                        }
                        View a2 = a(mVar2, childAt, viewGroup);
                        if (mVar2 != mVar) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f14856n).addView(a2, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f14857r) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f14856n).requestLayout();
        l.k kVar2 = this.f14854c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f14420i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                l.n nVar = ((l.m) arrayList2.get(i12)).A;
            }
        }
        l.k kVar3 = this.f14854c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f14421j;
        }
        if (this.f14859w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.m) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f14857r == null) {
                this.f14857r = new g(this, this.f14852a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f14857r.getParent();
            if (viewGroup3 != this.f14856n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f14857r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f14856n;
                g gVar = this.f14857r;
                actionMenuView.getClass();
                k i13 = ActionMenuView.i();
                i13.f14877a = true;
                actionMenuView.addView(gVar, i13);
            }
        } else {
            g gVar2 = this.f14857r;
            if (gVar2 != null) {
                ViewParent parent = gVar2.getParent();
                l.z zVar = this.f14856n;
                if (parent == zVar) {
                    ((ViewGroup) zVar).removeView(this.f14857r);
                }
            }
        }
        ((ActionMenuView) this.f14856n).setOverflowReserved(this.f14859w);
    }

    public final boolean f() {
        l.z zVar;
        f fVar = this.K;
        if (fVar != null && (zVar = this.f14856n) != null) {
            ((View) zVar).removeCallbacks(fVar);
            this.K = null;
            return true;
        }
        d dVar = this.I;
        if (dVar != null) {
            if (dVar.b()) {
                dVar.f14475i.dismiss();
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
    public final void h(l.w wVar) {
        throw null;
    }

    @Override
    public final void i(Context context, l.k kVar) {
        this.f14853b = context;
        LayoutInflater.from(context);
        this.f14854c = kVar;
        Resources resources = context.getResources();
        if (!this.f14860x) {
            this.f14859w = true;
        }
        int i10 = 2;
        this.f14861y = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        int i13 = this.f14861y;
        if (this.f14859w) {
            if (this.f14857r == null) {
                g gVar = new g(this, this.f14852a);
                this.f14857r = gVar;
                if (this.v) {
                    gVar.setImageDrawable(this.f14858s);
                    this.f14858s = null;
                    this.v = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f14857r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f14857r.getMeasuredWidth();
        } else {
            this.f14857r = null;
        }
        this.E = i13;
        float f7 = resources.getDisplayMetrics().density;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            l.d0 d0Var2 = d0Var;
            while (true) {
                l.k kVar = d0Var2.f14394z;
                if (kVar == this.f14854c) {
                    break;
                }
                d0Var2 = (l.d0) kVar;
            }
            l.m mVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f14856n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof l.y) && ((l.y) childAt).getItemData() == mVar) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
            }
            if (view != null) {
                d0Var.A.getClass();
                int size = d0Var.f14418f.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        MenuItem item = d0Var.getItem(i11);
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
                d dVar = new d(this, this.f14853b, d0Var, view);
                this.J = dVar;
                dVar.f14474g = z10;
                l.s sVar = dVar.f14475i;
                if (sVar != null) {
                    sVar.o(z10);
                }
                d dVar2 = this.J;
                if (!dVar2.b()) {
                    if (dVar2.e != null) {
                        dVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                l.w wVar = this.e;
                if (wVar != null) {
                    wVar.q(d0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        return false;
    }

    public final boolean l() {
        l.k kVar;
        if (this.f14859w && !g() && (kVar = this.f14854c) != null && this.f14856n != null && this.K == null) {
            kVar.i();
            if (!kVar.f14421j.isEmpty()) {
                f fVar = new f(this, new d(this, this.f14853b, this.f14854c, this.f14857r));
                this.K = fVar;
                ((View) this.f14856n).post(fVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
