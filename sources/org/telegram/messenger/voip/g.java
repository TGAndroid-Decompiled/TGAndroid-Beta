package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19557a;
    public final GroupCallMessage f19558b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19557a = i10;
        this.f19558b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19557a) {
            case 0:
                this.f19558b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19558b);
                return;
        }
    }
}
