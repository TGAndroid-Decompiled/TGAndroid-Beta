package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19304a;
    public final ConferenceCall f19305b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19304a = i10;
        this.f19305b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19304a) {
            case 0:
                ConferenceCall.n(this.f19305b);
                return;
            case 1:
                ConferenceCall.g(this.f19305b);
                return;
            default:
                ConferenceCall.j(this.f19305b);
                return;
        }
    }
}
