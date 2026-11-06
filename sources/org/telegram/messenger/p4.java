package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p4 implements RequestDelegate {
    public final int f24501a;
    public final long f24502b;
    public final Object f24503c;

    public p4(Object obj, long j3, int i7) {
        this.f24501a = i7;
        this.f24503c = obj;
        this.f24502b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24501a) {
            case 0:
                g5 g5Var = (g5) this.f24503c;
                ArrayList arrayList = g5Var.f22595x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    if (this.f24502b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        g5Var.h = true;
                        if (!arrayList.isEmpty() && g5Var.f22592r) {
                            g5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        g5Var.getUserConfig().f24483r = (int) (System.currentTimeMillis() / 1000);
                        g5Var.getUserConfig().v(false);
                        g0.h3(new x4(g5Var, 6));
                        if (r2.f25191a) {
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
                sd sdVar = (sd) this.f24503c;
                if (tL_error == null) {
                    g0.h3(new a4(sdVar, this.f24502b, tLObject, 1));
                    return;
                }
                return;
            case 2:
                g0.h3(new hr((vv) this.f24503c, tLObject, this.f24502b, 4));
                return;
            case 3:
                dw dwVar = (dw) this.f24503c;
                long j3 = this.f24502b;
                if (j3 != 0) {
                    dwVar.getMessagesStorage().q1(j3);
                    return;
                } else {
                    dwVar.getClass();
                    return;
                }
            default:
                gz gzVar = (gz) this.f24503c;
                if (tL_error == null) {
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.f24502b;
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
