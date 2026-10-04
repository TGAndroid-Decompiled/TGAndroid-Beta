package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19106a;
    public final TopicsController f19107b;
    public final long f19108c;
    public final ArrayList d;
    public final boolean f19109e;
    public final long f19110f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19106a = i10;
        this.f19107b = topicsController;
        this.f19108c = j3;
        this.d = arrayList;
        this.f19109e = z10;
        this.f19110f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19106a) {
            case 0:
                TopicsController.x(this.f19107b, this.f19108c, this.d, this.f19109e, this.f19110f);
                return;
            default:
                TopicsController.s(this.f19107b, this.f19108c, this.d, this.f19109e, this.f19110f);
                return;
        }
    }
}
