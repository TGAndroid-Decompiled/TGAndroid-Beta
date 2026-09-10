package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f16734a;
    public final GroupCallMessage f16735b;

    public i(GroupCallMessage groupCallMessage, int i10) {
        this.f16734a = i10;
        this.f16735b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f16734a) {
            case 0:
                this.f16735b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f16735b);
                return;
        }
    }
}
