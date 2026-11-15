package ai;

import java.util.concurrent.ExecutorService;
import org.telegram.messenger.z10;
import org.telegram.ui.Dictation.DictationLid;
public final class b1 implements Runnable {
    public final int f1126a;
    public final z10 f1127b;
    public final int f1128c;

    public b1(z10 z10Var, int i7, int i10) {
        this.f1126a = i10;
        this.f1127b = z10Var;
        this.f1128c = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f1126a;
        int i10 = this.f1128c;
        z10 z10Var = this.f1127b;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.f42585a;
                z10Var.a(Integer.valueOf(i10));
                return;
            default:
                z10Var.a(Integer.valueOf(i10));
                return;
        }
    }
}
