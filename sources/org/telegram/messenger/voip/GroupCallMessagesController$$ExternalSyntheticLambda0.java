package org.telegram.messenger.voip;

public final class GroupCallMessagesController$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final GroupCallMessage f$0;

    public GroupCallMessagesController$$ExternalSyntheticLambda0(GroupCallMessage groupCallMessage, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.notifyStateUpdate();
                break;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(this.f$0);
                break;
        }
    }
}
