package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f17608a;
    public final ConferenceCall f17609b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f17608a = i10;
        this.f17609b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f17608a) {
            case 0:
                ConferenceCall.n(this.f17609b);
                return;
            case 1:
                ConferenceCall.g(this.f17609b);
                return;
            default:
                ConferenceCall.j(this.f17609b);
                return;
        }
    }
}
