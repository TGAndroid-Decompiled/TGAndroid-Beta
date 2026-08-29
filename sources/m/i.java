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
    public int A;
    public int B;
    public boolean C;
    public e E;
    public e F;
    public g G;
    public f H;
    public final Context f16561a;
    public Context f16562b;
    public l.k f16563c;
    public final LayoutInflater d;
    public l.w f16564e;
    public l.z f16566n;
    public h f16567r;
    public Drawable f16568s;
    public boolean v;
    public boolean f16569w;
    public boolean f16570x;
    public int f16571y;
    public final int f16565f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray D = new SparseBooleanArray();
    public final m5.i I = new m5.i(this, 23);

    public i(Context context) {
        this.f16561a = context;
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
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f16566n);
            if (this.H == null) {
                this.H = new f(this);
            }
            actionMenuItemView.setPopupCallback(this.H);
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
    public final void b(l.k kVar, boolean z10) {
        f();
        e eVar = this.F;
        if (eVar != null && eVar.b()) {
            eVar.f14045i.dismiss();
        }
        l.w wVar = this.f16564e;
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
        ArrayList arrayList;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        i iVar = this;
        l.k kVar = iVar.f16563c;
        if (kVar != null) {
            arrayList = kVar.l();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i12 = iVar.B;
        int i13 = iVar.A;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) iVar.f16566n;
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
            int i17 = mVar.f14027y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z14 = true;
            }
            if (iVar.C && mVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (iVar.f16569w && (z14 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = iVar.D;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            l.m mVar2 = (l.m) arrayList.get(i19);
            int i21 = mVar2.f14027y;
            if ((i21 & 2) == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i22 = mVar2.f14007b;
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
                    z12 = true;
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
                        if (mVar3.f14007b == i22) {
                            if ((mVar3.f14026x & 32) == 32) {
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
        return true;
    }

    @Override
    public final void e() {
        int i10;
        l.m mVar;
        ViewGroup viewGroup = (ViewGroup) this.f16566n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.k kVar = this.f16563c;
            if (kVar != null) {
                kVar.i();
                ArrayList l10 = this.f16563c.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.m mVar2 = (l.m) l10.get(i11);
                    if ((mVar2.f14026x & 32) == 32) {
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
                            ((ViewGroup) this.f16566n).addView(a2, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f16567r) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f16566n).requestLayout();
        l.k kVar2 = this.f16563c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f13988i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                l.n nVar = ((l.m) arrayList2.get(i12)).A;
            }
        }
        l.k kVar3 = this.f16563c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f13989j;
        }
        if (this.f16569w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.m) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f16567r == null) {
                this.f16567r = new h(this, this.f16561a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f16567r.getParent();
            if (viewGroup3 != this.f16566n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f16567r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f16566n;
                h hVar = this.f16567r;
                actionMenuView.getClass();
                k i13 = ActionMenuView.i();
                i13.f16583a = true;
                actionMenuView.addView(hVar, i13);
            }
        } else {
            h hVar2 = this.f16567r;
            if (hVar2 != null) {
                ViewParent parent = hVar2.getParent();
                l.z zVar = this.f16566n;
                if (parent == zVar) {
                    ((ViewGroup) zVar).removeView(this.f16567r);
                }
            }
        }
        ((ActionMenuView) this.f16566n).setOverflowReserved(this.f16569w);
    }

    public final boolean f() {
        l.z zVar;
        g gVar = this.G;
        if (gVar != null && (zVar = this.f16566n) != null) {
            ((View) zVar).removeCallbacks(gVar);
            this.G = null;
            return true;
        }
        e eVar = this.E;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f14045i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override
    public final void g(l.w wVar) {
        throw null;
    }

    public final boolean h() {
        e eVar = this.E;
        if (eVar != null && eVar.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(Context context, l.k kVar) {
        this.f16562b = context;
        LayoutInflater.from(context);
        this.f16563c = kVar;
        Resources resources = context.getResources();
        if (!this.f16570x) {
            this.f16569w = true;
        }
        int i10 = 2;
        this.f16571y = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.B = i10;
        int i13 = this.f16571y;
        if (this.f16569w) {
            if (this.f16567r == null) {
                h hVar = new h(this, this.f16561a);
                this.f16567r = hVar;
                if (this.v) {
                    hVar.setImageDrawable(this.f16568s);
                    this.f16568s = null;
                    this.v = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f16567r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f16567r.getMeasuredWidth();
        } else {
            this.f16567r = null;
        }
        this.A = i13;
        float f9 = resources.getDisplayMetrics().density;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            l.d0 d0Var2 = d0Var;
            while (true) {
                l.k kVar = d0Var2.f13958z;
                if (kVar == this.f16563c) {
                    break;
                }
                d0Var2 = (l.d0) kVar;
            }
            l.m mVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f16566n;
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
                int size = d0Var.f13986f.size();
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
                e eVar = new e(this, this.f16562b, d0Var, view);
                this.F = eVar;
                eVar.f14044g = z10;
                l.s sVar = eVar.f14045i;
                if (sVar != null) {
                    sVar.o(z10);
                }
                e eVar2 = this.F;
                if (!eVar2.b()) {
                    if (eVar2.f14042e != null) {
                        eVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                l.w wVar = this.f16564e;
                if (wVar != null) {
                    wVar.h(d0Var);
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
        if (this.f16569w && !h() && (kVar = this.f16563c) != null && this.f16566n != null && this.G == null) {
            kVar.i();
            if (!kVar.f13989j.isEmpty()) {
                g gVar = new g(this, new e(this, this.f16562b, this.f16563c, this.f16567r));
                this.G = gVar;
                ((View) this.f16566n).post(gVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
