package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f21938a;
    public final GroupCallMessage f21939b;

    public e(GroupCallMessage groupCallMessage, int i10) {
        this.f21938a = i10;
        this.f21939b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f21938a) {
            case 0:
                this.f21939b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f21939b);
                return;
        }
    }
}
