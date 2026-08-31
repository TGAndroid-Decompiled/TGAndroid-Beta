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
public final class h implements l.y {
    public int B;
    public int C;
    public boolean D;
    public d F;
    public d G;
    public f H;
    public e I;
    public final Context f13200a;
    public Context f13201b;
    public l.l f13202c;
    public final LayoutInflater d;
    public l.x f13203e;
    public l.a0 f13205n;
    public g f13206r;
    public Drawable f13207s;
    public boolean v;
    public boolean f13208w;
    public boolean f13209x;
    public int f13210y;
    public final int f13204f = 2131492867;
    public final int h = 2131492866;
    public final SparseBooleanArray E = new SparseBooleanArray();
    public final y5.h J = new y5.h(this, 24);

    public h(Context context) {
        this.f13200a = context;
        this.d = LayoutInflater.from(context);
    }

    public final View a(l.n nVar, View view, ViewGroup viewGroup) {
        l.z zVar;
        View actionView = nVar.getActionView();
        int i10 = 0;
        if (actionView == null || nVar.e()) {
            if (view instanceof l.z) {
                zVar = (l.z) view;
            } else {
                zVar = (l.z) this.d.inflate(this.h, viewGroup, false);
            }
            zVar.b(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) zVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f13205n);
            if (this.I == null) {
                this.I = new e(this);
            }
            actionMenuItemView.setPopupCallback(this.I);
            actionView = (View) zVar;
        }
        if (nVar.C) {
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
    public final boolean b(l.n nVar) {
        return false;
    }

    @Override
    public final void c(l.l lVar, boolean z4) {
        f();
        d dVar = this.G;
        if (dVar != null && dVar.b()) {
            dVar.f11458i.dismiss();
        }
        l.x xVar = this.f13203e;
        if (xVar != null) {
            xVar.c(lVar, z4);
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
        l.l lVar = hVar.f13202c;
        if (lVar != null) {
            arrayList = lVar.l();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i12 = hVar.C;
        int i13 = hVar.B;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) hVar.f13205n;
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
            l.n nVar = (l.n) arrayList.get(i14);
            int i17 = nVar.f11440y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z13 = true;
            }
            if (hVar.D && nVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (hVar.f13208w && (z13 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = hVar.E;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            l.n nVar2 = (l.n) arrayList.get(i19);
            int i21 = nVar2.f11440y;
            if ((i21 & 2) == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i22 = nVar2.f11420b;
            if (z10) {
                View a2 = hVar.a(nVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z4);
                }
                nVar2.f(z4);
            } else if ((i21 & 1) == z4) {
                boolean z14 = sparseBooleanArray.get(i22);
                if ((i18 > 0 || z14) && i13 > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    View a10 = hVar.a(nVar2, null, viewGroup);
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
                        l.n nVar3 = (l.n) arrayList.get(i23);
                        if (nVar3.f11420b == i22) {
                            if ((nVar3.f11439x & 32) == 32) {
                                i18++;
                            }
                            nVar3.f(false);
                        }
                    }
                }
                if (z11) {
                    i18--;
                }
                nVar2.f(z11);
            } else {
                nVar2.f(false);
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
        l.n nVar;
        ViewGroup viewGroup = (ViewGroup) this.f13205n;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            l.l lVar = this.f13202c;
            if (lVar != null) {
                lVar.i();
                ArrayList l10 = this.f13202c.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.n nVar2 = (l.n) l10.get(i11);
                    if ((nVar2.f11439x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof l.z) {
                            nVar = ((l.z) childAt).getItemData();
                        } else {
                            nVar = null;
                        }
                        View a2 = a(nVar2, childAt, viewGroup);
                        if (nVar2 != nVar) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f13205n).addView(a2, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f13206r) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f13205n).requestLayout();
        l.l lVar2 = this.f13202c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f11401i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                l.o oVar = ((l.n) arrayList2.get(i12)).A;
            }
        }
        l.l lVar3 = this.f13202c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f11402j;
        }
        if (this.f13208w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((l.n) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f13206r == null) {
                this.f13206r = new g(this, this.f13200a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f13206r.getParent();
            if (viewGroup3 != this.f13205n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f13206r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f13205n;
                g gVar = this.f13206r;
                actionMenuView.getClass();
                j i13 = ActionMenuView.i();
                i13.f13222a = true;
                actionMenuView.addView(gVar, i13);
            }
        } else {
            g gVar2 = this.f13206r;
            if (gVar2 != null) {
                ViewParent parent = gVar2.getParent();
                l.a0 a0Var = this.f13205n;
                if (parent == a0Var) {
                    ((ViewGroup) a0Var).removeView(this.f13206r);
                }
            }
        }
        ((ActionMenuView) this.f13205n).setOverflowReserved(this.f13208w);
    }

    public final boolean f() {
        l.a0 a0Var;
        f fVar = this.H;
        if (fVar != null && (a0Var = this.f13205n) != null) {
            ((View) a0Var).removeCallbacks(fVar);
            this.H = null;
            return true;
        }
        d dVar = this.F;
        if (dVar != null) {
            if (dVar.b()) {
                dVar.f11458i.dismiss();
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
    public final void h(l.x xVar) {
        throw null;
    }

    @Override
    public final void i(Context context, l.l lVar) {
        this.f13201b = context;
        LayoutInflater.from(context);
        this.f13202c = lVar;
        Resources resources = context.getResources();
        if (!this.f13209x) {
            this.f13208w = true;
        }
        int i10 = 2;
        this.f13210y = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        int i13 = this.f13210y;
        if (this.f13208w) {
            if (this.f13206r == null) {
                g gVar = new g(this, this.f13200a);
                this.f13206r = gVar;
                if (this.v) {
                    gVar.setImageDrawable(this.f13207s);
                    this.f13207s = null;
                    this.v = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f13206r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f13206r.getMeasuredWidth();
        } else {
            this.f13206r = null;
        }
        this.B = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override
    public final boolean j(l.e0 e0Var) {
        boolean z4;
        if (e0Var.hasVisibleItems()) {
            l.e0 e0Var2 = e0Var;
            while (true) {
                l.l lVar = e0Var2.f11371z;
                if (lVar == this.f13202c) {
                    break;
                }
                e0Var2 = (l.e0) lVar;
            }
            l.n nVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f13205n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof l.z) && ((l.z) childAt).getItemData() == nVar) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
            }
            if (view != null) {
                e0Var.A.getClass();
                int size = e0Var.f11399f.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        MenuItem item = e0Var.getItem(i11);
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
                d dVar = new d(this, this.f13201b, e0Var, view);
                this.G = dVar;
                dVar.f11457g = z4;
                l.t tVar = dVar.f11458i;
                if (tVar != null) {
                    tVar.o(z4);
                }
                d dVar2 = this.G;
                if (!dVar2.b()) {
                    if (dVar2.f11455e != null) {
                        dVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                l.x xVar = this.f13203e;
                if (xVar != null) {
                    xVar.d0(e0Var);
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
        if (this.f13208w && !g() && (lVar = this.f13202c) != null && this.f13205n != null && this.H == null) {
            lVar.i();
            if (!lVar.f11402j.isEmpty()) {
                f fVar = new f(this, new d(this, this.f13201b, this.f13202c, this.f13206r));
                this.H = fVar;
                ((View) this.f13205n).post(fVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
