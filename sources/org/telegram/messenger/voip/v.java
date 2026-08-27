package org.telegram.messenger.voip;

import java.util.HashSet;

public final class v implements Runnable {

    public final int f21981a;

    public final VoIPService f21982b;

    public final HashSet f21983c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f21981a = i10;
        this.f21982b = voIPService;
        this.f21983c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f21981a) {
            case 0:
                this.f21982b.lambda$startConferenceGroupCall$42(this.f21983c, this.d);
                break;
            default:
                this.f21982b.lambda$startConferenceGroupCall$50(this.f21983c, this.d);
                break;
        }
    }
}
