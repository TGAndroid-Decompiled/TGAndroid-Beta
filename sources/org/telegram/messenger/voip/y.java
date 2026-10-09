package org.telegram.messenger.voip;

import java.util.HashSet;
public final class y implements Runnable {
    public final int f19641a;
    public final VoIPService f19642b;
    public final HashSet f19643c;
    public final String d;

    public y(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19641a = i10;
        this.f19642b = voIPService;
        this.f19643c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19641a) {
            case 0:
                this.f19642b.lambda$startConferenceGroupCall$42(this.f19643c, this.d);
                return;
            default:
                this.f19642b.lambda$startConferenceGroupCall$50(this.f19643c, this.d);
                return;
        }
    }
}
