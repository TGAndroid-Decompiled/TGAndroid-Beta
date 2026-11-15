package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v4 implements RequestDelegate {
    public final int f26930a;
    public final long f26931b;
    public final Object f26932c;

    public v4(Object obj, long j3, int i7) {
        this.f26930a = i7;
        this.f26932c = obj;
        this.f26931b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26930a) {
            case 0:
                g5 g5Var = (g5) this.f26932c;
                ArrayList arrayList = g5Var.f23693x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    if (this.f26931b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        g5Var.h = true;
                        if (!arrayList.isEmpty() && g5Var.f23690r) {
                            g5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        g5Var.getUserConfig().f24964r = (int) (System.currentTimeMillis() / 1000);
                        g5Var.getUserConfig().v(false);
                        g0.h3(new k4(g5Var, 6));
                        if (r2.f26206a) {
                            a8.b("load contacts don't change");
                            return;
                        }
                        return;
                    }
                    g5Var.getUserConfig().h = contacts_contacts.saved_count;
                    g5Var.getUserConfig().v(false);
                    g0.h3(new cg(g5Var, contacts_contacts.users, 0, contacts_contacts.contacts, 3));
                    return;
                }
                return;
            case 1:
                rd rdVar = (rd) this.f26932c;
                if (tL_error == null) {
                    g0.h3(new a4(rdVar, this.f26931b, tLObject, 1));
                    return;
                }
                return;
            case 2:
                g0.h3(new dr((tv) this.f26932c, tLObject, this.f26931b, 4));
                return;
            case 3:
                bw bwVar = (bw) this.f26932c;
                long j3 = this.f26931b;
                if (j3 != 0) {
                    bwVar.getMessagesStorage().q1(j3);
                    return;
                } else {
                    bwVar.getClass();
                    return;
                }
            default:
                ez ezVar = (ez) this.f26932c;
                if (tL_error == null) {
                    ezVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.f26931b;
                if (j10 != 0) {
                    ezVar.getMessagesStorage().q1(j10);
                    return;
                } else {
                    ezVar.getClass();
                    return;
                }
        }
    }
}
