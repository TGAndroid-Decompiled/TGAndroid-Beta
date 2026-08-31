package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f20395a;
    public final GroupCallMessage f20396b;

    public e(GroupCallMessage groupCallMessage, int i10) {
        this.f20395a = i10;
        this.f20396b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f20395a) {
            case 0:
                this.f20396b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f20396b);
                return;
        }
    }
}
