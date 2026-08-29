package org.telegram.messenger;

import java.util.ArrayList;
public final class qk implements Runnable {
    public final int f21381a;
    public final TopicsController f21382b;
    public final long f21383c;
    public final ArrayList d;
    public final boolean f21384e;
    public final long f21385f;

    public qk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f21381a = i10;
        this.f21382b = topicsController;
        this.f21383c = j10;
        this.d = arrayList;
        this.f21384e = z10;
        this.f21385f = j11;
    }

    @Override
    public final void run() {
        switch (this.f21381a) {
            case 0:
                TopicsController.x(this.f21382b, this.f21383c, this.d, this.f21384e, this.f21385f);
                return;
            default:
                TopicsController.s(this.f21382b, this.f21383c, this.d, this.f21384e, this.f21385f);
                return;
        }
    }
}
