package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class et2 extends c6 {
    public final it2 a;

    public et2(it2 it2Var) {
        this.a = it2Var;
    }

    @Override
    public final void b(int i) {
        boolean z;
        int i2;
        int i3;
        it2 it2Var = this.a;
        if (i == -1) {
            it2Var.finishFragment();
        } else if (i == 1 && it2Var.b.getText().length() != 0) {
            TLRPC.User V1 = it2Var.getMessagesController().V1(Long.valueOf(it2Var.I));
            TLRPC.UserFull W1 = it2Var.getMessagesController().W1(it2Var.I);
            V1.first_name = it2Var.b.getText().toString();
            V1.last_name = it2Var.c.getText().toString();
            V1.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = it2Var.d.getTextWithEntities();
            it2Var.getMessagesController().a4(V1, false, false);
            qu2 contactsController = it2Var.getContactsController();
            if (it2Var.L && it2Var.Y) {
                z = true;
            } else {
                z = false;
            }
            contactsController.getClass();
            TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
            tL_contacts_addContact.id = contactsController.getMessagesController().o1(V1);
            tL_contacts_addContact.first_name = V1.first_name;
            tL_contacts_addContact.last_name = V1.last_name;
            String str = V1.phone;
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
            contactsController.getConnectionsManager().sendRequest(tL_contacts_addContact, new pl(contactsController, V1, (byte) 27), 6);
            i2 = ((d) it2Var).currentAccount;
            na7.q1(i2).W3.edit().putInt("dialog_bar_vis3" + it2Var.I, 3).commit();
            it2Var.getNotificationCenter().k(2, 1);
            it2Var.getNotificationCenter().k(kk7.P0, Long.valueOf(it2Var.I));
            if (W1 != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    W1.flags2 |= 4194304;
                    W1.note = textWithEntities;
                } else {
                    W1.flags2 &= -4194305;
                    W1.note = null;
                }
                i3 = ((d) it2Var).currentAccount;
                ad7.Y(i3).g2(W1, true);
                it2Var.getNotificationCenter().k(kk7.D0, Long.valueOf(W1.id), W1);
            }
            it2Var.finishFragment();
            ht2 ht2Var = it2Var.P;
            if (ht2Var != null) {
                ht2Var.a();
            }
        }
    }
}
