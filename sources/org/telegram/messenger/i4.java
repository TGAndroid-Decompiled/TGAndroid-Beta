package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class i4 implements OnCompleteListener {
    public final int f18924a;
    public final q0.a f18925b;

    public i4(q0.a aVar, int i10) {
        this.f18924a = i10;
        this.f18925b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18924a) {
            case 0:
                GoogleLocationProvider.b(this.f18925b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18925b, task);
                return;
        }
    }
}
