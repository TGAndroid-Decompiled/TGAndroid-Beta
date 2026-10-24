package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19911a;
    public final ConferenceCall f19912b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19911a = i10;
        this.f19912b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19911a) {
            case 0:
                ConferenceCall.n(this.f19912b);
                return;
            case 1:
                ConferenceCall.g(this.f19912b);
                return;
            default:
                ConferenceCall.j(this.f19912b);
                return;
        }
    }
}
