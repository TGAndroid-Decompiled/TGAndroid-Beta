package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f26107a;
    public final GroupCallMessage f26108b;

    public e(GroupCallMessage groupCallMessage, int i7) {
        this.f26107a = i7;
        this.f26108b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f26107a) {
            case 0:
                this.f26108b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.c(this.f26108b);
                return;
        }
    }
}
