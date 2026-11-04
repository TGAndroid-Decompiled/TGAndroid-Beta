package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f25978a;
    public final ConferenceCall f25979b;

    public b(ConferenceCall conferenceCall, int i3) {
        this.f25978a = i3;
        this.f25979b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f25978a) {
            case 0:
                ConferenceCall.n(this.f25979b);
                return;
            case 1:
                ConferenceCall.g(this.f25979b);
                return;
            default:
                ConferenceCall.j(this.f25979b);
                return;
        }
    }
}
