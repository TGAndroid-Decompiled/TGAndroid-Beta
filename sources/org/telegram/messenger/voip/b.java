package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f27564a;
    public final ConferenceCall f27565b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f27564a = i7;
        this.f27565b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f27564a) {
            case 0:
                ConferenceCall.n(this.f27565b);
                return;
            case 1:
                ConferenceCall.g(this.f27565b);
                return;
            default:
                ConferenceCall.j(this.f27565b);
                return;
        }
    }
}
