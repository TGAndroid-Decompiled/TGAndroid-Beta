package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class h4 implements OnCompleteListener {

    public final int f20444a;

    public final q0.a f20445b;

    public h4(q0.a aVar, int i10) {
        this.f20444a = i10;
        this.f20445b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f20444a) {
            case 0:
                GoogleLocationProvider.lambda$getLastLocation$0(this.f20445b, task);
                break;
            default:
                GoogleLocationProvider.lambda$checkLocationSettings$1(this.f20445b, task);
                break;
        }
    }
}
