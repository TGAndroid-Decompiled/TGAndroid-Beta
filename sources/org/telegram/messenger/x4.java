package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x4 implements RequestDelegate {
    public final int f27809a;
    public final long f27810b;
    public final Object f27811c;

    public x4(Object obj, long j3, int i7) {
        this.f27809a = i7;
        this.f27811c = obj;
        this.f27810b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27809a) {
            case 0:
                i5 i5Var = (i5) this.f27811c;
                ArrayList arrayList = i5Var.f24581x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    if (this.f27810b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        i5Var.h = true;
                        if (!arrayList.isEmpty() && i5Var.f24578r) {
                            i5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        i5Var.getUserConfig().f24956r = (int) (System.currentTimeMillis() / 1000);
                        i5Var.getUserConfig().v(false);
                        g0.g3(new m4(i5Var, 6));
                        if (s2.f26694a) {
                            a8.b("load contacts don't change");
                            return;
                        }
                        return;
                    }
                    i5Var.getUserConfig().h = contacts_contacts.saved_count;
                    i5Var.getUserConfig().v(false);
                    g0.g3(new eg(i5Var, contacts_contacts.users, 0, contacts_contacts.contacts, 3));
                    return;
                }
                return;
            case 1:
                rd rdVar = (rd) this.f27811c;
                if (tL_error == null) {
                    g0.g3(new d4(rdVar, this.f27810b, tLObject, 1));
                    return;
                }
                return;
            case 2:
                g0.g3(new cr((qv) this.f27811c, tLObject, this.f27810b, 4));
                return;
            case 3:
                yv yvVar = (yv) this.f27811c;
                long j3 = this.f27810b;
                if (j3 != 0) {
                    yvVar.getMessagesStorage().q1(j3);
                    return;
                } else {
                    yvVar.getClass();
                    return;
                }
            case 4:
                az azVar = (az) this.f27811c;
                if (tL_error == null) {
                    azVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.f27810b;
                if (j10 != 0) {
                    azVar.getMessagesStorage().q1(j10);
                    return;
                } else {
                    azVar.getClass();
                    return;
                }
            default:
                f00 f00Var = (f00) this.f27811c;
                f00Var.getClass();
                g0.g3(new cr(f00Var, this.f27810b, tLObject, 6));
                return;
        }
    }
}
