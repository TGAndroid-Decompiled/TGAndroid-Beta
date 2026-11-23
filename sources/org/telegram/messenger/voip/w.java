package org.telegram.messenger.voip;

import java.util.HashSet;
public final class w implements Runnable {
    public final int f27515a;
    public final VoIPService f27516b;
    public final HashSet f27517c;
    public final String d;

    public w(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f27515a = i7;
        this.f27516b = voIPService;
        this.f27517c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f27515a) {
            case 0:
                this.f27516b.lambda$startConferenceGroupCall$42(this.f27517c, this.d);
                return;
            default:
                this.f27516b.lambda$startConferenceGroupCall$50(this.f27517c, this.d);
                return;
        }
    }
}
