package ai;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
public final class rb implements OnBackInvokedCallback {
    public final int f1478a;
    public final Object f1479b;

    public rb(Object obj, int i10) {
        this.f1478a = i10;
        this.f1479b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1478a) {
            case 0:
                jc jcVar = (jc) this.f1479b;
                jcVar.getClass();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null) {
                    launchActivity.onBackPressed();
                    return;
                } else {
                    jcVar.onAttachedBackPressed();
                    return;
                }
            case 1:
                rd.a onBackInvoked = (rd.a) this.f1479b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            case 2:
                ((ci.lc) this.f1479b).M();
                return;
            case 3:
                ((g.s) this.f1479b).s();
                return;
            default:
                ((Runnable) this.f1479b).run();
                return;
        }
    }
}
