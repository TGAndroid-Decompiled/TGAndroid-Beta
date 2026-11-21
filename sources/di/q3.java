package di;

import org.telegram.messenger.j10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q3 implements Runnable {
    public final int f9594a = 0;
    public final f6 f9595b;
    public final TLRPC.TL_error f9596c;
    public final TwoStepVerificationActivity d;
    public final TLObject f9597e;
    public final boolean f9598f;

    public q3(f6 f6Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.f9595b = f6Var;
        this.f9597e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f9598f = z10;
        this.f9596c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f9594a) {
            case 0:
                TLObject tLObject = this.f9597e;
                boolean z10 = tLObject instanceof TL_account.tmpPassword;
                f6 f6Var = this.f9595b;
                TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                boolean z11 = this.f9598f;
                if (z10) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    j10.i(f6Var.f30170a).f24828y = tmppassword;
                    j10.i(f6Var.f30170a).v(false);
                    f6Var.O1(tmppassword.tmp_password, twoStepVerificationActivity, z11, null);
                    return;
                }
                f6Var.Y1(this.f9596c, twoStepVerificationActivity, z11);
                return;
            default:
                TLRPC.TL_error tL_error = this.f9596c;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                if (tL_error == null && twoStepVerificationActivity2 != null) {
                    TL_account.Password password = (TL_account.Password) this.f9597e;
                    twoStepVerificationActivity2.J = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity2.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    f6 f6Var2 = this.f9595b;
                    ConnectionsManager.getInstance(f6Var2.f30170a).sendRequest(gettmppassword, new l3(f6Var2, twoStepVerificationActivity2, this.f9598f, 0));
                    return;
                }
                if (twoStepVerificationActivity2 != null) {
                    twoStepVerificationActivity2.t0();
                }
                if (tL_error != null) {
                    str = tL_error.text;
                } else {
                    str = "NULL_ERROR";
                }
                org.telegram.ui.Components.lc.c0(str);
                return;
        }
    }

    public q3(f6 f6Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.f9595b = f6Var;
        this.f9596c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f9597e = tLObject;
        this.f9598f = z10;
    }
}
