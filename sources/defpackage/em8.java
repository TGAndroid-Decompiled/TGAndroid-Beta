package defpackage;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PrivacySettingsActivity;
public final class em8 implements ee {
    public final byte a;
    public final PrivacySettingsActivity b;

    public em8(PrivacySettingsActivity privacySettingsActivity, byte b) {
        this.a = b;
        this.b = privacySettingsActivity;
    }

    public final void a() {
        int i;
        byte b = this.a;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        switch (b) {
            case 2:
                gm8 gm8Var = privacySettingsActivity.a;
                if (gm8Var != null && (i = privacySettingsActivity.s) >= 0) {
                    gm8Var.g(i);
                    return;
                }
                return;
            default:
                privacySettingsActivity.D0();
                return;
        }
    }

    @Override
    public final void r(he heVar, int i) {
        String M0;
        byte b = this.a;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        switch (b) {
            case 0:
                privacySettingsActivity.getClass();
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String M02 = jb6.M0(2131746529, "PrivacyPaymentsClearAlertTitle");
                he heVar2 = alertDialog$Builder.a;
                heVar2.S = M02;
                heVar2.U = jb6.M0(2131746531, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.j(jb6.M0(2131752036, "ClearButton"), new em8(privacySettingsActivity, (byte) 1));
                alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                privacySettingsActivity.showDialog(heVar2);
                privacySettingsActivity.showDialog(heVar2);
                TextView textView = (TextView) heVar2.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                    return;
                }
                return;
            case 1:
                privacySettingsActivity.getClass();
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.a0;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().u(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new nf2((byte) 0));
                if (zArr[0]) {
                    if (zArr[1]) {
                        M0 = jb6.M0(2131746527, "PrivacyPaymentsPaymentShippingCleared");
                    } else {
                        M0 = jb6.M0(2131746526, "PrivacyPaymentsShippingInfoCleared");
                    }
                } else if (zArr[1]) {
                    M0 = jb6.M0(2131746528, "PrivacyPaymentsPaymentInfoCleared");
                } else {
                    return;
                }
                c41.b0(privacySettingsActivity).Q(2131623982, 36, M0).j();
                return;
            case 2:
            case 3:
            default:
                he o = new AlertDialog$Builder(3, null, privacySettingsActivity.getParentActivity()).o();
                privacySettingsActivity.c = o;
                o.j0 = false;
                if (privacySettingsActivity.T != privacySettingsActivity.U) {
                    z8c userConfig = privacySettingsActivity.getUserConfig();
                    boolean z = privacySettingsActivity.U;
                    userConfig.V = z;
                    privacySettingsActivity.T = z;
                    privacySettingsActivity.getUserConfig().u(false);
                }
                bw2 contactsController = privacySettingsActivity.getContactsController();
                dm8 dm8Var = new dm8(privacySettingsActivity, (byte) 1);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    tL_contacts_deleteContacts.id.add(contactsController.getMessagesController().n1(((TLRPC.TL_contact) contactsController.f0.get(i2)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new pm(contactsController, dm8Var, (byte) 26));
                return;
            case 4:
                privacySettingsActivity.getClass();
                mh6 mh6Var = new mh6();
                dm8 dm8Var2 = new dm8(privacySettingsActivity, (byte) 2);
                mh6Var.G = (byte) 3;
                mh6Var.a = 12;
                mh6Var.e0 = dm8Var2;
                privacySettingsActivity.presentFragment(mh6Var);
                return;
        }
    }
}
