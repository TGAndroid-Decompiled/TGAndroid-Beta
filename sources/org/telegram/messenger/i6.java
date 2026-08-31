package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f18927a;
    public final Utilities.Callback f18928b;
    public final Uri f18929c;

    public i6(Utilities.Callback callback, Uri uri, int i10) {
        this.f18927a = i10;
        this.f18928b = callback;
        this.f18929c = uri;
    }

    @Override
    public final void run() {
        switch (this.f18927a) {
            case 0:
                this.f18928b.run(this.f18929c);
                return;
            default:
                this.f18928b.run(this.f18929c);
                return;
        }
    }
}
