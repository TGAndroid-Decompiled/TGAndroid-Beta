package ig;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.l61;
import org.telegram.ui.nd0;
public final class z0 implements Utilities.Callback5, org.telegram.ui.ActionBar.z1 {
    public final int f11707a;
    public final e1 f11708b;

    public z0(e1 e1Var, int i10) {
        this.f11707a = i10;
        this.f11708b = e1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f11707a) {
            case 1:
                this.f11708b.W();
                return;
            case 2:
                this.f11708b.finishFragment();
                return;
            default:
                e1 e1Var = this.f11708b;
                e1Var.f11480b.a(1.0f);
                TLRPC.UserFull userFull = e1Var.getMessagesController().getUserFull(e1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                e1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new a1(e1Var, 1));
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        e1 e1Var = this.f11708b;
        l61 l61Var = (l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = l61Var.d;
        if (i10 != 1 && l61Var.f26948c != e1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e1Var.getParentActivity());
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(e1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e1Var.showDialog(alertDialog$Builder.f19548a);
            }
        } else if (e1Var.f11487x != null && l61Var.f26948c != e1Var.h) {
            e1Var.f11487x = null;
            e1Var.f11479a.W2.N(true);
        } else {
            nd0 nd0Var = new nd0(8);
            if (e1Var.f11487x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = e1Var.f11488y;
                tL_channelLocation.geo_point = e1Var.f11487x;
                nd0Var.A0 = tL_channelLocation;
            }
            nd0Var.F0 = new ah.h0(16, e1Var, nd0Var);
            if (e1Var.f11487x == null && !TextUtils.isEmpty(e1Var.f11488y)) {
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(e1Var.getParentActivity(), 3, null);
                a2Var.f19569g0 = false;
                a2Var.q(200L);
                Utilities.searchQueue.postRunnable(new x0(e1Var, nd0Var, a2Var));
                return;
            }
            e1Var.presentFragment(nd0Var);
        }
    }
}
