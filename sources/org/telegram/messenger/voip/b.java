package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19517a;
    public final ConferenceCall f19518b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19517a = i10;
        this.f19518b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19517a) {
            case 0:
                ConferenceCall.n(this.f19518b);
                return;
            case 1:
                ConferenceCall.g(this.f19518b);
                return;
            default:
                ConferenceCall.j(this.f19518b);
                return;
        }
    }
}
