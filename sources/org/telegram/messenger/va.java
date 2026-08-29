package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class va implements Runnable {
    public final int f21806a;
    public final MessagesController f21807b;
    public final TLObject f21808c;

    public va(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f21806a = i10;
        this.f21807b = messagesController;
        this.f21808c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21806a) {
            case 0:
                this.f21807b.lambda$loadHintDialogs$195(this.f21808c);
                return;
            case 1:
                this.f21807b.lambda$getContentSettings$501(this.f21808c);
                return;
            case 2:
                this.f21807b.lambda$reloadReactionsNotifySettings$204(this.f21808c);
                return;
            case 3:
                this.f21807b.lambda$loadGlobalNotificationsSettings$202(this.f21808c);
                return;
            case 4:
                this.f21807b.lambda$loadUnreadDialogs$361(this.f21808c);
                return;
            case 5:
                this.f21807b.lambda$loadSuggestedFilters$24(this.f21808c);
                return;
            default:
                this.f21807b.lambda$loadSignUpNotificationsSettings$206(this.f21808c);
                return;
        }
    }
}
