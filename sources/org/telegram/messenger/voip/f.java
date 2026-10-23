package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f19874a;
    public final GroupCallMessage f19875b;

    public f(GroupCallMessage groupCallMessage, int i10) {
        this.f19874a = i10;
        this.f19875b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19874a) {
            case 0:
                this.f19875b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19875b);
                return;
        }
    }
}
