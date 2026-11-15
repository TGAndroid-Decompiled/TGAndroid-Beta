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
    public int G;
    public boolean H;
    public d J;
    public d K;
    public f L;
    public e M;
    public final Context f19704a;
    public Context f19705b;
    public l.k f19706c;
    public final LayoutInflater d;
    public l.w f19707e;
    public l.z f19709n;
    public g f19710r;
    public Drawable f19711s;
    public boolean f19712w;
    public boolean f19713x;
    public boolean f19714y;
    public final int f19708f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray I = new SparseBooleanArray();
    public final ia.d N = new ia.d(this, 9);

    public h(Context context) {
        this.f19704a = context;
        this.d = LayoutInflater.from(context);
    }

    public final View a(l.m mVar, View view, ViewGroup viewGroup) {
        l.y yVar;
        View actionView = mVar.getActionView();
        int i7 = 0;
        if (actionView == null || mVar.e()) {
            if (view instanceof l.y) {
                yVar = (l.y) view;
            } else {
                yVar = (l.y) this.d.inflate(this.h, viewGroup, false);
            }
            yVar.b(mVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f19709n);
            if (this.M == null) {
                this.M = new e(this);
            }
            actionMenuItemView.setPopupCallback(this.M);
            actionView = (View) yVar;
        }
        if (mVar.C) {
            i7 = 8;
        }
        actionView.setVisibility(i7);
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
        int i7;
        ArrayList arrayList;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        h hVar = this;
        l.k kVar = hVar.f19706c;
        if (kVar != null) {
            arrayList = kVar.l();
            i7 = arrayList.size();
        } else {
            i7 = 0;
            arrayList = null;
        }
        int i11 = hVar.G;
        int i12 = hVar.F;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) hVar.f19709n;
        int i13 = 0;
        boolean z14 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= i7) {
                break;
            }
            l.m mVar = (l.m) arrayList.get(i13);
            int i16 = mVar.f18858y;
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
        if (hVar.f19713x && (z14 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = hVar.I;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i7) {
            l.m mVar2 = (l.m) arrayList.get(i18);
            int i20 = mVar2.f18858y;
            if ((i20 & 2) == i10) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i21 = mVar2.f18838b;
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
                        if (mVar3.f18838b == i21) {
                            if ((mVar3.f18857x & 32) == 32) {
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
    public final void d() {
        int i7;
        l.m mVar;
        ViewGroup viewGroup = (ViewGroup) this.f19709n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.k kVar = this.f19706c;
            if (kVar != null) {
                kVar.i();
                ArrayList l10 = this.f19706c.l();
                int size = l10.size();
                i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    l.m mVar2 = (l.m) l10.get(i10);
                    if ((mVar2.f18857x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i7);
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
                            ((ViewGroup) this.f19709n).addView(a10, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i7) == this.f19710r) {
                    i7++;
                } else {
                    viewGroup.removeViewAt(i7);
                }
            }
        }
        ((View) this.f19709n).requestLayout();
        l.k kVar2 = this.f19706c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f18819i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                l.n nVar = ((l.m) arrayList2.get(i11)).A;
            }
        }
        l.k kVar3 = this.f19706c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f18820j;
        }
        if (this.f19713x && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.m) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f19710r == null) {
                this.f19710r = new g(this, this.f19704a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f19710r.getParent();
            if (viewGroup3 != this.f19709n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f19710r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f19709n;
                g gVar = this.f19710r;
                actionMenuView.getClass();
                j i12 = ActionMenuView.i();
                i12.f19723a = true;
                actionMenuView.addView(gVar, i12);
            }
        } else {
            g gVar2 = this.f19710r;
            if (gVar2 != null) {
                ViewParent parent = gVar2.getParent();
                l.z zVar = this.f19709n;
                if (parent == zVar) {
                    ((ViewGroup) zVar).removeView(this.f19710r);
                }
            }
        }
        ((ActionMenuView) this.f19709n).setOverflowReserved(this.f19713x);
    }

    @Override
    public final void e(l.k kVar, boolean z10) {
        f();
        d dVar = this.K;
        if (dVar != null && dVar.b()) {
            dVar.f18876i.dismiss();
        }
        l.w wVar = this.f19707e;
        if (wVar != null) {
            wVar.e(kVar, z10);
        }
    }

    public final boolean f() {
        l.z zVar;
        f fVar = this.L;
        if (fVar != null && (zVar = this.f19709n) != null) {
            ((View) zVar).removeCallbacks(fVar);
            this.L = null;
            return true;
        }
        d dVar = this.J;
        if (dVar != null) {
            if (dVar.b()) {
                dVar.f18876i.dismiss();
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
        this.f19705b = context;
        LayoutInflater.from(context);
        this.f19706c = kVar;
        Resources resources = context.getResources();
        if (!this.f19714y) {
            this.f19713x = true;
        }
        int i7 = 2;
        this.E = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
            if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                if (i10 >= 360) {
                    i7 = 3;
                }
            } else {
                i7 = 4;
            }
        } else {
            i7 = 5;
        }
        this.G = i7;
        int i12 = this.E;
        if (this.f19713x) {
            if (this.f19710r == null) {
                g gVar = new g(this, this.f19704a);
                this.f19710r = gVar;
                if (this.f19712w) {
                    gVar.setImageDrawable(this.f19711s);
                    this.f19711s = null;
                    this.f19712w = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f19710r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.f19710r.getMeasuredWidth();
        } else {
            this.f19710r = null;
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
                l.k kVar = d0Var2.f18789z;
                if (kVar == this.f19706c) {
                    break;
                }
                d0Var2 = (l.d0) kVar;
            }
            l.m mVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f19709n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i7);
                    if ((childAt instanceof l.y) && ((l.y) childAt).getItemData() == mVar) {
                        view = childAt;
                        break;
                    }
                    i7++;
                }
            }
            if (view != null) {
                d0Var.A.getClass();
                int size = d0Var.f18817f.size();
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
                d dVar = new d(this, this.f19705b, d0Var, view);
                this.K = dVar;
                dVar.f18875g = z10;
                l.s sVar = dVar.f18876i;
                if (sVar != null) {
                    sVar.o(z10);
                }
                d dVar2 = this.K;
                if (!dVar2.b()) {
                    if (dVar2.f18873e != null) {
                        dVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                l.w wVar = this.f19707e;
                if (wVar != null) {
                    wVar.y(d0Var);
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
        if (this.f19713x && !g() && (kVar = this.f19706c) != null && this.f19709n != null && this.L == null) {
            kVar.i();
            if (!kVar.f18820j.isEmpty()) {
                f fVar = new f(this, new d(this, this.f19705b, this.f19706c, this.f19710r));
                this.L = fVar;
                ((View) this.f19709n).post(fVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
