package org.telegram.messenger.voip;

import java.util.HashSet;
public final class y implements Runnable {
    public final int f18726a;
    public final VoIPService f18727b;
    public final HashSet f18728c;
    public final String d;

    public y(VoIPService voIPService, HashSet hashSet, String str, int i10) {
        this.f18726a = i10;
        this.f18727b = voIPService;
        this.f18728c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18726a) {
            case 0:
                VoIPService.o0(this.f18727b, this.f18728c, this.d);
                return;
            default:
                VoIPService.p1(this.f18727b, this.f18728c, this.d);
                return;
        }
    }
}
