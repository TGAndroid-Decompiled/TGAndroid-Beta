package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17848a;
    public final ConferenceCall f17849b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17848a = i10;
        this.f17849b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17848a) {
            case 0:
                ConferenceCall.n(this.f17849b);
                return;
            case 1:
                ConferenceCall.g(this.f17849b);
                return;
            default:
                ConferenceCall.j(this.f17849b);
                return;
        }
    }
}
