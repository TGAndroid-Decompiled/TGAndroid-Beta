package org.telegram.messenger.voip;

import java.util.HashSet;
public final class w implements Runnable {
    public final int f27193a;
    public final VoIPService f27194b;
    public final HashSet f27195c;
    public final String d;

    public w(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f27193a = i7;
        this.f27194b = voIPService;
        this.f27195c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f27193a) {
            case 0:
                this.f27194b.lambda$startConferenceGroupCall$42(this.f27195c, this.d);
                return;
            default:
                this.f27194b.lambda$startConferenceGroupCall$50(this.f27195c, this.d);
                return;
        }
    }
}
