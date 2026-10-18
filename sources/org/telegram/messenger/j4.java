package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class j4 implements OnCompleteListener {
    public final int f18677a;
    public final q0.a f18678b;

    public j4(q0.a aVar, int i10) {
        this.f18677a = i10;
        this.f18678b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18677a) {
            case 0:
                GoogleLocationProvider.b(this.f18678b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18678b, task);
                return;
        }
    }
}
