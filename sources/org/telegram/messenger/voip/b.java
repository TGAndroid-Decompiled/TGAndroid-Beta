package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f16691a;
    public final ConferenceCall f16692b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f16691a = i10;
        this.f16692b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f16691a) {
            case 0:
                ConferenceCall.n(this.f16692b);
                return;
            case 1:
                ConferenceCall.g(this.f16692b);
                return;
            default:
                ConferenceCall.j(this.f16692b);
                return;
        }
    }
}
