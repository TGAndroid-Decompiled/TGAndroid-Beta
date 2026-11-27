package defpackage;

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class q05 implements OnCompleteListener {
    public final byte a;
    public final pt2 b;

    public q05(pt2 pt2Var, byte b) {
        this.a = b;
        this.b = pt2Var;
    }

    @Override
    public final void onComplete(Task task) {
        byte b = this.a;
        pt2 pt2Var = this.b;
        switch (b) {
            case 0:
                if (task.getException() == null) {
                    pt2Var.accept((Location) task.getResult());
                    return;
                }
                return;
            default:
                try {
                    task.getResult(ao.class);
                    pt2Var.accept(0);
                    return;
                } catch (ao e) {
                    int statusCode = e.getStatusCode();
                    if (statusCode != 6) {
                        if (statusCode == 8502) {
                            pt2Var.accept(2);
                            return;
                        }
                        return;
                    }
                    pt2Var.accept(1);
                    return;
                }
        }
    }
}
