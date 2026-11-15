package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f27116a;
    public final GroupCallMessagesController f27117b;
    public final long f27118c;
    public final GroupCallMessage d;

    public e(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f27116a = i7;
        this.f27117b = groupCallMessagesController;
        this.f27118c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27116a) {
            case 0:
                GroupCallMessagesController.a(this.f27117b, this.f27118c, this.d);
                return;
            case 1:
                GroupCallMessagesController.d(this.f27117b, this.f27118c, this.d);
                return;
            default:
                GroupCallMessagesController.f(this.f27117b, this.f27118c, this.d);
                return;
        }
    }
}
