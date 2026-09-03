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
    public int B;
    public int C;
    public boolean D;
    public d F;
    public d G;
    public f H;
    public e I;
    public final Context f13490a;
    public Context f13491b;
    public l.k f13492c;
    public final LayoutInflater d;
    public l.w e;
    public l.z f13494n;
    public g f13495r;
    public Drawable f13496s;
    public boolean v;
    public boolean f13497w;
    public boolean f13498x;
    public int f13499y;
    public final int f13493f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray E = new SparseBooleanArray();
    public final bb.b J = new bb.b(this, 25);

    public h(Context context) {
        this.f13490a = context;
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
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f13494n);
            if (this.I == null) {
                this.I = new e(this);
            }
            actionMenuItemView.setPopupCallback(this.I);
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
    public final void c(l.k kVar, boolean z4) {
        f();
        d dVar = this.G;
        if (dVar != null && dVar.b()) {
            dVar.f11210i.dismiss();
        }
        l.w wVar = this.e;
        if (wVar != null) {
            wVar.c(kVar, z4);
        }
    }

    @Override
    public final boolean d() {
        ArrayList arrayList;
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        h hVar = this;
        l.k kVar = hVar.f13492c;
        if (kVar != null) {
            arrayList = kVar.l();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i12 = hVar.C;
        int i13 = hVar.B;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) hVar.f13494n;
        int i14 = 0;
        boolean z13 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z4 = true;
            if (i14 >= i10) {
                break;
            }
            l.m mVar = (l.m) arrayList.get(i14);
            int i17 = mVar.f11193y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z13 = true;
            }
            if (hVar.D && mVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (hVar.f13497w && (z13 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = hVar.E;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            l.m mVar2 = (l.m) arrayList.get(i19);
            int i21 = mVar2.f11193y;
            if ((i21 & 2) == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i22 = mVar2.f11174b;
            if (z10) {
                View a2 = hVar.a(mVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z4);
                }
                mVar2.f(z4);
            } else if ((i21 & 1) == z4) {
                boolean z14 = sparseBooleanArray.get(i22);
                if ((i18 > 0 || z14) && i13 > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    View a10 = hVar.a(mVar2, null, viewGroup);
                    a10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a10.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    if (i13 + i20 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 &= z12;
                }
                if (z11 && i22 != 0) {
                    sparseBooleanArray.put(i22, true);
                } else if (z14) {
                    sparseBooleanArray.put(i22, false);
                    for (int i23 = 0; i23 < i19; i23++) {
                        l.m mVar3 = (l.m) arrayList.get(i23);
                        if (mVar3.f11174b == i22) {
                            if ((mVar3.f11192x & 32) == 32) {
                                i18++;
                            }
                            mVar3.f(false);
                        }
                    }
                }
                if (z11) {
                    i18--;
                }
                mVar2.f(z11);
            } else {
                mVar2.f(false);
                i19++;
                i11 = 2;
                hVar = this;
                z4 = true;
            }
            i19++;
            i11 = 2;
            hVar = this;
            z4 = true;
        }
        return true;
    }

    @Override
    public final void e() {
        int i10;
        l.m mVar;
        ViewGroup viewGroup = (ViewGroup) this.f13494n;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            l.k kVar = this.f13492c;
            if (kVar != null) {
                kVar.i();
                ArrayList l10 = this.f13492c.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.m mVar2 = (l.m) l10.get(i11);
                    if ((mVar2.f11192x & 32) == 32) {
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
                            ((ViewGroup) this.f13494n).addView(a2, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f13495r) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f13494n).requestLayout();
        l.k kVar2 = this.f13492c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f11155i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                l.n nVar = ((l.m) arrayList2.get(i12)).A;
            }
        }
        l.k kVar3 = this.f13492c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f11156j;
        }
        if (this.f13497w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((l.m) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f13495r == null) {
                this.f13495r = new g(this, this.f13490a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f13495r.getParent();
            if (viewGroup3 != this.f13494n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f13495r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f13494n;
                g gVar = this.f13495r;
                actionMenuView.getClass();
                j i13 = ActionMenuView.i();
                i13.f13518a = true;
                actionMenuView.addView(gVar, i13);
            }
        } else {
            g gVar2 = this.f13495r;
            if (gVar2 != null) {
                ViewParent parent = gVar2.getParent();
                l.z zVar = this.f13494n;
                if (parent == zVar) {
                    ((ViewGroup) zVar).removeView(this.f13495r);
                }
            }
        }
        ((ActionMenuView) this.f13494n).setOverflowReserved(this.f13497w);
    }

    public final boolean f() {
        l.z zVar;
        f fVar = this.H;
        if (fVar != null && (zVar = this.f13494n) != null) {
            ((View) zVar).removeCallbacks(fVar);
            this.H = null;
            return true;
        }
        d dVar = this.F;
        if (dVar != null) {
            if (dVar.b()) {
                dVar.f11210i.dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean g() {
        d dVar = this.F;
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
        this.f13491b = context;
        LayoutInflater.from(context);
        this.f13492c = kVar;
        Resources resources = context.getResources();
        if (!this.f13498x) {
            this.f13497w = true;
        }
        int i10 = 2;
        this.f13499y = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.C = i10;
        int i13 = this.f13499y;
        if (this.f13497w) {
            if (this.f13495r == null) {
                g gVar = new g(this, this.f13490a);
                this.f13495r = gVar;
                if (this.v) {
                    gVar.setImageDrawable(this.f13496s);
                    this.f13496s = null;
                    this.v = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f13495r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f13495r.getMeasuredWidth();
        } else {
            this.f13495r = null;
        }
        this.B = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        boolean z4;
        if (d0Var.hasVisibleItems()) {
            l.d0 d0Var2 = d0Var;
            while (true) {
                l.k kVar = d0Var2.f11129z;
                if (kVar == this.f13492c) {
                    break;
                }
                d0Var2 = (l.d0) kVar;
            }
            l.m mVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f13494n;
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
                int size = d0Var.f11153f.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        MenuItem item = d0Var.getItem(i11);
                        if (item.isVisible() && item.getIcon() != null) {
                            z4 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z4 = false;
                        break;
                    }
                }
                d dVar = new d(this, this.f13491b, d0Var, view);
                this.G = dVar;
                dVar.f11209g = z4;
                l.s sVar = dVar.f11210i;
                if (sVar != null) {
                    sVar.o(z4);
                }
                d dVar2 = this.G;
                if (!dVar2.b()) {
                    if (dVar2.e != null) {
                        dVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                l.w wVar = this.e;
                if (wVar != null) {
                    wVar.p(d0Var);
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
        if (this.f13497w && !g() && (kVar = this.f13492c) != null && this.f13494n != null && this.H == null) {
            kVar.i();
            if (!kVar.f11156j.isEmpty()) {
                f fVar = new f(this, new d(this, this.f13491b, this.f13492c, this.f13495r));
                this.H = fVar;
                ((View) this.f13494n).post(fVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
