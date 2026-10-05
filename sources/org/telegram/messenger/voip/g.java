package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19551a;
    public final GroupCallMessage f19552b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19551a = i10;
        this.f19552b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19551a) {
            case 0:
                this.f19552b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19552b);
                return;
        }
    }
}
