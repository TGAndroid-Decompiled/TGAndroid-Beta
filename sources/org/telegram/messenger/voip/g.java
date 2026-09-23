package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f17636a;
    public final GroupCallMessage f17637b;

    public g(GroupCallMessage groupCallMessage, int i10) {
        this.f17636a = i10;
        this.f17637b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17636a) {
            case 0:
                this.f17637b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f17637b);
                return;
        }
    }
}
