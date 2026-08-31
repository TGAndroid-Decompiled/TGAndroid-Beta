package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class wa implements Runnable {
    public final int f20529a;
    public final MessagesController f20530b;
    public final TLObject f20531c;

    public wa(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f20529a = i10;
        this.f20530b = messagesController;
        this.f20531c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20529a) {
            case 0:
                this.f20530b.lambda$loadHintDialogs$195(this.f20531c);
                return;
            case 1:
                this.f20530b.lambda$getContentSettings$501(this.f20531c);
                return;
            case 2:
                this.f20530b.lambda$reloadReactionsNotifySettings$204(this.f20531c);
                return;
            case 3:
                this.f20530b.lambda$loadGlobalNotificationsSettings$202(this.f20531c);
                return;
            case 4:
                this.f20530b.lambda$loadUnreadDialogs$361(this.f20531c);
                return;
            case 5:
                this.f20530b.lambda$loadSuggestedFilters$24(this.f20531c);
                return;
            default:
                this.f20530b.lambda$loadSignUpNotificationsSettings$206(this.f20531c);
                return;
        }
    }
}
