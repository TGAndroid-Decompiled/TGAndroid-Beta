package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s4 implements RequestDelegate {
    public final int f17871a;
    public final long f17872b;
    public final Object f17873c;

    public s4(Object obj, long j10, int i10) {
        this.f17871a = i10;
        this.f17873c = obj;
        this.f17872b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17871a) {
            case 0:
                i5 i5Var = (i5) this.f17873c;
                ArrayList arrayList = i5Var.f16078x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    if (this.f17872b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        i5Var.h = true;
                        if (!arrayList.isEmpty() && i5Var.f16075r) {
                            i5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        i5Var.getUserConfig().f15170r = (int) (System.currentTimeMillis() / 1000);
                        i5Var.getUserConfig().v(false);
                        i0.g3(new a5(i5Var, 6));
                        if (v2.f18448a) {
                            f8.b("load contacts don't change");
                            return;
                        }
                        return;
                    }
                    i5Var.getUserConfig().h = contacts_contacts.saved_count;
                    i5Var.getUserConfig().v(false);
                    i0.g3(new cg(i5Var, contacts_contacts.users, 0, contacts_contacts.contacts, 3));
                    return;
                }
                return;
            case 1:
                nd ndVar = (nd) this.f17873c;
                if (tL_error == null) {
                    i0.g3(new d4(ndVar, this.f17872b, tLObject, 1));
                    return;
                }
                return;
            case 2:
                i0.g3(new or((gw) this.f17873c, tLObject, this.f17872b, 4));
                return;
            case 3:
                ow owVar = (ow) this.f17873c;
                long j10 = this.f17872b;
                if (j10 != 0) {
                    owVar.getMessagesStorage().q1(j10);
                    return;
                } else {
                    owVar.getClass();
                    return;
                }
            default:
                qz qzVar = (qz) this.f17873c;
                if (tL_error == null) {
                    qzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.f17872b;
                if (j11 != 0) {
                    qzVar.getMessagesStorage().q1(j11);
                    return;
                } else {
                    qzVar.getClass();
                    return;
                }
        }
    }
}
