package org.telegram.messenger;

import android.net.Uri;
public final class ge implements Runnable {
    public final int f22632a;
    public final c20 f22633b;
    public final Uri f22634c;

    public ge(c20 c20Var, Uri uri, int i7) {
        this.f22632a = i7;
        this.f22633b = c20Var;
        this.f22634c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f22632a;
        Uri uri = this.f22634c;
        c20 c20Var = this.f22633b;
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
