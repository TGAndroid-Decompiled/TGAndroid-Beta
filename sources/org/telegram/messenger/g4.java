package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class g4 implements OnCompleteListener {
    public final int f16432a;
    public final q0.a f16433b;

    public g4(q0.a aVar, int i10) {
        this.f16432a = i10;
        this.f16433b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f16432a) {
            case 0:
                GoogleLocationProvider.b(this.f16433b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f16433b, task);
                return;
        }
    }
}
