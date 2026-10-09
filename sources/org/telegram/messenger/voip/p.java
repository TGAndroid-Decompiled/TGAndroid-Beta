package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.f5;
public final class p implements Runnable {
    public final int f19604a;
    public final Context f19605b;
    public final int f19606c;
    public final int d;

    public p(Context context, int i10, int i11, int i12) {
        this.f19604a = i12;
        this.f19605b = context;
        this.f19606c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19604a) {
            case 0:
                VoIPGroupNotification.d(this.f19605b, this.f19606c, this.d);
                return;
            default:
                try {
                    f5.f(this.f19605b, this.f19606c, this.d);
                    return;
                } catch (RuntimeException e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
