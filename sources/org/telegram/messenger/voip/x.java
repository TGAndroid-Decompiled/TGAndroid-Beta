package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class x implements Runnable {
    public final int f22026a;
    public final VoIPService f22027b;
    public final ArrayList f22028c;
    public final ArrayList d;
    public final ArrayList f22029e;
    public final String f22030f;

    public x(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f22026a = i10;
        this.f22027b = voIPService;
        this.f22028c = arrayList;
        this.d = arrayList2;
        this.f22029e = arrayList3;
        this.f22030f = str;
    }

    @Override
    public final void run() {
        switch (this.f22026a) {
            case 0:
                this.f22027b.lambda$startConferenceGroupCall$47(this.f22028c, this.d, this.f22029e, this.f22030f);
                return;
            default:
                this.f22027b.lambda$startConferenceGroupCall$39(this.f22028c, this.d, this.f22029e, this.f22030f);
                return;
        }
    }
}
