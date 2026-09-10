package org.telegram.messenger;

import java.util.ArrayList;
public final class al implements Runnable {
    public final int f14734a;
    public final TopicsController f14735b;
    public final long f14736c;
    public final ArrayList d;
    public final boolean e;
    public final long f14737f;

    public al(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f14734a = i10;
        this.f14735b = topicsController;
        this.f14736c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f14737f = j10;
    }

    @Override
    public final void run() {
        switch (this.f14734a) {
            case 0:
                TopicsController.x(this.f14735b, this.f14736c, this.d, this.e, this.f14737f);
                return;
            default:
                TopicsController.s(this.f14735b, this.f14736c, this.d, this.e, this.f14737f);
                return;
        }
    }
}
