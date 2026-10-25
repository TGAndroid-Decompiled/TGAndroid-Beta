package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f21631a;
    public final GroupCallMessage f21632b;

    public e(GroupCallMessage groupCallMessage, int i10) {
        this.f21631a = i10;
        this.f21632b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f21631a) {
            case 0:
                this.f21632b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f21632b);
                return;
        }
    }
}
