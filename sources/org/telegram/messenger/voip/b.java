package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19327a;
    public final ConferenceCall f19328b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19327a = i10;
        this.f19328b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19327a) {
            case 0:
                ConferenceCall.n(this.f19328b);
                return;
            case 1:
                ConferenceCall.g(this.f19328b);
                return;
            default:
                ConferenceCall.j(this.f19328b);
                return;
        }
    }
}
