package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class z implements Runnable {
    public final int f18879a;
    public final VoIPService f18880b;
    public final ArrayList f18881c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f18882f;

    public z(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f18879a = i10;
        this.f18880b = voIPService;
        this.f18881c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f18882f = str;
    }

    @Override
    public final void run() {
        switch (this.f18879a) {
            case 0:
                this.f18880b.lambda$startConferenceGroupCall$47(this.f18881c, this.d, this.e, this.f18882f);
                return;
            default:
                this.f18880b.lambda$startConferenceGroupCall$39(this.f18881c, this.d, this.e, this.f18882f);
                return;
        }
    }
}
