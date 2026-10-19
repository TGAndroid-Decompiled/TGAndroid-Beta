package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class k4 implements OnCompleteListener {
    public final int f18765a;
    public final q0.a f18766b;

    public k4(q0.a aVar, int i10) {
        this.f18765a = i10;
        this.f18766b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18765a) {
            case 0:
                GoogleLocationProvider.b(this.f18766b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18766b, task);
                return;
        }
    }
}
