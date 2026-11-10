package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f26184a;
    public final VoIPService f26185b;
    public final HashSet f26186c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f26184a = i7;
        this.f26185b = voIPService;
        this.f26186c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f26184a) {
            case 0:
                this.f26185b.lambda$startConferenceGroupCall$42(this.f26186c, this.d);
                return;
            default:
                this.f26185b.lambda$startConferenceGroupCall$50(this.f26186c, this.d);
                return;
        }
    }
}
