package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17838a;
    public final GroupCallMessage f17839b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17838a = i10;
        this.f17839b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17838a) {
            case 0:
                this.f17839b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17839b);
                return;
        }
    }
}
