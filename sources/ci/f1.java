package ci;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.z01;
import org.telegram.ui.k60;
public final class f1 implements DialogInterface.OnDismissListener {
    public final int f4620a;

    public f1(int i10) {
        this.f4620a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4620a) {
            case 0:
                int i10 = t2.G;
                return;
            case 1:
                org.telegram.ui.b.f32008a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i11 = z01.e;
                return;
            case 5:
                k60 k60Var = k60.D3;
                return;
            case 6:
                return;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                return;
        }
    }

    public f1(boolean[] zArr) {
        this.f4620a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
