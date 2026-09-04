package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f19436a;
    public final VoIPService f19437b;
    public final ArrayList f19438c;
    public final ArrayList d;
    public final ArrayList f19439e;
    public final String f19440f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19436a = i10;
        this.f19437b = voIPService;
        this.f19438c = arrayList;
        this.d = arrayList2;
        this.f19439e = arrayList3;
        this.f19440f = str;
    }

    @Override
    public final void run() {
        switch (this.f19436a) {
            case 0:
                this.f19437b.lambda$startConferenceGroupCall$47(this.f19438c, this.d, this.f19439e, this.f19440f);
                return;
            default:
                this.f19437b.lambda$startConferenceGroupCall$39(this.f19438c, this.d, this.f19439e, this.f19440f);
                return;
        }
    }
}
