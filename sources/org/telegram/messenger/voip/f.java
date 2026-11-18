package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f27488a;
    public final GroupCallMessage f27489b;

    public f(GroupCallMessage groupCallMessage, int i7) {
        this.f27488a = i7;
        this.f27489b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27488a) {
            case 0:
                this.f27489b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.b(this.f27489b);
                return;
        }
    }
}
