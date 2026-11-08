package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f26114a;
    public final GroupCallMessagesController f26115b;
    public final long f26116c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f26114a = i7;
        this.f26115b = groupCallMessagesController;
        this.f26116c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f26114a) {
            case 0:
                GroupCallMessagesController.a(this.f26115b, this.f26116c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f26115b, this.f26116c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f26115b, this.f26116c, this.d);
                return;
        }
    }
}
