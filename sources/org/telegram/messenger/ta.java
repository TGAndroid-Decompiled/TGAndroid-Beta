package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f19232a;
    public final MessagesController f19233b;
    public final TLObject f19234c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19232a = i10;
        this.f19233b = messagesController;
        this.f19234c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19232a) {
            case 0:
                this.f19233b.lambda$loadHintDialogs$195(this.f19234c);
                return;
            case 1:
                this.f19233b.lambda$getContentSettings$501(this.f19234c);
                return;
            case 2:
                this.f19233b.lambda$reloadReactionsNotifySettings$204(this.f19234c);
                return;
            case 3:
                this.f19233b.lambda$loadGlobalNotificationsSettings$202(this.f19234c);
                return;
            case 4:
                this.f19233b.lambda$loadUnreadDialogs$361(this.f19234c);
                return;
            case 5:
                this.f19233b.lambda$loadSuggestedFilters$24(this.f19234c);
                return;
            default:
                this.f19233b.lambda$loadSignUpNotificationsSettings$206(this.f19234c);
                return;
        }
    }
}
