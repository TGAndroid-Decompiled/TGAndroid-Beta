package ci;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.w11;
import org.telegram.ui.h60;
public final class f1 implements DialogInterface.OnDismissListener {
    public final int f5069a;

    public f1(int i10) {
        this.f5069a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5069a) {
            case 0:
                int i10 = s2.G;
                return;
            case 1:
                org.telegram.ui.b.f34946a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i11 = w11.f32442e;
                return;
            case 5:
                h60 h60Var = h60.D3;
                return;
            case 6:
                return;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                return;
        }
    }

    public f1(boolean[] zArr) {
        this.f5069a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
