package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f19239a;
    public final MessagesController f19240b;
    public final TLObject f19241c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19239a = i10;
        this.f19240b = messagesController;
        this.f19241c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19239a) {
            case 0:
                this.f19240b.lambda$loadHintDialogs$195(this.f19241c);
                return;
            case 1:
                this.f19240b.lambda$getContentSettings$501(this.f19241c);
                return;
            case 2:
                this.f19240b.lambda$reloadReactionsNotifySettings$204(this.f19241c);
                return;
            case 3:
                this.f19240b.lambda$loadGlobalNotificationsSettings$202(this.f19241c);
                return;
            case 4:
                this.f19240b.lambda$loadUnreadDialogs$361(this.f19241c);
                return;
            case 5:
                this.f19240b.lambda$loadSuggestedFilters$24(this.f19241c);
                return;
            default:
                this.f19240b.lambda$loadSignUpNotificationsSettings$206(this.f19241c);
                return;
        }
    }
}
