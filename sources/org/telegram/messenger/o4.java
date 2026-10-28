package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class o4 implements OnCompleteListener {
    public final int f20830a;
    public final q0.a f20831b;

    public o4(q0.a aVar, int i10) {
        this.f20830a = i10;
        this.f20831b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f20830a) {
            case 0:
                GoogleLocationProvider.b(this.f20831b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f20831b, task);
                return;
        }
    }
}
