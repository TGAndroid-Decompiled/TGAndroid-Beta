package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class v implements Runnable {
    public final int f26065a;
    public final VoIPService f26066b;
    public final ArrayList f26067c;
    public final ArrayList d;
    public final ArrayList f26068e;
    public final String f26069f;

    public v(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i3) {
        this.f26065a = i3;
        this.f26066b = voIPService;
        this.f26067c = arrayList;
        this.d = arrayList2;
        this.f26068e = arrayList3;
        this.f26069f = str;
    }

    @Override
    public final void run() {
        switch (this.f26065a) {
            case 0:
                VoIPService.m1(this.f26066b, this.f26067c, this.d, this.f26068e, this.f26069f);
                return;
            default:
                VoIPService.f(this.f26066b, this.f26067c, this.d, this.f26068e, this.f26069f);
                return;
        }
    }
}
