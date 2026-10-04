package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19554a;
    public final GroupCallMessage f19555b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19554a = i10;
        this.f19555b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19554a) {
            case 0:
                this.f19555b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19555b);
                return;
        }
    }
}
