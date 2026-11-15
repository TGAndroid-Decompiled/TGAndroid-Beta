package org.telegram.messenger.voip;

import java.util.HashSet;
public final class w implements Runnable {
    public final int f27194a;
    public final VoIPService f27195b;
    public final HashSet f27196c;
    public final String d;

    public w(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f27194a = i7;
        this.f27195b = voIPService;
        this.f27196c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f27194a) {
            case 0:
                this.f27195b.lambda$startConferenceGroupCall$42(this.f27196c, this.d);
                return;
            default:
                this.f27195b.lambda$startConferenceGroupCall$50(this.f27196c, this.d);
                return;
        }
    }
}
