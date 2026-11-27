package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mkb implements fd {
    public final byte a;
    public final okb b;

    public mkb(okb okbVar, byte b) {
        this.a = b;
        this.b = okbVar;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        okb okbVar = this.b;
        switch (b) {
            case 0:
                okbVar.a();
                return;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(okbVar.getContext());
                String M0 = ob6.M0(2131743631, null);
                id idVar2 = alertDialog$Builder.a;
                idVar2.U = M0;
                idVar2.S = ob6.M0(2131689472, null);
                alertDialog$Builder.j(ob6.M0(2131751617, null), new mkb(okbVar, (byte) 2));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.o();
                return;
            default:
                id idVar3 = new id(3, null, okbVar.getContext());
                idVar3.j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(okbVar.d).sendRequest(deleteaccount, new isa(okbVar, idVar3, (byte) 12));
                idVar3.show();
                return;
        }
    }
}
