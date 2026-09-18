package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17730a;
    public final VoIPService f17731b;
    public final HashSet f17732c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17730a = i10;
        this.f17731b = voIPService;
        this.f17732c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17730a) {
            case 0:
                this.f17731b.lambda$startConferenceGroupCall$42(this.f17732c, this.d);
                return;
            default:
                this.f17731b.lambda$startConferenceGroupCall$50(this.f17732c, this.d);
                return;
        }
    }
}
