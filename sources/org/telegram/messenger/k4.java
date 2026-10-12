package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class k4 implements OnCompleteListener {
    public final int f18034a;
    public final q0.a f18035b;

    public k4(q0.a aVar, int i10) {
        this.f18034a = i10;
        this.f18035b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18034a) {
            case 0:
                GoogleLocationProvider.b(this.f18035b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18035b, task);
                return;
        }
    }
}
