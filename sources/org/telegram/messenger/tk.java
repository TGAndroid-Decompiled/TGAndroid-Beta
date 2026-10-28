package org.telegram.messenger;

import java.util.ArrayList;
public final class tk implements Runnable {
    public final int f21352a;
    public final TopicsController f21353b;
    public final long f21354c;
    public final ArrayList d;
    public final boolean e;
    public final long f21355f;

    public tk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f21352a = i10;
        this.f21353b = topicsController;
        this.f21354c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f21355f = j11;
    }

    @Override
    public final void run() {
        switch (this.f21352a) {
            case 0:
                TopicsController.x(this.f21353b, this.f21354c, this.d, this.e, this.f21355f);
                return;
            default:
                TopicsController.s(this.f21353b, this.f21354c, this.d, this.e, this.f21355f);
                return;
        }
    }
}
