package org.telegram.messenger;

import android.net.Uri;

public final class g6 implements Runnable {

    public final int f20346a;

    public final Utilities.Callback f20347b;

    public final Uri f20348c;

    public g6(Utilities.Callback callback, Uri uri, int i10) {
        this.f20346a = i10;
        this.f20347b = callback;
        this.f20348c = uri;
    }

    @Override
    public final void run() {
        switch (this.f20346a) {
            case 0:
                this.f20347b.run(this.f20348c);
                break;
            default:
                this.f20347b.run(this.f20348c);
                break;
        }
    }
}
