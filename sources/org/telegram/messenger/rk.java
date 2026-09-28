package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f17490a;
    public final TopicsController f17491b;
    public final long f17492c;
    public final ArrayList d;
    public final boolean e;
    public final long f17493f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17490a = i10;
        this.f17491b = topicsController;
        this.f17492c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17493f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17490a) {
            case 0:
                TopicsController.x(this.f17491b, this.f17492c, this.d, this.e, this.f17493f);
                return;
            default:
                TopicsController.s(this.f17491b, this.f17492c, this.d, this.e, this.f17493f);
                return;
        }
    }
}
