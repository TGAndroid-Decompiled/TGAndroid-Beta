package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19848a;
    public final ConferenceCall f19849b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19848a = i10;
        this.f19849b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19848a) {
            case 0:
                ConferenceCall.n(this.f19849b);
                return;
            case 1:
                ConferenceCall.g(this.f19849b);
                return;
            default:
                ConferenceCall.j(this.f19849b);
                return;
        }
    }
}
