package org.telegram.messenger.voip;

import java.util.HashSet;
public final class u implements Runnable {
    public final int f26062a;
    public final VoIPService f26063b;
    public final HashSet f26064c;
    public final String d;

    public u(VoIPService voIPService, HashSet hashSet, String str, int i3) {
        this.f26062a = i3;
        this.f26063b = voIPService;
        this.f26064c = hashSet;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f26062a) {
            case 0:
                VoIPService.o0(this.f26063b, this.f26064c, this.d);
                return;
            default:
                VoIPService.p1(this.f26063b, this.f26064c, this.d);
                return;
        }
    }
}
