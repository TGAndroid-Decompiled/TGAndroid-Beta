package org.telegram.messenger.voip;

import java.util.ArrayList;

public final class w implements Runnable {

    public final int f21984a;

    public final VoIPService f21985b;

    public final ArrayList f21986c;
    public final ArrayList d;

    public final ArrayList f21987e;

    public final String f21988f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f21984a = i10;
        this.f21985b = voIPService;
        this.f21986c = arrayList;
        this.d = arrayList2;
        this.f21987e = arrayList3;
        this.f21988f = str;
    }

    @Override
    public final void run() {
        switch (this.f21984a) {
            case 0:
                this.f21985b.lambda$startConferenceGroupCall$47(this.f21986c, this.d, this.f21987e, this.f21988f);
                break;
            default:
                this.f21985b.lambda$startConferenceGroupCall$39(this.f21986c, this.d, this.f21987e, this.f21988f);
                break;
        }
    }
}
