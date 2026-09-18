package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17633a;
    public final ConferenceCall f17634b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17633a = i10;
        this.f17634b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17633a) {
            case 0:
                ConferenceCall.n(this.f17634b);
                return;
            case 1:
                ConferenceCall.g(this.f17634b);
                return;
            default:
                ConferenceCall.j(this.f17634b);
                return;
        }
    }
}
