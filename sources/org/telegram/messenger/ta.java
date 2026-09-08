package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f19087a;
    public final MessagesController f19088b;
    public final TLObject f19089c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19087a = i10;
        this.f19088b = messagesController;
        this.f19089c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19087a) {
            case 0:
                this.f19088b.lambda$loadHintDialogs$195(this.f19089c);
                return;
            case 1:
                this.f19088b.lambda$getContentSettings$501(this.f19089c);
                return;
            case 2:
                this.f19088b.lambda$reloadReactionsNotifySettings$204(this.f19089c);
                return;
            case 3:
                this.f19088b.lambda$loadGlobalNotificationsSettings$202(this.f19089c);
                return;
            case 4:
                this.f19088b.lambda$loadUnreadDialogs$361(this.f19089c);
                return;
            case 5:
                this.f19088b.lambda$loadSuggestedFilters$24(this.f19089c);
                return;
            default:
                this.f19088b.lambda$loadSignUpNotificationsSettings$206(this.f19089c);
                return;
        }
    }
}
