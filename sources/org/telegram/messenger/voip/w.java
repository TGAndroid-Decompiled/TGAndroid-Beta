package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class w implements Runnable {
    public final int f19925a;
    public final VoIPService f19926b;
    public final ArrayList f19927c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f19928f;

    public w(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19925a = i10;
        this.f19926b = voIPService;
        this.f19927c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f19928f = str;
    }

    @Override
    public final void run() {
        switch (this.f19925a) {
            case 0:
                this.f19926b.lambda$startConferenceGroupCall$47(this.f19927c, this.d, this.e, this.f19928f);
                return;
            default:
                this.f19926b.lambda$startConferenceGroupCall$39(this.f19927c, this.d, this.e, this.f19928f);
                return;
        }
    }
}
