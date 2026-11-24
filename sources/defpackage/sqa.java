package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class sqa implements Runnable {
    public final byte a = 0;
    public final wsa b;
    public final TLRPC.TL_error c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;
    public final boolean f;

    public sqa(wsa wsaVar, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, TLRPC.TL_error tL_error) {
        this.b = wsaVar;
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
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TL_account.tmpPassword) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    z8c.h(wsaVar.a).y = tmppassword;
                    z8c.h(wsaVar.a).u(false);
                    wsaVar.C1(tmppassword.tmp_password, twoStepVerificationActivity, z, null);
                    return;
                }
                wsaVar.P1(tL_error, twoStepVerificationActivity, z);
                return;
            default:
                if (tL_error == null && twoStepVerificationActivity != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.f0(password);
                    TLRPC.TL_inputCheckPasswordSRP e0 = twoStepVerificationActivity.e0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = e0;
                    gettmppassword.period = 600;
                    ConnectionsManager.getInstance(wsaVar.a).sendRequest(gettmppassword, new pqa(wsaVar, twoStepVerificationActivity, z, (byte) 0));
                    return;
                }
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.t0();
                }
                if (tL_error != null) {
                    str = tL_error.text;
                } else {
                    str = "NULL_ERROR";
                }
                c41.c0(str);
                return;
        }
    }

    public sqa(wsa wsaVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z) {
        this.b = wsaVar;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f = z;
    }
}
