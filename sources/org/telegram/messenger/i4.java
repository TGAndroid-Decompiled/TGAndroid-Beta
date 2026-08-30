package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class i4 implements OnCompleteListener {
    public final int f17449a;
    public final q0.a f17450b;

    public i4(q0.a aVar, int i10) {
        this.f17449a = i10;
        this.f17450b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f17449a) {
            case 0:
                GoogleLocationProvider.b(this.f17450b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f17450b, task);
                return;
        }
    }
}
