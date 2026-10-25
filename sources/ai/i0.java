package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i0 implements n0 {
    public final Utilities.Callback f1547a;
    public final Runnable f1548b;

    public i0(Utilities.Callback callback, Runnable runnable) {
        this.f1547a = callback;
        this.f1548b = runnable;
    }

    @Override
    public final void a(o0 o0Var) {
        AndroidUtilities.removeFromParent(o0Var);
        this.f1548b.run();
    }

    @Override
    public final void f(String str) {
        this.f1547a.run(str);
    }
}
