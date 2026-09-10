package org.telegram.messenger.voip;

import java.util.HashSet;
public final class z implements Runnable {
    public final int f16807a;
    public final VoIPService f16808b;
    public final HashSet f16809c;
    public final String d;

    public z(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f16807a = i10;
        this.f16808b = voIPService;
        this.f16809c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16807a) {
            case 0:
                VoIPService.o0(this.f16808b, this.f16809c, this.d);
                return;
            default:
                VoIPService.o1(this.f16808b, this.f16809c, this.d);
                return;
        }
    }
}
