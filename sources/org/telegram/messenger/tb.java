package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class tb implements Runnable {
    public final int f18178a;
    public final MessagesController f18179b;
    public final TLObject f18180c;

    public tb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f18178a = i10;
        this.f18179b = messagesController;
        this.f18180c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18178a) {
            case 0:
                this.f18179b.lambda$loadGlobalNotificationsSettings$201(this.f18180c);
                return;
            case 1:
                this.f18179b.lambda$reloadReactionsNotifySettings$203(this.f18180c);
                return;
            case 2:
                this.f18179b.lambda$getContentSettings$504(this.f18180c);
                return;
            case 3:
                this.f18179b.lambda$loadSuggestedFilters$24(this.f18180c);
                return;
            case 4:
                this.f18179b.lambda$loadHintDialogs$194(this.f18180c);
                return;
            case 5:
                this.f18179b.lambda$loadUnreadDialogs$360(this.f18180c);
                return;
            default:
                this.f18179b.lambda$loadSignUpNotificationsSettings$205(this.f18180c);
                return;
        }
    }
}
