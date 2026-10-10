package org.telegram.messenger;

import java.util.ArrayList;
public final class w9 implements Runnable {
    public final int f19688a;
    public final MessagesController f19689b;
    public final ArrayList f19690c;
    public final long d;

    public w9(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f19688a = i10;
        this.f19689b = messagesController;
        this.d = j3;
        this.f19690c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19688a) {
            case 0:
                this.f19689b.lambda$deleteMessagesByPush$368(this.f19690c, this.d);
                return;
            case 1:
                this.f19689b.lambda$markAllTopicsAsRead$7(this.f19690c, this.d);
                return;
            case 2:
                this.f19689b.lambda$getDifference$353(this.d, this.f19690c);
                return;
            case 3:
                this.f19689b.lambda$generateJoinMessage$367(this.d, this.f19690c);
                return;
            case 4:
                this.f19689b.lambda$processUpdateArray$421(this.d, this.f19690c);
                return;
            default:
                this.f19689b.lambda$getDifference$354(this.d, this.f19690c);
                return;
        }
    }

    public w9(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f19688a = i10;
        this.f19689b = messagesController;
        this.f19690c = arrayList;
        this.d = j3;
    }
}
