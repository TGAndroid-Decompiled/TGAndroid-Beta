package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f27443a;
    public final GroupCallMessage f27444b;

    public f(GroupCallMessage groupCallMessage, int i7) {
        this.f27443a = i7;
        this.f27444b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27443a) {
            case 0:
                this.f27444b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.b(this.f27444b);
                return;
        }
    }
}
