package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17810a;
    public final ConferenceCall f17811b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17810a = i10;
        this.f17811b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17810a) {
            case 0:
                ConferenceCall.n(this.f17811b);
                return;
            case 1:
                ConferenceCall.g(this.f17811b);
                return;
            default:
                ConferenceCall.j(this.f17811b);
                return;
        }
    }
}
