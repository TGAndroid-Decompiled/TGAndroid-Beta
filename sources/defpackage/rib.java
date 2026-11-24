package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rib implements ee {
    public final byte a;
    public final tib b;

    public rib(tib tibVar, byte b) {
        this.a = b;
        this.b = tibVar;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        tib tibVar = this.b;
        switch (b) {
            case 0:
                tibVar.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tibVar.getContext());
                String M0 = jb6.M0(2131743663, null);
                he heVar2 = alertDialog$Builder.a;
                heVar2.U = M0;
                heVar2.S = jb6.M0(2131689472, null);
                alertDialog$Builder.j(jb6.M0(2131751589, null), new rib(tibVar, (byte) 2));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.o();
                return;
            default:
                he heVar3 = new he(3, null, tibVar.getContext());
                heVar3.j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(tibVar.d).sendRequest(deleteaccount, new ara(tibVar, heVar3, (byte) 11));
                heVar3.show();
                return;
        }
    }
}
