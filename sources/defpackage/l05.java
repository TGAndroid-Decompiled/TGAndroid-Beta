package defpackage;

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class l05 implements OnCompleteListener {
    public final byte a;
    public final gu2 b;

    public l05(gu2 gu2Var, byte b) {
        this.a = b;
        this.b = gu2Var;
    }

    @Override
    public final void onComplete(Task task) {
        byte b = this.a;
        gu2 gu2Var = this.b;
        switch (b) {
            case 0:
                if (task.getException() == null) {
                    gu2Var.accept((Location) task.getResult());
                    return;
                }
                return;
            default:
                try {
                    task.getResult(ap.class);
                    gu2Var.accept(0);
                    return;
                } catch (ap e) {
                    int statusCode = e.getStatusCode();
                    if (statusCode != 6) {
                        if (statusCode == 8502) {
                            gu2Var.accept(2);
                            return;
                        }
                        return;
                    }
                    gu2Var.accept(1);
                    return;
                }
        }
    }
}
