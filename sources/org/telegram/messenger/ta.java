package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f19060a;
    public final MessagesController f19061b;
    public final TLObject f19062c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19060a = i10;
        this.f19061b = messagesController;
        this.f19062c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19060a) {
            case 0:
                this.f19061b.lambda$loadHintDialogs$195(this.f19062c);
                return;
            case 1:
                this.f19061b.lambda$getContentSettings$501(this.f19062c);
                return;
            case 2:
                this.f19061b.lambda$reloadReactionsNotifySettings$204(this.f19062c);
                return;
            case 3:
                this.f19061b.lambda$loadGlobalNotificationsSettings$202(this.f19062c);
                return;
            case 4:
                this.f19061b.lambda$loadUnreadDialogs$361(this.f19062c);
                return;
            case 5:
                this.f19061b.lambda$loadSuggestedFilters$24(this.f19062c);
                return;
            default:
                this.f19061b.lambda$loadSignUpNotificationsSettings$206(this.f19062c);
                return;
        }
    }
}
