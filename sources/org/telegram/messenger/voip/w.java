package org.telegram.messenger.voip;

import java.util.HashSet;
public final class w implements Runnable {
    public final int f22023a;
    public final VoIPService f22024b;
    public final HashSet f22025c;
    public final String d;

    public w(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f22023a = i10;
        this.f22024b = voIPService;
        this.f22025c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f22023a) {
            case 0:
                this.f22024b.lambda$startConferenceGroupCall$42(this.f22025c, this.d);
                return;
            default:
                this.f22024b.lambda$startConferenceGroupCall$50(this.f22025c, this.d);
                return;
        }
    }
}
