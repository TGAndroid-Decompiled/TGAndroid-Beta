package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.e5;
public final class q implements Runnable {
    public final int f18847a;
    public final Context f18848b;
    public final int f18849c;
    public final int d;

    public q(Context context, int i10, int i11, int i12) {
        this.f18847a = i12;
        this.f18848b = context;
        this.f18849c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18847a) {
            case 0:
                VoIPGroupNotification.d(this.f18848b, this.f18849c, this.d);
                return;
            default:
                try {
                    e5.f(this.f18848b, this.f18849c, this.d);
                    return;
                } catch (RuntimeException e) {
                    FileLog.e(e);
                    return;
                }
        }
    }
}
