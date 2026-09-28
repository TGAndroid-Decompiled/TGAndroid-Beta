package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17877a;
    public final ConferenceCall f17878b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17877a = i10;
        this.f17878b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17877a) {
            case 0:
                ConferenceCall.n(this.f17878b);
                return;
            case 1:
                ConferenceCall.g(this.f17878b);
                return;
            default:
                ConferenceCall.j(this.f17878b);
                return;
        }
    }
}
