package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f21926a;
    public final ConferenceCall f21927b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f21926a = i10;
        this.f21927b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f21926a) {
            case 0:
                ConferenceCall.n(this.f21927b);
                return;
            case 1:
                ConferenceCall.g(this.f21927b);
                return;
            default:
                ConferenceCall.j(this.f21927b);
                return;
        }
    }
}
