package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17878a;
    public final ConferenceCall f17879b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17878a = i10;
        this.f17879b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17878a) {
            case 0:
                ConferenceCall.n(this.f17879b);
                return;
            case 1:
                ConferenceCall.g(this.f17879b);
                return;
            default:
                ConferenceCall.j(this.f17879b);
                return;
        }
    }
}
