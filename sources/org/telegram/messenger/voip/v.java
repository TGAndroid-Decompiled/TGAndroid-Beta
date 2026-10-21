package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f19913a;
    public final VoIPService f19914b;
    public final HashSet f19915c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19913a = i10;
        this.f19914b = voIPService;
        this.f19915c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19913a) {
            case 0:
                this.f19914b.lambda$startConferenceGroupCall$42(this.f19915c, this.d);
                return;
            default:
                this.f19914b.lambda$startConferenceGroupCall$50(this.f19915c, this.d);
                return;
        }
    }
}
