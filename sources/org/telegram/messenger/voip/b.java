package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19527a;
    public final ConferenceCall f19528b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19527a = i10;
        this.f19528b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19527a) {
            case 0:
                ConferenceCall.n(this.f19528b);
                return;
            case 1:
                ConferenceCall.g(this.f19528b);
                return;
            default:
                ConferenceCall.j(this.f19528b);
                return;
        }
    }
}
