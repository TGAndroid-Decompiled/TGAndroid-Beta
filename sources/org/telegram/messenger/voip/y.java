package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17961a;
    public final VoIPService f17962b;
    public final ArrayList f17963c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17964f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17961a = i10;
        this.f17962b = voIPService;
        this.f17963c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17964f = str;
    }

    @Override
    public final void run() {
        switch (this.f17961a) {
            case 0:
                this.f17962b.lambda$startConferenceGroupCall$47(this.f17963c, this.d, this.e, this.f17964f);
                return;
            default:
                this.f17962b.lambda$startConferenceGroupCall$39(this.f17963c, this.d, this.e, this.f17964f);
                return;
        }
    }
}
