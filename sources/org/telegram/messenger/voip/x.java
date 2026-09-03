package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f18834a;
    public final VoIPService f18835b;
    public final HashSet f18836c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f18834a = i10;
        this.f18835b = voIPService;
        this.f18836c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18834a) {
            case 0:
                this.f18835b.lambda$startConferenceGroupCall$42(this.f18836c, this.d);
                return;
            default:
                this.f18835b.lambda$startConferenceGroupCall$50(this.f18836c, this.d);
                return;
        }
    }
}
