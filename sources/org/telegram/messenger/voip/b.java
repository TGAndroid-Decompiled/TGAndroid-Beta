package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19368a;
    public final ConferenceCall f19369b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19368a = i10;
        this.f19369b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19368a) {
            case 0:
                ConferenceCall.n(this.f19369b);
                return;
            case 1:
                ConferenceCall.g(this.f19369b);
                return;
            default:
                ConferenceCall.j(this.f19369b);
                return;
        }
    }
}
