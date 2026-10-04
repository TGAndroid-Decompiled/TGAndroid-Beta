package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19546a;
    public final GroupCallMessage f19547b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19546a = i10;
        this.f19547b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19546a) {
            case 0:
                this.f19547b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19547b);
                return;
        }
    }
}
