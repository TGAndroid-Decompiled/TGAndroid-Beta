package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class soa implements Runnable {
    public final byte a = 0;
    public final vqa b;
    public final TLRPC.TL_error c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;
    public final boolean f;

    public soa(vqa vqaVar, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, TLRPC.TL_error tL_error) {
        this.b = vqaVar;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f = z;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        boolean z = this.f;
        TLObject tLObject = this.e;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        TLRPC.TL_error tL_error = this.c;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TL_account.tmpPassword) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    y6c.h(vqaVar.a).y = tmppassword;
                    y6c.h(vqaVar.a).u(false);
                    vqaVar.C1(tmppassword.tmp_password, twoStepVerificationActivity, z, null);
                    return;
                }
                vqaVar.P1(tL_error, twoStepVerificationActivity, z);
                return;
            default:
                if (tL_error == null && twoStepVerificationActivity != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    TLRPC.TL_inputCheckPasswordSRP d0 = twoStepVerificationActivity.d0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = d0;
                    gettmppassword.period = 600;
                    ConnectionsManager.getInstance(vqaVar.a).sendRequest(gettmppassword, new poa(vqaVar, twoStepVerificationActivity, z, (byte) 0));
                    return;
                }
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.s0();
                }
                if (tL_error != null) {
                    str = tL_error.text;
                } else {
                    str = "NULL_ERROR";
                }
                u21.c0(str);
                return;
        }
    }

    public soa(vqa vqaVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z) {
        this.b = vqaVar;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f = z;
    }
}
