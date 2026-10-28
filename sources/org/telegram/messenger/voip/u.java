package org.telegram.messenger.voip;

import java.util.HashSet;
public final class u implements Runnable {
    public final int f21685a;
    public final VoIPService f21686b;
    public final HashSet f21687c;
    public final String d;

    public u(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f21685a = i10;
        this.f21686b = voIPService;
        this.f21687c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f21685a) {
            case 0:
                this.f21686b.lambda$startConferenceGroupCall$42(this.f21687c, this.d);
                return;
            default:
                this.f21686b.lambda$startConferenceGroupCall$50(this.f21687c, this.d);
                return;
        }
    }
}
