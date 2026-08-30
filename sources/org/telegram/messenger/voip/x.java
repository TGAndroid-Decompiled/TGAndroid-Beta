package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f18852a;
    public final VoIPService f18853b;
    public final HashSet f18854c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f18852a = i10;
        this.f18853b = voIPService;
        this.f18854c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18852a) {
            case 0:
                this.f18853b.lambda$startConferenceGroupCall$42(this.f18854c, this.d);
                return;
            default:
                this.f18853b.lambda$startConferenceGroupCall$50(this.f18854c, this.d);
                return;
        }
    }
}
