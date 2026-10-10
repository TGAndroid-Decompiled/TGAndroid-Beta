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
public final class h implements l.x {
    public int E;
    public int F;
    public boolean G;
    public d I;
    public d J;
    public f K;
    public e L;
    public final Context f15684a;
    public Context f15685b;
    public l.k f15686c;
    public final LayoutInflater d;
    public l.w f15687e;
    public l.z f15689n;
    public g f15690r;
    public Drawable f15691s;
    public boolean v;
    public boolean f15692w;
    public boolean f15693x;
    public int f15694y;
    public final int f15688f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray H = new SparseBooleanArray();
    public final a4.l M = new a4.l(this, 29);

    public h(Context context) {
        this.f15684a = context;
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
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f15689n);
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
        if (!(layoutParams instanceof j)) {
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
        h hVar = this;
        l.k kVar = hVar.f15686c;
        if (kVar != null) {
            arrayList = kVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = hVar.F;
        int i13 = hVar.E;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) hVar.f15689n;
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
            int i17 = mVar.f15284y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z14 = true;
            }
            if (hVar.G && mVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (hVar.f15692w && (z14 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = hVar.H;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            l.m mVar2 = (l.m) arrayList.get(i19);
            int i21 = mVar2.f15284y;
            if ((i21 & 2) == i11) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i22 = mVar2.f15264b;
            if (z11) {
                View a2 = hVar.a(mVar2, null, viewGroup);
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
                    View a10 = hVar.a(mVar2, null, viewGroup);
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
                        if (mVar3.f15264b == i22) {
                            if ((mVar3.f15283x & 32) == 32) {
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
                hVar = this;
                z10 = true;
            }
            i19++;
            i11 = 2;
            hVar = this;
            z10 = true;
        }
        return z10;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
        f();
        d dVar = this.J;
        if (dVar != null && dVar.b()) {
            dVar.f15302i.dismiss();
        }
        l.w wVar = this.f15687e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        int i10;
        l.m mVar;
        ViewGroup viewGroup = (ViewGroup) this.f15689n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.k kVar = this.f15686c;
            if (kVar != null) {
                kVar.i();
                ArrayList l4 = this.f15686c.l();
                int size = l4.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.m mVar2 = (l.m) l4.get(i11);
                    if ((mVar2.f15283x & 32) == 32) {
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
                            ((ViewGroup) this.f15689n).addView(a2, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f15690r) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f15689n).requestLayout();
        l.k kVar2 = this.f15686c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f15245i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                l.n nVar = ((l.m) arrayList2.get(i12)).A;
            }
        }
        l.k kVar3 = this.f15686c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f15246j;
        }
        if (this.f15692w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.m) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f15690r == null) {
                this.f15690r = new g(this, this.f15684a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f15690r.getParent();
            if (viewGroup3 != this.f15689n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f15690r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f15689n;
                g gVar = this.f15690r;
                actionMenuView.getClass();
                j i13 = ActionMenuView.i();
                i13.f15708a = true;
                actionMenuView.addView(gVar, i13);
            }
        } else {
            g gVar2 = this.f15690r;
            if (gVar2 != null) {
                ViewParent parent = gVar2.getParent();
                l.z zVar = this.f15689n;
                if (parent == zVar) {
                    ((ViewGroup) zVar).removeView(this.f15690r);
                }
            }
        }
        ((ActionMenuView) this.f15689n).setOverflowReserved(this.f15692w);
    }

    public final boolean f() {
        l.z zVar;
        f fVar = this.K;
        if (fVar != null && (zVar = this.f15689n) != null) {
            ((View) zVar).removeCallbacks(fVar);
            this.K = null;
            return true;
        }
        d dVar = this.I;
        if (dVar != null) {
            if (dVar.b()) {
                dVar.f15302i.dismiss();
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
        this.f15685b = context;
        LayoutInflater.from(context);
        this.f15686c = kVar;
        Resources resources = context.getResources();
        if (!this.f15693x) {
            this.f15692w = true;
        }
        int i10 = 2;
        this.f15694y = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        int i13 = this.f15694y;
        if (this.f15692w) {
            if (this.f15690r == null) {
                g gVar = new g(this, this.f15684a);
                this.f15690r = gVar;
                if (this.v) {
                    gVar.setImageDrawable(this.f15691s);
                    this.f15691s = null;
                    this.v = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f15690r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f15690r.getMeasuredWidth();
        } else {
            this.f15690r = null;
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
                l.k kVar = d0Var2.f15215z;
                if (kVar == this.f15686c) {
                    break;
                }
                d0Var2 = (l.d0) kVar;
            }
            l.m mVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f15689n;
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
                int size = d0Var.f15243f.size();
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
                d dVar = new d(this, this.f15685b, d0Var, view);
                this.J = dVar;
                dVar.f15301g = z10;
                l.s sVar = dVar.f15302i;
                if (sVar != null) {
                    sVar.o(z10);
                }
                d dVar2 = this.J;
                if (!dVar2.b()) {
                    if (dVar2.f15299e != null) {
                        dVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                l.w wVar = this.f15687e;
                if (wVar != null) {
                    wVar.v(d0Var);
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
        if (this.f15692w && !g() && (kVar = this.f15686c) != null && this.f15689n != null && this.K == null) {
            kVar.i();
            if (!kVar.f15246j.isEmpty()) {
                f fVar = new f(this, new d(this, this.f15685b, this.f15686c, this.f15690r));
                this.K = fVar;
                ((View) this.f15689n).post(fVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
