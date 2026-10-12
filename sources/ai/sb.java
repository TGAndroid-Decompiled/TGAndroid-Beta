package ai;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
public final class sb implements OnBackInvokedCallback {
    public final int f1711a;
    public final Object f1712b;

    public sb(Object obj, int i10) {
        this.f1711a = i10;
        this.f1712b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1711a) {
            case 0:
                kc kcVar = (kc) this.f1712b;
                kcVar.getClass();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null) {
                    launchActivity.onBackPressed();
                    return;
                } else {
                    kcVar.onAttachedBackPressed();
                    return;
                }
            case 1:
                sd.a onBackInvoked = (sd.a) this.f1712b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            case 2:
                ((ci.lc) this.f1712b).L();
                return;
            case 3:
                ((g.r) this.f1712b).r();
                return;
            default:
                ((Runnable) this.f1712b).run();
                return;
        }
    }
}
