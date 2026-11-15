package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f27102a;
    public final ConferenceCall f27103b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f27102a = i7;
        this.f27103b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f27102a) {
            case 0:
                ConferenceCall.n(this.f27103b);
                return;
            case 1:
                ConferenceCall.g(this.f27103b);
                return;
            default:
                ConferenceCall.j(this.f27103b);
                return;
        }
    }
}
