package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f26097a;
    public final ConferenceCall f26098b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f26097a = i7;
        this.f26098b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f26097a) {
            case 0:
                ConferenceCall.n(this.f26098b);
                return;
            case 1:
                ConferenceCall.g(this.f26098b);
                return;
            default:
                ConferenceCall.j(this.f26098b);
                return;
        }
    }
}
