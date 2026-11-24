package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class pu2 extends c6 {
    public final tu2 a;

    public pu2(tu2 tu2Var) {
        this.a = tu2Var;
    }

    @Override
    public final void b(int i) {
        boolean z;
        int i2;
        int i3;
        tu2 tu2Var = this.a;
        if (i == -1) {
            tu2Var.finishFragment();
        } else if (i == 1 && tu2Var.b.getText().length() != 0) {
            TLRPC.User W1 = tu2Var.getMessagesController().W1(Long.valueOf(tu2Var.I));
            TLRPC.UserFull X1 = tu2Var.getMessagesController().X1(tu2Var.I);
            W1.first_name = tu2Var.b.getText().toString();
            W1.last_name = tu2Var.c.getText().toString();
            W1.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = tu2Var.d.getTextWithEntities();
            tu2Var.getMessagesController().c4(W1, false, false);
            bw2 contactsController = tu2Var.getContactsController();
            if (tu2Var.L && tu2Var.Y) {
                z = true;
            } else {
                z = false;
            }
            contactsController.getClass();
            TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
            tL_contacts_addContact.id = contactsController.getMessagesController().p1(W1);
            tL_contacts_addContact.first_name = W1.first_name;
            tL_contacts_addContact.last_name = W1.last_name;
            String str = W1.phone;
            tL_contacts_addContact.phone = str;
            tL_contacts_addContact.add_phone_privacy_exception = z;
            if (str == null) {
                tL_contacts_addContact.phone = "";
            } else if (str.length() > 0 && !tL_contacts_addContact.phone.startsWith("+")) {
                tL_contacts_addContact.phone = "+" + tL_contacts_addContact.phone;
            }
            if (textWithEntities != null) {
                tL_contacts_addContact.flags |= 2;
                tL_contacts_addContact.note = textWithEntities;
            }
            contactsController.getConnectionsManager().sendRequest(tL_contacts_addContact, new pm(contactsController, W1, (byte) 27), 6);
            i2 = ((d) tu2Var).currentAccount;
            oc7.r1(i2).W3.edit().putInt("dialog_bar_vis3" + tu2Var.I, 3).commit();
            tu2Var.getNotificationCenter().k(2, 1);
            tu2Var.getNotificationCenter().k(nm7.Q0, Long.valueOf(tu2Var.I));
            if (X1 != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    X1.flags2 |= 4194304;
                    X1.note = textWithEntities;
                } else {
                    X1.flags2 &= -4194305;
                    X1.note = null;
                }
                i3 = ((d) tu2Var).currentAccount;
                cf7.Y(i3).g2(X1, true);
                tu2Var.getNotificationCenter().k(nm7.E0, Long.valueOf(X1.id), X1);
            }
            tu2Var.finishFragment();
            su2 su2Var = tu2Var.P;
            if (su2Var != null) {
                su2Var.a();
            }
        }
    }
}
