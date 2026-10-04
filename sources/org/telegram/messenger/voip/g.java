package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19553a;
    public final GroupCallMessage f19554b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19553a = i10;
        this.f19554b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19553a) {
            case 0:
                this.f19554b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19554b);
                return;
        }
    }
}
