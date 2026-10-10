package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19532a;
    public final ConferenceCall f19533b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19532a = i10;
        this.f19533b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19532a) {
            case 0:
                ConferenceCall.n(this.f19533b);
                return;
            case 1:
                ConferenceCall.g(this.f19533b);
                return;
            default:
                ConferenceCall.j(this.f19533b);
                return;
        }
    }
}
