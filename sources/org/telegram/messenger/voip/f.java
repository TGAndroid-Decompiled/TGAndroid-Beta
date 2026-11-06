package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f26100a;
    public final GroupCallMessagesController f26101b;
    public final long f26102c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f26100a = i7;
        this.f26101b = groupCallMessagesController;
        this.f26102c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f26100a) {
            case 0:
                GroupCallMessagesController.a(this.f26101b, this.f26102c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f26101b, this.f26102c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f26101b, this.f26102c, this.d);
                return;
        }
    }
}
