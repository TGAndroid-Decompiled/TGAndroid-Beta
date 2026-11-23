package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f27479a;
    public final GroupCallMessage f27480b;

    public f(GroupCallMessage groupCallMessage, int i7) {
        this.f27479a = i7;
        this.f27480b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27479a) {
            case 0:
                this.f27480b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f27480b);
                return;
        }
    }
}
