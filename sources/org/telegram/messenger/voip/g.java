package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17922a;
    public final GroupCallMessage f17923b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17922a = i10;
        this.f17923b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17922a) {
            case 0:
                this.f17923b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17923b);
                return;
        }
    }
}
