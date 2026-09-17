package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class sa implements Runnable {
    public final int f19003a;
    public final MessagesController f19004b;
    public final TLObject f19005c;

    public sa(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19003a = i10;
        this.f19004b = messagesController;
        this.f19005c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19003a) {
            case 0:
                this.f19004b.lambda$loadHintDialogs$195(this.f19005c);
                return;
            case 1:
                this.f19004b.lambda$getContentSettings$501(this.f19005c);
                return;
            case 2:
                this.f19004b.lambda$reloadReactionsNotifySettings$204(this.f19005c);
                return;
            case 3:
                this.f19004b.lambda$loadGlobalNotificationsSettings$202(this.f19005c);
                return;
            case 4:
                this.f19004b.lambda$loadUnreadDialogs$361(this.f19005c);
                return;
            case 5:
                this.f19004b.lambda$loadSuggestedFilters$24(this.f19005c);
                return;
            default:
                this.f19004b.lambda$loadSignUpNotificationsSettings$206(this.f19005c);
                return;
        }
    }
}
