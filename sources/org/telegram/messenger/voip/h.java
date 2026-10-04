package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19560a;
    public final GroupCallMessagesController f19561b;
    public final long f19562c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19560a = i10;
        this.f19561b = groupCallMessagesController;
        this.f19562c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19560a) {
            case 0:
                GroupCallMessagesController.a(this.f19561b, this.f19562c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19561b, this.f19562c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19561b, this.f19562c, this.d);
                return;
        }
    }
}
