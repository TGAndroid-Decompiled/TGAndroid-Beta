package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19372a;
    public final GroupCallMessage f19373b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19372a = i10;
        this.f19373b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19372a) {
            case 0:
                this.f19373b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19373b);
                return;
        }
    }
}
