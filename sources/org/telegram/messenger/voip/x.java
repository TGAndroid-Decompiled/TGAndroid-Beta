package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f19632a;
    public final VoIPService f19633b;
    public final HashSet f19634c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19632a = i10;
        this.f19633b = voIPService;
        this.f19634c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19632a) {
            case 0:
                this.f19633b.lambda$startConferenceGroupCall$42(this.f19634c, this.d);
                return;
            default:
                this.f19633b.lambda$startConferenceGroupCall$50(this.f19634c, this.d);
                return;
        }
    }
}
