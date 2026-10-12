package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19303a;
    public final ConferenceCall f19304b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19303a = i10;
        this.f19304b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19303a) {
            case 0:
                ConferenceCall.n(this.f19304b);
                return;
            case 1:
                ConferenceCall.g(this.f19304b);
                return;
            default:
                ConferenceCall.j(this.f19304b);
                return;
        }
    }
}
