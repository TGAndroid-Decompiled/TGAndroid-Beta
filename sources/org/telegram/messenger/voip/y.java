package org.telegram.messenger.voip;

import java.util.HashSet;
public final class y implements Runnable {
    public final int f18886a;
    public final VoIPService f18887b;
    public final HashSet f18888c;
    public final String d;

    public y(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f18886a = i10;
        this.f18887b = voIPService;
        this.f18888c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18886a) {
            case 0:
                VoIPService.o0(this.f18887b, this.f18888c, this.d);
                return;
            default:
                VoIPService.p1(this.f18887b, this.f18888c, this.d);
                return;
        }
    }
}
