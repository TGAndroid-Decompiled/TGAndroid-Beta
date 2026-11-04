package ci;

import org.telegram.messenger.h10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q1 implements Runnable {
    public final int f5796a = 0;
    public final l6 f5797b;
    public final TLRPC.TL_error f5798c;
    public final TwoStepVerificationActivity d;
    public final TLObject f5799e;
    public final boolean f5800f;

    public q1(l6 l6Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.f5797b = l6Var;
        this.f5799e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f5800f = z10;
        this.f5798c = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f5796a) {
            case 0:
                TLObject tLObject = this.f5799e;
                boolean z10 = tLObject instanceof TL_account.tmpPassword;
                l6 l6Var = this.f5797b;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                boolean z11 = this.f5800f;
                if (z10) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    h10.i(l6Var.f28583a).f22859y = tmppassword;
                    h10.i(l6Var.f28583a).v(false);
                    l6Var.J1(tmppassword.tmp_password, twoStepVerificationActivity2, z11, null);
                    return;
                }
                l6Var.Q1(this.f5798c, twoStepVerificationActivity2, z11);
                return;
            default:
                if (this.f5798c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.f5799e;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    l6 l6Var2 = this.f5797b;
                    ConnectionsManager.getInstance(l6Var2.f28583a).sendRequest(gettmppassword, new s3(l6Var2, twoStepVerificationActivity, this.f5800f, 0));
                    return;
                }
                return;
        }
    }

    public q1(l6 l6Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.f5797b = l6Var;
        this.f5798c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f5799e = tLObject;
        this.f5800f = z10;
    }
}
