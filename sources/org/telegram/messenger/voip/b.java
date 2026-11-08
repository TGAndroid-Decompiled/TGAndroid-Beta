package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f26093a;
    public final ConferenceCall f26094b;

    public b(ConferenceCall conferenceCall, int i7) {
        this.f26093a = i7;
        this.f26094b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f26093a) {
            case 0:
                ConferenceCall.n(this.f26094b);
                return;
            case 1:
                ConferenceCall.g(this.f26094b);
                return;
            default:
                ConferenceCall.j(this.f26094b);
                return;
        }
    }
}
