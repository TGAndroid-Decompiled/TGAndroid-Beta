package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17903a;
    public final GroupCallMessage f17904b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17903a = i10;
        this.f17904b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17903a) {
            case 0:
                this.f17904b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17904b);
                return;
        }
    }
}
