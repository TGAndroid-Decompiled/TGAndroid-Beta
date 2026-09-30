package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17991a;
    public final VoIPService f17992b;
    public final HashSet f17993c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17991a = i10;
        this.f17992b = voIPService;
        this.f17993c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17991a) {
            case 0:
                this.f17992b.lambda$startConferenceGroupCall$42(this.f17993c, this.d);
                return;
            default:
                this.f17992b.lambda$startConferenceGroupCall$50(this.f17993c, this.d);
                return;
        }
    }
}
