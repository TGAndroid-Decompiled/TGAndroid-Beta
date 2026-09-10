package org.telegram.messenger.voip;

import java.util.ArrayList;
public final class b0 implements Runnable {
    public final int f16693a;
    public final VoIPService f16694b;
    public final ArrayList f16695c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f16696f;

    public b0(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i10) {
        this.f16693a = i10;
        this.f16694b = voIPService;
        this.f16695c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f16696f = str;
    }

    @Override
    public final void run() {
        switch (this.f16693a) {
            case 0:
                VoIPService.l1(this.f16694b, this.f16695c, this.d, this.e, this.f16696f);
                return;
            default:
                VoIPService.d(this.f16694b, this.f16695c, this.d, this.e, this.f16696f);
                return;
        }
    }
}
