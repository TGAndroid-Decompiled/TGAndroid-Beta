package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f21957a;
    public final VoIPService f21958b;
    public final HashSet f21959c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i9) {
        this.f21957a = i9;
        this.f21958b = voIPService;
        this.f21959c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f21957a) {
            case 0:
                this.f21958b.lambda$startConferenceGroupCall$42(this.f21959c, this.d);
                return;
            default:
                this.f21958b.lambda$startConferenceGroupCall$50(this.f21959c, this.d);
                return;
        }
    }
}
