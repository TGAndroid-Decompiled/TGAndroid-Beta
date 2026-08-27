package org.telegram.messenger;

import java.util.ArrayList;

public final class fa implements Runnable {

    public final int f20241a;

    public final MessagesController f20242b;

    public final ArrayList f20243c;

    public fa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f20241a = i10;
        this.f20242b = messagesController;
        this.f20243c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20241a) {
            case 0:
                this.f20242b.lambda$processUpdateArray$397(this.f20243c);
                break;
            case 1:
                this.f20242b.lambda$processUpdates$379(this.f20243c);
                break;
            case 2:
                this.f20242b.lambda$processUpdates$378(this.f20243c);
                break;
            case 3:
                this.f20242b.lambda$getChannelDifference$341(this.f20243c);
                break;
            case 4:
                this.f20242b.lambda$processUpdateArray$398(this.f20243c);
                break;
            case 5:
                this.f20242b.lambda$checkChatInviter$372(this.f20243c);
                break;
            case 6:
                this.f20242b.lambda$reloadMentionsCountForChannels$222(this.f20243c);
                break;
            default:
                this.f20242b.lambda$checkChatInviter$373(this.f20243c);
                break;
        }
    }
}
