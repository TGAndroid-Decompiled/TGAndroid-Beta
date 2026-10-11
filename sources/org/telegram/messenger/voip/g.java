package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19592a;
    public final GroupCallMessage f19593b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19592a = i10;
        this.f19593b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19592a) {
            case 0:
                this.f19593b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19593b);
                return;
        }
    }
}
