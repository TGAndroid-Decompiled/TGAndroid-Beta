package ai;

import java.util.concurrent.ExecutorService;
import org.telegram.messenger.z10;
import org.telegram.ui.Dictation.DictationLid;
public final class a1 implements Runnable {
    public final int f1116a;
    public final z10 f1117b;
    public final int f1118c;

    public a1(z10 z10Var, int i7, int i10) {
        this.f1116a = i10;
        this.f1117b = z10Var;
        this.f1118c = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f1116a;
        int i10 = this.f1118c;
        z10 z10Var = this.f1117b;
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
