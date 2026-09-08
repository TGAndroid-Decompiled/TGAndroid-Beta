package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19390a;
    public final GroupCallMessagesController f19391b;
    public final long f19392c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19390a = i10;
        this.f19391b = groupCallMessagesController;
        this.f19392c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19390a) {
            case 0:
                GroupCallMessagesController.a(this.f19391b, this.f19392c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19391b, this.f19392c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19391b, this.f19392c, this.d);
                return;
        }
    }
}
