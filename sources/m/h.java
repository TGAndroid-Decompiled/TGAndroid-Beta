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
import gi.v5;
import java.util.ArrayList;
public final class h implements l.x {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public d J;
    public d K;
    public f L;
    public e M;
    public final Context f18592a;
    public Context f18593b;
    public l.k f18594c;
    public final LayoutInflater d;
    public l.w f18595e;
    public l.z f18597n;
    public g f18598r;
    public Drawable f18599s;
    public boolean f18600w;
    public boolean f18601x;
    public boolean f18602y;
    public final int f18596f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray I = new SparseBooleanArray();
    public final v5 N = new v5(this, 11);

    public h(Context context) {
        this.f18592a = context;
        this.d = LayoutInflater.from(context);
    }

    public final View a(l.m mVar, View view, ViewGroup viewGroup) {
        l.y yVar;
        View actionView = mVar.getActionView();
        int i3 = 0;
        if (actionView == null || mVar.e()) {
            if (view instanceof l.y) {
                yVar = (l.y) view;
            } else {
                yVar = (l.y) this.d.inflate(this.h, viewGroup, false);
            }
            yVar.b(mVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f18597n);
            if (this.M == null) {
                this.M = new e(this);
            }
            actionMenuItemView.setPopupCallback(this.M);
            actionView = (View) yVar;
        }
        if (mVar.C) {
            i3 = 8;
        }
        actionView.setVisibility(i3);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof j)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override
    public final void b(l.k kVar, boolean z10) {
        f();
        d dVar = this.K;
        if (dVar != null && dVar.b()) {
            dVar.f17480i.dismiss();
        }
        l.w wVar = this.f18595e;
        if (wVar != null) {
            wVar.b(kVar, z10);
        }
    }

    @Override
    public final boolean c(l.m mVar) {
        return false;
    }

