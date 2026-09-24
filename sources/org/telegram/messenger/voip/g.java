package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17880a;
    public final GroupCallMessage f17881b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17880a = i10;
        this.f17881b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17880a) {
            case 0:
                this.f17881b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17881b);
                return;
        }
    }
}
