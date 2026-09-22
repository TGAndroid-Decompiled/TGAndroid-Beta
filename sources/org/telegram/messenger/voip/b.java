package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17619a;
    public final ConferenceCall f17620b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17619a = i10;
        this.f17620b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17619a) {
            case 0:
                ConferenceCall.n(this.f17620b);
                return;
            case 1:
                ConferenceCall.g(this.f17620b);
                return;
            default:
                ConferenceCall.j(this.f17620b);
                return;
        }
    }
}
