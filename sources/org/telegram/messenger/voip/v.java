package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f19922a;
    public final VoIPService f19923b;
    public final HashSet f19924c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19922a = i10;
        this.f19923b = voIPService;
        this.f19924c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19922a) {
            case 0:
                this.f19923b.lambda$startConferenceGroupCall$42(this.f19924c, this.d);
                return;
            default:
                this.f19923b.lambda$startConferenceGroupCall$50(this.f19924c, this.d);
                return;
        }
    }
}
