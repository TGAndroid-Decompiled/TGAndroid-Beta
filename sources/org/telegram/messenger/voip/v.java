package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f26174a;
    public final VoIPService f26175b;
    public final HashSet f26176c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f26174a = i7;
        this.f26175b = voIPService;
        this.f26176c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f26174a) {
            case 0:
                this.f26175b.lambda$startConferenceGroupCall$42(this.f26176c, this.d);
                return;
            default:
                this.f26175b.lambda$startConferenceGroupCall$50(this.f26176c, this.d);
                return;
        }
    }
}
