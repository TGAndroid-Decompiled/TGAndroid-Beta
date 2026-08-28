package mh;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.LaunchActivity;
public final class j2 implements RequestDelegate {
    public final int f17928a;
    public final int f17929b;

    public j2(int i9, int i10) {
        this.f17928a = i10;
        this.f17929b = i9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f17928a;
        int i10 = this.f17929b;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new k2(i10, 0));
                return;
            case 1:
                VoIPGroupNotification.a(i10, tLObject, tL_error);
                return;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i10, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new k5(i10, tLObject));
                return;
            case 4:
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i10).processUpdates((TLRPC.TL_updates) tLObject, false);
                    return;
                }
                return;
            case 5:
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new k5(i10, tLObject, 2));
                return;
            default:
                Pattern pattern2 = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new k5(i10, tLObject, 1));
                return;
        }
    }
}
