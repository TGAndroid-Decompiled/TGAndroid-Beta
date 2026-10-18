package org.telegram.messenger;

import java.util.ArrayList;
public final class ta implements Runnable {
    public final int f19567a;
    public final MessagesController f19568b;
    public final ArrayList f19569c;

    public ta(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f19567a = i10;
        this.f19568b = messagesController;
        this.f19569c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19567a) {
            case 0:
                this.f19568b.lambda$processUpdates$382(this.f19569c);
                return;
            case 1:
                this.f19568b.lambda$processUpdateArray$400(this.f19569c);
                return;
            case 2:
                this.f19568b.lambda$checkChatInviter$372(this.f19569c);
                return;
            case 3:
                this.f19568b.lambda$processUpdates$381(this.f19569c);
                return;
            case 4:
                this.f19568b.lambda$processUpdateArray$401(this.f19569c);
                return;
            case 5:
                this.f19568b.lambda$getChannelDifference$340(this.f19569c);
                return;
            case 6:
                this.f19568b.lambda$reloadMentionsCountForChannels$221(this.f19569c);
                return;
            default:
                this.f19568b.lambda$checkChatInviter$371(this.f19569c);
                return;
        }
    }
}
