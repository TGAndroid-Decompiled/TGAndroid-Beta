package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19916a;
    public final ConferenceCall f19917b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19916a = i10;
        this.f19917b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19916a) {
            case 0:
                ConferenceCall.n(this.f19917b);
                return;
            case 1:
                ConferenceCall.g(this.f19917b);
                return;
            default:
                ConferenceCall.j(this.f19917b);
                return;
        }
    }
}
