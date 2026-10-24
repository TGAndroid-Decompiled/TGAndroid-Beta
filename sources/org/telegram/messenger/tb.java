package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class tb implements Runnable {
    public final int f19649a;
    public final MessagesController f19650b;
    public final TLObject f19651c;

    public tb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19649a = i10;
        this.f19650b = messagesController;
        this.f19651c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19649a) {
            case 0:
                this.f19650b.lambda$loadGlobalNotificationsSettings$201(this.f19651c);
                return;
            case 1:
                this.f19650b.lambda$reloadReactionsNotifySettings$203(this.f19651c);
                return;
            case 2:
                this.f19650b.lambda$getContentSettings$504(this.f19651c);
                return;
            case 3:
                this.f19650b.lambda$loadSuggestedFilters$24(this.f19651c);
                return;
            case 4:
                this.f19650b.lambda$loadHintDialogs$194(this.f19651c);
                return;
            case 5:
                this.f19650b.lambda$loadUnreadDialogs$360(this.f19651c);
                return;
            default:
                this.f19650b.lambda$loadSignUpNotificationsSettings$205(this.f19651c);
                return;
        }
    }
}
