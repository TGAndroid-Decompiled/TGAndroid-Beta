package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f21619a;
    public final GroupCallMessage f21620b;

    public e(GroupCallMessage groupCallMessage, int i10) {
        this.f21619a = i10;
        this.f21620b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f21619a) {
            case 0:
                this.f21620b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f21620b);
                return;
        }
    }
}
