package fi;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.LaunchActivity;
public final class q2 implements RequestDelegate {
    public final int f9895a;
    public final int f9896b;

    public q2(int i10, int i11) {
        this.f9895a = i11;
        this.f9896b = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f9895a;
        int i11 = this.f9896b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new r2(i11, 0));
                return;
            case 1:
                VoIPGroupNotification.a(i11, tLObject, tL_error);
                return;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i11, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new m5(i11, tLObject));
                return;
            case 4:
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.TL_updates) tLObject, false);
                    return;
                }
                return;
            case 5:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new m5(i11, tLObject, 2));
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new m5(i11, tLObject, 1));
                return;
        }
    }
}
