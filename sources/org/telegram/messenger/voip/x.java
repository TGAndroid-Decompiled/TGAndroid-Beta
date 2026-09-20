package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17945a;
    public final VoIPService f17946b;
    public final HashSet f17947c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17945a = i10;
        this.f17946b = voIPService;
        this.f17947c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17945a) {
            case 0:
                this.f17946b.lambda$startConferenceGroupCall$42(this.f17947c, this.d);
                return;
            default:
                this.f17946b.lambda$startConferenceGroupCall$50(this.f17947c, this.d);
                return;
        }
    }
}
