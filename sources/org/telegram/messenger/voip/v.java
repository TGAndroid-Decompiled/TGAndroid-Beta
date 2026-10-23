package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f19937a;
    public final VoIPService f19938b;
    public final HashSet f19939c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19937a = i10;
        this.f19938b = voIPService;
        this.f19939c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19937a) {
            case 0:
                this.f19938b.lambda$startConferenceGroupCall$42(this.f19939c, this.d);
                return;
            default:
                this.f19938b.lambda$startConferenceGroupCall$50(this.f19939c, this.d);
                return;
        }
    }
}
