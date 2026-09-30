package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17894a;
    public final ConferenceCall f17895b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17894a = i10;
        this.f17895b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17894a) {
            case 0:
                ConferenceCall.n(this.f17895b);
                return;
            case 1:
                ConferenceCall.g(this.f17895b);
                return;
            default:
                ConferenceCall.j(this.f17895b);
                return;
        }
    }
}
