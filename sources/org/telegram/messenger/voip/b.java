package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f26079a;
    public final ConferenceCall f26080b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f26079a = i7;
        this.f26080b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f26079a) {
            case 0:
                ConferenceCall.n(this.f26080b);
                return;
            case 1:
                ConferenceCall.g(this.f26080b);
                return;
            default:
                ConferenceCall.j(this.f26080b);
                return;
        }
    }
}
