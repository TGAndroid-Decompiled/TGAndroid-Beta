package defpackage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.tgnet.TLRPC;
public final class cf implements ee, Continuation, ac7 {
    public final byte a;
    public final Runnable b;

    public cf(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 9:
                runnable.run();
                return true;
            case 10:
                runnable.run();
                return true;
            case 11:
                runnable.run();
                return true;
            case 12:
                runnable.run();
                return true;
            case 13:
                runnable.run();
                return true;
            default:
                runnable.run();
                return true;
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            case 4:
                heVar.dismiss();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                runnable.run();
                return;
            case 6:
            default:
                runnable.run();
                return;
            case 7:
                runnable.run();
                return;
            case 8:
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object then(Task task) {
        this.b.run();
        return Tasks.forResult(null);
    }
}
