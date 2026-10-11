package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f17946a;
    public final Utilities.Callback f17947b;
    public final Uri f17948c;

    public g6(Utilities.Callback callback, Uri uri, int i10) {
        this.f17946a = i10;
        this.f17947b = callback;
        this.f17948c = uri;
    }

    @Override
    public final void run() {
        switch (this.f17946a) {
            case 0:
                this.f17947b.run(this.f17948c);
                return;
            default:
                this.f17947b.run(this.f17948c);
                return;
        }
    }
}
