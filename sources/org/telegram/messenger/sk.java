package org.telegram.messenger;

import java.util.ArrayList;
public final class sk implements Runnable {
    public final int f17564a;
    public final TopicsController f17565b;
    public final long f17566c;
    public final ArrayList d;
    public final boolean e;
    public final long f17567f;

    public sk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17564a = i10;
        this.f17565b = topicsController;
        this.f17566c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17567f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17564a) {
            case 0:
                TopicsController.x(this.f17565b, this.f17566c, this.d, this.e, this.f17567f);
                return;
            default:
                TopicsController.s(this.f17565b, this.f17566c, this.d, this.e, this.f17567f);
                return;
        }
    }
}
