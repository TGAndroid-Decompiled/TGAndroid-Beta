package defpackage;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ef6 implements Runnable {
    public final byte a = 1;
    public final if6 b;
    public final TLRPC.TL_error c;
    public final String d;
    public final String e;
    public final TLObject f;

    public ef6(if6 if6Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = if6Var;
        this.c = tL_error;
        this.d = str;
        this.e = str2;
        this.f = tLObject;
    }

    @Override
    public final void run() {
        String G;
        int i;
        byte b = this.a;
        TLObject tLObject = this.f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.c;
        if6 if6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if6Var.s = password;
                    TwoStepVerificationActivity.e0(password);
                    if6Var.n(str2, str);
                    return;
                }
                return;
            default:
                qh6 qh6Var = if6Var.H;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i = ((e) qh6Var).currentAccount;
                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new hf6(if6Var, str2, str, (byte) 1), 8);
                    return;
                }
                qh6Var.y1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
                    alertDialog$Builder.j(ob6.M0(2131751736, null), new u34(if6Var, tLObject, (byte) 23));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    id idVar = alertDialog$Builder.a;
                    if (isEmpty) {
                        idVar.U = ob6.M0(2131742430, null);
                    } else {
                        idVar.U = ob6.M0(2131742435, null);
                    }
                    idVar.S = ob6.M0(2131743586, null);
                    Dialog showDialog = qh6Var.showDialog(idVar);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    if6Var.x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = ob6.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = ob6.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.a0("FloodWaitTime", null, 2131750646, G));
                        return;
                    }
                    qh6Var.z1(ob6.M0(2131745798, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public ef6(if6 if6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = if6Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
