package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class i4 implements OnCompleteListener {
    public final int f17430a;
    public final q0.a f17431b;

    public i4(q0.a aVar, int i10) {
        this.f17430a = i10;
        this.f17431b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f17430a) {
            case 0:
                GoogleLocationProvider.b(this.f17431b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f17431b, task);
                return;
        }
    }
}
