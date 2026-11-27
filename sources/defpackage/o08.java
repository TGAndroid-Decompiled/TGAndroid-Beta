package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
public final class o08 implements RequestDelegate {
    public final byte a;
    public final r08 b;

    public o08(r08 r08Var, byte b) {
        this.a = b;
        this.b = r08Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final r08 r08Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        int i2;
                        switch (r3) {
                            case 0:
                                r08 r08Var2 = r08Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((e) r08Var2.e).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new o08(r08Var2, (byte) 3), 8);
                                    return;
                                }
                                Utilities.e.c(new gd7(r08Var2, r08Var2.b, r08Var2.d, (byte) 19));
                                return;
                            default:
                                r08 r08Var3 = r08Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                b18 b18Var = r08Var3.e;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i2 = ((e) b18Var).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(getpassword2, new o08(r08Var3, (byte) 4), 8);
                                    return;
                                }
                                if (b18Var.E == null) {
                                    b18Var.E = new TL_account.authorizationForm();
                                }
                                r08Var3.a();
                                return;
                        }
                    }
                });
                return;
            case 1:
                hl.c3(new p08(r08Var, tLObject, tL_error));
                return;
            case 2:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        int i2;
                        switch (r3) {
                            case 0:
                                r08 r08Var2 = r08Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((e) r08Var2.e).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new o08(r08Var2, (byte) 3), 8);
                                    return;
                                }
                                Utilities.e.c(new gd7(r08Var2, r08Var2.b, r08Var2.d, (byte) 19));
                                return;
                            default:
                                r08 r08Var3 = r08Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                b18 b18Var = r08Var3.e;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i2 = ((e) b18Var).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(getpassword2, new o08(r08Var3, (byte) 4), 8);
                                    return;
                                }
                                if (b18Var.E == null) {
                                    b18Var.E = new TL_account.authorizationForm();
                                }
                                r08Var3.a();
                                return;
                        }
                    }
                });
                return;
            case 3:
                hl.c3(new p08(r08Var, tL_error, tLObject, (byte) 1));
                return;
            default:
                hl.c3(new p08(r08Var, tL_error, tLObject, (byte) 2));
                return;
        }
    }
}
