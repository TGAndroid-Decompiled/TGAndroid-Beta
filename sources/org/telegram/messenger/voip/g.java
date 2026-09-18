package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17661a;
    public final GroupCallMessage f17662b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17661a = i10;
        this.f17662b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17661a) {
            case 0:
                this.f17662b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17662b);
                return;
        }
    }
}
