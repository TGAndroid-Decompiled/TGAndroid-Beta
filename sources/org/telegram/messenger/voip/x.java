package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17974a;
    public final VoIPService f17975b;
    public final HashSet f17976c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17974a = i10;
        this.f17975b = voIPService;
        this.f17976c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17974a) {
            case 0:
                this.f17975b.lambda$startConferenceGroupCall$42(this.f17976c, this.d);
                return;
            default:
                this.f17975b.lambda$startConferenceGroupCall$50(this.f17976c, this.d);
                return;
        }
    }
}
