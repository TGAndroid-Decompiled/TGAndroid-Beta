package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class h4 implements OnCompleteListener {
    public final int f18017a;
    public final q0.a f18018b;

    public h4(q0.a aVar, int i10) {
        this.f18017a = i10;
        this.f18018b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18017a) {
            case 0:
                GoogleLocationProvider.b(this.f18018b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18018b, task);
                return;
        }
    }
}
