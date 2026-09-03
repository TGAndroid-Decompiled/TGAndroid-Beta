package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f18750a;
    public final GroupCallMessage f18751b;

    public e(GroupCallMessage groupCallMessage, int i10) {
        this.f18750a = i10;
        this.f18751b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18750a) {
            case 0:
                this.f18751b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f18751b);
                return;
        }
    }
}
