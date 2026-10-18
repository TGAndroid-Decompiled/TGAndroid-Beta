package org.telegram.messenger;

import java.util.ArrayList;
public final class ok implements Runnable {
    public final int f19199a;
    public final TopicsController f19200b;
    public final long f19201c;
    public final ArrayList d;
    public final boolean e;
    public final long f19202f;

    public ok(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f19199a = i10;
        this.f19200b = topicsController;
        this.f19201c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f19202f = j11;
    }

    @Override
    public final void run() {
        switch (this.f19199a) {
            case 0:
                TopicsController.x(this.f19200b, this.f19201c, this.d, this.e, this.f19202f);
                return;
            default:
                TopicsController.s(this.f19200b, this.f19201c, this.d, this.e, this.f19202f);
                return;
        }
    }
}
