package org.telegram.messenger;

import java.util.ArrayList;
public final class sk implements Runnable {
    public final int f17332a;
    public final TopicsController f17333b;
    public final long f17334c;
    public final ArrayList d;
    public final boolean e;
    public final long f17335f;

    public sk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17332a = i10;
        this.f17333b = topicsController;
        this.f17334c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17335f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17332a) {
            case 0:
                TopicsController.x(this.f17333b, this.f17334c, this.d, this.e, this.f17335f);
                return;
            default:
                TopicsController.s(this.f17333b, this.f17334c, this.d, this.e, this.f17335f);
                return;
        }
    }
}
