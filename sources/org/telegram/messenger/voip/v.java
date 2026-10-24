package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f19997a;
    public final VoIPService f19998b;
    public final HashSet f19999c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19997a = i10;
        this.f19998b = voIPService;
        this.f19999c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19997a) {
            case 0:
                this.f19998b.lambda$startConferenceGroupCall$42(this.f19999c, this.d);
                return;
            default:
                this.f19998b.lambda$startConferenceGroupCall$50(this.f19999c, this.d);
                return;
        }
    }
}
