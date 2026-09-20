package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17876a;
    public final GroupCallMessage f17877b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17876a = i10;
        this.f17877b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17876a) {
            case 0:
                this.f17877b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17877b);
                return;
        }
    }
}
