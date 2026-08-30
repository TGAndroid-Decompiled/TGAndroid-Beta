package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f18774a;
    public final GroupCallMessage f18775b;

    public f(GroupCallMessage groupCallMessage, int i10) {
        this.f18774a = i10;
        this.f18775b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18774a) {
            case 0:
                this.f18775b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f18775b);
                return;
        }
    }
}
