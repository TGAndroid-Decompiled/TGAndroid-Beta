package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19123a;
    public final TopicsController f19124b;
    public final long f19125c;
    public final ArrayList d;
    public final boolean f19126e;
    public final long f19127f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19123a = i10;
        this.f19124b = topicsController;
        this.f19125c = j3;
        this.d = arrayList;
        this.f19126e = z10;
        this.f19127f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19123a) {
            case 0:
                TopicsController.x(this.f19124b, this.f19125c, this.d, this.f19126e, this.f19127f);
                return;
            default:
                TopicsController.s(this.f19124b, this.f19125c, this.d, this.f19126e, this.f19127f);
                return;
        }
    }
}
