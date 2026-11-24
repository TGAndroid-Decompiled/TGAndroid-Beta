package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class dn0 extends fx0 {
    public static dn0 o1;
    public final an0 l1;
    public final zy9 m1;
    public boolean n1;

    public dn0(Activity activity, ao0 ao0Var, zy9 zy9Var, wjb wjbVar, boolean z) {
        super(1, wjbVar, (Context) activity, true);
        boolean z2;
        boolean z3;
        this.m1 = zy9Var;
        this.w0 = false;
        this.v0 = false;
        this.T0 = false;
        s0(0);
        K();
        if (bm2.h(bkb.v0(bkb.g5, this.J0)) > 0.699999988079071d) {
            z2 = true;
        } else {
            z2 = false;
        }
        gl.m3(this, z2);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.n1 = z3;
        an0 an0Var = new an0(this, getContext(), zy9Var, wjbVar, ao0Var);
        this.l1 = an0Var;
        an0Var.setOverScrollMode(2);
        an0Var.setClipToPadding(false);
        an0Var.setAdapter(new bn0(ao0Var, zy9Var));
        an0Var.setPosition(0);
        this.O = an0Var;
        ao0Var.o2 = new zm0(this, (byte) 0);
        ao0Var.m2 = new lv6(this, zy9Var, (byte) 9);
        zy9Var.p2 = new cn0(this, ao0Var, wjbVar);
        zy9Var.n2 = new zm0(this, (byte) 1);
        if (!z) {
            na7.q1(this.a).M1().T();
        }
        m21.a(this.c, new oy((byte) 1));
    }

    public static void D0(d dVar, wjb wjbVar, long j, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        d dVar2;
        if (o1 != null) {
            return;
        }
        boolean z = wjbVar instanceof f53;
        if (z) {
            dVar2 = new hu0(dVar);
        } else {
            dVar2 = dVar;
        }
        dn0 dn0Var = new dn0(dVar.getParentActivity(), new ao0(dVar2, j, prepaidGiveaway), new zy9(dVar2, j), dVar2.getResourceProvider(), z);
        dn0Var.show();
        o1 = dn0Var;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void I() {
        super.I();
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
            zy9 zy9Var = this.m1;
            HashSet hashSet = zy9Var.Z1;
            int size = hashSet.size();
            HashSet hashSet2 = zy9Var.a2;
            if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
                if (this.d) {
                    gl.t1(zy9Var.b);
                }
                an0Var.E(0);
                return;
            }
            byte b = zy9Var.m2;
            Context context = zy9Var.getContext();
            wjb wjbVar = zy9Var.J0;
            uy9 uy9Var = new uy9(zy9Var, (byte) 0);
            uy9 uy9Var2 = new uy9(zy9Var, (byte) 6);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
            String M02 = k96.M0(2131743596, "UnsavedChanges");
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M02;
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        M0 = "";
                    } else {
                        M0 = k96.M0(2131753593, "BoostingApplyChangesCountries");
                    }
                } else {
                    M0 = k96.M0(2131753594, "BoostingApplyChangesChannels");
                }
            } else {
                M0 = k96.M0(2131753592, "BoostingApplyChangesUsers");
            }
            hdVar.U = M0;
            alertDialog$Builder.j(k96.M0(2131754213, "ApplyTheme"), new sg0(uy9Var, (byte) 6));
            alertDialog$Builder.g(k96.M0(2131751394, "Discard"), new sg0(uy9Var2, (byte) 3));
            alertDialog$Builder.o();
            return;
        }
        super.onBackPressed();
    }
}
