package org.telegram.messenger;

import java.util.ArrayList;
public final class uk implements Runnable {
    public final int f18619a;
    public final TopicsController f18620b;
    public final long f18621c;
    public final ArrayList d;
    public final boolean e;
    public final long f18622f;

    public uk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f18619a = i10;
        this.f18620b = topicsController;
        this.f18621c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f18622f = j11;
    }

    @Override
    public final void run() {
        switch (this.f18619a) {
            case 0:
                TopicsController.x(this.f18620b, this.f18621c, this.d, this.e, this.f18622f);
                return;
            default:
                TopicsController.s(this.f18620b, this.f18621c, this.d, this.e, this.f18622f);
                return;
        }
    }
}
