package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17876a;
    public final ConferenceCall f17877b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17876a = i10;
        this.f17877b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17876a) {
            case 0:
                ConferenceCall.n(this.f17877b);
                return;
            case 1:
                ConferenceCall.g(this.f17877b);
                return;
            default:
                ConferenceCall.j(this.f17877b);
                return;
        }
    }
}
