package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19354a;
    public final ConferenceCall f19355b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19354a = i10;
        this.f19355b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19354a) {
            case 0:
                ConferenceCall.n(this.f19355b);
                return;
            case 1:
                ConferenceCall.g(this.f19355b);
                return;
            default:
                ConferenceCall.j(this.f19355b);
                return;
        }
    }
}
