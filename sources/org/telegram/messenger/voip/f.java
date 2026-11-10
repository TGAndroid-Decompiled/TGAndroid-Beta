package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f26119a;
    public final GroupCallMessage f26120b;

    public f(GroupCallMessage groupCallMessage, int i7) {
        this.f26119a = i7;
        this.f26120b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f26119a) {
            case 0:
                this.f26120b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.b(this.f26120b);
                return;
        }
    }
}
