package org.telegram.messenger.voip;
public final class b implements Runnable {
    public final int f19341a;
    public final ConferenceCall f19342b;

    public b(ConferenceCall conferenceCall, int i10) {
        this.f19341a = i10;
        this.f19342b = conferenceCall;
    }

    @Override
    public final void run() {
        switch (this.f19341a) {
            case 0:
                ConferenceCall.n(this.f19342b);
                return;
            case 1:
                ConferenceCall.g(this.f19342b);
                return;
            default:
                ConferenceCall.j(this.f19342b);
                return;
        }
    }
}
