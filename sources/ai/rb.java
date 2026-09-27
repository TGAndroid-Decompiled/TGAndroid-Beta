package ai;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
public final class rb implements OnBackInvokedCallback {
    public final int f1475a;
    public final Object f1476b;

    public rb(Object obj, int i10) {
        this.f1475a = i10;
        this.f1476b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1475a) {
            case 0:
                jc jcVar = (jc) this.f1476b;
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
                rd.a onBackInvoked = (rd.a) this.f1476b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            case 2:
                ((ci.kc) this.f1476b).M();
                return;
            case 3:
                ((g.s) this.f1476b).t();
                return;
            default:
                ((Runnable) this.f1476b).run();
                return;
        }
    }
}
