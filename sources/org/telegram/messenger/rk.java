package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f18953a;
    public final TopicsController f18954b;
    public final long f18955c;
    public final ArrayList d;
    public final boolean f18956e;
    public final long f18957f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f18953a = i10;
        this.f18954b = topicsController;
        this.f18955c = j3;
        this.d = arrayList;
        this.f18956e = z10;
        this.f18957f = j10;
    }

    @Override
    public final void run() {
        switch (this.f18953a) {
            case 0:
                TopicsController.x(this.f18954b, this.f18955c, this.d, this.f18956e, this.f18957f);
                return;
            default:
                TopicsController.s(this.f18954b, this.f18955c, this.d, this.f18956e, this.f18957f);
                return;
        }
    }
}
