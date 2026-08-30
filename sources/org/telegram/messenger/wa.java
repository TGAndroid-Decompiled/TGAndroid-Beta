package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class wa implements Runnable {
    public final int f18889a;
    public final MessagesController f18890b;
    public final TLObject f18891c;

    public wa(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f18889a = i10;
        this.f18890b = messagesController;
        this.f18891c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18889a) {
            case 0:
                this.f18890b.lambda$loadHintDialogs$195(this.f18891c);
                return;
            case 1:
                this.f18890b.lambda$getContentSettings$501(this.f18891c);
                return;
            case 2:
                this.f18890b.lambda$reloadReactionsNotifySettings$204(this.f18891c);
                return;
            case 3:
                this.f18890b.lambda$loadGlobalNotificationsSettings$202(this.f18891c);
                return;
            case 4:
                this.f18890b.lambda$loadUnreadDialogs$361(this.f18891c);
                return;
            case 5:
                this.f18890b.lambda$loadSuggestedFilters$24(this.f18891c);
                return;
            default:
                this.f18890b.lambda$loadSignUpNotificationsSettings$206(this.f18891c);
                return;
        }
    }
}
