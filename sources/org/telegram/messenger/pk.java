package org.telegram.messenger;

import java.util.ArrayList;
public final class pk implements Runnable {
    public final int f19295a;
    public final TopicsController f19296b;
    public final long f19297c;
    public final ArrayList d;
    public final boolean e;
    public final long f19298f;

    public pk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f19295a = i10;
        this.f19296b = topicsController;
        this.f19297c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f19298f = j11;
    }

    @Override
    public final void run() {
        switch (this.f19295a) {
            case 0:
                TopicsController.x(this.f19296b, this.f19297c, this.d, this.e, this.f19298f);
                return;
            default:
                TopicsController.s(this.f19296b, this.f19297c, this.d, this.e, this.f19298f);
                return;
        }
    }
}
