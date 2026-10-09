package ai;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
public final class sb implements OnBackInvokedCallback {
    public final int f1713a;
    public final Object f1714b;

    public sb(Object obj, int i10) {
        this.f1713a = i10;
        this.f1714b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1713a) {
            case 0:
                kc kcVar = (kc) this.f1714b;
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
                sd.a onBackInvoked = (sd.a) this.f1714b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            case 2:
                ((ci.lc) this.f1714b).L();
                return;
            case 3:
                ((g.r) this.f1714b).s();
                return;
            default:
                ((Runnable) this.f1714b).run();
                return;
        }
    }
}
