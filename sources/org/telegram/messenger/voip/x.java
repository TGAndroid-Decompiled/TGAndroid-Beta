package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f20486a;
    public final VoIPService f20487b;
    public final HashSet f20488c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f20486a = i10;
        this.f20487b = voIPService;
        this.f20488c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20486a) {
            case 0:
                this.f20487b.lambda$startConferenceGroupCall$42(this.f20488c, this.d);
                return;
            default:
                this.f20487b.lambda$startConferenceGroupCall$50(this.f20488c, this.d);
                return;
        }
    }
}
