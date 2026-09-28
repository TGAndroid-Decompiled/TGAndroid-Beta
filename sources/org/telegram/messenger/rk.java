package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f17489a;
    public final TopicsController f17490b;
    public final long f17491c;
    public final ArrayList d;
    public final boolean e;
    public final long f17492f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17489a = i10;
        this.f17490b = topicsController;
        this.f17491c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17492f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17489a) {
            case 0:
                TopicsController.x(this.f17490b, this.f17491c, this.d, this.e, this.f17492f);
                return;
            default:
                TopicsController.s(this.f17490b, this.f17491c, this.d, this.e, this.f17492f);
                return;
        }
    }
}
