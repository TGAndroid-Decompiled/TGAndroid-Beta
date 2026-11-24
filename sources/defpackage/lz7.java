package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class lz7 implements RequestDelegate {
    public final byte a;
    public final nz7 b;

    public lz7(nz7 nz7Var, byte b) {
        this.a = b;
        this.b = nz7Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final nz7 nz7Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new mz7(nz7Var, tLObject, tL_error));
                return;
            case 1:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        int i2;
                        switch (r3) {
                            case 0:
                                nz7 nz7Var2 = nz7Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                xz7 xz7Var = nz7Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) xz7Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new lz7(nz7Var2, (byte) 4), 8);
                                    return;
                                }
                                if (xz7Var.E == null) {
                                    xz7Var.E = new TL_account.authorizationForm();
                                }
                                nz7Var2.a();
                                return;
                            default:
                                nz7 nz7Var3 = nz7Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i2 = ((d) nz7Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(getpassword2, new lz7(nz7Var3, (byte) 3), 8);
                                    return;
                                }
                                Utilities.e.c(new ud7((byte) 14, nz7Var3, nz7Var3.b, nz7Var3.d));
                                return;
                        }
                    }
                });
                return;
            case 2:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        int i2;
                        switch (r3) {
                            case 0:
                                nz7 nz7Var2 = nz7Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                xz7 xz7Var = nz7Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) xz7Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new lz7(nz7Var2, (byte) 4), 8);
                                    return;
                                }
                                if (xz7Var.E == null) {
                                    xz7Var.E = new TL_account.authorizationForm();
                                }
                                nz7Var2.a();
                                return;
                            default:
                                nz7 nz7Var3 = nz7Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i2 = ((d) nz7Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(getpassword2, new lz7(nz7Var3, (byte) 3), 8);
                                    return;
                                }
                                Utilities.e.c(new ud7((byte) 14, nz7Var3, nz7Var3.b, nz7Var3.d));
                                return;
                        }
                    }
                });
                return;
            case 3:
                gm.c3(new mz7(nz7Var, tL_error, tLObject, (byte) 1));
                return;
            default:
                gm.c3(new mz7(nz7Var, tL_error, tLObject, (byte) 2));
                return;
        }
    }
}
