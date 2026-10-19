package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f19919a;
    public final VoIPService f19920b;
    public final HashSet f19921c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19919a = i10;
        this.f19920b = voIPService;
        this.f19921c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19919a) {
            case 0:
                this.f19920b.lambda$startConferenceGroupCall$42(this.f19921c, this.d);
                return;
            default:
                this.f19920b.lambda$startConferenceGroupCall$50(this.f19921c, this.d);
                return;
        }
    }
}
