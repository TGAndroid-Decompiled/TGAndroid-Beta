package a3;

import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
public final class b implements Executor {
    public final int f73a;

    public b(int i10) {
        this.f73a = i10;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f73a) {
            case 0:
                return;
            case 1:
                AndroidUtilities.runOnUIThread(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }

    private final void a(Runnable runnable) {
    }
}
