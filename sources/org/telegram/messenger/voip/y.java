package org.telegram.messenger.voip;

import java.util.HashSet;
public final class y implements Runnable {
    public final int f19645a;
    public final VoIPService f19646b;
    public final HashSet f19647c;
    public final String d;

    public y(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19645a = i10;
        this.f19646b = voIPService;
        this.f19647c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19645a) {
            case 0:
                this.f19646b.lambda$startConferenceGroupCall$42(this.f19647c, this.d);
                return;
            default:
                this.f19646b.lambda$startConferenceGroupCall$50(this.f19647c, this.d);
                return;
        }
    }
}
