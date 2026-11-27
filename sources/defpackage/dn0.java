package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class dn0 extends nx0 {
    public static dn0 o1;
    public final an0 l1;
    public final t2a m1;
    public boolean n1;

    public dn0(Activity activity, ao0 ao0Var, t2a t2aVar, vnb vnbVar, boolean z) {
        super(1, vnbVar, (Context) activity, true);
        boolean z2;
        boolean z3;
        this.m1 = t2aVar;
        this.w0 = false;
        this.v0 = false;
        this.T0 = false;
        s0(0);
        J();
        if (vm2.h(aob.v0(aob.h5, this.J0)) > 0.699999988079071d) {
            z2 = true;
        } else {
            z2 = false;
        }
        hl.l3(this, z2);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.n1 = z3;
        an0 an0Var = new an0(this, getContext(), t2aVar, vnbVar, ao0Var);
        this.l1 = an0Var;
        an0Var.setOverScrollMode(2);
        an0Var.setClipToPadding(false);
        an0Var.setAdapter(new bn0(ao0Var, t2aVar));
        an0Var.setPosition(0);
        this.O = an0Var;
        ao0Var.o2 = new zm0(this, (byte) 0);
        ao0Var.m2 = new qx6(this, t2aVar, (byte) 9);
        t2aVar.p2 = new cn0(this, ao0Var, vnbVar);
        t2aVar.n2 = new zm0(this, (byte) 1);
        if (!z) {
            uc7.s1(this.a).O1().T();
        }
        v21.a(this.c, new py((byte) 1));
    }

    public static void E0(e eVar, vnb vnbVar, long j, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        e eVar2;
        if (o1 != null) {
            return;
        }
        boolean z = vnbVar instanceof x53;
        if (z) {
            eVar2 = new qu0(eVar);
        } else {
            eVar2 = eVar;
        }
        dn0 dn0Var = new dn0(eVar.getParentActivity(), new ao0(eVar2, j, prepaidGiveaway), new t2a(eVar2, j), eVar2.getResourceProvider(), z);
        dn0Var.show();
        o1 = dn0Var;
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final void H() {
        super.H();
        o1 = null;
    }

    @Override
    public final void Z(Configuration configuration) {
        boolean z;
        this.m1.Z(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        this.n1 = z;
    }

    @Override
    public final void onBackPressed() {
        String M0;
        an0 an0Var = this.l1;
        if (an0Var.getCurrentPosition() > 0) {
            t2a t2aVar = this.m1;
            HashSet hashSet = t2aVar.Z1;
            int size = hashSet.size();
            HashSet hashSet2 = t2aVar.a2;
            if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
                if (this.d) {
                    hl.t1(t2aVar.b);
                }
                an0Var.F(0);
                return;
            }
            byte b = t2aVar.m2;
            Context context = t2aVar.getContext();
            vnb vnbVar = t2aVar.J0;
            o2a o2aVar = new o2a(t2aVar, (byte) 0);
            o2a o2aVar2 = new o2a(t2aVar, (byte) 6);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
            String M02 = ob6.M0(2131743490, "UnsavedChanges");
            id idVar = alertDialog$Builder.a;
            idVar.S = M02;
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        M0 = "";
                    } else {
                        M0 = ob6.M0(2131753589, "BoostingApplyChangesCountries");
                    }
                } else {
                    M0 = ob6.M0(2131753590, "BoostingApplyChangesChannels");
                }
            } else {
                M0 = ob6.M0(2131753588, "BoostingApplyChangesUsers");
            }
            idVar.U = M0;
            alertDialog$Builder.j(ob6.M0(2131754209, "ApplyTheme"), new tg0(o2aVar, (byte) 3));
            alertDialog$Builder.g(ob6.M0(2131751371, "Discard"), new tg0(o2aVar2, (byte) 4));
            alertDialog$Builder.o();
            return;
        }
        super.onBackPressed();
    }
}
