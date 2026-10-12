package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f19409a;
    public final VoIPService f19410b;
    public final HashSet f19411c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19409a = i10;
        this.f19410b = voIPService;
        this.f19411c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19409a) {
            case 0:
                this.f19410b.lambda$startConferenceGroupCall$42(this.f19411c, this.d);
                return;
            default:
                this.f19410b.lambda$startConferenceGroupCall$50(this.f19411c, this.d);
                return;
        }
    }
}
