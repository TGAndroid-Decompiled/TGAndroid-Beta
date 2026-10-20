package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f19853a;
    public final GroupCallMessage f19854b;

    public f(GroupCallMessage groupCallMessage, int i10) {
        this.f19853a = i10;
        this.f19854b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19853a) {
            case 0:
                this.f19854b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19854b);
                return;
        }
    }
}
