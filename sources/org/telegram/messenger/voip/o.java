package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.s5;
import org.telegram.ui.Wallet.z5;
public final class o implements Runnable {
    public final int f19900a;
    public final Context f19901b;
    public final int f19902c;
    public final int d;

    public o(Context context, int i10, int i11, int i12) {
        this.f19900a = i12;
        this.f19901b = context;
        this.f19902c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19900a) {
            case 0:
                VoIPGroupNotification.decline(this.f19901b, this.f19902c, this.d);
                return;
            default:
                try {
                    s5.g(this.f19901b, this.f19902c, this.d);
                    z5.e();
                    return;
                } catch (RuntimeException e) {
                    FileLog.e(e);
                    return;
                }
        }
    }
}
