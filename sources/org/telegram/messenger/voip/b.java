package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f27459a;
    public final ConferenceCall f27460b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f27459a = i7;
        this.f27460b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f27459a) {
            case 0:
                ConferenceCall.n(this.f27460b);
                return;
            case 1:
                ConferenceCall.g(this.f27460b);
                return;
            default:
                ConferenceCall.j(this.f27460b);
                return;
        }
    }
}
