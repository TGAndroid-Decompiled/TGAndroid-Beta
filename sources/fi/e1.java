package fi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.jb1;
import org.telegram.ui.x50;
public final class e1 implements DialogInterface.OnDismissListener {
    public final int f10773a;

    public e1(int i10) {
        this.f10773a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10773a) {
            case 0:
                int i10 = l2.H;
                return;
            case 1:
                org.telegram.ui.b.f37849a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i11 = i21.e;
                return;
            case 5:
                jb1.f29629i = false;
                return;
            case 6:
                x50 x50Var = x50.D3;
                return;
            case 7:
                return;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                return;
        }
    }

    public e1(boolean[] zArr) {
        this.f10773a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
