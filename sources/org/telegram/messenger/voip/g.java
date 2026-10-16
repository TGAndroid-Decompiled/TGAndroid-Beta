package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f18497a;
    public final GroupCallMessage f18498b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f18497a = i10;
        this.f18498b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18497a) {
            case 0:
                this.f18498b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f18498b);
                return;
        }
    }
}
