package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17716a;
    public final VoIPService f17717b;
    public final HashSet f17718c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17716a = i10;
        this.f17717b = voIPService;
        this.f17718c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17716a) {
            case 0:
                this.f17717b.lambda$startConferenceGroupCall$42(this.f17718c, this.d);
                return;
            default:
                this.f17717b.lambda$startConferenceGroupCall$50(this.f17718c, this.d);
                return;
        }
    }
}
