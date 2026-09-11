package a3;

import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
public final class a implements Executor {
    public final int f49a;

    public a(int i10) {
        this.f49a = i10;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f49a) {
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
