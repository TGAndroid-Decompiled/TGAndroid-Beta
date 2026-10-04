package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19099a;
    public final TopicsController f19100b;
    public final long f19101c;
    public final ArrayList d;
    public final boolean f19102e;
    public final long f19103f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19099a = i10;
        this.f19100b = topicsController;
        this.f19101c = j3;
        this.d = arrayList;
        this.f19102e = z10;
        this.f19103f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19099a) {
            case 0:
                TopicsController.x(this.f19100b, this.f19101c, this.d, this.f19102e, this.f19103f);
                return;
            default:
                TopicsController.s(this.f19100b, this.f19101c, this.d, this.f19102e, this.f19103f);
                return;
        }
    }
}
