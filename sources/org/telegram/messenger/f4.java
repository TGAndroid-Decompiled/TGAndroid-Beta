package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class f4 implements OnCompleteListener {
    public final int f20242a;
    public final q0.a f20243b;

    public f4(q0.a aVar, int i9) {
        this.f20242a = i9;
        this.f20243b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f20242a) {
            case 0:
                GoogleLocationProvider.b(this.f20243b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f20243b, task);
                return;
        }
    }
}
