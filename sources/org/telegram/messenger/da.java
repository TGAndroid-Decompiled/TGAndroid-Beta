package org.telegram.messenger;

import java.util.ArrayList;
public final class da implements Runnable {
    public final int f17495a;
    public final MessagesController f17496b;
    public final ArrayList f17497c;

    public da(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f17495a = i10;
        this.f17496b = messagesController;
        this.f17497c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17495a) {
            case 0:
                this.f17496b.lambda$processUpdateArray$397(this.f17497c);
                return;
            case 1:
                this.f17496b.lambda$processUpdates$379(this.f17497c);
                return;
            case 2:
                this.f17496b.lambda$processUpdates$378(this.f17497c);
                return;
            case 3:
                this.f17496b.lambda$getChannelDifference$341(this.f17497c);
                return;
            case 4:
                this.f17496b.lambda$processUpdateArray$398(this.f17497c);
                return;
            case 5:
                this.f17496b.lambda$checkChatInviter$372(this.f17497c);
                return;
            case 6:
                this.f17496b.lambda$reloadMentionsCountForChannels$222(this.f17497c);
                return;
            default:
                this.f17496b.lambda$checkChatInviter$373(this.f17497c);
                return;
        }
    }
}
