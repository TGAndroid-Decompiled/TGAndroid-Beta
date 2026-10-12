package org.telegram.messenger.voip;

import java.util.HashSet;
public final class y implements Runnable {
    public final int f18876a;
    public final VoIPService f18877b;
    public final HashSet f18878c;
    public final String d;

    public y(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f18876a = i10;
        this.f18877b = voIPService;
        this.f18878c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18876a) {
            case 0:
                this.f18877b.lambda$startConferenceGroupCall$42(this.f18878c, this.d);
                return;
            default:
                this.f18877b.lambda$startConferenceGroupCall$50(this.f18878c, this.d);
                return;
        }
    }
}
