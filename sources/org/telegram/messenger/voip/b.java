package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f27470a;
    public final ConferenceCall f27471b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f27470a = i7;
        this.f27471b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f27470a) {
            case 0:
                ConferenceCall.n(this.f27471b);
                return;
            case 1:
                ConferenceCall.g(this.f27471b);
                return;
            default:
                ConferenceCall.j(this.f27471b);
                return;
        }
    }
}
