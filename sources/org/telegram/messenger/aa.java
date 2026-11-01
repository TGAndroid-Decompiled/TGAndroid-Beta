package org.telegram.messenger;

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class aa implements OnCompleteListener {
    public final int f14587a;
    public final q0.a f14588b;

    public aa(q0.a aVar, int i10) {
        this.f14587a = i10;
        this.f14588b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f14587a) {
            case 0:
                if (task.getException() == null) {
                    this.f14588b.accept((Location) task.getResult());
                    return;
                }
                return;
            default:
                q0.a aVar = this.f14588b;
                try {
                    task.getResult(com.google.android.gms.common.api.f.class);
                    aVar.accept(0);
                    return;
                } catch (com.google.android.gms.common.api.f e) {
                    int statusCode = e.getStatusCode();
                    if (statusCode != 6) {
                        if (statusCode == 8502) {
                            aVar.accept(2);
                            return;
                        }
                        return;
                    }
                    aVar.accept(1);
                    return;
                }
        }
    }
}
