package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17907a;
    public final VoIPService f17908b;
    public final HashSet f17909c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17907a = i10;
        this.f17908b = voIPService;
        this.f17909c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17907a) {
            case 0:
                this.f17908b.lambda$startConferenceGroupCall$42(this.f17909c, this.d);
                return;
            default:
                this.f17908b.lambda$startConferenceGroupCall$50(this.f17909c, this.d);
                return;
        }
    }
}
