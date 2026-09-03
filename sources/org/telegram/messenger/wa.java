package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class wa implements Runnable {
    public final int f18872a;
    public final MessagesController f18873b;
    public final TLObject f18874c;

    public wa(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f18872a = i10;
        this.f18873b = messagesController;
        this.f18874c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18872a) {
            case 0:
                this.f18873b.lambda$loadHintDialogs$195(this.f18874c);
                return;
            case 1:
                this.f18873b.lambda$getContentSettings$501(this.f18874c);
                return;
            case 2:
                this.f18873b.lambda$reloadReactionsNotifySettings$204(this.f18874c);
                return;
            case 3:
                this.f18873b.lambda$loadGlobalNotificationsSettings$202(this.f18874c);
                return;
            case 4:
                this.f18873b.lambda$loadUnreadDialogs$361(this.f18874c);
                return;
            case 5:
                this.f18873b.lambda$loadSuggestedFilters$24(this.f18874c);
                return;
            default:
                this.f18873b.lambda$loadSignUpNotificationsSettings$206(this.f18874c);
                return;
        }
    }
}
