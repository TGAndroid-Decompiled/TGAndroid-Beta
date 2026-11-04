package org.telegram.messenger;

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class s9 implements OnCompleteListener {
    public final int f25295a;
    public final q0.a f25296b;

    public s9(q0.a aVar, int i3) {
        this.f25295a = i3;
        this.f25296b = aVar;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f25295a) {
            case 0:
                if (task.getException() == null) {
                    this.f25296b.accept((Location) task.getResult());
                    return;
                }
                return;
            default:
                q0.a aVar = this.f25296b;
                try {
                    task.getResult(com.google.android.gms.common.api.f.class);
                    aVar.accept(0);
                    return;
                } catch (com.google.android.gms.common.api.f e10) {
                    int statusCode = e10.getStatusCode();
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
