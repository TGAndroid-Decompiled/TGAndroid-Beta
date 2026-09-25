package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17964a;
    public final VoIPService f17965b;
    public final HashSet f17966c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17964a = i10;
        this.f17965b = voIPService;
        this.f17966c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17964a) {
            case 0:
                this.f17965b.lambda$startConferenceGroupCall$42(this.f17966c, this.d);
                return;
            default:
                this.f17965b.lambda$startConferenceGroupCall$50(this.f17966c, this.d);
                return;
        }
    }
}
