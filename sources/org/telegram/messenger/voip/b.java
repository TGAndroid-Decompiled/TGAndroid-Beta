package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f27101a;
    public final ConferenceCall f27102b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f27101a = i7;
        this.f27102b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f27101a) {
            case 0:
                ConferenceCall.n(this.f27102b);
                return;
            case 1:
                ConferenceCall.g(this.f27102b);
                return;
            default:
                ConferenceCall.j(this.f27102b);
                return;
        }
    }
}
