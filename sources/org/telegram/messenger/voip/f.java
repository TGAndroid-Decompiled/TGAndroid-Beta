package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f27490a;
    public final GroupCallMessage f27491b;

    public f(GroupCallMessage groupCallMessage, int i7) {
        this.f27490a = i7;
        this.f27491b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27490a) {
            case 0:
                this.f27491b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f27491b);
                return;
        }
    }
}
