package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class ta implements Runnable {

    public final int f21622a;

    public final MessagesController f21623b;

    public final TLObject f21624c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f21622a = i10;
        this.f21623b = messagesController;
        this.f21624c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21622a) {
            case 0:
                this.f21623b.lambda$loadHintDialogs$195(this.f21624c);
                break;
            case 1:
                this.f21623b.lambda$getContentSettings$501(this.f21624c);
                break;
            case 2:
                this.f21623b.lambda$reloadReactionsNotifySettings$204(this.f21624c);
                break;
            case 3:
                this.f21623b.lambda$loadGlobalNotificationsSettings$202(this.f21624c);
                break;
            case 4:
                this.f21623b.lambda$loadUnreadDialogs$361(this.f21624c);
                break;
            case 5:
                this.f21623b.lambda$loadSuggestedFilters$24(this.f21624c);
                break;
            default:
                this.f21623b.lambda$loadSignUpNotificationsSettings$206(this.f21624c);
                break;
        }
    }
}
