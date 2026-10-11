package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class h4 implements OnCompleteListener {
    public final int f18051a;
    public final q0.a f18052b;

    public h4(q0.a aVar, int i10) {
        this.f18051a = i10;
        this.f18052b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18051a) {
            case 0:
                GoogleLocationProvider.b(this.f18052b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18052b, task);
                return;
        }
    }
}
