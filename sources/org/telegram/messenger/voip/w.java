package org.telegram.messenger.voip;

import java.util.HashSet;
public final class w implements Runnable {
    public final int f27656a;
    public final VoIPService f27657b;
    public final HashSet f27658c;
    public final String d;

    public w(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f27656a = i7;
        this.f27657b = voIPService;
        this.f27658c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f27656a) {
            case 0:
                this.f27657b.lambda$startConferenceGroupCall$42(this.f27658c, this.d);
                return;
            default:
                this.f27657b.lambda$startConferenceGroupCall$50(this.f27658c, this.d);
                return;
        }
    }
}
