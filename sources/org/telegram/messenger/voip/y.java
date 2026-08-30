package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f18855a;
    public final VoIPService f18856b;
    public final ArrayList f18857c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f18858f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f18855a = i10;
        this.f18856b = voIPService;
        this.f18857c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f18858f = str;
    }

    @Override
    public final void run() {
        switch (this.f18855a) {
            case 0:
                this.f18856b.lambda$startConferenceGroupCall$47(this.f18857c, this.d, this.e, this.f18858f);
                return;
            default:
                this.f18856b.lambda$startConferenceGroupCall$39(this.f18857c, this.d, this.e, this.f18858f);
                return;
        }
    }
}
