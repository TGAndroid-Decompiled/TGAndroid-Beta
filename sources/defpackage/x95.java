package defpackage;

import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
public final class x95 implements Runnable {
    public final byte a;
    public final GroupCallMessagesController b;
    public final long c;
    public final GroupCallMessage d;

    public x95(GroupCallMessagesController groupCallMessagesController, long j, GroupCallMessage groupCallMessage, byte b) {
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
                GroupCallMessagesController.b(groupCallMessagesController, j, groupCallMessage);
                return;
            case 1:
                GroupCallMessagesController.g(groupCallMessagesController, j, groupCallMessage);
                return;
            default:
                GroupCallMessagesController.f(groupCallMessagesController, j, groupCallMessage);
                return;
        }
    }
}
