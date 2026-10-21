package org.telegram.messenger;

import java.util.ArrayList;
public final class pk implements Runnable {
    public final int f19292a;
    public final TopicsController f19293b;
    public final long f19294c;
    public final ArrayList d;
    public final boolean e;
    public final long f19295f;

    public pk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f19292a = i10;
        this.f19293b = topicsController;
        this.f19294c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f19295f = j11;
    }

    @Override
    public final void run() {
        switch (this.f19292a) {
            case 0:
                TopicsController.x(this.f19293b, this.f19294c, this.d, this.e, this.f19295f);
                return;
            default:
                TopicsController.s(this.f19293b, this.f19294c, this.d, this.e, this.f19295f);
                return;
        }
    }
}
