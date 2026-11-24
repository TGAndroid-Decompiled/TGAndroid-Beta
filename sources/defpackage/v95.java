package defpackage;

import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
public final class v95 implements Runnable {
    public final byte a;
    public final GroupCallMessage b;

    public v95(GroupCallMessage groupCallMessage, byte b) {
        this.a = b;
        this.b = groupCallMessage;
    }

    @Override
    public final void run() {
        byte b = this.a;
        GroupCallMessage groupCallMessage = this.b;
        switch (b) {
            case 0:
                groupCallMessage.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.b(groupCallMessage);
                return;
        }
    }
}
