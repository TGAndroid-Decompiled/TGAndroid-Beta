package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19528a;
    public final ConferenceCall f19529b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19528a = i10;
        this.f19529b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19528a) {
            case 0:
                ConferenceCall.n(this.f19529b);
                return;
            case 1:
                ConferenceCall.g(this.f19529b);
                return;
            default:
                ConferenceCall.j(this.f19529b);
                return;
        }
    }
}
