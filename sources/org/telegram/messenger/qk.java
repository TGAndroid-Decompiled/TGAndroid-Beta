package org.telegram.messenger;

import java.util.ArrayList;
public final class qk implements Runnable {
    public final int f19402a;
    public final TopicsController f19403b;
    public final long f19404c;
    public final ArrayList d;
    public final boolean e;
    public final long f19405f;

    public qk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f19402a = i10;
        this.f19403b = topicsController;
        this.f19404c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f19405f = j11;
    }

    @Override
    public final void run() {
        switch (this.f19402a) {
            case 0:
                TopicsController.x(this.f19403b, this.f19404c, this.d, this.e, this.f19405f);
                return;
            default:
                TopicsController.s(this.f19403b, this.f19404c, this.d, this.e, this.f19405f);
                return;
        }
    }
}
