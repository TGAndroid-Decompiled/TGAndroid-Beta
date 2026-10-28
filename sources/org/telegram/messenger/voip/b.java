package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f21604a;
    public final ConferenceCall f21605b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f21604a = i10;
        this.f21605b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f21604a) {
            case 0:
                ConferenceCall.n(this.f21605b);
                return;
            case 1:
                ConferenceCall.g(this.f21605b);
                return;
            default:
                ConferenceCall.j(this.f21605b);
                return;
        }
    }
}
