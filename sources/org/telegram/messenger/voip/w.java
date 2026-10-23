package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f20005a;
    public final VoIPService f20006b;
    public final ArrayList f20007c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f20008f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f20005a = i10;
        this.f20006b = voIPService;
        this.f20007c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f20008f = str;
    }

    @Override
    public final void run() {
        switch (this.f20005a) {
            case 0:
                this.f20006b.lambda$startConferenceGroupCall$47(this.f20007c, this.d, this.e, this.f20008f);
                return;
            default:
                this.f20006b.lambda$startConferenceGroupCall$39(this.f20007c, this.d, this.e, this.f20008f);
                return;
        }
    }
}
