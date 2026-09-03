package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class wa implements Runnable {
    public final int f20531a;
    public final MessagesController f20532b;
    public final TLObject f20533c;

    public wa(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f20531a = i10;
        this.f20532b = messagesController;
        this.f20533c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20531a) {
            case 0:
                this.f20532b.lambda$loadHintDialogs$195(this.f20533c);
                return;
            case 1:
                this.f20532b.lambda$getContentSettings$501(this.f20533c);
                return;
            case 2:
                this.f20532b.lambda$reloadReactionsNotifySettings$204(this.f20533c);
                return;
            case 3:
                this.f20532b.lambda$loadGlobalNotificationsSettings$202(this.f20533c);
                return;
            case 4:
                this.f20532b.lambda$loadUnreadDialogs$361(this.f20533c);
                return;
            case 5:
                this.f20532b.lambda$loadSuggestedFilters$24(this.f20533c);
                return;
            default:
                this.f20532b.lambda$loadSignUpNotificationsSettings$206(this.f20533c);
                return;
        }
    }
}
