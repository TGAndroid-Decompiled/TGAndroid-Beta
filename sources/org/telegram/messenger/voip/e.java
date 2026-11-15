package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f27115a;
    public final GroupCallMessagesController f27116b;
    public final long f27117c;
    public final GroupCallMessage d;

    public e(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f27115a = i7;
        this.f27116b = groupCallMessagesController;
        this.f27117c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27115a) {
            case 0:
                this.f27116b.lambda$processUpdate$0(this.f27117c, this.d);
                return;
            case 1:
                this.f27116b.lambda$processUpdate$1(this.f27117c, this.d);
                return;
            default:
                this.f27116b.lambda$processUpdate$2(this.f27117c, this.d);
                return;
        }
    }
}
