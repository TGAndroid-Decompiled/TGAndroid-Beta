package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v4 implements RequestDelegate {
    public final int f25945a;
    public final long f25946b;
    public final Object f25947c;

    public v4(Object obj, long j3, int i7) {
        this.f25945a = i7;
        this.f25947c = obj;
        this.f25946b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25945a) {
            case 0:
                g5 g5Var = (g5) this.f25947c;
                ArrayList arrayList = g5Var.f22625x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    if (this.f25946b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        g5Var.h = true;
                        if (!arrayList.isEmpty() && g5Var.f22622r) {
                            g5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        g5Var.getUserConfig().f24498r = (int) (System.currentTimeMillis() / 1000);
                        g5Var.getUserConfig().v(false);
                        g0.h3(new k4(g5Var, 6));
                        if (r2.f25216a) {
                            a8.b("load contacts don't change");
                            return;
                        }
                        return;
                    }
                    g5Var.getUserConfig().h = contacts_contacts.saved_count;
                    g5Var.getUserConfig().v(false);
                    g0.h3(new dg(g5Var, contacts_contacts.users, 0, contacts_contacts.contacts, 3));
                    return;
                }
                return;
            case 1:
                sd sdVar = (sd) this.f25947c;
                if (tL_error == null) {
                    g0.h3(new a4(sdVar, this.f25946b, tLObject, 1));
                    return;
                }
                return;
            case 2:
                g0.h3(new ir((vv) this.f25947c, tLObject, this.f25946b, 4));
                return;
            case 3:
                dw dwVar = (dw) this.f25947c;
                long j3 = this.f25946b;
                if (j3 != 0) {
                    dwVar.getMessagesStorage().q1(j3);
                    return;
                } else {
                    dwVar.getClass();
                    return;
                }
            default:
                gz gzVar = (gz) this.f25947c;
                if (tL_error == null) {
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.f25946b;
                if (j10 != 0) {
                    gzVar.getMessagesStorage().q1(j10);
                    return;
                } else {
                    gzVar.getClass();
                    return;
                }
        }
    }
}
