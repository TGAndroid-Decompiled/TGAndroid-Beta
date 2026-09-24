package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f17949a;
    public final VoIPService f17950b;
    public final HashSet f17951c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f17949a = i10;
        this.f17950b = voIPService;
        this.f17951c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17949a) {
            case 0:
                this.f17950b.lambda$startConferenceGroupCall$42(this.f17951c, this.d);
                return;
            default:
                this.f17950b.lambda$startConferenceGroupCall$50(this.f17951c, this.d);
                return;
        }
    }
}
