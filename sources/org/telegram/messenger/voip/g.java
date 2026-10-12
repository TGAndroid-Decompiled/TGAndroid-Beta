package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f18800a;
    public final GroupCallMessage f18801b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f18800a = i10;
        this.f18801b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18800a) {
            case 0:
                this.f18801b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f18801b);
                return;
        }
    }
}
