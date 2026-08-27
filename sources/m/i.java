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
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

public final class i implements l.y {
    public int A;
    public int B;
    public boolean C;
    public e E;
    public e F;
    public g G;
    public f H;

    public final Context f17337a;

    public Context f17338b;

    public l.l f17339c;
    public final LayoutInflater d;

    public l.x f17340e;

    public l.a0 f17342n;

    public h f17343r;

    public Drawable f17344s;
    public boolean v;

    public boolean f17345w;

    public boolean f17346x;

    public int f17347y;

    public final int f17341f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray D = new SparseBooleanArray();
    public final k5.i I = new k5.i(this, 25);

    public i(Context context) {
        this.f17337a = context;
        this.d = LayoutInflater.from(context);
    }

    public final View a(l.n nVar, View view, ViewGroup viewGroup) {
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            l.z zVar = view instanceof l.z ? (l.z) view : (l.z) this.d.inflate(this.h, viewGroup, false);
            zVar.b(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) zVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f17342n);
            if (this.H == null) {
                this.H = new f(this);
            }
            actionMenuItemView.setPopupCallback(this.H);
            actionView = (View) zVar;
        }
        actionView.setVisibility(nVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof k)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override
    public final void b(l.l lVar, boolean z10) {
        f();
        e eVar = this.F;
        if (eVar != null && eVar.b()) {
            eVar.f15373i.dismiss();
        }
        l.x xVar = this.f17340e;
        if (xVar != null) {
            xVar.b(lVar, z10);
        }
    }

    @Override
    public final boolean c(l.n nVar) {
        return false;
    }

    @Override
    public final boolean d() {
        ArrayList arrayListL;
        int size;
        int i10;
        boolean z10;
        i iVar = this;
        l.l lVar = iVar.f17339c;
        if (lVar != null) {
            arrayListL = lVar.l();
            size = arrayListL.size();
        } else {
            arrayListL = null;
            size = 0;
        }
        int i11 = iVar.B;
        int i12 = iVar.A;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) iVar.f17342n;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= size) {
                break;
            }
            l.n nVar = (l.n) arrayListL.get(i13);
            int i16 = nVar.f15355y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (iVar.C && nVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (iVar.f17345w && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = iVar.D;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            l.n nVar2 = (l.n) arrayListL.get(i18);
            int i20 = nVar2.f15355y;
            boolean z12 = (i20 & 2) == i10;
            int i21 = nVar2.f15335b;
            if (z12) {
                View viewA = iVar.a(nVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                nVar2.f(z10);
            } else {
                if ((i20 & 1) == z10) {
                    boolean z13 = sparseBooleanArray.get(i21);
                    boolean z14 = (i17 > 0 || z13) && i12 > 0;
                    if (z14) {
                        View viewA2 = iVar.a(nVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z14 &= i12 + i19 > 0;
                    }
                    if (z14 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z13) {
                        sparseBooleanArray.put(i21, false);
                        for (int i22 = 0; i22 < i18; i22++) {
                            l.n nVar3 = (l.n) arrayListL.get(i22);
                            if (nVar3.f15335b == i21) {
                                if ((nVar3.f15354x & 32) == 32) {
                                    i17++;
                                }
                                nVar3.f(false);
                            }
                        }
                    }
                    if (z14) {
                        i17--;
                    }
                    nVar2.f(z14);
                } else {
                    nVar2.f(false);
                }
                i18++;
                i10 = 2;
                iVar = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            iVar = this;
            z10 = true;
        }
        return true;
    }

    @Override
    public final void e() {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.f17342n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.l lVar = this.f17339c;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListL = this.f17339c.l();
                int size = arrayListL.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.n nVar = (l.n) arrayListL.get(i11);
                    if ((nVar.f15354x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        l.n itemData = childAt instanceof l.z ? ((l.z) childAt).getItemData() : null;
                        View viewA = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f17342n).addView(viewA, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f17343r) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f17342n).requestLayout();
        l.l lVar2 = this.f17339c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f15316i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                l.o oVar = ((l.n) arrayList2.get(i12)).A;
            }
        }
        l.l lVar3 = this.f17339c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f15317j;
        }
        if (this.f17345w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.n) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f17343r == null) {
                this.f17343r = new h(this, this.f17337a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f17343r.getParent();
            if (viewGroup3 != this.f17342n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f17343r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f17342n;
                h hVar = this.f17343r;
                actionMenuView.getClass();
                k kVarI = ActionMenuView.i();
                kVarI.f17358a = true;
                actionMenuView.addView(hVar, kVarI);
            }
        } else {
            h hVar2 = this.f17343r;
            if (hVar2 != null) {
                Object parent = hVar2.getParent();
                Object obj = this.f17342n;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f17343r);
                }
            }
        }
        ((ActionMenuView) this.f17342n).setOverflowReserved(this.f17345w);
    }

    public final boolean f() {
        Object obj;
        g gVar = this.G;
        if (gVar != null && (obj = this.f17342n) != null) {
            ((View) obj).removeCallbacks(gVar);
            this.G = null;
            return true;
        }
        e eVar = this.E;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.f15373i.dismiss();
        }
        return true;
    }

    public final boolean g() {
        e eVar = this.E;
        return eVar != null && eVar.b();
    }

    @Override
    public final void h(l.x xVar) {
        throw null;
    }

    @Override
    public final void i(Context context, l.l lVar) {
        this.f17338b = context;
        LayoutInflater.from(context);
        this.f17339c = lVar;
        Resources resources = context.getResources();
        if (!this.f17346x) {
            this.f17345w = true;
        }
        int i10 = 2;
        this.f17347y = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.B = i10;
        int measuredWidth = this.f17347y;
        if (this.f17345w) {
            if (this.f17343r == null) {
                h hVar = new h(this, this.f17337a);
                this.f17343r = hVar;
                if (this.v) {
                    hVar.setImageDrawable(this.f17344s);
                    this.f17344s = null;
                    this.v = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f17343r.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f17343r.getMeasuredWidth();
        } else {
            this.f17343r = null;
        }
        this.A = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override
    public final boolean j(l.e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            l.e0 e0Var2 = e0Var;
            while (true) {
                l.l lVar = e0Var2.f15286z;
                if (lVar == this.f17339c) {
                    break;
                }
                e0Var2 = (l.e0) lVar;
            }
            l.n nVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f17342n;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof l.z) && ((l.z) childAt).getItemData() == nVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                e0Var.A.getClass();
                int size = e0Var.f15314f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                e eVar = new e(this, this.f17338b, e0Var, view);
                this.F = eVar;
                eVar.f15372g = z10;
                l.t tVar = eVar.f15373i;
                if (tVar != null) {
                    tVar.o(z10);
                }
                e eVar2 = this.F;
                if (!eVar2.b()) {
                    if (eVar2.f15370e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    eVar2.d(0, 0, false, false);
                }
                l.x xVar = this.f17340e;
                if (xVar != null) {
                    xVar.l(e0Var);
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
        if (!this.f17345w || g() || (lVar = this.f17339c) == null || this.f17342n == null || this.G != null) {
            return false;
        }
        lVar.i();
        if (lVar.f15317j.isEmpty()) {
            return false;
        }
        g gVar = new g(this, new e(this, this.f17338b, this.f17339c, this.f17343r));
        this.G = gVar;
        ((View) this.f17342n).post(gVar);
        return true;
    }
}
