package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17647a;
    public final GroupCallMessage f17648b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17647a = i10;
        this.f17648b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17647a) {
            case 0:
                this.f17648b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17648b);
                return;
        }
    }
}
