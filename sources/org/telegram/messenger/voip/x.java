package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f19408a;
    public final VoIPService f19409b;
    public final HashSet f19410c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19408a = i10;
        this.f19409b = voIPService;
        this.f19410c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19408a) {
            case 0:
                this.f19409b.lambda$startConferenceGroupCall$42(this.f19410c, this.d);
                return;
            default:
                this.f19409b.lambda$startConferenceGroupCall$50(this.f19410c, this.d);
                return;
        }
    }
}
