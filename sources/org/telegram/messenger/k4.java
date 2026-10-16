package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class k4 implements OnCompleteListener {
    public final int f17356a;
    public final q0.a f17357b;

    public k4(q0.a aVar, int i10) {
        this.f17356a = i10;
        this.f17357b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f17356a) {
            case 0:
                GoogleLocationProvider.b(this.f17357b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f17357b, task);
                return;
        }
    }
}
