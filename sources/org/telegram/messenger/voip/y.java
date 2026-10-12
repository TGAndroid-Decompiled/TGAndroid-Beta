package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f19412a;
    public final VoIPService f19413b;
    public final ArrayList f19414c;
    public final ArrayList d;
    public final ArrayList f19415e;
    public final String f19416f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19412a = i10;
        this.f19413b = voIPService;
        this.f19414c = arrayList;
        this.d = arrayList2;
        this.f19415e = arrayList3;
        this.f19416f = str;
    }

    @Override
    public final void run() {
        switch (this.f19412a) {
            case 0:
                this.f19413b.lambda$startConferenceGroupCall$47(this.f19414c, this.d, this.f19415e, this.f19416f);
                return;
            default:
                this.f19413b.lambda$startConferenceGroupCall$39(this.f19414c, this.d, this.f19415e, this.f19416f);
                return;
        }
    }
}
