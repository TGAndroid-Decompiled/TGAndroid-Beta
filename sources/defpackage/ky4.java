package defpackage;

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class ky4 implements OnCompleteListener {
    public final byte a;
    public final vs2 b;

    public ky4(vs2 vs2Var, byte b) {
        this.a = b;
        this.b = vs2Var;
    }

    @Override
    public final void onComplete(Task task) {
        byte b = this.a;
        vs2 vs2Var = this.b;
        switch (b) {
            case 0:
                if (task.getException() == null) {
                    vs2Var.accept((Location) task.getResult());
                    return;
                }
                return;
            default:
                try {
                    task.getResult(zn.class);
                    vs2Var.accept(0);
                    return;
                } catch (zn e) {
                    int statusCode = e.getStatusCode();
                    if (statusCode != 6) {
                        if (statusCode == 8502) {
                            vs2Var.accept(2);
                            return;
                        }
                        return;
                    }
                    vs2Var.accept(1);
                    return;
                }
        }
    }
}
