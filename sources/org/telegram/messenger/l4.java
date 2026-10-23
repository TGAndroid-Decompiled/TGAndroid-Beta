package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class l4 implements OnCompleteListener {
    public final int f18929a;
    public final q0.a f18930b;

    public l4(q0.a aVar, int i10) {
        this.f18929a = i10;
        this.f18930b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18929a) {
            case 0:
                GoogleLocationProvider.b(this.f18930b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18930b, task);
                return;
        }
    }
}
