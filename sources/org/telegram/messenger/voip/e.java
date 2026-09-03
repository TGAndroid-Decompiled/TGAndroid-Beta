package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f20397a;
    public final GroupCallMessage f20398b;

    public e(GroupCallMessage groupCallMessage, int i10) {
        this.f20397a = i10;
        this.f20398b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f20397a) {
            case 0:
                this.f20398b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f20398b);
                return;
        }
    }
}
