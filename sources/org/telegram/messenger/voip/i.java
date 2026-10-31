package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f18656a;
    public final GroupCallMessagesController f18657b;
    public final long f18658c;
    public final GroupCallMessage d;

    public i(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f18656a = i10;
        this.f18657b = groupCallMessagesController;
        this.f18658c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18656a) {
            case 0:
                GroupCallMessagesController.a(this.f18657b, this.f18658c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f18657b, this.f18658c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f18657b, this.f18658c, this.d);
                return;
        }
    }
}
