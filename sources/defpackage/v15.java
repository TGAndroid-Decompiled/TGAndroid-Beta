package defpackage;

import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
public final class v15 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public v15(mh6 mh6Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        this.a = (byte) 14;
        this.c = mh6Var;
        this.d = tL_error;
        this.b = str;
        this.e = str2;
        this.f = str3;
    }

    private final void a() {
        ml7 ml7Var = (ml7) this.c;
        TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) this.d;
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.b;
        d dVar = ml7Var.F1;
        ml7Var.A1 = false;
        if (tL_contacts_importedContacts != null) {
            if (!tL_contacts_importedContacts.users.isEmpty()) {
                oc7.r1(ml7Var.a).d4(tL_contacts_importedContacts.users, false);
                oc7.r1(ml7Var.a).D3(tL_contacts_importedContacts.users.get(0), null, dVar, 1);
                ml7Var.dismiss();
                return;
            } else if (dVar.getParentActivity() == null) {
                return;
            } else {
                gm.T3(ml7Var.Q1, true, 0.5f, true, true);
                gm.T3(ml7Var.R1, false, 0.5f, true, true);
                ik.u(dVar, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                return;
            }
        }
        gm.T3(ml7Var.Q1, true, 0.5f, true, true);
        gm.T3(ml7Var.R1, false, 0.5f, true, true);
        ik.c0(ml7Var.a, tL_error, dVar, tL_contacts_importContacts, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v15.run():void");
    }

    public v15(w45 w45Var, TL_wallet.sendTransfer sendtransfer, s45 s45Var, qac qacVar, y25 y25Var) {
        this.a = (byte) 3;
        this.c = w45Var;
        this.e = sendtransfer;
        this.f = s45Var;
        this.b = qacVar;
        this.d = y25Var;
    }

    public v15(g95 g95Var, he heVar, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.c = g95Var;
        this.e = heVar;
        this.d = tLObject;
        this.f = exportgroupcallinvite;
        this.b = tL_error;
    }

    public v15(y25 y25Var, s45 s45Var, TL_wallet.tonConnectChallenge tonconnectchallenge, u35 u35Var, m45 m45Var) {
        this.a = (byte) 2;
        this.d = y25Var;
        this.c = s45Var;
        this.e = tonconnectchallenge;
        this.f = u35Var;
        this.b = m45Var;
    }

    public v15(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public v15(Object obj, Object obj2, Object obj3, String str, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = str;
        this.f = obj4;
    }

    public v15(Object obj, String str, Serializable serializable, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = str;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
    }
}
