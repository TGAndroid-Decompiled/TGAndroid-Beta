package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f18470a;
    public final ConferenceCall f18471b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f18470a = i10;
        this.f18471b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f18470a) {
            case 0:
                ConferenceCall.n(this.f18471b);
                return;
            case 1:
                ConferenceCall.g(this.f18471b);
                return;
            default:
                ConferenceCall.j(this.f18471b);
                return;
        }
    }
}
