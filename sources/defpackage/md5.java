package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class md5 extends n5c {
    public boolean e;

    @Override
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        rha rhaVar = (rha) wcd.j.a();
        qha qhaVar = (qha) wcd.k.a();
        arrayList.add(c4c.u(k96.M0(2131749148, null)));
        c4c x = c4c.x(11, k96.M0(2131749147, null));
        boolean z4 = false;
        if (rhaVar == rha.b) {
            z = true;
        } else {
            z = false;
        }
        x.L(z);
        arrayList.add(x);
        c4c x2 = c4c.x(10, k96.M0(2131749146, null));
        if (rhaVar == rha.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        x2.L(z2);
        arrayList.add(x2);
        arrayList.add(c4c.C(k96.M0(2131749145, null)));
        arrayList.add(c4c.u(k96.M0(2131749141, null)));
        c4c x3 = c4c.x(20, k96.M0(2131749140, null));
        if (qhaVar == qha.a) {
            z3 = true;
        } else {
            z3 = false;
        }
        x3.L(z3);
        arrayList.add(x3);
        c4c x4 = c4c.x(21, k96.M0(2131749139, null));
        if (qhaVar == qha.b) {
            z4 = true;
        }
        x4.L(z4);
        arrayList.add(x4);
        arrayList.add(c4c.C(null));
        arrayList.add(c4c.u(k96.M0(2131749144, null)));
        c4c i = c4c.i(30, k96.M0(2131749143, null));
        i.L(this.e);
        arrayList.add(i);
        arrayList.add(c4c.C(k96.M0(2131749142, null)));
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131749138, null);
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
        rha rhaVar;
        qha qhaVar;
        int i = c4cVar.d;
        if (i != 10 && i != 11) {
            if (i != 20 && i != 21) {
                if (i != 30) {
                    return;
                }
                this.e = !this.e;
                this.simpleActionBar.getDoneButton().a(this.e, true);
            } else {
                if (i == 21) {
                    qhaVar = qha.b;
                } else {
                    qhaVar = qha.a;
                }
                wcd.k.b(qhaVar);
                c0();
            }
        } else {
            if (i == 10) {
                rhaVar = rha.a;
            } else {
                rhaVar = rha.b;
            }
            wcd.j.b(rhaVar);
            c0();
        }
        this.a.g3.O(true);
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    public final void c0() {
        pha phaVar = this.simpleActionBar;
        sha shaVar = phaVar.n;
        if (shaVar != null) {
            phaVar.removeView(shaVar);
            phaVar.n = null;
            phaVar.k();
            phaVar.requestLayout();
        }
        this.simpleActionBar.s(k96.M0(2131745754, null)).a(this.e, false);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        c0();
        return this.fragmentView;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
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
