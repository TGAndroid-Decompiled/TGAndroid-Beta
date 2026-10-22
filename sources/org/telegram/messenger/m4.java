package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class m4 implements OnCompleteListener {
    public final int f18937a;
    public final q0.a f18938b;

    public m4(q0.a aVar, int i10) {
        this.f18937a = i10;
        this.f18938b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f18937a) {
            case 0:
                GoogleLocationProvider.b(this.f18938b, task);
                return;
            default:
                GoogleLocationProvider.c(this.f18938b, task);
                return;
        }
    }
}
