package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f17823a;
    public final Utilities.Callback f17824b;
    public final Uri f17825c;

    public f6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17823a = i10;
        this.f17824b = callback;
        this.f17825c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17823a) {
            case 0:
                this.f17824b.run(this.f17825c);
                return;
            default:
                this.f17824b.run(this.f17825c);
                return;
        }
    }
}
