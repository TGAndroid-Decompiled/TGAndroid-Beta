package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f19859a;
    public final GroupCallMessage f19860b;

    public f(GroupCallMessage groupCallMessage, int i10) {
        this.f19859a = i10;
        this.f19860b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19859a) {
            case 0:
                this.f19860b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19860b);
                return;
        }
    }
}
