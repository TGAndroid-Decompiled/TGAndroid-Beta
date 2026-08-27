package lh;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.g01;
import org.telegram.ui.s50;

public final class e1 implements DialogInterface.OnDismissListener {

    public final int f15918a;

    public e1(int i10) {
        this.f15918a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15918a) {
            case 0:
                int i10 = l2.C;
                break;
            case 1:
                org.telegram.ui.b.f36656a = false;
                break;
            case 2:
                break;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                break;
            case 4:
                int i11 = g01.f28491e;
                break;
            case 5:
                s50 s50Var = s50.f42409z3;
                break;
            case 6:
                break;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                break;
        }
    }

    public e1(boolean[] zArr) {
        this.f15918a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
