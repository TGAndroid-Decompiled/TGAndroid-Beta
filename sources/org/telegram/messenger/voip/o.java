package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.q5;
public final class o implements Runnable {
    public final int f19889a;
    public final Context f19890b;
    public final int f19891c;
    public final int d;

    public o(Context context, int i10, int i11, int i12) {
        this.f19889a = i12;
        this.f19890b = context;
        this.f19891c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19889a) {
            case 0:
                VoIPGroupNotification.d(this.f19890b, this.f19891c, this.d);
                return;
            default:
                try {
                    q5.g(this.f19890b, this.f19891c, this.d);
                    return;
                } catch (RuntimeException e) {
                    FileLog.e(e);
                    return;
                }
        }
    }
}
