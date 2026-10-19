package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f19922a;
    public final VoIPService f19923b;
    public final ArrayList f19924c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f19925f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19922a = i10;
        this.f19923b = voIPService;
        this.f19924c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f19925f = str;
    }

    @Override
    public final void run() {
        switch (this.f19922a) {
            case 0:
                this.f19923b.lambda$startConferenceGroupCall$47(this.f19924c, this.d, this.e, this.f19925f);
                return;
            default:
                this.f19923b.lambda$startConferenceGroupCall$39(this.f19924c, this.d, this.e, this.f19925f);
                return;
        }
    }
}
