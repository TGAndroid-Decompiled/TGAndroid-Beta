package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f19474a;
    public final VoIPService f19475b;
    public final HashSet f19476c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19474a = i10;
        this.f19475b = voIPService;
        this.f19476c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19474a) {
            case 0:
                this.f19475b.lambda$startConferenceGroupCall$42(this.f19476c, this.d);
                return;
            default:
                this.f19475b.lambda$startConferenceGroupCall$50(this.f19476c, this.d);
                return;
        }
    }
}
