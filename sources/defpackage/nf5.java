package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class nf5 extends n9c {
    public boolean e;

    @Override
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        mla mlaVar = (mla) phd.j.a();
        lla llaVar = (lla) phd.k.a();
        arrayList.add(b8c.u(ob6.M0(2131749094, null)));
        b8c x = b8c.x(11, ob6.M0(2131749093, null));
        boolean z4 = false;
        if (mlaVar == mla.b) {
            z = true;
        } else {
            z = false;
        }
        x.L(z);
        arrayList.add(x);
        b8c x2 = b8c.x(10, ob6.M0(2131749092, null));
        if (mlaVar == mla.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        x2.L(z2);
        arrayList.add(x2);
        arrayList.add(b8c.C(ob6.M0(2131749091, null)));
        arrayList.add(b8c.u(ob6.M0(2131749087, null)));
        b8c x3 = b8c.x(20, ob6.M0(2131749086, null));
        if (llaVar == lla.a) {
            z3 = true;
        } else {
            z3 = false;
        }
        x3.L(z3);
        arrayList.add(x3);
        b8c x4 = b8c.x(21, ob6.M0(2131749085, null));
        if (llaVar == lla.b) {
            z4 = true;
        }
        x4.L(z4);
        arrayList.add(x4);
        arrayList.add(b8c.C(null));
        arrayList.add(b8c.u(ob6.M0(2131749090, null)));
        b8c i = b8c.i(30, ob6.M0(2131749089, null));
        i.L(this.e);
        arrayList.add(i);
        arrayList.add(b8c.C(ob6.M0(2131749088, null)));
    }

    @Override
    public final CharSequence Z() {
        return ob6.M0(2131749084, null);
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
        mla mlaVar;
        lla llaVar;
        int i = b8cVar.d;
        if (i != 10 && i != 11) {
            if (i != 20 && i != 21) {
                if (i != 30) {
                    return;
                }
                this.e = !this.e;
                this.simpleActionBar.getDoneButton().a(this.e, true);
            } else {
                if (i == 21) {
                    llaVar = lla.b;
                } else {
                    llaVar = lla.a;
                }
                phd.k.b(llaVar);
                c0();
            }
        } else {
            if (i == 10) {
                mlaVar = mla.a;
            } else {
                mlaVar = mla.b;
            }
            phd.j.b(mlaVar);
            c0();
        }
        this.a.g3.O(true);
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    public final void c0() {
        jla jlaVar = this.simpleActionBar;
        nla nlaVar = jlaVar.n;
        if (nlaVar != null) {
            jlaVar.removeView(nlaVar);
            jlaVar.n = null;
            jlaVar.l();
            jlaVar.requestLayout();
        }
        this.simpleActionBar.u(ob6.M0(2131745674, null)).a(this.e, false);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.s1();
        this.a.setSectionsDrawBackground(true);
        c0();
        return this.fragmentView;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
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
