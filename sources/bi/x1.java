package bi;

import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class x1 implements Runnable {
    public final int f5011a = 0;
    public final k7 f5012b;
    public final TLRPC.TL_error f5013c;
    public final TwoStepVerificationActivity d;
    public final TLObject f5014e;
    public final boolean f5015f;

    public x1(k7 k7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, TLRPC.TL_error tL_error) {
        this.f5012b = k7Var;
        this.f5014e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f5015f = z9;
        this.f5013c = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f5011a) {
            case 0:
                TLObject tLObject = this.f5014e;
                boolean z9 = tLObject instanceof TL_account.tmpPassword;
                k7 k7Var = this.f5012b;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                boolean z10 = this.f5015f;
                if (z9) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    p10.i(k7Var.f28616a).f24499y = tmppassword;
                    p10.i(k7Var.f28616a).v(false);
                    k7Var.J1(tmppassword.tmp_password, twoStepVerificationActivity2, z10, null);
                    return;
                }
                k7Var.Q1(this.f5013c, twoStepVerificationActivity2, z10);
                return;
            default:
                if (this.f5013c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.f5014e;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    k7 k7Var2 = this.f5012b;
                    ConnectionsManager.getInstance(k7Var2.f28616a).sendRequest(gettmppassword, new i4(k7Var2, twoStepVerificationActivity, this.f5015f, 0));
                    return;
                }
                return;
        }
    }

    public x1(k7 k7Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z9) {
        this.f5012b = k7Var;
        this.f5013c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f5014e = tLObject;
        this.f5015f = z9;
    }
}
