package di;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.x01;
import org.telegram.ui.j60;
public final class f1 implements DialogInterface.OnDismissListener {
    public final int f7191a;

    public f1(int i10) {
        this.f7191a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f7191a) {
            case 0:
                int i10 = t2.G;
                return;
            case 1:
                org.telegram.ui.b.f34575a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i11 = x01.f32380e;
                return;
            case 5:
                j60 j60Var = j60.D3;
                return;
            case 6:
                return;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                return;
        }
    }

    public f1(boolean[] zArr) {
        this.f7191a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
