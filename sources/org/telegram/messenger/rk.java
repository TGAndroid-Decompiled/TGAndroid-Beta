package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19098a;
    public final TopicsController f19099b;
    public final long f19100c;
    public final ArrayList d;
    public final boolean f19101e;
    public final long f19102f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19098a = i10;
        this.f19099b = topicsController;
        this.f19100c = j3;
        this.d = arrayList;
        this.f19101e = z10;
        this.f19102f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19098a) {
            case 0:
                TopicsController.x(this.f19099b, this.f19100c, this.d, this.f19101e, this.f19102f);
                return;
            default:
                TopicsController.s(this.f19099b, this.f19100c, this.d, this.f19101e, this.f19102f);
                return;
        }
    }
}