    @Override
    public final boolean d() {
        int i3;
        ArrayList arrayList;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        h hVar = this;
        l.k kVar = hVar.f18594c;
        if (kVar != null) {
            arrayList = kVar.l();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i11 = hVar.G;
        int i12 = hVar.F;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) hVar.f18597n;
        int i13 = 0;
        boolean z14 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= i3) {
                break;
            }
            l.m mVar = (l.m) arrayList.get(i13);
            int i16 = mVar.f17462y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z14 = true;
            }
            if (hVar.H && mVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (hVar.f18601x && (z14 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = hVar.I;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i3) {
            l.m mVar2 = (l.m) arrayList.get(i18);
            int i20 = mVar2.f17462y;
            if ((i20 & 2) == i10) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i21 = mVar2.f17442b;
            if (z11) {
                View a10 = hVar.a(mVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                mVar2.f(z10);
            } else if ((i20 & 1) == z10) {
                boolean z15 = sparseBooleanArray.get(i21);
                if ((i17 > 0 || z15) && i12 > 0) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    View a11 = hVar.a(mVar2, null, viewGroup);
                    a11.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a11.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    if (i12 + i19 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z12 &= z13;
                }
                if (z12 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z15) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        l.m mVar3 = (l.m) arrayList.get(i22);
                        if (mVar3.f17442b == i21) {
                            if ((mVar3.f17461x & 32) == 32) {
                                i17++;
                            }
                            mVar3.f(false);
                        }
                    }
                }
                if (z12) {
                    i17--;
                }
                mVar2.f(z12);
            } else {
                mVar2.f(false);
                i18++;
                i10 = 2;
                hVar = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            hVar = this;
            z10 = true;
        }
        return z10;
    }

    @Override
    public final void e() {
        int i3;
        l.m mVar;
        ViewGroup viewGroup = (ViewGroup) this.f18597n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.k kVar = this.f18594c;
            if (kVar != null) {
                kVar.i();
                ArrayList l10 = this.f18594c.l();
                int size = l10.size();
                i3 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    l.m mVar2 = (l.m) l10.get(i10);
                    if ((mVar2.f17461x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (childAt instanceof l.y) {
                            mVar = ((l.y) childAt).getItemData();
                        } else {
                            mVar = null;
                        }
                        View a10 = a(mVar2, childAt, viewGroup);
                        if (mVar2 != mVar) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.f18597n).addView(a10, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i3) == this.f18598r) {
                    i3++;
                } else {
                    viewGroup.removeViewAt(i3);
                }
            }
        }
        ((View) this.f18597n).requestLayout();
        l.k kVar2 = this.f18594c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f17423i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                l.n nVar = ((l.m) arrayList2.get(i11)).A;
            }
        }
        l.k kVar3 = this.f18594c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f17424j;
        }
        if (this.f18601x && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.m) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f18598r == null) {
                this.f18598r = new g(this, this.f18592a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f18598r.getParent();
            if (viewGroup3 != this.f18597n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f18598r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f18597n;
                g gVar = this.f18598r;
                actionMenuView.getClass();
                j i12 = ActionMenuView.i();
                i12.f18611a = true;
                actionMenuView.addView(gVar, i12);
            }
        } else {
            g gVar2 = this.f18598r;
            if (gVar2 != null) {
                ViewParent parent = gVar2.getParent();
                l.z zVar = this.f18597n;
                if (parent == zVar) {
                    ((ViewGroup) zVar).removeView(this.f18598r);
                }
            }
        }
        ((ActionMenuView) this.f18597n).setOverflowReserved(this.f18601x);
    }

    public final boolean f() {
        l.z zVar;
        f fVar = this.L;
        if (fVar != null && (zVar = this.f18597n) != null) {
            ((View) zVar).removeCallbacks(fVar);
            this.L = null;
            return true;
        }
        d dVar = this.J;
        if (dVar != null) {
            if (dVar.b()) {
                dVar.f17480i.dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean g() {
        d dVar = this.J;
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
        this.f18593b = context;
        LayoutInflater.from(context);
        this.f18594c = kVar;
        Resources resources = context.getResources();
        if (!this.f18602y) {
            this.f18601x = true;
        }
        int i3 = 2;
        this.E = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
            if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                if (i10 >= 360) {
                    i3 = 3;
                }
            } else {
                i3 = 4;
            }
        } else {
            i3 = 5;
        }
        this.G = i3;
        int i12 = this.E;
        if (this.f18601x) {
            if (this.f18598r == null) {
                g gVar = new g(this, this.f18592a);
                this.f18598r = gVar;
                if (this.f18600w) {
                    gVar.setImageDrawable(this.f18599s);
                    this.f18599s = null;
                    this.f18600w = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f18598r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.f18598r.getMeasuredWidth();
        } else {
            this.f18598r = null;
        }
        this.F = i12;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            l.d0 d0Var2 = d0Var;
            while (true) {
                l.k kVar = d0Var2.f17393z;
                if (kVar == this.f18594c) {
                    break;
                }
                d0Var2 = (l.d0) kVar;
            }
            l.m mVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f18597n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i3);
                    if ((childAt instanceof l.y) && ((l.y) childAt).getItemData() == mVar) {
                        view = childAt;
                        break;
                    }
                    i3++;
                }
            }
            if (view != null) {
                d0Var.A.getClass();
                int size = d0Var.f17421f.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        MenuItem item = d0Var.getItem(i10);
                        if (item.isVisible() && item.getIcon() != null) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                d dVar = new d(this, this.f18593b, d0Var, view);
                this.K = dVar;
                dVar.f17479g = z10;
                l.s sVar = dVar.f17480i;
                if (sVar != null) {
                    sVar.o(z10);
                }
                d dVar2 = this.K;
                if (!dVar2.b()) {
                    if (dVar2.f17477e != null) {
                        dVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                l.w wVar = this.f18595e;
                if (wVar != null) {
                    wVar.E(d0Var);
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
        if (this.f18601x && !g() && (kVar = this.f18594c) != null && this.f18597n != null && this.L == null) {
            kVar.i();
            if (!kVar.f17424j.isEmpty()) {
                f fVar = new f(this, new d(this, this.f18593b, this.f18594c, this.f18598r));
                this.L = fVar;
                ((View) this.f18597n).post(fVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
