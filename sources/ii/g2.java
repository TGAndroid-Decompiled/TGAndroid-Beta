package ii;

import org.telegram.messenger.hp;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.LaunchActivity;
public final class g2 implements RequestDelegate {
    public final int f14951a;
    public final int f14952b;

    public g2(int i3, int i10) {
        this.f14951a = i10;
        this.f14952b = i3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f14951a;
        int i10 = this.f14952b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new i2(i10, 0));
                return;
            case 1:
                VoIPGroupNotification.a(i10, tLObject, tL_error);
                return;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i10, tLObject, tL_error);
                return;
            case 3:
                org.telegram.messenger.g0.h3(new m5(i10, tLObject));
                return;
            case 4:
                if (tLObject instanceof TLRPC.TL_updates) {
                    hp.s1(i10).O3((TLRPC.TL_updates) tLObject, false);
                    return;
                }
                return;
            case 5:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new m5(i10, 2, tLObject));
                return;
            default:
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new m5(i10, 1, tLObject));
                return;
        }
    }
}
