package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f20000a;
    public final VoIPService f20001b;
    public final ArrayList f20002c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f20003f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f20000a = i10;
        this.f20001b = voIPService;
        this.f20002c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f20003f = str;
    }

    @Override
    public final void run() {
        switch (this.f20000a) {
            case 0:
                this.f20001b.lambda$startConferenceGroupCall$47(this.f20002c, this.d, this.e, this.f20003f);
                return;
            default:
                this.f20001b.lambda$startConferenceGroupCall$39(this.f20002c, this.d, this.e, this.f20003f);
                return;
        }
    }
}
