package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f18777a;
    public final ConferenceCall f18778b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f18777a = i10;
        this.f18778b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f18777a) {
            case 0:
                ConferenceCall.n(this.f18778b);
                return;
            case 1:
                ConferenceCall.g(this.f18778b);
                return;
            default:
                ConferenceCall.j(this.f18778b);
                return;
        }
    }
}
