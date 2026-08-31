package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f20489a;
    public final VoIPService f20490b;
    public final ArrayList f20491c;
    public final ArrayList d;
    public final ArrayList f20492e;
    public final String f20493f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f20489a = i10;
        this.f20490b = voIPService;
        this.f20491c = arrayList;
        this.d = arrayList2;
        this.f20492e = arrayList3;
        this.f20493f = str;
    }

    @Override
    public final void run() {
        switch (this.f20489a) {
            case 0:
                this.f20490b.lambda$startConferenceGroupCall$47(this.f20491c, this.d, this.f20492e, this.f20493f);
                return;
            default:
                this.f20490b.lambda$startConferenceGroupCall$39(this.f20491c, this.d, this.f20492e, this.f20493f);
                return;
        }
    }
}
