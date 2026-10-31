package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f18617a;
    public final ConferenceCall f18618b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f18617a = i10;
        this.f18618b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f18617a) {
            case 0:
                ConferenceCall.n(this.f18618b);
                return;
            case 1:
                ConferenceCall.g(this.f18618b);
                return;
            default:
                ConferenceCall.j(this.f18618b);
                return;
        }
    }
}
