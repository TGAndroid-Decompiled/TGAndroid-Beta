package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s4 implements RequestDelegate {
    public final int f18061a;
    public final long f18062b;
    public final Object f18063c;

    public s4(Object obj, long j10, int i10) {
        this.f18061a = i10;
        this.f18063c = obj;
        this.f18062b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18061a) {
            case 0:
                i5 i5Var = (i5) this.f18063c;
                ArrayList arrayList = i5Var.f16231x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    if (this.f18062b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        i5Var.h = true;
                        if (!arrayList.isEmpty() && i5Var.f16228r) {
                            i5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        i5Var.getUserConfig().f15529r = (int) (System.currentTimeMillis() / 1000);
                        i5Var.getUserConfig().v(false);
                        i0.g3(new a5(i5Var, 6));
                        if (v2.f18578a) {
                            f8.b("load contacts don't change");
                            return;
                        }
                        return;
                    }
                    i5Var.getUserConfig().h = contacts_contacts.saved_count;
                    i5Var.getUserConfig().v(false);
                    i0.g3(new dg(i5Var, contacts_contacts.users, 0, contacts_contacts.contacts, 3));
                    return;
                }
                return;
            case 1:
                od odVar = (od) this.f18063c;
                if (tL_error == null) {
                    i0.g3(new d4(odVar, this.f18062b, tLObject, 1));
                    return;
                }
                return;
            case 2:
                i0.g3(new pr((hw) this.f18063c, tLObject, this.f18062b, 4));
                return;
            case 3:
                pw pwVar = (pw) this.f18063c;
                long j10 = this.f18062b;
                if (j10 != 0) {
                    pwVar.getMessagesStorage().q1(j10);
                    return;
                } else {
                    pwVar.getClass();
                    return;
                }
            default:
                rz rzVar = (rz) this.f18063c;
                if (tL_error == null) {
                    rzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.f18062b;
                if (j11 != 0) {
                    rzVar.getMessagesStorage().q1(j11);
                    return;
                } else {
                    rzVar.getClass();
                    return;
                }
        }
    }
}
