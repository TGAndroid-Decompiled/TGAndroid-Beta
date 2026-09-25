package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17867a;
    public final ConferenceCall f17868b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17867a = i10;
        this.f17868b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17867a) {
            case 0:
                ConferenceCall.n(this.f17868b);
                return;
            case 1:
                ConferenceCall.g(this.f17868b);
                return;
            default:
                ConferenceCall.j(this.f17868b);
                return;
        }
    }
}
