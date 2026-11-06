package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f26093a;
    public final GroupCallMessage f26094b;

    public e(GroupCallMessage groupCallMessage, int i7) {
        this.f26093a = i7;
        this.f26094b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f26093a) {
            case 0:
                this.f26094b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.c(this.f26094b);
                return;
        }
    }
}
