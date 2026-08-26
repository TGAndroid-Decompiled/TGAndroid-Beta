package org.telegram.messenger.voip;

public final class GroupCallMessagesController$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final GroupCallMessagesController f$0;
    public final long f$1;
    public final GroupCallMessage f$2;

    public GroupCallMessagesController$$ExternalSyntheticLambda2(GroupCallMessagesController groupCallMessagesController, long j, GroupCallMessage groupCallMessage, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallMessagesController;
        this.f$1 = j;
        this.f$2 = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processUpdate$0(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$processUpdate$1(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$processUpdate$2(this.f$1, this.f$2);
                break;
        }
    }
}
