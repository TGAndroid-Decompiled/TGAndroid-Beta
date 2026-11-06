package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f26087a;
    public final ConferenceCall f26088b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f26087a = i7;
        this.f26088b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f26087a) {
            case 0:
                ConferenceCall.n(this.f26088b);
                return;
            case 1:
                ConferenceCall.g(this.f26088b);
                return;
            default:
                ConferenceCall.j(this.f26088b);
                return;
        }
    }
}
