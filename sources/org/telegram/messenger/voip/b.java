package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19524a;
    public final ConferenceCall f19525b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19524a = i10;
        this.f19525b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19524a) {
            case 0:
                ConferenceCall.n(this.f19525b);
                return;
            case 1:
                ConferenceCall.g(this.f19525b);
                return;
            default:
                ConferenceCall.j(this.f19525b);
                return;
        }
    }
}
