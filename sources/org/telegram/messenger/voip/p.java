package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.h5;
public final class p implements Runnable {
    public final int f19378a;
    public final Context f19379b;
    public final int f19380c;
    public final int d;

    public p(Context context, int i10, int i11, int i12) {
        this.f19378a = i12;
        this.f19379b = context;
        this.f19380c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19378a) {
            case 0:
                VoIPGroupNotification.d(this.f19379b, this.f19380c, this.d);
                return;
            default:
                try {
                    h5.f(this.f19379b, this.f19380c, this.d);
                    return;
                } catch (RuntimeException e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
