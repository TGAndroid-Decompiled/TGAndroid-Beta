package defpackage;

import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
public final class vz4 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public vz4(mf6 mf6Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        this.a = (byte) 14;
        this.c = mf6Var;
        this.d = tL_error;
        this.b = str;
        this.e = str2;
        this.f = str3;
    }

    private final void a() {
        jj7 jj7Var = (jj7) this.c;
        TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) this.d;
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.b;
        d dVar = jj7Var.F1;
        jj7Var.A1 = false;
        if (tL_contacts_importedContacts != null) {
            if (!tL_contacts_importedContacts.users.isEmpty()) {
                na7.q1(jj7Var.a).a4(tL_contacts_importedContacts.users, false);
                na7.q1(jj7Var.a).A3(tL_contacts_importedContacts.users.get(0), null, dVar, 1);
                jj7Var.dismiss();
                return;
            } else if (dVar.getParentActivity() == null) {
                return;
            } else {
                gl.U3(jj7Var.Q1, true, 0.5f, true, true);
                gl.U3(jj7Var.R1, false, 0.5f, true, true);
                ij.u(dVar, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                return;
            }
        }
        gl.U3(jj7Var.Q1, true, 0.5f, true, true);
        gl.U3(jj7Var.R1, false, 0.5f, true, true);
        ij.c0(jj7Var.a, tL_error, dVar, tL_contacts_importContacts, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz4.run():void");
    }

    public vz4(w25 w25Var, TL_wallet.sendTransfer sendtransfer, s25 s25Var, p8c p8cVar, y05 y05Var) {
        this.a = (byte) 3;
        this.c = w25Var;
        this.e = sendtransfer;
        this.f = s25Var;
        this.b = p8cVar;
        this.d = y05Var;
    }

    public vz4(h75 h75Var, hd hdVar, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.c = h75Var;
        this.e = hdVar;
        this.d = tLObject;
        this.f = exportgroupcallinvite;
        this.b = tL_error;
    }

    public vz4(y05 y05Var, s25 s25Var, TL_wallet.tonConnectChallenge tonconnectchallenge, x15 x15Var, m25 m25Var) {
        this.a = (byte) 2;
        this.d = y05Var;
        this.c = s25Var;
        this.e = tonconnectchallenge;
        this.f = x15Var;
        this.b = m25Var;
    }

    public vz4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public vz4(Object obj, Object obj2, Object obj3, String str, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = str;
        this.f = obj4;
    }

    public vz4(Object obj, String str, Serializable serializable, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = str;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
    }
}
