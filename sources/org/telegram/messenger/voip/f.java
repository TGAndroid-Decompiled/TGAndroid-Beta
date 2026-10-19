package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f19856a;
    public final GroupCallMessage f19857b;

    public f(GroupCallMessage groupCallMessage, int i10) {
        this.f19856a = i10;
        this.f19857b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19856a) {
            case 0:
                this.f19857b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19857b);
                return;
        }
    }
}
