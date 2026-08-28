package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f21860a;
    public final ConferenceCall f21861b;

    public b(ConferenceCall conferenceCall, int i9) {
        this.f21860a = i9;
        this.f21861b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f21860a) {
            case 0:
                ConferenceCall.n(this.f21861b);
                return;
            case 1:
                ConferenceCall.g(this.f21861b);
                return;
            default:
                ConferenceCall.j(this.f21861b);
                return;
        }
    }
}
