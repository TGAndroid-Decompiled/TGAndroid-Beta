package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f26101a;
    public final GroupCallMessage f26102b;

    public e(GroupCallMessage groupCallMessage, int i7) {
        this.f26101a = i7;
        this.f26102b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f26101a) {
            case 0:
                this.f26102b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.c(this.f26102b);
                return;
        }
    }
}
