package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17652a;
    public final GroupCallMessage f17653b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17652a = i10;
        this.f17653b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17652a) {
            case 0:
                this.f17653b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17653b);
                return;
        }
    }
}
