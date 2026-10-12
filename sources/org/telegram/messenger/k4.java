package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class k4 implements OnCompleteListener {
    public final int f18033a;
    public final q0.a f18034b;

    public k4(q0.a aVar, int i10) {
        this.f18033a = i10;
        this.f18034b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18033a) {
            case 0:
                GoogleLocationProvider.b(this.f18034b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18034b, task);
                return;
        }
    }
}
