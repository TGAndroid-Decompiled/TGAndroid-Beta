package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class y implements Runnable {
    public final int f19477a;
    public final VoIPService f19478b;
    public final ArrayList f19479c;
    public final ArrayList d;
    public final ArrayList f19480e;
    public final String f19481f;

    public y(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f19477a = i10;
        this.f19478b = voIPService;
        this.f19479c = arrayList;
        this.d = arrayList2;
        this.f19480e = arrayList3;
        this.f19481f = str;
    }

    @Override
    public final void run() {
        switch (this.f19477a) {
            case 0:
                this.f19478b.lambda$startConferenceGroupCall$47(this.f19479c, this.d, this.f19480e, this.f19481f);
                return;
            default:
                this.f19478b.lambda$startConferenceGroupCall$39(this.f19479c, this.d, this.f19480e, this.f19481f);
                return;
        }
    }
}
