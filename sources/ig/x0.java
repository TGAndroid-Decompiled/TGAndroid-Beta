package ig;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m61;
import org.telegram.ui.sc0;
public final class x0 implements Utilities.Callback5, org.telegram.ui.ActionBar.z1 {
    public final int f13118a;
    public final c1 f13119b;

    public x0(c1 c1Var, int i10) {
        this.f13118a = i10;
        this.f13119b = c1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f13118a) {
            case 1:
                this.f13119b.W();
                return;
            case 2:
                this.f13119b.finishFragment();
                return;
            default:
                c1 c1Var = this.f13119b;
                c1Var.f12876b.a(1.0f);
                TLRPC.UserFull userFull = c1Var.getMessagesController().getUserFull(c1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                c1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new y0(c1Var, 1));
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        c1 c1Var = this.f13119b;
        m61 m61Var = (m61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = m61Var.d;
        if (i10 != 1 && m61Var.f28553c != c1Var.f12879n) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c1Var.getParentActivity());
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new x0(c1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                c1Var.showDialog(alertDialog$Builder.f20678a);
            }
        } else if (c1Var.f12884y != null && m61Var.f28553c != c1Var.f12879n) {
            c1Var.f12884y = null;
            c1Var.f12875a.Z2.N(true);
        } else {
            sc0 sc0Var = new sc0(8);
            if (c1Var.f12884y != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = c1Var.E;
                tL_channelLocation.geo_point = c1Var.f12884y;
                sc0Var.A0 = tL_channelLocation;
            }
            sc0Var.F0 = new ah.h0(18, c1Var, sc0Var);
            if (c1Var.f12884y == null && !TextUtils.isEmpty(c1Var.E)) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(c1Var.getParentActivity(), 3, null);
                c2Var.f20762i0 = false;
                c2Var.r(200L);
                Utilities.searchQueue.postRunnable(new v0(c1Var, sc0Var, c2Var));
                return;
            }
            c1Var.presentFragment(sc0Var);
        }
    }
}
