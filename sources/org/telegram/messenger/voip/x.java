package org.telegram.messenger.voip;

import java.util.HashSet;
public final class x implements Runnable {
    public final int f19624a;
    public final VoIPService f19625b;
    public final HashSet f19626c;
    public final String d;

    public x(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f19624a = i10;
        this.f19625b = voIPService;
        this.f19626c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19624a) {
            case 0:
                this.f19625b.lambda$startConferenceGroupCall$42(this.f19626c, this.d);
                return;
            default:
                this.f19625b.lambda$startConferenceGroupCall$50(this.f19626c, this.d);
                return;
        }
    }
}
