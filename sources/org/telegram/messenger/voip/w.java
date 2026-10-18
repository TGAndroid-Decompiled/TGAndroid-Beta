package org.telegram.messenger.voip;

import java.util.HashSet;
public final class w implements Runnable {
    public final int f19929a;
    public final VoIPService f19930b;
    public final HashSet f19931c;
    public final String d;

    public w(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19929a = i10;
        this.f19930b = voIPService;
        this.f19931c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19929a) {
            case 0:
                this.f19930b.lambda$startConferenceGroupCall$42(this.f19931c, this.d);
                return;
            default:
                this.f19930b.lambda$startConferenceGroupCall$50(this.f19931c, this.d);
                return;
        }
    }
}
