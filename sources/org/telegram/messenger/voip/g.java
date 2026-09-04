package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19358a;
    public final GroupCallMessage f19359b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19358a = i10;
        this.f19359b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19358a) {
            case 0:
                this.f19359b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19359b);
                return;
        }
    }
}
