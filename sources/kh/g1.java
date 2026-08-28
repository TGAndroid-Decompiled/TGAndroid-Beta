package kh;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.e01;
import org.telegram.ui.o50;
public final class g1 implements DialogInterface.OnDismissListener {
    public final int f15255a;

    public g1(int i9) {
        this.f15255a = i9;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15255a) {
            case 0:
                int i9 = n2.C;
                return;
            case 1:
                org.telegram.ui.b.f36580a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i10 = e01.f27888e;
                return;
            case 5:
                o50 o50Var = o50.f40880z3;
                return;
            case 6:
                return;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                return;
        }
    }

    public g1(boolean[] zArr) {
        this.f15255a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
