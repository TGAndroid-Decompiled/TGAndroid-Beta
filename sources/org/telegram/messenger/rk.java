package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f17480a;
    public final TopicsController f17481b;
    public final long f17482c;
    public final ArrayList d;
    public final boolean e;
    public final long f17483f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17480a = i10;
        this.f17481b = topicsController;
        this.f17482c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17483f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17480a) {
            case 0:
                TopicsController.x(this.f17481b, this.f17482c, this.d, this.e, this.f17483f);
                return;
            default:
                TopicsController.s(this.f17481b, this.f17482c, this.d, this.e, this.f17483f);
                return;
        }
    }
}
