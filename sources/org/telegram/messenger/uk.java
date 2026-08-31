package org.telegram.messenger;

import java.util.ArrayList;
public final class uk implements Runnable {
    public final int f20226a;
    public final TopicsController f20227b;
    public final long f20228c;
    public final ArrayList d;
    public final boolean f20229e;
    public final long f20230f;

    public uk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z4, long j11, int i10) {
        this.f20226a = i10;
        this.f20227b = topicsController;
        this.f20228c = j10;
        this.d = arrayList;
        this.f20229e = z4;
        this.f20230f = j11;
    }

    @Override
    public final void run() {
        switch (this.f20226a) {
            case 0:
                TopicsController.x(this.f20227b, this.f20228c, this.d, this.f20229e, this.f20230f);
                return;
            default:
                TopicsController.s(this.f20227b, this.f20228c, this.d, this.f20229e, this.f20230f);
                return;
        }
    }
}
