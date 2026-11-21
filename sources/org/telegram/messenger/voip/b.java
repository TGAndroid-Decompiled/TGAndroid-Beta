package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f27496a;
    public final ConferenceCall f27497b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f27496a = i7;
        this.f27497b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f27496a) {
            case 0:
                ConferenceCall.n(this.f27497b);
                return;
            case 1:
                ConferenceCall.g(this.f27497b);
                return;
            default:
                ConferenceCall.j(this.f27497b);
                return;
        }
    }
}
