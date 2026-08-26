package org.telegram.messenger;

import androidx.core.util.Consumer;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda0 implements OnCompleteListener {
    public final int $r8$classId;
    public final Consumer f$0;

    public GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda0(Consumer consumer, int i) {
        this.$r8$classId = i;
        this.f$0 = consumer;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.$r8$classId) {
            case 1:
                GoogleLocationProvider.lambda$getLastLocation$0(this.f$0, task);
                break;
            default:
                GoogleLocationProvider.lambda$checkLocationSettings$1(this.f$0, task);
                break;
        }
    }
}
