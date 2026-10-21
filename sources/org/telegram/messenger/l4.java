package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class l4 implements OnCompleteListener {
    public final int f18856a;
    public final q0.a f18857b;

    public l4(q0.a aVar, int i10) {
        this.f18856a = i10;
        this.f18857b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18856a) {
            case 0:
                GoogleLocationProvider.b(this.f18857b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18857b, task);
                return;
        }
    }
}
