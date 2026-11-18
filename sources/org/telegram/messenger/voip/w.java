package org.telegram.messenger.voip;

import java.util.HashSet;
public final class w implements Runnable {
    public final int f27562a;
    public final VoIPService f27563b;
    public final HashSet f27564c;
    public final String d;

    public w(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f27562a = i7;
        this.f27563b = voIPService;
        this.f27564c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f27562a) {
            case 0:
                this.f27563b.lambda$startConferenceGroupCall$42(this.f27564c, this.d);
                return;
            default:
                this.f27563b.lambda$startConferenceGroupCall$50(this.f27564c, this.d);
                return;
        }
    }
}
