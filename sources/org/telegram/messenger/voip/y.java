package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17963a;
    public final VoIPService f17964b;
    public final ArrayList f17965c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17966f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17963a = i10;
        this.f17964b = voIPService;
        this.f17965c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17966f = str;
    }

    @Override
    public final void run() {
        switch (this.f17963a) {
            case 0:
                this.f17964b.lambda$startConferenceGroupCall$47(this.f17965c, this.d, this.e, this.f17966f);
                return;
            default:
                this.f17964b.lambda$startConferenceGroupCall$39(this.f17965c, this.d, this.e, this.f17966f);
                return;
        }
    }
}
