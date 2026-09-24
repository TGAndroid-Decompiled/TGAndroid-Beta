package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f17471a;
    public final TopicsController f17472b;
    public final long f17473c;
    public final ArrayList d;
    public final boolean e;
    public final long f17474f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17471a = i10;
        this.f17472b = topicsController;
        this.f17473c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17474f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17471a) {
            case 0:
                TopicsController.x(this.f17472b, this.f17473c, this.d, this.e, this.f17474f);
                return;
            default:
                TopicsController.s(this.f17472b, this.f17473c, this.d, this.e, this.f17474f);
                return;
        }
    }
}
