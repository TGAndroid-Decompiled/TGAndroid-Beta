package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f20491a;
    public final VoIPService f20492b;
    public final ArrayList f20493c;
    public final ArrayList d;
    public final ArrayList f20494e;
    public final String f20495f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f20491a = i10;
        this.f20492b = voIPService;
        this.f20493c = arrayList;
        this.d = arrayList2;
        this.f20494e = arrayList3;
        this.f20495f = str;
    }

    @Override
    public final void run() {
        switch (this.f20491a) {
            case 0:
                this.f20492b.lambda$startConferenceGroupCall$47(this.f20493c, this.d, this.f20494e, this.f20495f);
                return;
            default:
                this.f20492b.lambda$startConferenceGroupCall$39(this.f20493c, this.d, this.f20494e, this.f20495f);
                return;
        }
    }
}
