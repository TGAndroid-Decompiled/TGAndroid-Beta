package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17721a;
    public final VoIPService f17722b;
    public final HashSet f17723c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17721a = i10;
        this.f17722b = voIPService;
        this.f17723c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17721a) {
            case 0:
                this.f17722b.lambda$startConferenceGroupCall$42(this.f17723c, this.d);
                return;
            default:
                this.f17722b.lambda$startConferenceGroupCall$50(this.f17723c, this.d);
                return;
        }
    }
}
