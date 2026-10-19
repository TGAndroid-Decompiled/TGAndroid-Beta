package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ob implements Runnable {
    public final int f19166a;
    public final MessagesController f19167b;
    public final TLObject f19168c;

    public ob(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19166a = i10;
        this.f19167b = messagesController;
        this.f19168c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19166a) {
            case 0:
                this.f19167b.lambda$loadGlobalNotificationsSettings$201(this.f19168c);
                return;
            case 1:
                this.f19167b.lambda$reloadReactionsNotifySettings$203(this.f19168c);
                return;
            case 2:
                this.f19167b.lambda$getContentSettings$504(this.f19168c);
                return;
            case 3:
                this.f19167b.lambda$loadSuggestedFilters$24(this.f19168c);
                return;
            case 4:
                this.f19167b.lambda$loadHintDialogs$194(this.f19168c);
                return;
            case 5:
                this.f19167b.lambda$loadUnreadDialogs$360(this.f19168c);
                return;
            default:
                this.f19167b.lambda$loadSignUpNotificationsSettings$205(this.f19168c);
                return;
        }
    }
}
