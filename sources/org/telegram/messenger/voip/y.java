package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17948a;
    public final VoIPService f17949b;
    public final ArrayList f17950c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17951f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17948a = i10;
        this.f17949b = voIPService;
        this.f17950c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17951f = str;
    }

    @Override
    public final void run() {
        switch (this.f17948a) {
            case 0:
                this.f17949b.lambda$startConferenceGroupCall$47(this.f17950c, this.d, this.e, this.f17951f);
                return;
            default:
                this.f17949b.lambda$startConferenceGroupCall$39(this.f17950c, this.d, this.e, this.f17951f);
                return;
        }
    }
}
