package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19111a;
    public final TopicsController f19112b;
    public final long f19113c;
    public final ArrayList d;
    public final boolean f19114e;
    public final long f19115f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19111a = i10;
        this.f19112b = topicsController;
        this.f19113c = j3;
        this.d = arrayList;
        this.f19114e = z10;
        this.f19115f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19111a) {
            case 0:
                TopicsController.x(this.f19112b, this.f19113c, this.d, this.f19114e, this.f19115f);
                return;
            default:
                TopicsController.s(this.f19112b, this.f19113c, this.d, this.f19114e, this.f19115f);
                return;
        }
    }
}
