package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f18738a;
    public final ConferenceCall f18739b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f18738a = i10;
        this.f18739b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f18738a) {
            case 0:
                ConferenceCall.n(this.f18739b);
                return;
            case 1:
                ConferenceCall.g(this.f18739b);
                return;
            default:
                ConferenceCall.j(this.f18739b);
                return;
        }
    }
}
