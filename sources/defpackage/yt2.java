package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class yt2 extends d6 {
    public final cu2 a;

    public yt2(cu2 cu2Var) {
        this.a = cu2Var;
    }

    @Override
    public final void b(int i) {
        boolean z;
        int i2;
        int i3;
        cu2 cu2Var = this.a;
        if (i == -1) {
            cu2Var.finishFragment();
        } else if (i == 1 && cu2Var.b.getText().length() != 0) {
            TLRPC.User X1 = cu2Var.getMessagesController().X1(Long.valueOf(cu2Var.I));
            TLRPC.UserFull Y1 = cu2Var.getMessagesController().Y1(cu2Var.I);
            X1.first_name = cu2Var.b.getText().toString();
            X1.last_name = cu2Var.c.getText().toString();
            X1.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = cu2Var.d.getTextWithEntities();
            cu2Var.getMessagesController().i4(X1, false, false);
            lv2 contactsController = cu2Var.getContactsController();
            if (cu2Var.L && cu2Var.Y) {
                z = true;
            } else {
                z = false;
            }
            contactsController.getClass();
            TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
            tL_contacts_addContact.id = contactsController.getMessagesController().q1(X1);
            tL_contacts_addContact.first_name = X1.first_name;
            tL_contacts_addContact.last_name = X1.last_name;
            String str = X1.phone;
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
            contactsController.getConnectionsManager().sendRequest(tL_contacts_addContact, new ql(contactsController, X1, (byte) 27), 6);
            i2 = ((e) cu2Var).currentAccount;
            uc7.s1(i2).X3.edit().putInt("dialog_bar_vis3" + cu2Var.I, 3).commit();
            cu2Var.getNotificationCenter().k(2, 1);
            cu2Var.getNotificationCenter().k(jn7.Q0, Long.valueOf(cu2Var.I));
            if (Y1 != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    Y1.flags2 |= 4194304;
                    Y1.note = textWithEntities;
                } else {
                    Y1.flags2 &= -4194305;
                    Y1.note = null;
                }
                i3 = ((e) cu2Var).currentAccount;
                kf7.a0(i3).l2(Y1, true);
                cu2Var.getNotificationCenter().k(jn7.E0, Long.valueOf(Y1.id), Y1);
            }
            cu2Var.finishFragment();
            bu2 bu2Var = cu2Var.P;
            if (bu2Var != null) {
                bu2Var.a();
            }
        }
    }
}
