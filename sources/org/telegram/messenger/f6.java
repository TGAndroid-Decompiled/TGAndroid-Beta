package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16097a;
    public final Utilities.Callback f16098b;
    public final Uri f16099c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16097a = i10;
        this.f16098b = callback;
        this.f16099c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16097a) {
            case 0:
                this.f16098b.run(this.f16099c);
                return;
            default:
                this.f16098b.run(this.f16099c);
                return;
        }
    }
}
