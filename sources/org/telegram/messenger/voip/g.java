package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17905a;
    public final GroupCallMessage f17906b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17905a = i10;
        this.f17906b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17905a) {
            case 0:
                this.f17906b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17906b);
                return;
        }
    }
}
