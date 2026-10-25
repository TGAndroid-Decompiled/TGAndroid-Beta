package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f21616a;
    public final ConferenceCall f21617b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f21616a = i10;
        this.f21617b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f21616a) {
            case 0:
                ConferenceCall.n(this.f21617b);
                return;
            case 1:
                ConferenceCall.g(this.f21617b);
                return;
            default:
                ConferenceCall.j(this.f21617b);
                return;
        }
    }
}
