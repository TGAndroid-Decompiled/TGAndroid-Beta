package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f20383a;
    public final ConferenceCall f20384b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f20383a = i10;
        this.f20384b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f20383a) {
            case 0:
                ConferenceCall.n(this.f20384b);
                return;
            case 1:
                ConferenceCall.g(this.f20384b);
                return;
            default:
                ConferenceCall.j(this.f20384b);
                return;
        }
    }
}
