package di;

import org.telegram.messenger.j10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q3 implements Runnable {
    public final int f9561a = 0;
    public final f6 f9562b;
    public final TLRPC.TL_error f9563c;
    public final TwoStepVerificationActivity d;
    public final TLObject f9564e;
    public final boolean f9565f;

    public q3(f6 f6Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.f9562b = f6Var;
        this.f9564e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f9565f = z10;
        this.f9563c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f9561a) {
            case 0:
                TLObject tLObject = this.f9564e;
                boolean z10 = tLObject instanceof TL_account.tmpPassword;
                f6 f6Var = this.f9562b;
                TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                boolean z11 = this.f9565f;
                if (z10) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    j10.i(f6Var.f30187a).f24800y = tmppassword;
                    j10.i(f6Var.f30187a).v(false);
                    f6Var.O1(tmppassword.tmp_password, twoStepVerificationActivity, z11, null);
                    return;
                }
                f6Var.Y1(this.f9563c, twoStepVerificationActivity, z11);
                return;
            default:
                TLRPC.TL_error tL_error = this.f9563c;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                if (tL_error == null && twoStepVerificationActivity2 != null) {
                    TL_account.Password password = (TL_account.Password) this.f9564e;
                    twoStepVerificationActivity2.J = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity2.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    f6 f6Var2 = this.f9562b;
                    ConnectionsManager.getInstance(f6Var2.f30187a).sendRequest(gettmppassword, new l3(f6Var2, twoStepVerificationActivity2, this.f9565f, 0));
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
        this.f9562b = f6Var;
        this.f9563c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f9564e = tLObject;
        this.f9565f = z10;
    }
}
