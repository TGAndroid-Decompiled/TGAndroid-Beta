package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17719a;
    public final VoIPService f17720b;
    public final ArrayList f17721c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17722f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17719a = i10;
        this.f17720b = voIPService;
        this.f17721c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17722f = str;
    }

    @Override
    public final void run() {
        switch (this.f17719a) {
            case 0:
                this.f17720b.lambda$startConferenceGroupCall$47(this.f17721c, this.d, this.e, this.f17722f);
                return;
            default:
                this.f17720b.lambda$startConferenceGroupCall$39(this.f17721c, this.d, this.e, this.f17722f);
                return;
        }
    }
}
