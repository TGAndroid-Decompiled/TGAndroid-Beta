package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.g5;
public final class p implements Runnable {
    public final int f19608a;
    public final Context f19609b;
    public final int f19610c;
    public final int d;

    public p(Context context, int i10, int i11, int i12) {
        this.f19608a = i12;
        this.f19609b = context;
        this.f19610c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19608a) {
            case 0:
                VoIPGroupNotification.d(this.f19609b, this.f19610c, this.d);
                return;
            default:
                try {
                    g5.f(this.f19609b, this.f19610c, this.d);
                    return;
                } catch (RuntimeException e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
