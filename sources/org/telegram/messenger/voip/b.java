package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f27468a;
    public final ConferenceCall f27469b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f27468a = i7;
        this.f27469b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f27468a) {
            case 0:
                ConferenceCall.n(this.f27469b);
                return;
            case 1:
                ConferenceCall.g(this.f27469b);
                return;
            default:
                ConferenceCall.j(this.f27469b);
                return;
        }
    }
}
