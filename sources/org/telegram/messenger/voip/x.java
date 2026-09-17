package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f19447a;
    public final VoIPService f19448b;
    public final HashSet f19449c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19447a = i10;
        this.f19448b = voIPService;
        this.f19449c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19447a) {
            case 0:
                this.f19448b.lambda$startConferenceGroupCall$42(this.f19449c, this.d);
                return;
            default:
                this.f19448b.lambda$startConferenceGroupCall$50(this.f19449c, this.d);
                return;
        }
    }
}
