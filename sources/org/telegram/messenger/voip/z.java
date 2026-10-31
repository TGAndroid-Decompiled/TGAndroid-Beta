package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class z implements Runnable {
    public final int f18729a;
    public final VoIPService f18730b;
    public final ArrayList f18731c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f18732f;

    public z(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f18729a = i10;
        this.f18730b = voIPService;
        this.f18731c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f18732f = str;
    }

    @Override
    public final void run() {
        switch (this.f18729a) {
            case 0:
                VoIPService.m1(this.f18730b, this.f18731c, this.d, this.e, this.f18732f);
                return;
            default:
                this.f18730b.lambda$startConferenceGroupCall$39(this.f18731c, this.d, this.e, this.f18732f);
                return;
        }
    }
}
