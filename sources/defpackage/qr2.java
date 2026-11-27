package defpackage;

import org.telegram.messenger.voip.ConferenceCall;
public final class qr2 implements Runnable {
    public final byte a;
    public final ConferenceCall b;

    public qr2(ConferenceCall conferenceCall, byte b) {
        this.a = b;
        this.b = conferenceCall;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ConferenceCall conferenceCall = this.b;
        switch (b) {
            case 0:
                ConferenceCall.e(conferenceCall);
                return;
            case 1:
                ConferenceCall.c(conferenceCall);
                return;
            default:
                ConferenceCall.a(conferenceCall);
                return;
        }
    }
}
