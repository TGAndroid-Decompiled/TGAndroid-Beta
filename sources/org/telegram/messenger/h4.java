package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class h4 implements OnCompleteListener {
    public final int f20408a;
    public final q0.a f20409b;

    public h4(q0.a aVar, int i10) {
        this.f20408a = i10;
        this.f20409b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f20408a) {
            case 0:
                GoogleLocationProvider.b(this.f20409b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f20409b, task);
                return;
        }
    }
}
