package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19837a;
    public final ConferenceCall f19838b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19837a = i10;
        this.f19838b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19837a) {
            case 0:
                ConferenceCall.n(this.f19838b);
                return;
            case 1:
                ConferenceCall.g(this.f19838b);
                return;
            default:
                ConferenceCall.j(this.f19838b);
                return;
        }
    }
}
