package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MediaController$$ExternalSyntheticLambda27 implements RequestDelegate {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final int f$1;
    public final int f$2;

    public MediaController$$ExternalSyntheticLambda27(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((MediaController) this.f$0).lambda$loadMoreMusic$12(this.f$1, this.f$2, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.f$0).lambda$getDifference$359(this.f$1, this.f$2, tLObject, tL_error);
                break;
        }
    }
}
