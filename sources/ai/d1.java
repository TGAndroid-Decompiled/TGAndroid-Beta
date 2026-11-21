package ai;

import java.util.concurrent.ExecutorService;
import org.telegram.messenger.x10;
import org.telegram.ui.Dictation.DictationLid;
public final class d1 implements Runnable {
    public final int f1144a;
    public final x10 f1145b;
    public final int f1146c;

    public d1(x10 x10Var, int i7, int i10) {
        this.f1144a = i10;
        this.f1145b = x10Var;
        this.f1146c = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f1144a;
        int i10 = this.f1146c;
        x10 x10Var = this.f1145b;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.f43071a;
                x10Var.a(Integer.valueOf(i10));
                return;
            default:
                x10Var.a(Integer.valueOf(i10));
                return;
        }
    }
}
