package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class g4 implements OnCompleteListener {
    public final int f17913a;
    public final q0.a f17914b;

    public g4(q0.a aVar, int i10) {
        this.f17913a = i10;
        this.f17914b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f17913a) {
            case 0:
                GoogleLocationProvider.b(this.f17914b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f17914b, task);
                return;
        }
    }
}
