package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17624a;
    public final ConferenceCall f17625b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17624a = i10;
        this.f17625b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17624a) {
            case 0:
                ConferenceCall.n(this.f17625b);
                return;
            case 1:
                ConferenceCall.g(this.f17625b);
                return;
            default:
                ConferenceCall.j(this.f17625b);
                return;
        }
    }
}
