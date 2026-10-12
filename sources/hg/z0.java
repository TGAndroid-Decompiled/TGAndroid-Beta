package hg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.u61;
import org.telegram.ui.id0;
public final class z0 implements Utilities.Callback5, org.telegram.ui.ActionBar.z1 {
    public final int f11462a;
    public final e1 f11463b;

    public z0(e1 e1Var, int i10) {
        this.f11462a = i10;
        this.f11463b = e1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f11462a) {
            case 1:
                this.f11463b.W();
                return;
            case 2:
                this.f11463b.finishFragment();
                return;
            default:
                e1 e1Var = this.f11463b;
                e1Var.f11204b.a(1.0f);
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
        e1 e1Var = this.f11463b;
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = u61Var.d;
        if (i10 != 1 && u61Var.f31069c != e1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e1Var.getParentActivity());
                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(e1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e1Var.showDialog(alertDialog$Builder.f20141a);
            }
        } else if (e1Var.f11212x != null && u61Var.f31069c != e1Var.h) {
            e1Var.f11212x = null;
            e1Var.f11203a.W2.N(true);
        } else {
            id0 id0Var = new id0(8);
            if (e1Var.f11212x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = e1Var.f11213y;
                tL_channelLocation.geo_point = e1Var.f11212x;
                id0Var.A0 = tL_channelLocation;
            }
            id0Var.F0 = new ah.b(15, e1Var, id0Var);
            if (e1Var.f11212x == null && !TextUtils.isEmpty(e1Var.f11213y)) {
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(e1Var.getParentActivity(), 3, null);
                a2Var.f20163g0 = false;
                a2Var.q(200L);
                Utilities.searchQueue.postRunnable(new x0(e1Var, id0Var, a2Var));
                return;
            }
            e1Var.presentFragment(id0Var);
        }
    }
}
