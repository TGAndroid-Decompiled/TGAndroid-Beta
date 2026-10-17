package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f19848a;
    public final GroupCallMessage f19849b;

    public f(GroupCallMessage groupCallMessage, int i10) {
        this.f19848a = i10;
        this.f19849b = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19848a) {
            case 0:
                this.f19849b.notifyStateUpdate();
                return;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f19849b);
                return;
        }
    }
}
