package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f17595a;
    public final MessagesController f17596b;
    public final TLObject f17597c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f17595a = i10;
        this.f17596b = messagesController;
        this.f17597c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17595a) {
            case 0:
                this.f17596b.lambda$loadHintDialogs$195(this.f17597c);
                return;
            case 1:
                this.f17596b.lambda$getContentSettings$501(this.f17597c);
                return;
            case 2:
                this.f17596b.lambda$reloadReactionsNotifySettings$204(this.f17597c);
                return;
            case 3:
                this.f17596b.lambda$loadGlobalNotificationsSettings$202(this.f17597c);
                return;
            case 4:
                this.f17596b.lambda$loadUnreadDialogs$361(this.f17597c);
                return;
            case 5:
                this.f17596b.lambda$loadSuggestedFilters$24(this.f17597c);
                return;
            default:
                this.f17596b.lambda$loadSignUpNotificationsSettings$206(this.f17597c);
                return;
        }
    }
}
