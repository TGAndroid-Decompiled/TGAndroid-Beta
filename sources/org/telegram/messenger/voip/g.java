package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19385a;
    public final GroupCallMessage f19386b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19385a = i10;
        this.f19386b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19385a) {
            case 0:
                this.f19386b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19386b);
                return;
        }
    }
}
