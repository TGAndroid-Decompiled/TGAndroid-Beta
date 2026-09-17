package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f17389a;
    public final MessagesController f17390b;
    public final TLObject f17391c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f17389a = i10;
        this.f17390b = messagesController;
        this.f17391c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17389a) {
            case 0:
                this.f17390b.lambda$loadHintDialogs$195(this.f17391c);
                return;
            case 1:
                this.f17390b.lambda$getContentSettings$501(this.f17391c);
                return;
            case 2:
                this.f17390b.lambda$reloadReactionsNotifySettings$204(this.f17391c);
                return;
            case 3:
                this.f17390b.lambda$loadGlobalNotificationsSettings$202(this.f17391c);
                return;
            case 4:
                this.f17390b.lambda$loadUnreadDialogs$361(this.f17391c);
                return;
            case 5:
                this.f17390b.lambda$loadSuggestedFilters$24(this.f17391c);
                return;
            default:
                this.f17390b.lambda$loadSignUpNotificationsSettings$206(this.f17391c);
                return;
        }
    }
}
