package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class f4 implements OnCompleteListener {
    public final int f17656a;
    public final q0.a f17657b;

    public f4(q0.a aVar, int i10) {
        this.f17656a = i10;
        this.f17657b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f17656a) {
            case 0:
                GoogleLocationProvider.b(this.f17657b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f17657b, task);
                return;
        }
    }
}
