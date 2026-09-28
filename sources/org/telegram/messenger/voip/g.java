package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17906a;
    public final GroupCallMessage f17907b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17906a = i10;
        this.f17907b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17906a) {
            case 0:
                this.f17907b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17907b);
                return;
        }
    }
}
