package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f26183a;
    public final VoIPService f26184b;
    public final ArrayList f26185c;
    public final ArrayList d;
    public final ArrayList f26186e;
    public final String f26187f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i7) {
        this.f26183a = i7;
        this.f26184b = voIPService;
        this.f26185c = arrayList;
        this.d = arrayList2;
        this.f26186e = arrayList3;
        this.f26187f = str;
    }

    @Override
    public final void run() {
        switch (this.f26183a) {
            case 0:
                this.f26184b.lambda$startConferenceGroupCall$47(this.f26185c, this.d, this.f26186e, this.f26187f);
                return;
            default:
                this.f26184b.lambda$startConferenceGroupCall$39(this.f26185c, this.d, this.f26186e, this.f26187f);
                return;
        }
    }
}
