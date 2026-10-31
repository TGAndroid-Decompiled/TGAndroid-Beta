package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f18651a;
    public final GroupCallMessage f18652b;

    public h(GroupCallMessage groupCallMessage, int i10) {
        this.f18651a = i10;
        this.f18652b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18651a) {
            case 0:
                this.f18652b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.c(this.f18652b);
                return;
        }
    }
}
