package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f21960a;
    public final VoIPService f21961b;
    public final ArrayList f21962c;
    public final ArrayList d;
    public final ArrayList f21963e;
    public final String f21964f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i9) {
        this.f21960a = i9;
        this.f21961b = voIPService;
        this.f21962c = arrayList;
        this.d = arrayList2;
        this.f21963e = arrayList3;
        this.f21964f = str;
    }

    @Override
    public final void run() {
        switch (this.f21960a) {
            case 0:
                this.f21961b.lambda$startConferenceGroupCall$47(this.f21962c, this.d, this.f21963e, this.f21964f);
                return;
            default:
                this.f21961b.lambda$startConferenceGroupCall$39(this.f21962c, this.d, this.f21963e, this.f21964f);
                return;
        }
    }
}
