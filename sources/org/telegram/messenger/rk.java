package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19428a;
    public final TopicsController f19429b;
    public final long f19430c;
    public final ArrayList d;
    public final boolean e;
    public final long f19431f;

    public rk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f19428a = i10;
        this.f19429b = topicsController;
        this.f19430c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f19431f = j11;
    }

    @Override
    public final void run() {
        switch (this.f19428a) {
            case 0:
                TopicsController.x(this.f19429b, this.f19430c, this.d, this.e, this.f19431f);
                return;
            default:
                TopicsController.s(this.f19429b, this.f19430c, this.d, this.e, this.f19431f);
                return;
        }
    }
}
