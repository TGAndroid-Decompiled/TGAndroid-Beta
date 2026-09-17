package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17733a;
    public final VoIPService f17734b;
    public final ArrayList f17735c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17736f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17733a = i10;
        this.f17734b = voIPService;
        this.f17735c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17736f = str;
    }

    @Override
    public final void run() {
        switch (this.f17733a) {
            case 0:
                this.f17734b.lambda$startConferenceGroupCall$47(this.f17735c, this.d, this.e, this.f17736f);
                return;
            default:
                this.f17734b.lambda$startConferenceGroupCall$39(this.f17735c, this.d, this.e, this.f17736f);
                return;
        }
    }
}
