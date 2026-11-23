package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f27584a;
    public final GroupCallMessage f27585b;

    public f(GroupCallMessage groupCallMessage, int i7) {
        this.f27584a = i7;
        this.f27585b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27584a) {
            case 0:
                this.f27585b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f27585b);
                return;
        }
    }
}
