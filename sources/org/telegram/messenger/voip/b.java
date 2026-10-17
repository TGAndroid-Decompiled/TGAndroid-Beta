package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19826a;
    public final ConferenceCall f19827b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19826a = i10;
        this.f19827b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19826a) {
            case 0:
                ConferenceCall.n(this.f19827b);
                return;
            case 1:
                ConferenceCall.g(this.f19827b);
                return;
            default:
                ConferenceCall.j(this.f19827b);
                return;
        }
    }
}
