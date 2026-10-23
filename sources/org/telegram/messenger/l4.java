package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class l4 implements OnCompleteListener {
    public final int f18861a;
    public final q0.a f18862b;

    public l4(q0.a aVar, int i10) {
        this.f18861a = i10;
        this.f18862b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18861a) {
            case 0:
                GoogleLocationProvider.b(this.f18862b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18862b, task);
                return;
        }
    }
}
