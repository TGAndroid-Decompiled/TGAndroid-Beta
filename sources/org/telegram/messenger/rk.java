package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19081a;
    public final TopicsController f19082b;
    public final long f19083c;
    public final ArrayList d;
    public final boolean f19084e;
    public final long f19085f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19081a = i10;
        this.f19082b = topicsController;
        this.f19083c = j3;
        this.d = arrayList;
        this.f19084e = z10;
        this.f19085f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19081a) {
            case 0:
                TopicsController.x(this.f19082b, this.f19083c, this.d, this.f19084e, this.f19085f);
                return;
            default:
                TopicsController.s(this.f19082b, this.f19083c, this.d, this.f19084e, this.f19085f);
                return;
        }
    }
}
