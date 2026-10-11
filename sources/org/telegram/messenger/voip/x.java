package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f19668a;
    public final VoIPService f19669b;
    public final HashSet f19670c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19668a = i10;
        this.f19669b = voIPService;
        this.f19670c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19668a) {
            case 0:
                this.f19669b.lambda$startConferenceGroupCall$42(this.f19670c, this.d);
                return;
            default:
                this.f19669b.lambda$startConferenceGroupCall$50(this.f19670c, this.d);
                return;
        }
    }
}
