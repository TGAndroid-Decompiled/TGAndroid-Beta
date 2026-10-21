package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19827a;
    public final ConferenceCall f19828b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19827a = i10;
        this.f19828b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19827a) {
            case 0:
                ConferenceCall.n(this.f19828b);
                return;
            case 1:
                ConferenceCall.g(this.f19828b);
                return;
            default:
                ConferenceCall.j(this.f19828b);
                return;
        }
    }
}
