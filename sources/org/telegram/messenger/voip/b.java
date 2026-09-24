package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17852a;
    public final ConferenceCall f17853b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17852a = i10;
        this.f17853b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17852a) {
            case 0:
                ConferenceCall.n(this.f17853b);
                return;
            case 1:
                ConferenceCall.g(this.f17853b);
                return;
            default:
                ConferenceCall.j(this.f17853b);
                return;
        }
    }
}
