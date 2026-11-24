package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class jx7 implements RequestDelegate {
    public final byte a;
    public final lx7 b;

    public jx7(lx7 lx7Var, byte b) {
        this.a = b;
        this.b = lx7Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final lx7 lx7Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new kx7(lx7Var, tLObject, tL_error));
                return;
            case 1:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        int i2;
                        switch (r3) {
                            case 0:
                                lx7 lx7Var2 = lx7Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                vx7 vx7Var = lx7Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) vx7Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new jx7(lx7Var2, (byte) 4), 8);
                                    return;
                                }
                                if (vx7Var.E == null) {
                                    vx7Var.E = new TL_account.authorizationForm();
                                }
                                lx7Var2.a();
                                return;
                            default:
                                lx7 lx7Var3 = lx7Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i2 = ((d) lx7Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(getpassword2, new jx7(lx7Var3, (byte) 3), 8);
                                    return;
                                }
                                Utilities.e.c(new pc7(lx7Var3, lx7Var3.b, lx7Var3.d, (byte) 11));
                                return;
                        }
                    }
                });
                return;
            case 2:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        int i2;
                        switch (r3) {
                            case 0:
                                lx7 lx7Var2 = lx7Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                vx7 vx7Var = lx7Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) vx7Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new jx7(lx7Var2, (byte) 4), 8);
                                    return;
                                }
                                if (vx7Var.E == null) {
                                    vx7Var.E = new TL_account.authorizationForm();
                                }
                                lx7Var2.a();
                                return;
                            default:
                                lx7 lx7Var3 = lx7Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i2 = ((d) lx7Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(getpassword2, new jx7(lx7Var3, (byte) 3), 8);
                                    return;
                                }
                                Utilities.e.c(new pc7(lx7Var3, lx7Var3.b, lx7Var3.d, (byte) 11));
                                return;
                        }
                    }
                });
                return;
            case 3:
                gl.d3(new kx7(lx7Var, tL_error, tLObject, (byte) 1));
                return;
            default:
                gl.d3(new kx7(lx7Var, tL_error, tLObject, (byte) 2));
                return;
        }
    }
}
