package org.telegram.messenger.voip;

public final class ConferenceCall$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ConferenceCall f$0;

    public ConferenceCall$$ExternalSyntheticLambda3(ConferenceCall conferenceCall, int i) {
        this.$r8$classId = i;
        this.f$0 = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkEmojiHash$0();
                break;
            case 1:
                this.f$0.lambda$checkParticipants$1();
                break;
            default:
                this.f$0.poll();
                break;
        }
    }
}
