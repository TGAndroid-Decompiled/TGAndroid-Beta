package hi;

import org.telegram.messenger.qp;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.LaunchActivity;
public final class g2 implements RequestDelegate {
    public final int f14672a;
    public final int f14673b;

    public g2(int i7, int i10) {
        this.f14672a = i10;
        this.f14673b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f14672a;
        int i10 = this.f14673b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new j2(i10, 0));
                return;
            case 1:
                VoIPGroupNotification.lambda$decline$3(i10, tLObject, tL_error);
                return;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i10, tLObject, tL_error);
                return;
            case 3:
                org.telegram.messenger.g0.h3(new n5(i10, tLObject));
                return;
            case 4:
                if (tLObject instanceof TLRPC.TL_updates) {
                    qp.s1(i10).O3((TLRPC.TL_updates) tLObject, false);
                    return;
                }
                return;
            case 5:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new n5(i10, 2, tLObject));
                return;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new n5(i10, 1, tLObject));
                return;
        }
    }
}
