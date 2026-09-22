package ai;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
public final class rb implements OnBackInvokedCallback {
    public final int f1481a;
    public final Object f1482b;

    public rb(Object obj, int i10) {
        this.f1481a = i10;
        this.f1482b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1481a) {
            case 0:
                jc jcVar = (jc) this.f1482b;
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
                rd.a onBackInvoked = (rd.a) this.f1482b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            case 2:
                ((ci.oc) this.f1482b).M();
                return;
            case 3:
                ((g.s) this.f1482b).r();
                return;
            default:
                ((Runnable) this.f1482b).run();
                return;
        }
    }
}
