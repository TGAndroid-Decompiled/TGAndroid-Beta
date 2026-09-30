package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f17506a;
    public final TopicsController f17507b;
    public final long f17508c;
    public final ArrayList d;
    public final boolean e;
    public final long f17509f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17506a = i10;
        this.f17507b = topicsController;
        this.f17508c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17509f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17506a) {
            case 0:
                TopicsController.x(this.f17507b, this.f17508c, this.d, this.e, this.f17509f);
                return;
            default:
                TopicsController.s(this.f17507b, this.f17508c, this.d, this.e, this.f17509f);
                return;
        }
    }
}
