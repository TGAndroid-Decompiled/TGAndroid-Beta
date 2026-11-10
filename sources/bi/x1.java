package bi;

import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class x1 implements Runnable {
    public final int f5013a = 0;
    public final k7 f5014b;
    public final TLRPC.TL_error f5015c;
    public final TwoStepVerificationActivity d;
    public final TLObject f5016e;
    public final boolean f5017f;

    public x1(k7 k7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, TLRPC.TL_error tL_error) {
        this.f5014b = k7Var;
        this.f5016e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f5017f = z9;
        this.f5015c = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f5013a) {
            case 0:
                TLObject tLObject = this.f5016e;
                boolean z9 = tLObject instanceof TL_account.tmpPassword;
                k7 k7Var = this.f5014b;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                boolean z10 = this.f5017f;
                if (z9) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    p10.i(k7Var.f28669a).f24503y = tmppassword;
                    p10.i(k7Var.f28669a).v(false);
                    k7Var.I1(tmppassword.tmp_password, twoStepVerificationActivity2, z10, null);
                    return;
                }
                k7Var.P1(this.f5015c, twoStepVerificationActivity2, z10);
                return;
            default:
                if (this.f5015c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.f5016e;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    k7 k7Var2 = this.f5014b;
                    ConnectionsManager.getInstance(k7Var2.f28669a).sendRequest(gettmppassword, new i4(k7Var2, twoStepVerificationActivity, this.f5017f, 0));
                    return;
                }
                return;
        }
    }

    public x1(k7 k7Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z9) {
        this.f5014b = k7Var;
        this.f5015c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f5016e = tLObject;
        this.f5017f = z9;
    }
}
