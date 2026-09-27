package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class g4 implements OnCompleteListener {
    public final int f16420a;
    public final q0.a f16421b;

    public g4(q0.a aVar, int i10) {
        this.f16420a = i10;
        this.f16421b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f16420a) {
            case 0:
                GoogleLocationProvider.b(this.f16421b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f16421b, task);
                return;
        }
    }
}
