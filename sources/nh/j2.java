package nh;

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

    public final int f18773a;

    public final int f18774b;

    public j2(int i10, int i11) {
        this.f18773a = i11;
        this.f18774b = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18773a;
        int i11 = 0;
        int i12 = this.f18774b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new k2(i12, i11));
                break;
            case 1:
                VoIPGroupNotification.lambda$decline$3(i12, tLObject, tL_error);
                break;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i12, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new k5(i12, tLObject));
                break;
            case 4:
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i12).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                break;
            case 5:
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new k5(i12, tLObject, 2));
                break;
            default:
                Pattern pattern2 = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new k5(i12, tLObject, 1));
                break;
        }
    }
}
