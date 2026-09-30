package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f16366a;
    public final Utilities.Callback f16367b;
    public final Uri f16368c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f16366a = i10;
        this.f16367b = callback;
        this.f16368c = uri;
    }

    @Override
    public final void run() {
        switch (this.f16366a) {
            case 0:
                this.f16367b.run(this.f16368c);
                return;
            default:
                this.f16367b.run(this.f16368c);
                return;
        }
    }
}
