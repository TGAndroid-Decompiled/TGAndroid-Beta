package defpackage;

import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class dx0 implements RequestDelegate {
    public final byte a;
    public final int b;

    public dx0(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                gm.c3(new fx0(i, (byte) 0));
                return;
            case 1:
                String str = LaunchActivity.C1;
                gm.c3(new a16(tLObject, i, (byte) 1));
                return;
            case 2:
                String str2 = LaunchActivity.C1;
                gm.c3(new a16(tLObject, i, (byte) 0));
                return;
            case 3:
                gm.c3(new a16(i, tLObject));
                return;
            case 4:
                VoIPGroupNotification.lambda$decline$3(i, tLObject, tL_error);
                return;
            case 5:
                if (tLObject instanceof TLRPC.TL_updates) {
                    oc7.r1(i).T3((TLRPC.TL_updates) tLObject, false);
                    return;
                }
                return;
            default:
                VoIPPreNotificationService.lambda$decline$4(i, tLObject, tL_error);
                return;
        }
    }
}
