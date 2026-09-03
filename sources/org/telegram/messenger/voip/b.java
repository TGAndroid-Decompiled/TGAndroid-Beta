package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f20385a;
    public final ConferenceCall f20386b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f20385a = i10;
        this.f20386b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f20385a) {
            case 0:
                ConferenceCall.n(this.f20386b);
                return;
            case 1:
                ConferenceCall.g(this.f20386b);
                return;
            default:
                ConferenceCall.j(this.f20386b);
                return;
        }
    }
}
