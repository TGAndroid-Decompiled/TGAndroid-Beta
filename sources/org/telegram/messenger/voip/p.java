package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.f5;
public final class p implements Runnable {
    public final int f18538a;
    public final Context f18539b;
    public final int f18540c;
    public final int d;

    public p(Context context, int i10, int i11, int i12) {
        this.f18538a = i12;
        this.f18539b = context;
        this.f18540c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18538a) {
            case 0:
                VoIPGroupNotification.d(this.f18539b, this.f18540c, this.d);
                return;
            default:
                try {
                    f5.f(this.f18539b, this.f18540c, this.d);
                    return;
                } catch (RuntimeException e) {
                    FileLog.e(e);
                    return;
                }
        }
    }
}
