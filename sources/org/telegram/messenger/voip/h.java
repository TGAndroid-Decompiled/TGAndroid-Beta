package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f18811a;
    public final GroupCallMessage f18812b;

    public h(GroupCallMessage groupCallMessage, int i10) {
        this.f18811a = i10;
        this.f18812b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18811a) {
            case 0:
                this.f18812b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f18812b);
                return;
        }
    }
}
