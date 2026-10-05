package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19522a;
    public final ConferenceCall f19523b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19522a = i10;
        this.f19523b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19522a) {
            case 0:
                ConferenceCall.n(this.f19523b);
                return;
            case 1:
                ConferenceCall.g(this.f19523b);
                return;
            default:
                ConferenceCall.j(this.f19523b);
                return;
        }
    }
}
