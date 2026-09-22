package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17960a;
    public final VoIPService f17961b;
    public final HashSet f17962c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17960a = i10;
        this.f17961b = voIPService;
        this.f17962c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17960a) {
            case 0:
                this.f17961b.lambda$startConferenceGroupCall$42(this.f17962c, this.d);
                return;
            default:
                this.f17961b.lambda$startConferenceGroupCall$50(this.f17962c, this.d);
                return;
        }
    }
}
