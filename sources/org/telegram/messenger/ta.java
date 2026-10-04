package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f19231a;
    public final MessagesController f19232b;
    public final TLObject f19233c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19231a = i10;
        this.f19232b = messagesController;
        this.f19233c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19231a) {
            case 0:
                this.f19232b.lambda$loadHintDialogs$195(this.f19233c);
                return;
            case 1:
                this.f19232b.lambda$getContentSettings$501(this.f19233c);
                return;
            case 2:
                this.f19232b.lambda$reloadReactionsNotifySettings$204(this.f19233c);
                return;
            case 3:
                this.f19232b.lambda$loadGlobalNotificationsSettings$202(this.f19233c);
                return;
            case 4:
                this.f19232b.lambda$loadUnreadDialogs$361(this.f19233c);
                return;
            case 5:
                this.f19232b.lambda$loadSuggestedFilters$24(this.f19233c);
                return;
            default:
                this.f19232b.lambda$loadSignUpNotificationsSettings$206(this.f19233c);
                return;
        }
    }
}
