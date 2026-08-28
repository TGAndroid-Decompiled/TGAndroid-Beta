package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f21876a;
    public final GroupCallMessage f21877b;

    public e(GroupCallMessage groupCallMessage, int i9) {
        this.f21876a = i9;
        this.f21877b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f21876a) {
            case 0:
                this.f21877b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f21877b);
                return;
        }
    }
}
