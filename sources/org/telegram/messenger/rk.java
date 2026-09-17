package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f18926a;
    public final TopicsController f18927b;
    public final long f18928c;
    public final ArrayList d;
    public final boolean f18929e;
    public final long f18930f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f18926a = i10;
        this.f18927b = topicsController;
        this.f18928c = j3;
        this.d = arrayList;
        this.f18929e = z10;
        this.f18930f = j10;
    }

    @Override
    public final void run() {
        switch (this.f18926a) {
            case 0:
                TopicsController.x(this.f18927b, this.f18928c, this.d, this.f18929e, this.f18930f);
                return;
            default:
                TopicsController.s(this.f18927b, this.f18928c, this.d, this.f18929e, this.f18930f);
                return;
        }
    }
}
