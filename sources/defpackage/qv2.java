package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qv2 implements RequestDelegate {
    public final byte a;
    public final long b;
    public final Object c;

    public qv2(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                bw2 bw2Var = (bw2) obj;
                ArrayList arrayList = bw2Var.x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    if (j != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        bw2Var.h = true;
                        if (!arrayList.isEmpty() && bw2Var.r) {
                            bw2Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        bw2Var.getUserConfig().r = (int) (System.currentTimeMillis() / 1000);
                        bw2Var.getUserConfig().u(false);
                        gm.c3(new hv2(bw2Var, (byte) 6));
                        if (e21.a) {
                            fc4.b("load contacts don't change");
                            return;
                        }
                        return;
                    }
                    bw2Var.getUserConfig().h = contacts_contacts.saved_count;
                    bw2Var.getUserConfig().u(false);
                    gm.c3(new sv2(bw2Var, contacts_contacts.users, 0, contacts_contacts.contacts, (byte) 0));
                    return;
                }
                return;
            case 1:
                pc6 pc6Var = (pc6) obj;
                if (tLObject != null) {
                    gm.c3(new of2(pc6Var, tLObject, this.b, (byte) 28));
                    return;
                }
                return;
            case 2:
                dd6 dd6Var = (dd6) obj;
                if (tL_error == null) {
                    gm.c3(new of2(dd6Var, this.b, tLObject, (byte) 1));
                    return;
                }
                return;
            case 3:
                gm.c3(new hq6((wr9) obj, tLObject, this.b, (byte) 23));
                return;
            case 4:
                dw9 dw9Var = (dw9) obj;
                if (j != 0) {
                    dw9Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 5:
                a6a a6aVar = (a6a) obj;
                if (tL_error == null) {
                    a6aVar.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    a6aVar.getMessagesStorage().n1(j);
                    return;
                }
                return;
            case 6:
                gm.c3(new hq6((h4b) obj, this.b, tLObject, (byte) 29));
                return;
            default:
                qwb qwbVar = (qwb) obj;
                qwbVar.getClass();
                gm.c3(new e4b(qwbVar, this.b, tLObject, (byte) 6));
                return;
        }
    }
}
