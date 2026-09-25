package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f17486a;
    public final TopicsController f17487b;
    public final long f17488c;
    public final ArrayList d;
    public final boolean e;
    public final long f17489f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17486a = i10;
        this.f17487b = topicsController;
        this.f17488c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17489f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17486a) {
            case 0:
                TopicsController.x(this.f17487b, this.f17488c, this.d, this.e, this.f17489f);
                return;
            default:
                TopicsController.s(this.f17487b, this.f17488c, this.d, this.e, this.f17489f);
                return;
        }
    }
}
