package org.telegram.messenger;

import java.util.ArrayList;
public final class ea implements Runnable {
    public final int f17542a;
    public final MessagesController f17543b;
    public final ArrayList f17544c;

    public ea(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f17542a = i10;
        this.f17543b = messagesController;
        this.f17544c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17542a) {
            case 0:
                this.f17543b.lambda$processUpdateArray$397(this.f17544c);
                return;
            case 1:
                this.f17543b.lambda$processUpdates$379(this.f17544c);
                return;
            case 2:
                this.f17543b.lambda$processUpdates$378(this.f17544c);
                return;
            case 3:
                this.f17543b.lambda$getChannelDifference$341(this.f17544c);
                return;
            case 4:
                this.f17543b.lambda$processUpdateArray$398(this.f17544c);
                return;
            case 5:
                this.f17543b.lambda$checkChatInviter$372(this.f17544c);
                return;
            case 6:
                this.f17543b.lambda$reloadMentionsCountForChannels$222(this.f17544c);
                return;
            default:
                this.f17543b.lambda$checkChatInviter$373(this.f17544c);
                return;
        }
    }
}
