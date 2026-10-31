package org.telegram.messenger.voip;

import java.util.regex.Pattern;
import org.telegram.messenger.vp;
import org.telegram.messenger.wd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.LaunchActivity;
public final class q implements RequestDelegate {
    public final int f18694a;
    public final int f18695b;

    public q(int i10, int i11) {
        this.f18694a = i11;
        this.f18695b = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18694a;
        int i11 = this.f18695b;
        switch (i10) {
            case 0:
                VoIPGroupNotification.a(i11, tLObject, tL_error);
                return;
            case 1:
                VoIPPreNotificationService.lambda$decline$4(i11, tLObject, tL_error);
                return;
            case 2:
                org.telegram.messenger.i0.g3(new x5(i11, tLObject));
                return;
            case 3:
                if (tLObject instanceof TLRPC.TL_updates) {
                    vp.r1(i11).L3((TLRPC.TL_updates) tLObject, false);
                    return;
                }
                return;
            case 4:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new x5(i11, 2, tLObject));
                return;
            case 5:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new x5(i11, 1, tLObject));
                return;
            default:
                org.telegram.messenger.i0.g3(new wd(i11, 13));
                return;
        }
    }
}
