package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f27516a;
    public final GroupCallMessage f27517b;

    public f(GroupCallMessage groupCallMessage, int i7) {
        this.f27516a = i7;
        this.f27517b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27516a) {
            case 0:
                this.f27517b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f27517b);
                return;
        }
    }
}
