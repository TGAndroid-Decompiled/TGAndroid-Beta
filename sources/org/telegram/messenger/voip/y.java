package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f17994a;
    public final VoIPService f17995b;
    public final ArrayList f17996c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f17997f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f17994a = i10;
        this.f17995b = voIPService;
        this.f17996c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f17997f = str;
    }

    @Override
    public final void run() {
        switch (this.f17994a) {
            case 0:
                this.f17995b.lambda$startConferenceGroupCall$47(this.f17996c, this.d, this.e, this.f17997f);
                return;
            default:
                this.f17995b.lambda$startConferenceGroupCall$39(this.f17996c, this.d, this.e, this.f17997f);
                return;
        }
    }
}
