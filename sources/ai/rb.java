package ai;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
public final class rb implements OnBackInvokedCallback {
    public final int f1473a;
    public final Object f1474b;

    public rb(Object obj, int i10) {
        this.f1473a = i10;
        this.f1474b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1473a) {
            case 0:
                jc jcVar = (jc) this.f1474b;
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
                rd.a onBackInvoked = (rd.a) this.f1474b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            case 2:
                ((ci.lc) this.f1474b).M();
                return;
            case 3:
                ((g.s) this.f1474b).s();
                return;
            default:
                ((Runnable) this.f1474b).run();
                return;
        }
    }
}
