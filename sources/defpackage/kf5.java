package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class kf5 extends n7c {
    public boolean e;

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        tja tjaVar = (tja) yed.j.a();
        sja sjaVar = (sja) yed.k.a();
        arrayList.add(c6c.u(jb6.M0(2131749097, null)));
        c6c x = c6c.x(11, jb6.M0(2131749096, null));
        boolean z4 = false;
        if (tjaVar == tja.b) {
            z = true;
        } else {
            z = false;
        }
        x.L(z);
        arrayList.add(x);
        c6c x2 = c6c.x(10, jb6.M0(2131749095, null));
        if (tjaVar == tja.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        x2.L(z2);
        arrayList.add(x2);
        arrayList.add(c6c.C(jb6.M0(2131749094, null)));
        arrayList.add(c6c.u(jb6.M0(2131749090, null)));
        c6c x3 = c6c.x(20, jb6.M0(2131749089, null));
        if (sjaVar == sja.a) {
            z3 = true;
        } else {
            z3 = false;
        }
        x3.L(z3);
        arrayList.add(x3);
        c6c x4 = c6c.x(21, jb6.M0(2131749088, null));
        if (sjaVar == sja.b) {
            z4 = true;
        }
        x4.L(z4);
        arrayList.add(x4);
        arrayList.add(c6c.C(null));
        arrayList.add(c6c.u(jb6.M0(2131749093, null)));
        c6c i = c6c.i(30, jb6.M0(2131749092, null));
        i.L(this.e);
        arrayList.add(i);
        arrayList.add(c6c.C(jb6.M0(2131749091, null)));
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131749087, null);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        tja tjaVar;
        sja sjaVar;
        int i = c6cVar.d;
        if (i != 10 && i != 11) {
            if (i != 20 && i != 21) {
                if (i != 30) {
                    return;
                }
                this.e = !this.e;
                this.simpleActionBar.getDoneButton().a(this.e, true);
            } else {
                if (i == 21) {
                    sjaVar = sja.b;
                } else {
                    sjaVar = sja.a;
                }
                yed.k.b(sjaVar);
                d0();
            }
        } else {
            if (i == 10) {
                tjaVar = tja.a;
            } else {
                tjaVar = tja.b;
            }
            yed.j.b(tjaVar);
            d0();
        }
        this.a.g3.O(true);
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        rja rjaVar = this.simpleActionBar;
        uja ujaVar = rjaVar.n;
        if (ujaVar != null) {
            rjaVar.removeView(ujaVar);
            rjaVar.n = null;
            rjaVar.l();
            rjaVar.requestLayout();
        }
        this.simpleActionBar.s(jb6.M0(2131745680, null)).a(this.e, false);
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
