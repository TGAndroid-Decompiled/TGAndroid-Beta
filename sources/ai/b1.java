package ai;

import java.util.concurrent.ExecutorService;
import org.telegram.messenger.x10;
import org.telegram.ui.Dictation.DictationLid;
public final class b1 implements Runnable {
    public final int f1125a;
    public final x10 f1126b;
    public final int f1127c;

    public b1(x10 x10Var, int i7, int i10) {
        this.f1125a = i10;
        this.f1126b = x10Var;
        this.f1127c = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f1125a;
        int i10 = this.f1127c;
        x10 x10Var = this.f1126b;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.f43030a;
                x10Var.a(Integer.valueOf(i10));
                return;
            default:
                x10Var.a(Integer.valueOf(i10));
                return;
        }
    }
}
