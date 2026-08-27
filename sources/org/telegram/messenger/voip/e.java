package org.telegram.messenger.voip;

public final class e implements Runnable {

    public final int f21900a;

    public final GroupCallMessage f21901b;

    public e(GroupCallMessage groupCallMessage, int i10) {
        this.f21900a = i10;
        this.f21901b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f21900a) {
            case 0:
                this.f21901b.notifyStateUpdate();
                break;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f21901b);
                break;
        }
    }
}
