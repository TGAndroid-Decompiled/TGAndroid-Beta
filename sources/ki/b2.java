package ki;

import org.telegram.messenger.mp;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.LaunchActivity;
public final class b2 implements RequestDelegate {
    public final int f18609a;
    public final int f18610b;

    public b2(int i7, int i10) {
        this.f18609a = i10;
        this.f18610b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f18609a;
        int i10 = this.f18610b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new jg.x(i10, 1));
                return;
            case 1:
                VoIPGroupNotification.lambda$decline$3(i10, tLObject, tL_error);
                return;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i10, tLObject, tL_error);
                return;
            case 3:
                org.telegram.messenger.g0.g3(new o5(i10, tLObject));
                return;
            case 4:
                if (tLObject instanceof TLRPC.TL_updates) {
                    mp.u1(i10).V3((TLRPC.TL_updates) tLObject, false);
                    return;
                }
                return;
            case 5:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new o5(i10, 2, tLObject));
                return;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new o5(i10, 1, tLObject));
                return;
        }
    }
}
