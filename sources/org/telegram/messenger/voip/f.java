package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f19939a;
    public final GroupCallMessage f19940b;

    public f(GroupCallMessage groupCallMessage, int i10) {
        this.f19939a = i10;
        this.f19940b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19939a) {
            case 0:
                this.f19940b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19940b);
                return;
        }
    }
}
