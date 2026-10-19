package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19836a;
    public final ConferenceCall f19837b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19836a = i10;
        this.f19837b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19836a) {
            case 0:
                ConferenceCall.n(this.f19837b);
                return;
            case 1:
                ConferenceCall.g(this.f19837b);
                return;
            default:
                ConferenceCall.j(this.f19837b);
                return;
        }
    }
}
