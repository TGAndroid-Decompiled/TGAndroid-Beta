package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f19850a;
    public final GroupCallMessage f19851b;

    public f(GroupCallMessage groupCallMessage, int i10) {
        this.f19850a = i10;
        this.f19851b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19850a) {
            case 0:
                this.f19851b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19851b);
                return;
        }
    }
}
