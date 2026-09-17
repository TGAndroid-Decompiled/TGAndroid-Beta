package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19399a;
    public final GroupCallMessage f19400b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19399a = i10;
        this.f19400b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19399a) {
            case 0:
                this.f19400b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19400b);
                return;
        }
    }
}
