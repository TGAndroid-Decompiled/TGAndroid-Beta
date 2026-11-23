package ai;

import java.util.concurrent.ExecutorService;
import org.telegram.messenger.y10;
import org.telegram.ui.Dictation.DictationLid;
public final class y0 implements Runnable {
    public final int f1627a;
    public final y10 f1628b;
    public final int f1629c;

    public y0(y10 y10Var, int i7, int i10) {
        this.f1627a = i10;
        this.f1628b = y10Var;
        this.f1629c = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f1627a;
        int i10 = this.f1629c;
        y10 y10Var = this.f1628b;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.f43075a;
                y10Var.a(Integer.valueOf(i10));
                return;
            default:
                y10Var.a(Integer.valueOf(i10));
                return;
        }
    }
}
