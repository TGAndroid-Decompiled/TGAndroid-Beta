package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f27122a;
    public final GroupCallMessage f27123b;

    public f(GroupCallMessage groupCallMessage, int i7) {
        this.f27122a = i7;
        this.f27123b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27122a) {
            case 0:
                this.f27123b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f27123b);
                return;
        }
    }
}
