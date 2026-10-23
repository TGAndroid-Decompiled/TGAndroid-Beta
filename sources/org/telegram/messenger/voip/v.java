package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f20002a;
    public final VoIPService f20003b;
    public final HashSet f20004c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f20002a = i10;
        this.f20003b = voIPService;
        this.f20004c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20002a) {
            case 0:
                this.f20003b.lambda$startConferenceGroupCall$42(this.f20004c, this.d);
                return;
            default:
                this.f20003b.lambda$startConferenceGroupCall$50(this.f20004c, this.d);
                return;
        }
    }
}
