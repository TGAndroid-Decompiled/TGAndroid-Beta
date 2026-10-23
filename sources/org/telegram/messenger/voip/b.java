package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19851a;
    public final ConferenceCall f19852b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19851a = i10;
        this.f19852b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19851a) {
            case 0:
                ConferenceCall.n(this.f19852b);
                return;
            case 1:
                ConferenceCall.g(this.f19852b);
                return;
            default:
                ConferenceCall.j(this.f19852b);
                return;
        }
    }
}
