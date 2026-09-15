package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f17380a;
    public final MessagesController f17381b;
    public final TLObject f17382c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f17380a = i10;
        this.f17381b = messagesController;
        this.f17382c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17380a) {
            case 0:
                this.f17381b.lambda$loadHintDialogs$195(this.f17382c);
                return;
            case 1:
                this.f17381b.lambda$getContentSettings$501(this.f17382c);
                return;
            case 2:
                this.f17381b.lambda$reloadReactionsNotifySettings$204(this.f17382c);
                return;
            case 3:
                this.f17381b.lambda$loadGlobalNotificationsSettings$202(this.f17382c);
                return;
            case 4:
                this.f17381b.lambda$loadUnreadDialogs$361(this.f17382c);
                return;
            case 5:
                this.f17381b.lambda$loadSuggestedFilters$24(this.f17382c);
                return;
            default:
                this.f17381b.lambda$loadSignUpNotificationsSettings$206(this.f17382c);
                return;
        }
    }
}
