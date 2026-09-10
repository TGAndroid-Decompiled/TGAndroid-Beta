package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class l4 implements OnCompleteListener {
    public final int f15672a;
    public final q0.a f15673b;

    public l4(q0.a aVar, int i10) {
        this.f15672a = i10;
        this.f15673b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f15672a) {
            case 0:
                GoogleLocationProvider.b(this.f15673b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f15673b, task);
                return;
        }
    }
}
