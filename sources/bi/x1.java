package bi;

import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class x1 implements Runnable {
    public final int f5009a = 0;
    public final k7 f5010b;
    public final TLRPC.TL_error f5011c;
    public final TwoStepVerificationActivity d;
    public final TLObject f5012e;
    public final boolean f5013f;

    public x1(k7 k7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, TLRPC.TL_error tL_error) {
        this.f5010b = k7Var;
        this.f5012e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f5013f = z9;
        this.f5011c = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f5009a) {
            case 0:
                TLObject tLObject = this.f5012e;
                boolean z9 = tLObject instanceof TL_account.tmpPassword;
                k7 k7Var = this.f5010b;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                boolean z10 = this.f5013f;
                if (z9) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    p10.i(k7Var.f28621a).f24499y = tmppassword;
                    p10.i(k7Var.f28621a).v(false);
                    k7Var.I1(tmppassword.tmp_password, twoStepVerificationActivity2, z10, null);
                    return;
                }
                k7Var.P1(this.f5011c, twoStepVerificationActivity2, z10);
                return;
            default:
                if (this.f5011c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.f5012e;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    k7 k7Var2 = this.f5010b;
                    ConnectionsManager.getInstance(k7Var2.f28621a).sendRequest(gettmppassword, new i4(k7Var2, twoStepVerificationActivity, this.f5013f, 0));
                    return;
                }
                return;
        }
    }

    public x1(k7 k7Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z9) {
        this.f5010b = k7Var;
        this.f5011c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f5012e = tLObject;
        this.f5013f = z9;
    }
}
