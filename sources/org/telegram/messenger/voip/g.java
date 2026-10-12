package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19333a;
    public final GroupCallMessage f19334b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19333a = i10;
        this.f19334b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19333a) {
            case 0:
                this.f19334b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19334b);
                return;
        }
    }
}
