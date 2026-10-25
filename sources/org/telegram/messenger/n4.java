package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class n4 implements OnCompleteListener {
    public final int f20738a;
    public final q0.a f20739b;

    public n4(q0.a aVar, int i10) {
        this.f20738a = i10;
        this.f20739b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f20738a) {
            case 0:
                GoogleLocationProvider.b(this.f20739b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f20739b, task);
                return;
        }
    }
}
