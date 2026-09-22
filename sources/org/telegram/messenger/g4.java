package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class g4 implements OnCompleteListener {
    public final int f16419a;
    public final q0.a f16420b;

    public g4(q0.a aVar, int i10) {
        this.f16419a = i10;
        this.f16420b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f16419a) {
            case 0:
                GoogleLocationProvider.b(this.f16420b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f16420b, task);
                return;
        }
    }
}
