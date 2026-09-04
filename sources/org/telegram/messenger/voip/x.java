package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f19433a;
    public final VoIPService f19434b;
    public final HashSet f19435c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19433a = i10;
        this.f19434b = voIPService;
        this.f19435c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19433a) {
            case 0:
                this.f19434b.lambda$startConferenceGroupCall$42(this.f19435c, this.d);
                return;
            default:
                this.f19434b.lambda$startConferenceGroupCall$50(this.f19435c, this.d);
                return;
        }
    }
}
