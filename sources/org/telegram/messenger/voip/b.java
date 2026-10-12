package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f18773a;
    public final ConferenceCall f18774b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f18773a = i10;
        this.f18774b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f18773a) {
            case 0:
                ConferenceCall.n(this.f18774b);
                return;
            case 1:
                ConferenceCall.g(this.f18774b);
                return;
            default:
                ConferenceCall.j(this.f18774b);
                return;
        }
    }
}
