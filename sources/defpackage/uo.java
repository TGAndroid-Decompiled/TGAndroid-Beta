package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class uo implements OnBackInvokedCallback {
    public final byte a;
    public final Object b;

    public uo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onBackInvoked() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((bp) obj).r();
                return;
            case 1:
                ((op4) obj).invoke();
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).onBackPressed();
                    return;
                } else if (photoViewer.V0()) {
                    photoViewer.B(true, false);
                    return;
                } else {
                    return;
                }
            case 3:
                ((t7b) obj).K();
                return;
            case 4:
                m8b m8bVar = (m8b) obj;
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.onBackPressed();
                    return;
                } else {
                    m8bVar.q();
                    return;
                }
            case 5:
                ((Runnable) obj).run();
                return;
            default:
                ((sfc) obj).run();
                return;
        }
    }
}
