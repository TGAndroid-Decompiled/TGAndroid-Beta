package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p4 implements RequestDelegate {
    public final int f24698a;
    public final long f24699b;
    public final Object f24700c;

    public p4(Object obj, long j10, int i3) {
        this.f24698a = i3;
        this.f24700c = obj;
        this.f24699b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24698a) {
            case 0:
                g5 g5Var = (g5) this.f24700c;
                ArrayList arrayList = g5Var.f22665x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    if (this.f24699b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        g5Var.h = true;
                        if (!arrayList.isEmpty() && g5Var.f22662r) {
                            g5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        g5Var.getUserConfig().f22853r = (int) (System.currentTimeMillis() / 1000);
                        g5Var.getUserConfig().v(false);
                        g0.h3(new x4(g5Var, 6));
                        if (r2.f25040a) {
                            a8.b("load contacts don't change");
                            return;
                        }
                        return;
                    }
                    g5Var.getUserConfig().h = contacts_contacts.saved_count;
                    g5Var.getUserConfig().v(false);
                    g0.h3(new vf(g5Var, contacts_contacts.users, 0, contacts_contacts.contacts, 3));
                    return;
                }
                return;
            case 1:
                ld ldVar = (ld) this.f24700c;
                if (tL_error == null) {
                    g0.h3(new a4(ldVar, this.f24699b, tLObject, 1));
                    return;
                }
                return;
            case 2:
                g0.h3(new zq((nv) this.f24700c, tLObject, this.f24699b, 4));
                return;
            case 3:
                vv vvVar = (vv) this.f24700c;
                long j10 = this.f24699b;
                if (j10 != 0) {
                    vvVar.getMessagesStorage().q1(j10);
                    return;
                } else {
                    vvVar.getClass();
                    return;
                }
            default:
                yy yyVar = (yy) this.f24700c;
                if (tL_error == null) {
                    yyVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.f24699b;
                if (j11 != 0) {
                    yyVar.getMessagesStorage().q1(j11);
                    return;
                } else {
                    yyVar.getClass();
                    return;
                }
        }
    }
}
