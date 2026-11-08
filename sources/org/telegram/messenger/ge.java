package org.telegram.messenger;

import android.net.Uri;
public final class ge implements Runnable {
    public final int f22659a;
    public final c20 f22660b;
    public final Uri f22661c;

    public ge(c20 c20Var, Uri uri, int i7) {
        this.f22659a = i7;
        this.f22660b = c20Var;
        this.f22661c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f22659a;
        Uri uri = this.f22661c;
        c20 c20Var = this.f22660b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.V1;
                c20Var.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.V1;
                c20Var.a(uri);
                return;
        }
    }
}
