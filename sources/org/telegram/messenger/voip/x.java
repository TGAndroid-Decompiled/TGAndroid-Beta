package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17975a;
    public final VoIPService f17976b;
    public final HashSet f17977c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17975a = i10;
        this.f17976b = voIPService;
        this.f17977c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17975a) {
            case 0:
                this.f17976b.lambda$startConferenceGroupCall$42(this.f17977c, this.d);
                return;
            default:
                this.f17976b.lambda$startConferenceGroupCall$50(this.f17977c, this.d);
                return;
        }
    }
}
