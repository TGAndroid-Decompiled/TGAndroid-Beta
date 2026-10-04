package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19525a;
    public final ConferenceCall f19526b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19525a = i10;
        this.f19526b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19525a) {
            case 0:
                ConferenceCall.n(this.f19526b);
                return;
            case 1:
                ConferenceCall.g(this.f19526b);
                return;
            default:
                ConferenceCall.j(this.f19526b);
                return;
        }
    }
}
