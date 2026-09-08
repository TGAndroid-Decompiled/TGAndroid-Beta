package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f19460a;
    public final VoIPService f19461b;
    public final HashSet f19462c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19460a = i10;
        this.f19461b = voIPService;
        this.f19462c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19460a) {
            case 0:
                this.f19461b.lambda$startConferenceGroupCall$42(this.f19462c, this.d);
                return;
            default:
                this.f19461b.lambda$startConferenceGroupCall$50(this.f19462c, this.d);
                return;
        }
    }
}
