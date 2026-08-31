package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class i4 implements OnCompleteListener {
    public final int f18922a;
    public final q0.a f18923b;

    public i4(q0.a aVar, int i10) {
        this.f18922a = i10;
        this.f18923b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18922a) {
            case 0:
                GoogleLocationProvider.b(this.f18923b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18923b, task);
                return;
        }
    }
}
