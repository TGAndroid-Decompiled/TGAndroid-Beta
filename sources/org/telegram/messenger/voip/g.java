package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17895a;
    public final GroupCallMessage f17896b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17895a = i10;
        this.f17896b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17895a) {
            case 0:
                this.f17896b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17896b);
                return;
        }
    }
}
