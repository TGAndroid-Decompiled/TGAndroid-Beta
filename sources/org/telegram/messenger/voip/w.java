package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f26187a;
    public final VoIPService f26188b;
    public final ArrayList f26189c;
    public final ArrayList d;
    public final ArrayList f26190e;
    public final String f26191f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f26187a = i7;
        this.f26188b = voIPService;
        this.f26189c = arrayList;
        this.d = arrayList2;
        this.f26190e = arrayList3;
        this.f26191f = str;
    }

    @Override
    public final void run() {
        switch (this.f26187a) {
            case 0:
                this.f26188b.lambda$startConferenceGroupCall$47(this.f26189c, this.d, this.f26190e, this.f26191f);
                return;
            default:
                this.f26188b.lambda$startConferenceGroupCall$39(this.f26189c, this.d, this.f26190e, this.f26191f);
                return;
        }
    }
}
