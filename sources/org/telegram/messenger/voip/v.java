package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f19916a;
    public final VoIPService f19917b;
    public final HashSet f19918c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19916a = i10;
        this.f19917b = voIPService;
        this.f19918c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19916a) {
            case 0:
                this.f19917b.lambda$startConferenceGroupCall$42(this.f19918c, this.d);
                return;
            default:
                this.f19917b.lambda$startConferenceGroupCall$50(this.f19918c, this.d);
                return;
        }
    }
}
