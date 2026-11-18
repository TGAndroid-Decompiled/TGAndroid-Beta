package org.telegram.messenger.voip;

import java.util.HashSet;
public final class w implements Runnable {
    public final int f27560a;
    public final VoIPService f27561b;
    public final HashSet f27562c;
    public final String d;

    public w(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f27560a = i7;
        this.f27561b = voIPService;
        this.f27562c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f27560a) {
            case 0:
                this.f27561b.lambda$startConferenceGroupCall$42(this.f27562c, this.d);
                return;
            default:
                this.f27561b.lambda$startConferenceGroupCall$50(this.f27562c, this.d);
                return;
        }
    }
}
