package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class wsa implements Runnable {
    public final byte a = 0;
    public final wua b;
    public final TLRPC.TL_error c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;
    public final boolean f;

    public wsa(wua wuaVar, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, TLRPC.TL_error tL_error) {
        this.b = wuaVar;
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
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TL_account.tmpPassword) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    yac.h(wuaVar.a).y = tmppassword;
                    yac.h(wuaVar.a).u(false);
                    wuaVar.D1(tmppassword.tmp_password, twoStepVerificationActivity, z, null);
                    return;
                }
                wuaVar.Q1(tL_error, twoStepVerificationActivity, z);
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
                    ConnectionsManager.getInstance(wuaVar.a).sendRequest(gettmppassword, new qsa(wuaVar, twoStepVerificationActivity, z, (byte) 0));
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
                d31.c0(str);
                return;
        }
    }

    public wsa(wua wuaVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z) {
        this.b = wuaVar;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f = z;
    }
}
