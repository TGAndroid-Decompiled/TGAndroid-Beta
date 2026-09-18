package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f17562a;
    public final MessagesController f17563b;
    public final TLObject f17564c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f17562a = i10;
        this.f17563b = messagesController;
        this.f17564c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17562a) {
            case 0:
                this.f17563b.lambda$loadHintDialogs$195(this.f17564c);
                return;
            case 1:
                this.f17563b.lambda$getContentSettings$501(this.f17564c);
                return;
            case 2:
                this.f17563b.lambda$reloadReactionsNotifySettings$204(this.f17564c);
                return;
            case 3:
                this.f17563b.lambda$loadGlobalNotificationsSettings$202(this.f17564c);
                return;
            case 4:
                this.f17563b.lambda$loadUnreadDialogs$361(this.f17564c);
                return;
            case 5:
                this.f17563b.lambda$loadSuggestedFilters$24(this.f17564c);
                return;
            default:
                this.f17563b.lambda$loadSignUpNotificationsSettings$206(this.f17564c);
                return;
        }
    }
}
