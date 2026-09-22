package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17891a;
    public final GroupCallMessage f17892b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17891a = i10;
        this.f17892b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17891a) {
            case 0:
                this.f17892b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17892b);
                return;
        }
    }
}
