package mg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.wb;
public final class v extends z2 {
    public static v l1;
    public final r f13246i1;
    public final v1 f13247j1;
    public boolean f13248k1;

    public v(Activity activity, w0 w0Var, v1 v1Var, p6 p6Var, boolean z10) {
        super(1, (Context) activity, p6Var, true);
        boolean z11;
        this.f13247j1 = v1Var;
        this.f21617v0 = false;
        this.f21616u0 = false;
        this.T0 = false;
        v0(0);
        O();
        if (i0.b.h(t6.w0(t6.f21001h5, this.I0)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.messenger.i0.p3(this, z11);
        this.f13248k1 = getContext().getResources().getConfiguration().orientation == 2;
        r rVar = new r(this, getContext(), v1Var, p6Var, w0Var);
        this.f13246i1 = rVar;
        rVar.setOverScrollMode(2);
        rVar.setClipToPadding(false);
        rVar.setAdapter(new s(w0Var, v1Var));
        rVar.setPosition(0);
        this.N = rVar;
        w0Var.f13275l2 = new q(this, 0);
        w0Var.f13273j2 = new m4.c(2, this, v1Var);
        v1Var.f13260m2 = new t(this, w0Var, p6Var);
        v1Var.f13258k2 = new q(this, 1);
        if (!z10) {
            vp.r1(this.f21583a).O1().U();
        }
        wb.a(this.f21589c, new u(0));
    }

    public static void I0(k2 k2Var, p6 p6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        k2 k2Var2;
        if (l1 != null) {
            return;
        }
        boolean z10 = p6Var instanceof th.b;
        if (z10) {
            k2Var2 = new kg.q1(k2Var);
        } else {
            k2Var2 = k2Var;
        }
        v vVar = new v(k2Var.getParentActivity(), new w0(k2Var2, j10, prepaidGiveaway), new v1(k2Var2, j10), k2Var2.getResourceProvider(), z10);
        vVar.show();
        l1 = vVar;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final void L() {
        super.L();
        l1 = null;
    }

    @Override
    public final void c0(Configuration configuration) {
        boolean z10;
        this.f13247j1.c0(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13248k1 = z10;
    }

    @Override
    public final void onBackPressed() {
        String L0;
        r rVar = this.f13246i1;
        if (rVar.getCurrentPosition() > 0) {
            v1 v1Var = this.f13247j1;
            HashSet hashSet = v1Var.W1;
            int size = hashSet.size();
            HashSet hashSet2 = v1Var.X1;
            if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
                if (this.d) {
                    org.telegram.messenger.i0.v1(v1Var.f21586b);
                }
                rVar.E(0);
                return;
            }
            int i10 = v1Var.f13257j2;
            Context context = v1Var.getContext();
            p6 p6Var = v1Var.I0;
            p1 p1Var = new p1(v1Var, 0);
            p1 p1Var2 = new p1(v1Var, 6);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
            String L02 = cd.L0(2131743860, "UnsavedChanges");
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L02;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        L0 = "";
                    } else {
                        L0 = cd.L0(2131753596, "BoostingApplyChangesCountries");
                    }
                } else {
                    L0 = cd.L0(2131753597, "BoostingApplyChangesChannels");
                }
            } else {
                L0 = cd.L0(2131753595, "BoostingApplyChangesUsers");
            }
            x1Var.T = L0;
            alertDialog$Builder.k(cd.L0(2131754216, "ApplyTheme"), new l(p1Var, 0));
            alertDialog$Builder.h(cd.L0(2131751407, "Discard"), new ig.c0(p1Var2, 27));
            alertDialog$Builder.p();
            return;
        }
        super.onBackPressed();
    }
}
