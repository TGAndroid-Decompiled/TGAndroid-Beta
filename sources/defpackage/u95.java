package defpackage;

import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
public final class u95 implements Runnable {
    public final byte a;
    public final GroupCallMessagesController b;
    public final long c;
    public final GroupCallMessage d;

    public u95(GroupCallMessagesController groupCallMessagesController, long j, GroupCallMessage groupCallMessage, byte b) {
        this.a = b;
        this.b = groupCallMessagesController;
        this.c = j;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        byte b = this.a;
        GroupCallMessage groupCallMessage = this.d;
        long j = this.c;
        GroupCallMessagesController groupCallMessagesController = this.b;
        switch (b) {
            case 0:
                groupCallMessagesController.lambda$processUpdate$0(j, groupCallMessage);
                return;
            case 1:
                groupCallMessagesController.lambda$processUpdate$1(j, groupCallMessage);
                return;
            default:
                groupCallMessagesController.lambda$processUpdate$2(j, groupCallMessage);
                return;
        }
    }
}
