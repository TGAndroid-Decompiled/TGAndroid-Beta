package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f19234a;
    public final MessagesController f19235b;
    public final TLObject f19236c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19234a = i10;
        this.f19235b = messagesController;
        this.f19236c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19234a) {
            case 0:
                this.f19235b.lambda$loadHintDialogs$195(this.f19236c);
                return;
            case 1:
                this.f19235b.lambda$getContentSettings$501(this.f19236c);
                return;
            case 2:
                this.f19235b.lambda$reloadReactionsNotifySettings$204(this.f19236c);
                return;
            case 3:
                this.f19235b.lambda$loadGlobalNotificationsSettings$202(this.f19236c);
                return;
            case 4:
                this.f19235b.lambda$loadUnreadDialogs$361(this.f19236c);
                return;
            case 5:
                this.f19235b.lambda$loadSuggestedFilters$24(this.f19236c);
                return;
            default:
                this.f19235b.lambda$loadSignUpNotificationsSettings$206(this.f19236c);
                return;
        }
    }
}
