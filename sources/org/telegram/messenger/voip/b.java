package org.telegram.messenger.voip;

public final class b implements Runnable {

    public final int f21884a;

    public final ConferenceCall f21885b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f21884a = i10;
        this.f21885b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f21884a) {
            case 0:
                this.f21885b.lambda$checkParticipants$1();
                break;
            case 1:
                this.f21885b.lambda$checkEmojiHash$0();
                break;
            default:
                this.f21885b.poll();
                break;
        }
    }
}
