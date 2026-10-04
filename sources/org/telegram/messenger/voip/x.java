package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f19631a;
    public final VoIPService f19632b;
    public final HashSet f19633c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19631a = i10;
        this.f19632b = voIPService;
        this.f19633c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19631a) {
            case 0:
                this.f19632b.lambda$startConferenceGroupCall$42(this.f19633c, this.d);
                return;
            default:
                this.f19632b.lambda$startConferenceGroupCall$50(this.f19633c, this.d);
                return;
        }
    }
}
