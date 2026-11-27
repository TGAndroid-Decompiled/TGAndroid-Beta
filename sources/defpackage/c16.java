package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
public final class c16 implements RequestDelegate {
    public final byte a;
    public final LaunchActivity b;

    public c16(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                if (tLObject != null) {
                    hl.c3(new tg5(launchActivity, (TL_account.Password) tLObject, (byte) 21));
                    return;
                }
                return;
            default:
                String str2 = LaunchActivity.C1;
                hl.c3(new tg5(launchActivity, tLObject, (byte) 27));
                return;
        }
    }
}
