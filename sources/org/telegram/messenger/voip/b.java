package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19833a;
    public final ConferenceCall f19834b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19833a = i10;
        this.f19834b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19833a) {
            case 0:
                ConferenceCall.n(this.f19834b);
                return;
            case 1:
                ConferenceCall.g(this.f19834b);
                return;
            default:
                ConferenceCall.j(this.f19834b);
                return;
        }
    }
}
