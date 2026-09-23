package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17705a;
    public final VoIPService f17706b;
    public final HashSet f17707c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17705a = i10;
        this.f17706b = voIPService;
        this.f17707c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17705a) {
            case 0:
                this.f17706b.lambda$startConferenceGroupCall$42(this.f17707c, this.d);
                return;
            default:
                this.f17706b.lambda$startConferenceGroupCall$50(this.f17707c, this.d);
                return;
        }
    }
}
