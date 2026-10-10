package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19561a;
    public final GroupCallMessage f19562b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f19561a = i10;
        this.f19562b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19561a) {
            case 0:
                this.f19562b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19562b);
                return;
        }
    }
}
