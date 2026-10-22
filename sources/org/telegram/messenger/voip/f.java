package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f19871a;
    public final GroupCallMessage f19872b;

    public f(GroupCallMessage groupCallMessage, int i10) {
        this.f19871a = i10;
        this.f19872b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19871a) {
            case 0:
                this.f19872b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19872b);
                return;
        }
    }
}
