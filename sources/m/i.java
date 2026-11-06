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
    public int D;
    public int E;
    public int F;
    public boolean G;
    public e I;
    public e J;
    public g K;
    public f L;
    public final Context f19119a;
    public Context f19120b;
    public l.k f19121c;
    public final LayoutInflater d;
    public l.w f19122e;
    public l.z f19124n;
    public h f19125r;
    public Drawable f19126s;
    public boolean f19127w;
    public boolean f19128x;
    public boolean f19129y;
    public final int f19123f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray H = new SparseBooleanArray();
    public final gf.g M = new gf.g(this, 15);

    public i(Context context) {
        this.f19119a = context;
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
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f19124n);
            if (this.L == null) {
                this.L = new f(this);
            }
            actionMenuItemView.setPopupCallback(this.L);
            actionView = (View) yVar;
        }
        if (mVar.C) {
            i7 = 8;
        }
        actionView.setVisibility(i7);
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
    public final void c(l.k kVar, boolean z9) {
        f();
        e eVar = this.J;
        if (eVar != null && eVar.b()) {
            eVar.f17731i.dismiss();
        }
        l.w wVar = this.f19122e;
        if (wVar != null) {
            wVar.c(kVar, z9);
        }
    }

    @Override
    public final boolean d() {
        int i7;
        ArrayList arrayList;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        i iVar = this;
        l.k kVar = iVar.f19121c;
        if (kVar != null) {
            arrayList = kVar.l();
            i7 = arrayList.size();
        } else {
            i7 = 0;
            arrayList = null;
        }
        int i11 = iVar.F;
        int i12 = iVar.E;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) iVar.f19124n;
        int i13 = 0;
        boolean z13 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z9 = true;
            if (i13 >= i7) {
                break;
            }
            l.m mVar = (l.m) arrayList.get(i13);
            int i16 = mVar.f17713y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z13 = true;
            }
            if (iVar.G && mVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (iVar.f19128x && (z13 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = iVar.H;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i7) {
            l.m mVar2 = (l.m) arrayList.get(i18);
            int i20 = mVar2.f17713y;
            if ((i20 & 2) == i10) {
                z10 = z9;
            } else {
                z10 = false;
            }
            int i21 = mVar2.f17693b;
            if (z10) {
                View a10 = iVar.a(mVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z9);
                }
                mVar2.f(z9);
            } else if ((i20 & 1) == z9) {
                boolean z14 = sparseBooleanArray.get(i21);
                if ((i17 > 0 || z14) && i12 > 0) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                if (z11) {
                    View a11 = iVar.a(mVar2, null, viewGroup);
                    a11.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a11.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    if (i12 + i19 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 &= z12;
                }
                if (z11 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z14) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        l.m mVar3 = (l.m) arrayList.get(i22);
                        if (mVar3.f17693b == i21) {
                            if ((mVar3.f17712x & 32) == 32) {
                                i17++;
                            }
                            mVar3.f(false);
                        }
                    }
                }
                if (z11) {
                    i17--;
                }
                mVar2.f(z11);
            } else {
                mVar2.f(false);
                i18++;
                i10 = 2;
                iVar = this;
                z9 = true;
            }
            i18++;
            i10 = 2;
            iVar = this;
            z9 = true;
        }
        return z9;
    }

    @Override
    public final void e() {
        int i7;
        l.m mVar;
        ViewGroup viewGroup = (ViewGroup) this.f19124n;
        ArrayList arrayList = null;
        boolean z9 = false;
        if (viewGroup != null) {
            l.k kVar = this.f19121c;
            if (kVar != null) {
                kVar.i();
                ArrayList l10 = this.f19121c.l();
                int size = l10.size();
                i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    l.m mVar2 = (l.m) l10.get(i10);
                    if ((mVar2.f17712x & 32) == 32) {
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
                            ((ViewGroup) this.f19124n).addView(a10, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i7) == this.f19125r) {
                    i7++;
                } else {
                    viewGroup.removeViewAt(i7);
                }
            }
        }
        ((View) this.f19124n).requestLayout();
        l.k kVar2 = this.f19121c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f17674i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                l.n nVar = ((l.m) arrayList2.get(i11)).A;
            }
        }
        l.k kVar3 = this.f19121c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f17675j;
        }
        if (this.f19128x && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z9 = !((l.m) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z9 = true;
            }
        }
        if (z9) {
            if (this.f19125r == null) {
                this.f19125r = new h(this, this.f19119a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f19125r.getParent();
            if (viewGroup3 != this.f19124n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f19125r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f19124n;
                h hVar = this.f19125r;
                actionMenuView.getClass();
                k i12 = ActionMenuView.i();
                i12.f19139a = true;
                actionMenuView.addView(hVar, i12);
            }
        } else {
            h hVar2 = this.f19125r;
            if (hVar2 != null) {
                ViewParent parent = hVar2.getParent();
                l.z zVar = this.f19124n;
                if (parent == zVar) {
                    ((ViewGroup) zVar).removeView(this.f19125r);
                }
            }
        }
        ((ActionMenuView) this.f19124n).setOverflowReserved(this.f19128x);
    }

    public final boolean f() {
        l.z zVar;
        g gVar = this.K;
        if (gVar != null && (zVar = this.f19124n) != null) {
            ((View) zVar).removeCallbacks(gVar);
            this.K = null;
            return true;
        }
        e eVar = this.I;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f17731i.dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean g() {
        e eVar = this.I;
        if (eVar != null && eVar.b()) {
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
        this.f19120b = context;
        LayoutInflater.from(context);
        this.f19121c = kVar;
        Resources resources = context.getResources();
        if (!this.f19129y) {
            this.f19128x = true;
        }
        int i7 = 2;
        this.D = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.F = i7;
        int i12 = this.D;
        if (this.f19128x) {
            if (this.f19125r == null) {
                h hVar = new h(this, this.f19119a);
                this.f19125r = hVar;
                if (this.f19127w) {
                    hVar.setImageDrawable(this.f19126s);
                    this.f19126s = null;
                    this.f19127w = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f19125r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.f19125r.getMeasuredWidth();
        } else {
            this.f19125r = null;
        }
        this.E = i12;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        boolean z9;
        if (d0Var.hasVisibleItems()) {
            l.d0 d0Var2 = d0Var;
            while (true) {
                l.k kVar = d0Var2.f17644z;
                if (kVar == this.f19121c) {
                    break;
                }
                d0Var2 = (l.d0) kVar;
            }
            l.m mVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f19124n;
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
                int size = d0Var.f17672f.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        MenuItem item = d0Var.getItem(i10);
                        if (item.isVisible() && item.getIcon() != null) {
                            z9 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z9 = false;
                        break;
                    }
                }
                e eVar = new e(this, this.f19120b, d0Var, view);
                this.J = eVar;
                eVar.f17730g = z9;
                l.s sVar = eVar.f17731i;
                if (sVar != null) {
                    sVar.o(z9);
                }
                e eVar2 = this.J;
                if (!eVar2.b()) {
                    if (eVar2.f17728e != null) {
                        eVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                l.w wVar = this.f19122e;
                if (wVar != null) {
                    wVar.A(d0Var);
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
        if (this.f19128x && !g() && (kVar = this.f19121c) != null && this.f19124n != null && this.K == null) {
            kVar.i();
            if (!kVar.f17675j.isEmpty()) {
                g gVar = new g(this, new e(this, this.f19120b, this.f19121c, this.f19125r));
                this.K = gVar;
                ((View) this.f19124n).post(gVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
