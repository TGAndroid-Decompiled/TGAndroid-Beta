package org.telegram.messenger;

import android.net.Uri;
public final class ae implements Runnable {
    public final int f21503a;
    public final u10 f21504b;
    public final Uri f21505c;

    public ae(u10 u10Var, Uri uri, int i3) {
        this.f21503a = i3;
        this.f21504b = u10Var;
        this.f21505c = uri;
    }

    @Override
    public final void run() {
        int i3 = this.f21503a;
        Uri uri = this.f21505c;
        u10 u10Var = this.f21504b;
        switch (i3) {
            case 0:
                String[] strArr = MediaController.W1;
                u10Var.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.W1;
                u10Var.a(uri);
                return;
        }
    }
}
