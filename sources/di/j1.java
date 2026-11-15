package di;

import org.telegram.messenger.m10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j1 implements Runnable {
    public final int f8839a = 0;
    public final c6 f8840b;
    public final TLRPC.TL_error f8841c;
    public final TwoStepVerificationActivity d;
    public final TLObject f8842e;
    public final boolean f8843f;

    public j1(c6 c6Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.f8840b = c6Var;
        this.f8842e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f8843f = z10;
        this.f8841c = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f8839a) {
            case 0:
                TLObject tLObject = this.f8842e;
                boolean z10 = tLObject instanceof TL_account.tmpPassword;
                c6 c6Var = this.f8840b;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                boolean z11 = this.f8843f;
                if (z10) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    m10.i(c6Var.f29679a).f24964y = tmppassword;
                    m10.i(c6Var.f29679a).v(false);
                    c6Var.J1(tmppassword.tmp_password, twoStepVerificationActivity2, z11, null);
                    return;
                }
                c6Var.Q1(this.f8841c, twoStepVerificationActivity2, z11);
                return;
            default:
                if (this.f8841c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.f8842e;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    c6 c6Var2 = this.f8840b;
                    ConnectionsManager.getInstance(c6Var2.f29679a).sendRequest(gettmppassword, new j3(c6Var2, twoStepVerificationActivity, this.f8843f, 0));
                    return;
                }
                return;
        }
    }

    public j1(c6 c6Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.f8840b = c6Var;
        this.f8841c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f8842e = tLObject;
        this.f8843f = z10;
    }
}
