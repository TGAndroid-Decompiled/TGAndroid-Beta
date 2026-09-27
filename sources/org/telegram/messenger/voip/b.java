package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17861a;
    public final ConferenceCall f17862b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17861a = i10;
        this.f17862b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17861a) {
            case 0:
                ConferenceCall.n(this.f17862b);
                return;
            case 1:
                ConferenceCall.g(this.f17862b);
                return;
            default:
                ConferenceCall.j(this.f17862b);
                return;
        }
    }
}
