package org.telegram.messenger.voip;

import java.util.HashSet;
public final class w implements Runnable {
    public final int f19918a;
    public final VoIPService f19919b;
    public final HashSet f19920c;
    public final String d;

    public w(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19918a = i10;
        this.f19919b = voIPService;
        this.f19920c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19918a) {
            case 0:
                this.f19919b.lambda$startConferenceGroupCall$42(this.f19920c, this.d);
                return;
            default:
                this.f19919b.lambda$startConferenceGroupCall$50(this.f19920c, this.d);
                return;
        }
    }
}
