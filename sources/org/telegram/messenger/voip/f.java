package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f27121a;
    public final GroupCallMessage f27122b;

    public f(GroupCallMessage groupCallMessage, int i7) {
        this.f27121a = i7;
        this.f27122b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27121a) {
            case 0:
                this.f27122b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.b(this.f27122b);
                return;
        }
    }
}
