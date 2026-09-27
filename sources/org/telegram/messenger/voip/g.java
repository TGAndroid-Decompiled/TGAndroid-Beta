package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17889a;
    public final GroupCallMessage f17890b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17889a = i10;
        this.f17890b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17889a) {
            case 0:
                this.f17890b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17890b);
                return;
        }
    }
}
