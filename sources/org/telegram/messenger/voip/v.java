package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f19934a;
    public final VoIPService f19935b;
    public final HashSet f19936c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19934a = i10;
        this.f19935b = voIPService;
        this.f19936c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19934a) {
            case 0:
                this.f19935b.lambda$startConferenceGroupCall$42(this.f19936c, this.d);
                return;
            default:
                this.f19935b.lambda$startConferenceGroupCall$50(this.f19936c, this.d);
                return;
        }
    }
}
