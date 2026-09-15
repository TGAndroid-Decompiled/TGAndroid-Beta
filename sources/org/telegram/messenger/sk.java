package org.telegram.messenger;

import java.util.ArrayList;
public final class sk implements Runnable {
    public final int f17335a;
    public final TopicsController f17336b;
    public final long f17337c;
    public final ArrayList d;
    public final boolean e;
    public final long f17338f;

    public sk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17335a = i10;
        this.f17336b = topicsController;
        this.f17337c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17338f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17335a) {
            case 0:
                TopicsController.x(this.f17336b, this.f17337c, this.d, this.e, this.f17338f);
                return;
            default:
                TopicsController.s(this.f17336b, this.f17337c, this.d, this.e, this.f17338f);
                return;
        }
    }
}
