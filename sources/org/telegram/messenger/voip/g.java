package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19332a;
    public final GroupCallMessage f19333b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19332a = i10;
        this.f19333b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19332a) {
            case 0:
                this.f19333b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19333b);
                return;
        }
    }
}
