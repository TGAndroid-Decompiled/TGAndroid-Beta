package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f20488a;
    public final VoIPService f20489b;
    public final HashSet f20490c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f20488a = i10;
        this.f20489b = voIPService;
        this.f20490c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20488a) {
            case 0:
                this.f20489b.lambda$startConferenceGroupCall$42(this.f20490c, this.d);
                return;
            default:
                this.f20489b.lambda$startConferenceGroupCall$50(this.f20490c, this.d);
                return;
        }
    }
}
