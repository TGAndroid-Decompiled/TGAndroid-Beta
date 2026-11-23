package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f27423a;
    public final ConferenceCall f27424b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f27423a = i7;
        this.f27424b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f27423a) {
            case 0:
                ConferenceCall.n(this.f27424b);
                return;
            case 1:
                ConferenceCall.g(this.f27424b);
                return;
            default:
                ConferenceCall.j(this.f27424b);
                return;
        }
    }
}
