package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19563a;
    public final ConferenceCall f19564b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19563a = i10;
        this.f19564b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19563a) {
            case 0:
                ConferenceCall.n(this.f19564b);
                return;
            case 1:
                ConferenceCall.g(this.f19564b);
                return;
            default:
                ConferenceCall.j(this.f19564b);
                return;
        }
    }
}
