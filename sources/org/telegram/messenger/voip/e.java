package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f25994a;
    public final GroupCallMessage f25995b;

    public e(GroupCallMessage groupCallMessage, int i3) {
        this.f25994a = i3;
        this.f25995b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f25994a) {
            case 0:
                this.f25995b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.c(this.f25995b);
                return;
        }
    }
}
