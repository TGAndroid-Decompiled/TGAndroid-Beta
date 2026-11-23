package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x4 implements RequestDelegate {
    public final int f27909a;
    public final long f27910b;
    public final Object f27911c;

    public x4(Object obj, long j3, int i7) {
        this.f27909a = i7;
        this.f27911c = obj;
        this.f27910b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27909a) {
            case 0:
                i5 i5Var = (i5) this.f27911c;
                ArrayList arrayList = i5Var.f24705x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    if (this.f27910b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        i5Var.h = true;
                        if (!arrayList.isEmpty() && i5Var.f24702r) {
                            i5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        i5Var.getUserConfig().f24661r = (int) (System.currentTimeMillis() / 1000);
                        i5Var.getUserConfig().v(false);
                        g0.g3(new m4(i5Var, 6));
                        if (s2.f26829a) {
                            a8.b("load contacts don't change");
                            return;
                        }
                        return;
                    }
                    i5Var.getUserConfig().h = contacts_contacts.saved_count;
                    i5Var.getUserConfig().v(false);
                    g0.g3(new dg(i5Var, contacts_contacts.users, 0, contacts_contacts.contacts, 3));
                    return;
                }
                return;
            case 1:
                qd qdVar = (qd) this.f27911c;
                if (tL_error == null) {
                    g0.g3(new d4(qdVar, this.f27910b, tLObject, 1));
                    return;
                }
                return;
            case 2:
                g0.g3(new br((pv) this.f27911c, tLObject, this.f27910b, 4));
                return;
            case 3:
                xv xvVar = (xv) this.f27911c;
                long j3 = this.f27910b;
                if (j3 != 0) {
                    xvVar.getMessagesStorage().q1(j3);
                    return;
                } else {
                    xvVar.getClass();
                    return;
                }
            case 4:
                zy zyVar = (zy) this.f27911c;
                if (tL_error == null) {
                    zyVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.f27910b;
                if (j10 != 0) {
                    zyVar.getMessagesStorage().q1(j10);
                    return;
                } else {
                    zyVar.getClass();
                    return;
                }
            default:
                d00 d00Var = (d00) this.f27911c;
                d00Var.getClass();
                g0.g3(new br(d00Var, this.f27910b, tLObject, 6));
                return;
        }
    }
}
