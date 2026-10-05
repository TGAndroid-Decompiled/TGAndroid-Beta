package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class g4 implements OnCompleteListener {
    public final int f17914a;
    public final q0.a f17915b;

    public g4(q0.a aVar, int i10) {
        this.f17914a = i10;
        this.f17915b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f17914a) {
            case 0:
                GoogleLocationProvider.b(this.f17915b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f17915b, task);
                return;
        }
    }
}
