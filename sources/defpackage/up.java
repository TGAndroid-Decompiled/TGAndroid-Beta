package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class up implements OnBackInvokedCallback {
    public final byte a;
    public final Object b;

    public up(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onBackInvoked() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((bq) obj).r();
                return;
            case 1:
                ((pr4) obj).invoke();
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).onBackPressed();
                    return;
                } else if (photoViewer.V0()) {
                    photoViewer.A(true, false);
                    return;
                } else {
                    return;
                }
            case 3:
                ((v9b) obj).K();
                return;
            case 4:
                oab oabVar = (oab) obj;
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.onBackPressed();
                    return;
                } else {
                    oabVar.p();
                    return;
                }
            case 5:
                ((Runnable) obj).run();
                return;
            default:
                ((thc) obj).run();
                return;
        }
    }
}
