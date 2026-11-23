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
    public final Context f20162a;
    public Context f20163b;
    public l.k f20164c;
    public final LayoutInflater d;
    public l.w f20165e;
    public l.z f20167n;
    public g f20168r;
    public Drawable f20169s;
    public boolean f20170w;
    public boolean f20171x;
    public boolean f20172y;
    public final int f20166f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray I = new SparseBooleanArray();
    public final hi.u0 N = new hi.u0(this, 13);

    public h(Context context) {
        this.f20162a = context;
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
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f20167n);
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
        l.k kVar = hVar.f20164c;
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
        ViewGroup viewGroup = (ViewGroup) hVar.f20167n;
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
            int i16 = mVar.f19318y;
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
        if (hVar.f20171x && (z14 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = hVar.I;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i7) {
            l.m mVar2 = (l.m) arrayList.get(i18);
            int i20 = mVar2.f19318y;
            if ((i20 & 2) == i10) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i21 = mVar2.f19298b;
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
                        if (mVar3.f19298b == i21) {
                            if ((mVar3.f19317x & 32) == 32) {
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
        ViewGroup viewGroup = (ViewGroup) this.f20167n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.k kVar = this.f20164c;
            if (kVar != null) {
                kVar.i();
                ArrayList l10 = this.f20164c.l();
                int size = l10.size();
                i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    l.m mVar2 = (l.m) l10.get(i10);
                    if ((mVar2.f19317x & 32) == 32) {
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
                            ((ViewGroup) this.f20167n).addView(a10, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i7) == this.f20168r) {
                    i7++;
                } else {
                    viewGroup.removeViewAt(i7);
                }
            }
        }
        ((View) this.f20167n).requestLayout();
        l.k kVar2 = this.f20164c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f19279i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                l.n nVar = ((l.m) arrayList2.get(i11)).A;
            }
        }
        l.k kVar3 = this.f20164c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f19280j;
        }
        if (this.f20171x && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.m) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f20168r == null) {
                this.f20168r = new g(this, this.f20162a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f20168r.getParent();
            if (viewGroup3 != this.f20167n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f20168r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f20167n;
                g gVar = this.f20168r;
                actionMenuView.getClass();
                j i12 = ActionMenuView.i();
                i12.f20181a = true;
                actionMenuView.addView(gVar, i12);
            }
        } else {
            g gVar2 = this.f20168r;
            if (gVar2 != null) {
                ViewParent parent = gVar2.getParent();
                l.z zVar = this.f20167n;
                if (parent == zVar) {
                    ((ViewGroup) zVar).removeView(this.f20168r);
                }
            }
        }
        ((ActionMenuView) this.f20167n).setOverflowReserved(this.f20171x);
    }

    public final boolean e() {
        l.z zVar;
        f fVar = this.L;
        if (fVar != null && (zVar = this.f20167n) != null) {
            ((View) zVar).removeCallbacks(fVar);
            this.L = null;
            return true;
        }
        d dVar = this.J;
        if (dVar != null) {
            if (dVar.b()) {
                dVar.f19336i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override
    public final void f(l.k kVar, boolean z10) {
        e();
        d dVar = this.K;
        if (dVar != null && dVar.b()) {
            dVar.f19336i.dismiss();
        }
        l.w wVar = this.f20165e;
        if (wVar != null) {
            wVar.f(kVar, z10);
        }
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
        this.f20163b = context;
        LayoutInflater.from(context);
        this.f20164c = kVar;
        Resources resources = context.getResources();
        if (!this.f20172y) {
            this.f20171x = true;
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
        if (this.f20171x) {
            if (this.f20168r == null) {
                g gVar = new g(this, this.f20162a);
                this.f20168r = gVar;
                if (this.f20170w) {
                    gVar.setImageDrawable(this.f20169s);
                    this.f20169s = null;
                    this.f20170w = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f20168r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.f20168r.getMeasuredWidth();
        } else {
            this.f20168r = null;
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
                l.k kVar = d0Var2.f19249z;
                if (kVar == this.f20164c) {
                    break;
                }
                d0Var2 = (l.d0) kVar;
            }
            l.m mVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f20167n;
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
                int size = d0Var.f19277f.size();
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
                d dVar = new d(this, this.f20163b, d0Var, view);
                this.K = dVar;
                dVar.f19335g = z10;
                l.s sVar = dVar.f19336i;
                if (sVar != null) {
                    sVar.o(z10);
                }
                d dVar2 = this.K;
                if (!dVar2.b()) {
                    if (dVar2.f19333e != null) {
                        dVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                l.w wVar = this.f20165e;
                if (wVar != null) {
                    wVar.u(d0Var);
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
        if (this.f20171x && !g() && (kVar = this.f20164c) != null && this.f20167n != null && this.L == null) {
            kVar.i();
            if (!kVar.f19280j.isEmpty()) {
                f fVar = new f(this, new d(this, this.f20163b, this.f20164c, this.f20168r));
                this.L = fVar;
                ((View) this.f20167n).post(fVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
