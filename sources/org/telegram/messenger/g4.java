package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class g4 implements OnCompleteListener {
    public final int f17909a;
    public final q0.a f17910b;

    public g4(q0.a aVar, int i10) {
        this.f17909a = i10;
        this.f17910b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f17909a) {
            case 0:
                GoogleLocationProvider.b(this.f17910b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f17910b, task);
                return;
        }
    }
}
