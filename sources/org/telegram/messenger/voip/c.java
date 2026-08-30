package org.telegram.messenger.voip;
public final class c implements Runnable {
    public final int f18762a;
    public final ConferenceCall f18763b;

    public c(ConferenceCall conferenceCall, int i10) {
        this.f18762a = i10;
        this.f18763b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f18762a) {
            case 0:
                ConferenceCall.n(this.f18763b);
                return;
            case 1:
                ConferenceCall.g(this.f18763b);
                return;
            default:
                ConferenceCall.j(this.f18763b);
                return;
        }
    }
}
