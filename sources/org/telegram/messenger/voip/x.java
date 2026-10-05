package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f19629a;
    public final VoIPService f19630b;
    public final HashSet f19631c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19629a = i10;
        this.f19630b = voIPService;
        this.f19631c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19629a) {
            case 0:
                this.f19630b.lambda$startConferenceGroupCall$42(this.f19631c, this.d);
                return;
            default:
                this.f19630b.lambda$startConferenceGroupCall$50(this.f19631c, this.d);
                return;
        }
    }
}
