package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17958a;
    public final VoIPService f17959b;
    public final HashSet f17960c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17958a = i10;
        this.f17959b = voIPService;
        this.f17960c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17958a) {
            case 0:
                this.f17959b.lambda$startConferenceGroupCall$42(this.f17960c, this.d);
                return;
            default:
                this.f17959b.lambda$startConferenceGroupCall$50(this.f17960c, this.d);
                return;
        }
    }
}
