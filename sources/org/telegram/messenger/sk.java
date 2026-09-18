package org.telegram.messenger;

import java.util.ArrayList;
public final class sk implements Runnable {
    public final int f17344a;
    public final TopicsController f17345b;
    public final long f17346c;
    public final ArrayList d;
    public final boolean e;
    public final long f17347f;

    public sk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17344a = i10;
        this.f17345b = topicsController;
        this.f17346c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17347f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17344a) {
            case 0:
                TopicsController.x(this.f17345b, this.f17346c, this.d, this.e, this.f17347f);
                return;
            default:
                TopicsController.s(this.f17345b, this.f17346c, this.d, this.e, this.f17347f);
                return;
        }
    }
}
