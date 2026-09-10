package org.telegram.messenger;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class l6 implements Runnable {
    public final int f15677a;
    public final Utilities.Callback f15678b;
    public final Uri f15679c;

    public l6(Utilities.Callback callback, Uri uri, int i10) {
        this.f15677a = i10;
        this.f15678b = callback;
        this.f15679c = uri;
    }

    @Override
    public final void run() {
        switch (this.f15677a) {
            case 0:
                this.f15678b.run(this.f15679c);
                return;
            default:
                this.f15678b.run(this.f15679c);
                return;
        }
    }
}
