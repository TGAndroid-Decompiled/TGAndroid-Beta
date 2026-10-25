package org.telegram.messenger.voip;

import java.util.HashSet;
public final class u implements Runnable {
    public final int f21697a;
    public final VoIPService f21698b;
    public final HashSet f21699c;
    public final String d;

    public u(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f21697a = i10;
        this.f21698b = voIPService;
        this.f21699c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f21697a) {
            case 0:
                this.f21698b.lambda$startConferenceGroupCall$42(this.f21699c, this.d);
                return;
            default:
                this.f21698b.lambda$startConferenceGroupCall$50(this.f21699c, this.d);
                return;
        }
    }
}
