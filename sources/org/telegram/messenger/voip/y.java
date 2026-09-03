package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f18837a;
    public final VoIPService f18838b;
    public final ArrayList f18839c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f18840f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f18837a = i10;
        this.f18838b = voIPService;
        this.f18839c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f18840f = str;
    }

    @Override
    public final void run() {
        switch (this.f18837a) {
            case 0:
                this.f18838b.lambda$startConferenceGroupCall$47(this.f18839c, this.d, this.e, this.f18840f);
                return;
            default:
                this.f18838b.lambda$startConferenceGroupCall$39(this.f18839c, this.d, this.e, this.f18840f);
                return;
        }
    }
}
