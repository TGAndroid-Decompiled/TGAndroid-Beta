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
    public final Context f16962a;
    public Context f16963b;
    public l.k f16964c;
    public final LayoutInflater d;
    public l.w f16965e;
    public l.z f16967n;
    public h f16968r;
    public Drawable f16969s;
    public boolean v;
    public boolean f16970w;
    public boolean f16971x;
    public int f16972y;
    public final int f16966f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray D = new SparseBooleanArray();
    public final android.support.v4.media.c I = new android.support.v4.media.c(this, 25);

    public i(Context context) {
        this.f16962a = context;
        this.d = LayoutInflater.from(context);
    }

    public final View a(l.m mVar, View view, ViewGroup viewGroup) {
        l.y yVar;
        View actionView = mVar.getActionView();
        int i9 = 0;
        if (actionView == null || mVar.e()) {
            if (view instanceof l.y) {
                yVar = (l.y) view;
            } else {
                yVar = (l.y) this.d.inflate(this.h, viewGroup, false);
            }
            yVar.b(mVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f16967n);
            if (this.H == null) {
                this.H = new f(this);
            }
            actionMenuItemView.setPopupCallback(this.H);
            actionView = (View) yVar;
        }
        if (mVar.C) {
            i9 = 8;
        }
        actionView.setVisibility(i9);
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
    public final void c(l.k kVar, boolean z10) {
        f();
        e eVar = this.F;
        if (eVar != null && eVar.b()) {
            eVar.f16617i.dismiss();
        }
        l.w wVar = this.f16965e;
        if (wVar != null) {
            wVar.c(kVar, z10);
        }
    }

    @Override
    public final boolean d() {
        ArrayList arrayList;
        int i9;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        i iVar = this;
        l.k kVar = iVar.f16964c;
        if (kVar != null) {
            arrayList = kVar.l();
            i9 = arrayList.size();
        } else {
            arrayList = null;
            i9 = 0;
        }
        int i11 = iVar.B;
        int i12 = iVar.A;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) iVar.f16967n;
        int i13 = 0;
        boolean z14 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= i9) {
                break;
            }
            l.m mVar = (l.m) arrayList.get(i13);
            int i16 = mVar.f16599y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z14 = true;
            }
            if (iVar.C && mVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (iVar.f16970w && (z14 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = iVar.D;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i9) {
            l.m mVar2 = (l.m) arrayList.get(i18);
            int i20 = mVar2.f16599y;
            if ((i20 & 2) == i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i21 = mVar2.f16579b;
            if (z11) {
                View a2 = iVar.a(mVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
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
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    View a3 = iVar.a(mVar2, null, viewGroup);
                    a3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a3.getMeasuredWidth();
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
                        if (mVar3.f16579b == i21) {
                            if ((mVar3.f16598x & 32) == 32) {
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
        int i9;
        l.m mVar;
        ViewGroup viewGroup = (ViewGroup) this.f16967n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.k kVar = this.f16964c;
            if (kVar != null) {
                kVar.i();
                ArrayList l10 = this.f16964c.l();
                int size = l10.size();
                i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    l.m mVar2 = (l.m) l10.get(i10);
                    if ((mVar2.f16598x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i9);
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
                            ((ViewGroup) this.f16967n).addView(a2, i9);
                        }
                        i9++;
                    }
                }
            } else {
                i9 = 0;
            }
            while (i9 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i9) == this.f16968r) {
                    i9++;
                } else {
                    viewGroup.removeViewAt(i9);
                }
            }
        }
        ((View) this.f16967n).requestLayout();
        l.k kVar2 = this.f16964c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f16560i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                l.n nVar = ((l.m) arrayList2.get(i11)).A;
            }
        }
        l.k kVar3 = this.f16964c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f16561j;
        }
        if (this.f16970w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.m) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f16968r == null) {
                this.f16968r = new h(this, this.f16962a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f16968r.getParent();
            if (viewGroup3 != this.f16967n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f16968r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f16967n;
                h hVar = this.f16968r;
                actionMenuView.getClass();
                k i12 = ActionMenuView.i();
                i12.f16983a = true;
                actionMenuView.addView(hVar, i12);
            }
        } else {
            h hVar2 = this.f16968r;
            if (hVar2 != null) {
                ViewParent parent = hVar2.getParent();
                l.z zVar = this.f16967n;
                if (parent == zVar) {
                    ((ViewGroup) zVar).removeView(this.f16968r);
                }
            }
        }
        ((ActionMenuView) this.f16967n).setOverflowReserved(this.f16970w);
    }

    public final boolean f() {
        l.z zVar;
        g gVar = this.G;
        if (gVar != null && (zVar = this.f16967n) != null) {
            ((View) zVar).removeCallbacks(gVar);
            this.G = null;
            return true;
        }
        e eVar = this.E;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f16617i.dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean g() {
        e eVar = this.E;
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
        this.f16963b = context;
        LayoutInflater.from(context);
        this.f16964c = kVar;
        Resources resources = context.getResources();
        if (!this.f16971x) {
            this.f16970w = true;
        }
        int i9 = 2;
        this.f16972y = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
            if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                if (i10 >= 360) {
                    i9 = 3;
                }
            } else {
                i9 = 4;
            }
        } else {
            i9 = 5;
        }
        this.B = i9;
        int i12 = this.f16972y;
        if (this.f16970w) {
            if (this.f16968r == null) {
                h hVar = new h(this, this.f16962a);
                this.f16968r = hVar;
                if (this.v) {
                    hVar.setImageDrawable(this.f16969s);
                    this.f16969s = null;
                    this.v = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f16968r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.f16968r.getMeasuredWidth();
        } else {
            this.f16968r = null;
        }
        this.A = i12;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            l.d0 d0Var2 = d0Var;
            while (true) {
                l.k kVar = d0Var2.f16530z;
                if (kVar == this.f16964c) {
                    break;
                }
                d0Var2 = (l.d0) kVar;
            }
            l.m mVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f16967n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i9 = 0;
                while (true) {
                    if (i9 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i9);
                    if ((childAt instanceof l.y) && ((l.y) childAt).getItemData() == mVar) {
                        view = childAt;
                        break;
                    }
                    i9++;
                }
            }
            if (view != null) {
                d0Var.A.getClass();
                int size = d0Var.f16558f.size();
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
                e eVar = new e(this, this.f16963b, d0Var, view);
                this.F = eVar;
                eVar.f16616g = z10;
                l.s sVar = eVar.f16617i;
                if (sVar != null) {
                    sVar.o(z10);
                }
                e eVar2 = this.F;
                if (!eVar2.b()) {
                    if (eVar2.f16614e != null) {
                        eVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                l.w wVar = this.f16965e;
                if (wVar != null) {
                    wVar.j(d0Var);
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
        if (this.f16970w && !g() && (kVar = this.f16964c) != null && this.f16967n != null && this.G == null) {
            kVar.i();
            if (!kVar.f16561j.isEmpty()) {
                g gVar = new g(this, new e(this, this.f16963b, this.f16964c, this.f16968r));
                this.G = gVar;
                ((View) this.f16967n).post(gVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
