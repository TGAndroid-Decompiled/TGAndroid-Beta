package org.telegram.messenger;

import java.util.ArrayList;
public final class vk implements Runnable {
    public final int f18455a;
    public final TopicsController f18456b;
    public final long f18457c;
    public final ArrayList d;
    public final boolean e;
    public final long f18458f;

    public vk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f18455a = i10;
        this.f18456b = topicsController;
        this.f18457c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f18458f = j11;
    }

    @Override
    public final void run() {
        switch (this.f18455a) {
            case 0:
                TopicsController.x(this.f18456b, this.f18457c, this.d, this.e, this.f18458f);
                return;
            default:
                TopicsController.s(this.f18456b, this.f18457c, this.d, this.e, this.f18458f);
                return;
        }
    }
}
