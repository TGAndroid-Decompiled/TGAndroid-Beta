package org.telegram.messenger;

import java.util.ArrayList;
public final class uk implements Runnable {
    public final int f20228a;
    public final TopicsController f20229b;
    public final long f20230c;
    public final ArrayList d;
    public final boolean f20231e;
    public final long f20232f;

    public uk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z4, long j11, int i10) {
        this.f20228a = i10;
        this.f20229b = topicsController;
        this.f20230c = j10;
        this.d = arrayList;
        this.f20231e = z4;
        this.f20232f = j11;
    }

    @Override
    public final void run() {
        switch (this.f20228a) {
            case 0:
                TopicsController.x(this.f20229b, this.f20230c, this.d, this.f20231e, this.f20232f);
                return;
            default:
                TopicsController.s(this.f20229b, this.f20230c, this.d, this.f20231e, this.f20232f);
                return;
        }
    }
}
