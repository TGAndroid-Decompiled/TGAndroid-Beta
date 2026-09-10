package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ab implements Runnable {
    public final int f14702a;
    public final MessagesController f14703b;
    public final TLObject f14704c;

    public ab(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f14702a = i10;
        this.f14703b = messagesController;
        this.f14704c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f14702a) {
            case 0:
                this.f14703b.lambda$loadHintDialogs$195(this.f14704c);
                return;
            case 1:
                this.f14703b.lambda$getContentSettings$501(this.f14704c);
                return;
            case 2:
                this.f14703b.lambda$reloadReactionsNotifySettings$204(this.f14704c);
                return;
            case 3:
                this.f14703b.lambda$loadGlobalNotificationsSettings$202(this.f14704c);
                return;
            case 4:
                this.f14703b.lambda$loadUnreadDialogs$361(this.f14704c);
                return;
            case 5:
                this.f14703b.lambda$loadSuggestedFilters$24(this.f14704c);
                return;
            default:
                this.f14703b.lambda$loadSignUpNotificationsSettings$206(this.f14704c);
                return;
        }
    }
}
