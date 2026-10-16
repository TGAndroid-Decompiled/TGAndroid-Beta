package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f18570a;
    public final VoIPService f18571b;
    public final HashSet f18572c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f18570a = i10;
        this.f18571b = voIPService;
        this.f18572c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18570a) {
            case 0:
                this.f18571b.lambda$startConferenceGroupCall$42(this.f18572c, this.d);
                return;
            default:
                this.f18571b.lambda$startConferenceGroupCall$50(this.f18572c, this.d);
                return;
        }
    }
}
