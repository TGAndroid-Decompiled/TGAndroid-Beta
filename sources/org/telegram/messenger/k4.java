package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class k4 implements OnCompleteListener {
    public final int f17657a;
    public final q0.a f17658b;

    public k4(q0.a aVar, int i10) {
        this.f17657a = i10;
        this.f17658b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f17657a) {
            case 0:
                GoogleLocationProvider.b(this.f17658b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f17658b, task);
                return;
        }
    }
}
