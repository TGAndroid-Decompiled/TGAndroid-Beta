package org.telegram.messenger.voip;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.e6;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.LaunchActivity;
public final class o implements RequestDelegate {
    public final int f20450a;
    public final int f20451b;

    public o(int i10, int i11) {
        this.f20450a = i11;
        this.f20451b = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f20450a;
        int i11 = this.f20451b;
        switch (i10) {
            case 0:
                VoIPGroupNotification.a(i11, tLObject, tL_error);
                return;
            case 1:
                VoIPPreNotificationService.lambda$decline$4(i11, tLObject, tL_error);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new o5(i11, tLObject));
                return;
            case 3:
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.TL_updates) tLObject, false);
                    return;
                }
                return;
            case 4:
                Pattern pattern = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new o5(i11, tLObject, 2));
                return;
            case 5:
                Pattern pattern2 = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new o5(i11, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e6(i11, 11));
                return;
        }
    }
}
