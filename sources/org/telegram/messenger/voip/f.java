package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f19934a;
    public final GroupCallMessage f19935b;

    public f(GroupCallMessage groupCallMessage, int i10) {
        this.f19934a = i10;
        this.f19935b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19934a) {
            case 0:
                this.f19935b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19935b);
                return;
        }
    }
}
