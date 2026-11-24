package defpackage;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;
public final class bd6 implements Runnable {
    public final byte a = 1;
    public final gd6 b;
    public final TLRPC.TL_error c;
    public final String d;
    public final String e;
    public final TLObject f;

    public bd6(gd6 gd6Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = gd6Var;
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
        gd6 gd6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    gd6Var.s = password;
                    TwoStepVerificationActivity.e0(password);
                    gd6Var.n(str2, str);
                    return;
                }
                return;
            default:
                mf6 mf6Var = gd6Var.H;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i = ((d) mf6Var).currentAccount;
                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new ed6(gd6Var, str2, str, (byte) 1), 8);
                    return;
                }
                mf6Var.x1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
                    alertDialog$Builder.j(k96.M0(2131751759, null), new h45(gd6Var, tLObject, (byte) 18));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    hd hdVar = alertDialog$Builder.a;
                    if (isEmpty) {
                        hdVar.U = k96.M0(2131742536, null);
                    } else {
                        hdVar.U = k96.M0(2131742541, null);
                    }
                    hdVar.S = k96.M0(2131743692, null);
                    Dialog showDialog = mf6Var.showDialog(hdVar);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    gd6Var.x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = k96.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = k96.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        mf6Var.y1(k96.M0(2131745878, null), k96.a0("FloodWaitTime", null, 2131750669, G));
                        return;
                    }
                    mf6Var.y1(k96.M0(2131745878, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public bd6(gd6 gd6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = gd6Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
