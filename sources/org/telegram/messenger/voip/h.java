package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19566a;
    public final GroupCallMessagesController f19567b;
    public final long f19568c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19566a = i10;
        this.f19567b = groupCallMessagesController;
        this.f19568c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19566a) {
            case 0:
                GroupCallMessagesController.a(this.f19567b, this.f19568c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19567b, this.f19568c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19567b, this.f19568c, this.d);
                return;
        }
    }
}
