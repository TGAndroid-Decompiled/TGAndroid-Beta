package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f17357a;
    public final MessagesController f17358b;
    public final TLObject f17359c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f17357a = i10;
        this.f17358b = messagesController;
        this.f17359c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17357a) {
            case 0:
                this.f17358b.lambda$loadHintDialogs$195(this.f17359c);
                return;
            case 1:
                this.f17358b.lambda$getContentSettings$501(this.f17359c);
                return;
            case 2:
                this.f17358b.lambda$reloadReactionsNotifySettings$204(this.f17359c);
                return;
            case 3:
                this.f17358b.lambda$loadGlobalNotificationsSettings$202(this.f17359c);
                return;
            case 4:
                this.f17358b.lambda$loadUnreadDialogs$361(this.f17359c);
                return;
            case 5:
                this.f17358b.lambda$loadSuggestedFilters$24(this.f17359c);
                return;
            default:
                this.f17358b.lambda$loadSignUpNotificationsSettings$206(this.f17359c);
                return;
        }
    }
}
