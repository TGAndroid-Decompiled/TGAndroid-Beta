package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class m4 implements OnCompleteListener {
    public final int f19003a;
    public final q0.a f19004b;

    public m4(q0.a aVar, int i10) {
        this.f19003a = i10;
        this.f19004b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f19003a) {
            case 0:
                GoogleLocationProvider.b(this.f19004b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f19004b, task);
                return;
        }
    }
}
