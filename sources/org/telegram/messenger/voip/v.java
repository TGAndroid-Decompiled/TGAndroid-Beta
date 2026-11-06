package org.telegram.messenger.voip;

import java.util.HashSet;
public final class v implements Runnable {
    public final int f26166a;
    public final VoIPService f26167b;
    public final HashSet f26168c;
    public final String d;

    public v(VoIPService voIPService, HashSet hashSet, String str, int i7) {
        this.f26166a = i7;
        this.f26167b = voIPService;
        this.f26168c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f26166a) {
            case 0:
                VoIPService.o0(this.f26167b, this.f26168c, this.d);
                return;
            default:
                VoIPService.p1(this.f26167b, this.f26168c, this.d);
                return;
        }
    }
}
