package org.telegram.messenger.voip;

import java.util.HashSet;
public final class w implements Runnable {
    public final int f27551a;
    public final VoIPService f27552b;
    public final HashSet f27553c;
    public final String d;

    public w(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f27551a = i7;
        this.f27552b = voIPService;
        this.f27553c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f27551a) {
            case 0:
                this.f27552b.lambda$startConferenceGroupCall$42(this.f27553c, this.d);
                return;
            default:
                this.f27552b.lambda$startConferenceGroupCall$50(this.f27553c, this.d);
                return;
        }
    }
}
