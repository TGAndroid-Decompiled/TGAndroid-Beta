package org.telegram.messenger.voip;

import java.util.HashSet;
public final class w implements Runnable {
    public final int f27588a;
    public final VoIPService f27589b;
    public final HashSet f27590c;
    public final String d;

    public w(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f27588a = i7;
        this.f27589b = voIPService;
        this.f27590c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f27588a) {
            case 0:
                this.f27589b.lambda$startConferenceGroupCall$42(this.f27590c, this.d);
                return;
            default:
                this.f27589b.lambda$startConferenceGroupCall$50(this.f27590c, this.d);
                return;
        }
    }
}
